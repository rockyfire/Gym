$(function (){
	$("#game_query_a").click(function () {
		$("#game_query").dialog('open').css("visibility","visible");
    });
	$("#game_apply_a").click(function () {
		$("#game_apply").dialog('open').css("visibility","visible");
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


