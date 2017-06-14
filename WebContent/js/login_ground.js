$(function (){
	$("#ground_query_a").click(function(){
		$("#ground_query").dialog('open').css("visibility","visible");
	});
	$("#ground_rent_a").click(function () {
		$("#ground_rent").dialog('open').css("visibility","visible");
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

});


