$(document).ready(function(){
    $('.box-check').change(function(){
        var isChecked = $(this).prop('checked');
        // 체크된 경우
        if(isChecked){            
            $('.box').eq($(this).val()).addClass('display-none');
        }
        // 체크 해제된 경우
        else{
            $('.box').eq($(this).val()).removeClass('display-none');
        }
    });
});