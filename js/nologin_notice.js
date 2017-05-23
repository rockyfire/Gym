$(function () {
    $("#target").mouseenter(function () {
        $(this).css("color","red")
        $("#a_target").toggle()
    });
    $("#target").mouseleave(function () {
        $(this).css("color","green")
        $("#a_target").toggle()
    })

});