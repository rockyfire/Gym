$(function (){
	$("#ground_add_a").click(function (){
		$("#ground_add").dialog('open');
	});
	$("#ground_query_a").click(function(){
		$("#ground_query").dialog('open');
	});
	$("#ground_repair_apply_a").click(function(){
		$("#ground_repair_apply").dialog('open');
	});
	$("#ground_add").dialog({
			title : "场地添加",
			width : 365,
			height : 330,
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
	$("#ground_query").dialog({
			title : "场地查询",
			width : 255,
			height : 300,
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
	$("#ground_repair_apply").dialog({
			title : "维修申请",
			width : 255,
			height : 360,
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


