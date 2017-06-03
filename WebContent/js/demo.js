$(function () {
    $('#forget_password').click(function () {
        $('#forget_password_form').dialog('open');
    })
    $('#forget_password_form').dialog({
        title : '帐号申诉',
        width : 300,
        height : 370,
        show : 'blind',
        hide : 'puff',
        modal: true,
        buttons :{
            '提交': function () {

            },
            '重置': function () {
                $(this).resetForm();
            },
            '取消': function () {
                $(this).resetForm().dialog('close');
            },
        },
        autoOpen:false,
    })
});
