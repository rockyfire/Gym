$(function() {
	var equipName=$("input[name='equipmentRentVo.equipmentName']");
	var initRate = $("input[name='equipmentRentVo.totalRent']");
	var number = $("input[name='equipmentRentVo.rentNumber']");
	var strRents = $("input[name='equipmentRentVo.rentTime']");
	var strReturns = $("input[name='equipmentRentVo.returnTime']");
	var totalRent 
	equipName.blur(
			function() {
				$.getJSON("jsonAction_ajaxJson", {
					equipmentName : equipName.val()
				}, function(result) {
					var json = eval('(' + result + ')');
					initRate.val(json.rentRate);
					number.attr("placeholder","可借数量为"+json.idleNumber).val("");
				});
			});
	strReturns.blur(
			function() {
				var strRent = strRents.val().split("-");
				var strReturn = strReturns.val().split("-");
				var rentDate = new Date(strRent[0], (strRent[1] - parseInt(1)),strRent[2]);
				var returnDate = new Date(strReturn[0],(strReturn[1] - parseInt(1)), strReturn[2]);
				
				totalRent = (returnDate - rentDate) / (24 * 3600 * 1000)
						* (number.val()) * (initRate.val());
				initRate.val(totalRent);
				
				totalRent = 0;
			});
	$("#equipment_query_a").click(function() {
		$("#equipment_query").dialog('open').css("visibility", "visible");
	});
	$("#equipment_rent_a").click(function() {
		$("#equipment_rent").dialog('open').css("visibility", "visible");
	});
	$(".login_equipment_rent_return_a").click(function() {
		$("input[name='equipmentRentVo.equipmentRentNumber']").val($(this).val());
		$("#login_equipment_rent_return").dialog('open').css("visibility", "visible");
	});
	
	
	var option_rent = {
			type : 'post',
			url : 'equipmentRentAction_addRent'
		};
	var option_query = {
			type : 'post',
			url : 'equipmentAction_query'
		};
	var option_return = {
			type : 'post',
			url : "equipmentRentAction_confirm"
		};
	
	$("#equipment_query").dialog({
		title : "器材查询",
		width : 255,
		height : 300,
		minWidth : 275,
		minHeight : 200,
		show : 'blind',
		hide : 'puff',
		modal : true,
		buttons : {
			'提交' : function() {
			},
			'重置' : function() {
				$(this).resetForm();
			},
			'取消' : function() {
				$(this).resetForm().dialog('close');
			},
		},
		autoOpen : false,
	});
	$("#equipment_rent").dialog({
		title : "器材租借",
		width : 255,
		height : 350,
		minWidth : 275,
		minHeight : 200,
		show : 'blind',
		hide : 'puff',
		modal : true,
		buttons : {
			'提交' : function() {
				$(this).ajaxForm(option_rent).submit().dialog('close');
			},
			'重置' : function() {
				$(this).resetForm();
			},
			'取消' : function() {
				$(this).resetForm().dialog('close');
			},
		},
		close : function(event, ui) {
			window.location.reload();
		},
		autoOpen : false,
	});
	$("#login_equipment_rent_return").dialog({
		title : "延期说明",
		width : 205,
		height : 300,
		minWidth : 205,
		minHeight : 200,
		show : 'blind',
		hide : 'puff',
		modal : true,
		buttons : {
			'提交' : function() {
				$(this).ajaxForm(option_return).submit().dialog('close');
			},
			'取消' : function() {
				$(this).resetForm().dialog('close');
			},
		},
		close : function(event, ui) {
			window.location.reload();
		},
		autoOpen : false,
	});
	
});
