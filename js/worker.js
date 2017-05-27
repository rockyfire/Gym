/**
 * Created by candy on 5/25/17.
 */
$(function (){
	$("#worker_add_a").click(function (){
		$("#worker_add").dialog('open');
	});
	$("#worker_query_a").click(function(){
		$("#worker_query").dialog('open');
	});
	$("#worker_update_a").click(function (){
		$("#worker_update").dialog('open');
	});
	$("#worker_arrange_a").click(function (){
		$("#worker_arrange").dialog('open');
	});
	$("#worker_arrange").dialog({
			title : "工作人员安排",
			width : 275,
			height : 350,
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
	$("#worker_add").dialog({
			title : "工作人员添加",
			width : 275,
			height : 350,
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
	$("#worker_query").dialog({
			title : "工作人员查询",
			width : 255,
			height : 320,
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
	$("#worker_update").dialog({
			title : "工作人员更新",
			width : 265,
			height : 350,
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


