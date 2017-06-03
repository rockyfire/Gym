$(function (){
	$("#equipment_query_a").click(function (){
		$("#equipment_query").dialog('open').css("visibility","visible");
	});
	$("#equipment_rent_a").click(function () {
		$("#equipment_rent").dialog('open').css("visibility","visible");
    });

	$("#equipment_query").dialog({
			title : "器材查询",
			width : 255,
			height : 300,
			minWidth : 275,
			minHeight: 200,
			show : 'blind',
			hide : 'puff',
			modal: true,
			buttons :{
				'提交':function(){},
				'重置':function () {
					$(this).resetForm();
                },
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			autoOpen:false,
		});
	var options = {
			type : 'post',
			url : 'equipmentRentAction_addRent',
			success : function(){
				alert("提交成功");
			}
	};
	$("#equipment_rent").dialog({
			title : "器材租借",
			width : 255,
			height : 300,
			minWidth : 275,
			minHeight: 200,
			show : 'blind',
			hide : 'puff',
			modal: true,
			buttons :{
				'提交':function () {
					$(this).ajaxForm(options).submit().dialog('close');
				},
				'重置':function () {
					$(this).resetForm();
                },
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			autoOpen:false,
		});
});


