$(document).ready(function(){
    // $('.box').mouseover(function(){
    //     $(this).animate({
    //         height: '150px',
    //         width: '150px'                    
    //     })
    // });
    // $('.box').mouseout(function(){
    //     $(this).animate({
    //         height: '50px',
    //         width: '50px'
    //     })
    // })   
    $('.box').mouseenter(function(){
        $(this).css('border-color','red');
        $(this).css('color','red');
        $(this).animate({height: '150px',width: '150px',fontSize:'3em'},function(){
            $(this).mouseout(function(){
                $(this).css('border-color','black');
                $(this).css('color','black');
                $(this).animate({height : '50px',width:'50px',fontSize:'1em'})
            });
        });                
    });
});