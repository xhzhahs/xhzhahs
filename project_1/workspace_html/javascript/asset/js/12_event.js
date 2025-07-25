console.log('Hello js');
const c = document.querySelector('#console');
// console.log(c);

// window.onload = init;   
window.addEventListener('load', init);   // 첫번째 전달인자 클릭이벤트, 두번째 전달인자 콜백함수
                                         // add이므로 여러개 사용 가능
function init(){
    const c = document.querySelector('#console');
    console.log( c );

    const game = document.querySelector('#game');
    game.style.top = '10px';
    game.style.left = '10px';
    
    bind();
}
function bind() {
    const msg = document.querySelector('#console');
    
    const btn1 = document.querySelector('#btn1');
    btn1.onclick = function(){
        msg.innerHTML += '<br>버튼1 클릭';  // +=은 기록이 누적되어 출력되고 
                                           // =를 시용하면 이전 기록은 지워지고 새로운 기록만 남는다.
    }
    // btn1.onclick = function(){
        //     msg.innerHTML += '<br>버튼1 클릭';
        // }    // 마지막 값만 저장(덮어씀)
    // btn1.onclick = ''    // onclick은 변수라서 마지막 값만 저장된다.

    const btn2 = document.querySelector('#btn2');
    // addEventListener는 계속 동일 이벤트를 추가할 수 있다.
    btn2.addEventListener('click', function(){
        msg.innerHTML += '<br>버튼2 클릭';
    })
    btn2.addEventListener('click', function(){
        msg.innerHTML += '<br>버튼2 클릭!';
    })
    // 중복 가능
    
    
    // 로그인 버튼을 눌렀을 때
    // 아이디와 비밀번호가 비어있지 않다면
    //      아이디, 비밀번호 출력
    // 하나라도 안썼다면
    //      아이디는 필수입니다 또는 비밀번호는 필수입니다 출력
    
    const login = document.querySelector('#login');
    login.addEventListener('click', function(){

        const id = document.querySelector('#id').value;
        const pw = document.querySelector('#pw').value;

        // debugger;   // 로그인시 디버그모드가 됨

        console.log('id :', id, id == "");
        if(id == ""){
            msg.innerHTML += '<br>아이디는 필수입니다'
        } else if(pw == "") {
            msg.innerHTML += '<br>비밀번호는 필수입니다'
        } else {
            msg.innerHTML += `<br>${id}, ${pw}`;
        }
    });

    window.addEventListener('resize', function(){
        console.log('resize');
        console.log( window.innerWidth);
    })

    window.addEventListener('scroll', function(){
        console.log('scroll');
        console.log('scrollTop :', document.documentElement.scrollTop);
        // document.documentElement.scrollTop = 140;
    })

    document.querySelector('#top').addEventListener('click', function(){
        // // document.documentElement.scrollTop = 0;
        // window.scrollTo(
        //     {
        //         top: 0,
        //         behavior : 'smooth' //  부드럽게 올라감
        //     });
    
        // document.documentElement.scrollTop -= 10;
        // 스크롤탑이 180위치에 있다.
        // 0까지 -10씩 바꿀것이다.
        for(let i=document.documentElement.scrollTop; i>=0; i -= 10){
            let time = (200 - i) * 10;
            setTimeout(function(){
                console.log('i :', i, 'time: ', time)
                document.documentElement.scrollTop = i;
            }, time)
        }
    })

    // document.querySelector('#id').addEventListener('keydown', function(){
    //     console.log('아다다다');
    // })
    // document.querySelector('#id').addEventListener('keyup', function(){
    //     console.log('아다다다');
    // })
    // document.querySelector('#id').addEventListener('keypress', function(){
    //     console.log('아다다다다다다');
    document.querySelector('#id').addEventListener('keyup', function(event){
        // console.log('a :', a);   //  전달인자 1개다.
        // console.log('b :', b);  //  undefined
        // console.log('c :', c);  //  undefined
        console.log(event);
        console.log(event.keyCode); //  대소문자 확실히 구분하여 써야함.
        if(event.keyCode == 13){
            console.log('엔터!!');
            document.querySelector('#pw').focus();  //  enter치면 id="password"칸으로 이동
        }
    })
    document.querySelector('#pw').addEventListener('keyup', function(event){
        if(event.keyCode == 13) {
            document.querySelector('#login').click();   //  enter치면 로그인 버튼 클릭됨
        }
    });

    document.querySelector('body').addEventListener('keydown', function(event){
        console.log(event.keyCode);
        const game = document.querySelector('#game')
        console.log(game.style.left)
        // 왼쪽
        if(event.keyCode == 37){
            game.style.left = (parseInt(game.style.left) - 10) + 'px';
        } else if(event.keyCode == 39) {
            game.style.left = (parseInt(game.style.left) + 10) + 'px';
        }
        // 아래쪽
        if(event.keyCode == 40){
            game.style.top = (parseInt(game.style.top) + 10) + 'px';
        } else if(event.keyCode == 38) {
            game.style.top = (parseInt(game.style.top) - 10) + 'px';
        }

    })

    document.querySelector('#pw').addEventListener('click',btnClick);
    // 클릭이벤트 빼기 ( removeEventListener )
    document.querySelector('#pw').removeEventListener('click',btnClick);
}

function btnClick(){
    const msg = document.querySelector('#console');
    msg.innerHTML +='<br>btnClick 실행';
}