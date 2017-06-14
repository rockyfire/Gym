/**
 * Created by candy on 5/24/17.
 */
$(function () {
    $("#trace_update_a").click(function (){
		$("#trace_update").dialog('open');
	});
	$("#trace_query_a").click(function(){
		$("#trace_query").dialog('open');
	});
    $("#trace_query").dialog({
			title : "交易查询",
			width : 365,
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
    $("#trace_update").dialog({
			title : "交易修改",
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
});
