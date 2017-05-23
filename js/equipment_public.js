$(function (){
	$("#equipment_add_a").click(function (){
		$("#equipment_add").dialog('open');
	});
	$("#equipment_query_a").click(function(){
		$("#equipment_query").dialog('open');
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
				'筛选':function(){},
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			autoOpen:false,
		});
});


