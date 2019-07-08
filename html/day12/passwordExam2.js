// 문자열의 길이가 최소길이에서 최대 길이 사이에 있는지 확인하는 함수
// 외부에서 min과 max의 길이를 알려주도록 함. 직접 지역변수를 처리하면 수정을 할때 직접 js 에서 처리를 해야함.
function checkStringLength(str,min,max){ 
    if(str.length >= min && str.length <= max)
        return true;        
    return false;    
}
function checkPw(pwObj,min,max){
    if(!checkStringLength(pwObj.value,min,max)){
        alert('비밀번호의 길이는' +min+ '~' +max+ '자리입니다.');
        return false;
    }
    return true;
}
function checkpwConfirm(idPw1, idPw2, min, max){
    var pw1 = document.getElementById(idPw1);
    var pw2 = document.getElementById(idPw2);
    //비밀번호가 입력됐는지 안됐는지, 됐다면 원하는 길이인지 확인
    if(!checkPw(pw1,min,max)){
        return ;
    }
    //비밀번호와 비밀번호 확인이 일치하는지를 확인
    if(pw1.value != pw2.value){
        alert('비밀번호와 비밀번호 확인이 일치하지 않습니다.')
    }
    //return값을 쓰지않는 이유는 뒤에 코드가 더 없기 때문이다.    
}