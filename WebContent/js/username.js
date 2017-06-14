$(function (){
	$("#equipment_query_a").click(function (){
		$("#equipment_query").dialog('open');
	});
	$("#equipment_rent_a").click(function () {
		$("#equipment_rent").dialog('open');
    });
	$("#ground_query_a").click(function(){
		$("#ground_query").dialog('open');
	});
	$("#ground_rent_a").click(function () {
		$("#ground_rent").dialog('open');
    });
	$("#game_query_a").click(function () {
		$("#game_query").dialog('open');
    });
	$("#game_apply_a").click(function () {
		$("#game_apply").dialog('open');
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
	$("#ground_query").dialog({
			title : "场地查询",
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
	$("#ground_rent").dialog({
			title : "场地租借",
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
	$("#game_query").dialog({
			title : "赛事查询",
			width : 255,
			height : 270,
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
	$("#game_apply").dialog({
			title : "赛事申请",
			width : 255,
			height : 370,
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


