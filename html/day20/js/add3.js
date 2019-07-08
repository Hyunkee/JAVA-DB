$(document).ready(function(){
    $('#more').click(function(){  
        var obj = '<div class="cts_box"></div><div class="cts_box"></div><div class="cts_box"></div>';                             
        //$(obj).appendTo('.cts');
        $('.cts').append(obj);
    });
});