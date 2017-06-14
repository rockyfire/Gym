$(function () {
   $("#game_query_a").click(function () {
       $("#game_query").dialog("open");
   });
   $("#game_detail_a").click(function () {
       $("#game_detail").dialog("open");
   });
    $("#game_query").dialog({
			title : "赛事查询",
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
   $("#game_detail").dialog({
			title : "赛事详情",
			width : 255,
			height : 300,
			minWidth : 275,
			minHeight: 200,
			show : 'blind',
			hide : 'puff',
			modal: true,
			buttons :{
				'提交':function(){},
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			autoOpen:false,
    });
});