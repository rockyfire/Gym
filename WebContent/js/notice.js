$(function () {
    $("#notice_add_a").click(function () {
        $("#notice_add").dialog('open');
    });
    $("#notice_add").dialog({
        title : "添加公告",
        width : 350,
        show : 'blind',
        hide : 'puff',
        buttons : {
            '添加':function () {

            },
            '取消':function () {
                $(this).dialog('close');
            },
        },
        autoOpen : false
    });
    $("#notice_detail").dialog({
			title : "公告编辑",
			width : 365,
			height : 330,
			minWidth : 275,
			minHeight: 200,
			show : 'blind',
			hide : 'puff',
			modal: true,
			buttons :{
				'编辑':function(){},
				'取消':function(){
					$(this).resetForm().dialog('close');
				},
			},
			autoOpen:false,
		});
})