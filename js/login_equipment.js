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
	$("#equipment_rent").dialog({
			title : "器材租借",
			width : 255,
			height : 400,
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


});


