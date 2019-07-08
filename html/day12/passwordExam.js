window.onload = function(){}
    // function checkPwConfirm(){ // 비밀번호 확인 
    //     var pw1 = document.getElementById('pw1').value;
    //     var pw2 = document.getElementById('pw2').value;
    //     if(pw1.length == 0){
    //         alert('비밀번호를 입력하세요.'); // alert 는 메시지를 출력하게 해주는 역할을 해준다.
    //         return ;
    //     }
    //     if (pw1 == pw2){
    //         alert('비밀번호가 일치합니다.'); 
    //         return ;
    //     }
    //     else{
    //         alert('비밀번호가 일치하지 않습니다.');
    //         return ;
    //     }
    // }
    function checkPwConfirm(idPw1, idPw2, min, max){ // 비밀번호 확인 
        var pw1 = document.getElementById(idPw1).value;
        var pw2 = document.getElementById(idPw2).value;

        // 비밀번호 id값을 이용하여 에러메세지 박스(html코드에서 div) 아이디 만들기
        var strErrorPw1 = 'error'+idPw1; 
        var strErrorPw2 = 'error'+idPw2;
        // 에러메세지 아이디를 이용하여 에러메시지를 화면에 추가
        document.getElementById(strErrorPw1).innerHTML = '에러';
        document.getElementById(strErrorPw2).innerHTML = '에러';


        if(!checkPw(pw1,min,max)){
            return;
        }
        if (pw1 == pw2){
            alert('비밀번호가 일치합니다.'); 
            return ;
        }
        else{
            alert('비밀번호가 일치하지 않습니다.');
            return ;
        }
    }
    function checkStringLength(str,min,max){ //내가 원하는 문자의 길이를 가지고 있는지 확인하는 함수
        if(str.length > max || str.length < min) // 문자열의 길이가 max보다 크거나 min보다 작을 경우
            return false; // 위 조건식이 맞을경우 return값을 false로 하고
        return true; // 위 조건식이 틀릴경우 return값을 true로 한다.
    }
    function checkPw(str,min,max){
        if(!checkStringLength(str,min,max)){
            alert('비밀번호는 '+min+'~'+max+'자리입니다.');
            return false;
        }
        return true;
    }