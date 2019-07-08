window.onload = function(){}   
    function checkPwConfirm(idPw1, idPw2, min, max){ 
        var pw1 = document.getElementById(idPw1).value;
        var pw2 = document.getElementById(idPw2).value;
        
        var strErrorPw1 = 'error'+idPw1; 
        var strErrorPw2 = 'error'+idPw2;

        var errorMessage1 = '';
        var errorMessage2 = '';

        if(!checkPw(pw1,min,max)){
            errorMessage1 = '비밀번호는' + min + '~' + max + '자리입니다.';            
        }        
        if(pw1 != pw2 ){
            errorMessage2 = '비밀번호가 일치하지 않습니다.';            
        }
        document.getElementById(strErrorPw1).innerHTML = errorMessage1;
        document.getElementById(strErrorPw2).innerHTML = errorMessage2;
    }
    function checkStringLength(str,min,max){
        if(str.length > max || str.length < min) 
            return false;                        
        return true;     
        
    }
    function checkPw(str,min,max){
        if(!checkStringLength(str,min,max)){  
            // alert('비밀번호는 '+min+'~'+max+'자리입니다.');          
            return false;            
        }        
        return true;
    }