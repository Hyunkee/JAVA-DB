$(document).ready(function(){
    $('#more').click(function(){  
        var obj = '<div class="cts_box"></div><div class="cts_box"></div><div class="cts_box"></div>'; 
        $('.cts_box.last').after(obj);        
    });
});