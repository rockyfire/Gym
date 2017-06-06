$(function (){
	var equipName=$("input[name='equipmentRepairVo.equipmentName']");
	var equipidleNumber = $("input[name='equipmentRepairVo.equipmentNumber']");
	
	equipName.blur(
			function() {
				$.getJSON("jsonAction_ajaxJson", {
					equipmentName : equipName.val()
				}, function(result) {
					var json = eval('(' + result + ')');
					equipidleNumber.attr("placeholder","可维修数为"+json.idleNumber).val("");
				});
			});
	
	var option_add = {
			type : 'post',
			url : 'equipmentAction_add'
	};
	var option_query ={
			type: 'post',
			url :  'equipmentAction_query'
	};
	var option_repair ={
			type: 'post',
			url : 'equipmentRepairAction_addRepair'
	};
	$("#equipment_add_a").click(function (){
		$("#equipment_add").dialog('open');
	});
	$("#equipment_query_a").click(function(){
		$("#equipment_query").dialog('open');
	});
	$("#equipment_repair_apply_a").click(function (){
		$("#equipment_repair_apply").dialog('open');
	});
	$("#equipment_add").dialog({
			title : "器材添加",
			width : 365,
			height : 400,
			minWidth : 275,
			minHeight: 200,
			show : 'blind',
			hide : 'puff',
			modal: true,
			buttons :{
				'提交':function(){
					$(this).ajaxForm(option_add).submit().dialog('close');
				},
				'重置':function () {
					$(this).resetForm();
                },
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			close: function(event, ui) {
			    window.location.reload();
			},
			autoOpen:false,
		});
	$("#equipment_query").dialog({
			title : "器材查询",
			width : 255,
			height : 275,
			minWidth : 275,
			minHeight: 200,
			show : 'blind',
			hide : 'puff',
			modal: true,
			buttons :{
				'筛选':function(){
					$(this).ajaxForm(option_query).submit().dialog('close');
				},
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			close: function(event, ui) {
			    window.location.reload();
			},
			autoOpen:false,
		});
	$("#equipment_repair_apply").dialog({
			title : "维修申请",
			width : 265,
			height : 400,
			minWidth : 275,
			minHeight: 200,
			show : 'blind',
			hide : 'puff',
			modal: true,
			buttons :{
				'筛选':function(){
					$(this).ajaxForm(option_repair).submit().dialog('close');
				},
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			close: function(event, ui) {
			    window.location.reload();
			},
			autoOpen:false,
		});
	
	idleNumber=$.ajax({
		url:"",
	});
	
	
});


