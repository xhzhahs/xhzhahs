window.addEventListener('load', bind)
function bind() {


    /*
    문제 1
    여러개의 checkbox이 있을 때
    선택 버튼을 클릭하면
    선택한 토핑의 값을 따로 출력
    */

    // 1. 선택 버튼을 클릭하면 .addEventListener('click', function(){})
    document.querySelector('[type=button]').addEventListener('click', function(){
        // 2. 선택한 토핑들을 가져오기
        // querySelector는 .chk인 것중에 첫번째꺼 하나만 가져온다.
        // querySelectorAll은 .chk인 것 모든 것을 하나만 가져온다.

        // 방법 1 (:checked를 사용함으로써 if문이 줄어든다.)
        let topping = document.querySelector('#topping')
    
        let list_chk = document.querySelectorAll('.chk:checked')
        for(let i=0; i< list_chk.length; i++) {

            topping.innerText += list_chk[i].value + ',';
        }

        // 방법 2 ('.chk:checked' 대신 아래 방법 사용 가능)
        // let list_chk2 = document.querySelectorAll('.chk')
        // for(let i=0; i<list_chk2.length; i++){
        //     if(list_chk2[i].checked == true){
        //         // 값을 출력
        //         topping.innerText += list_chk2[i].value + ',';
        //     }
        // }
    })

    /*       
    문제2
        전체 선택을 구현하시오
        문제2-1
            전체 선택 체크 시 모두 선택
            전체 선택 체크 해제 시 모두 선택 해제
    */

    // 전체 선택 구현
    // 전체 선택 체크 시 모두 선택
    // 전체 선택 체크 했을 "때"
    // 체크박스는 키보드로도 체크할 수 있으므로 click이벤트를 쓰면 키보드 사용했을 때 입력이 안된다. 그럴땐 change 이벤트 사용하자.
    document.querySelector('.chk_all').addEventListener('click', function(){
        // 전체 선택 체크가 되었다면
        let list_chk2 = document.querySelectorAll('.chk')
        if(document.querySelector('.chk_all').checked){
            // 모두 선택
            for(let i=0; i<list_chk2.length; i++){
                list_chk2[i].checked = true;
            }
        } else {
            // 모두 선택 해제
            for(let i=0; i<list_chk2.length; i++){
                list_chk2[i].checked = false;
            }
        }
    })

    /*
            문제2-2
            전체 선택 후 하나라도 해제되면 전제 선택도 해제
            전체 선택이 해제 된 경우에도 모든 요소 선택 시 전체 선택 체크
    */
    // 전체 선택 후 하나라도 해제되면 전제 선택도 해제
    let list_chk = document.querySelectorAll('.chk');
    // list_chk.addEventListener('click', ()=>{})   // 오류가 나므로 사용 불가
    for(let i=0; i<list_chk.length; i++){
        list_chk[i].addEventListener('click', function(){
            if( !list_chk[i].checked ){
                // 내가 선택 해제면되었다면
                document.querySelector('.chk_all').checked = false;
            } else if (list_chk[i].checked){
                // 전체 선택이 해제 된 경우에도 모든 요소 선택 시 전체 선택 체크

                // 내가 선택 되었다면
                // 전체 개수와 체크된 개수를 비교해서 
                // 같으면 전체선택 체크
                let list_chk_y = document.querySelectorAll('.chk:checked')
                if( list_chk.length == list_chk_y.length ) {
                    document.querySelector('.chk_all').checked = true;
                }
            }
        })
    }
    // 1번
    // 신청버튼 누르면 input의 글씨가 아래에 쌓인다.
    document.querySelector('#sign').addEventListener('click', function(){

        const list = document.querySelector('.list');

        // innerHTML보다 append 사용이 더 좋다. 기억하기

        list.innerHTML += document.querySelector('#name').value + '<br>';

        
    });


    // 2번
    // 주문정보와 같음 버튼을 누르면 주문자의 정보가 배송 정보로 복사됨
    document.querySelector('#same').addEventListener('change', function(){
        const s_name = document.querySelector('.s_name');
        const s_address = document.querySelector('.s_address');
        const s_number = document.querySelector('.s_number');

        s_name.innerHTML = document.querySelector('.name').value
        s_address.innerHTML = document.querySelector('.address').value
        s_number.innerHTML = document.querySelector('.number').value

        const check = document.querySelector('#same')
        if(!check.checked) {
            s_name.innerHTML = ''
            s_address.innerHTML = ''
            s_number.innerHTML = ''
        }       
    })

    // 3번
    // 메뉴가 여러 개일때 선택한 메뉴만 특이하게 보이게
    
    // 클릭 되면 .sub 를 지워준다. 그러면 목록이 보일 것이다.
    // classList.toggle = 이미 있으면 지워주고 없으면 넣어줌
    const tab = document.querySelectorAll('.menu');
    const sub_tab = document.querySelectorAll('.sub_1');
    console.log( tab )
    console.log( sub_tab )
    for(let i=0; i<tab.length; i++) {
        tab[i].addEventListener('click', function(){
            isClicked = tab[i].classList.contains('sub')
            for(let j=0; j<tab.length; j++){
                
                tab[j].classList.remove('sub')
                sub_tab[j].classList.remove('sub')
            }
            if(isClicked) {
                
                tab[i].classList.remove('sub')
                sub_tab[i].classList.remove('sub')
                document.querySelector('.third_1').classList.add('subtab')
                // console.log(isClicked)
            } else {
                tab[i].classList.add('sub')
                sub_tab[i].classList.add('sub')
                document.querySelector('.third_1').classList.remove('subtab')

            }
          
        })
    }
    
    
    // 4-0 번
    // 썸네일 클릭 또는 mouseover 시 큰 그림 변경 및 유지

    // 일단 썸네일에 마우스 올리면 따라다니는 반투명 네모 만들기
    const nemo = document.querySelector('.nemo');
    nemo.style.top = '0px'
    nemo.style.left = '0px'
    let mouseX = 0;
    let mouseY = 0;
    document.querySelector('.thumb').addEventListener('mouseover', function(evt){
        
        console.log('마우스들어옴')
        console.log(mouseX,mouseY)
        console.log(parseInt(nemo.style.top),parseInt(nemo.style.left))
        console.log(nemo.style.top,nemo.style.left)
        nemo.classList.remove('subtab');
        // 마우스 좌표
        mouseX = evt.pageX;
        mouseY = evt.pageY;
        nemo.style.top = evt.offsetY + 'px';
        nemo.style.left = evt.offsetX + 'px';
    })
    document.querySelector('.thumb').addEventListener('mousemove', function(evt){
        
        // absolute가 스크롤에 관계없이 작용해야하므로 page 를 사용해야한다.
        nemo.style.top = (parseInt(nemo.style.top) + (evt.pageY - mouseY)) + 'px';
        nemo.style.left = (parseInt(nemo.style.left) + (evt.pageX - mouseX)) + 'px';
        mouseX = evt.pageX
        mouseY = evt.pageY
    })
    document.querySelector('.thumb').addEventListener('mouseout', function(){
        document.querySelector('.nemo').classList.add('subtab')        
    })

    // 4번
    const small= document.querySelectorAll('.small img');
    const big = document.querySelectorAll('.big img');
    for(let i=0; i<small.length; i++) {
        small[i].addEventListener('click', function(){
            for(let j=0; j<big.length; j++){
                big[j].classList.add('subtab')
                console.log('클릭됨')
            }
            big[i].classList.remove('subtab')
        })
        console.log(small,big)
    } 

    // 5번 
    // 피자 주문 시스템
    // 사이즈, 토핑, 도우를 선택한 정보 한번에 표시
    document.querySelector('#button').addEventListener('click', function(){
        const list = document.querySelector('#list')
        const size = document.querySelector('[name=size]:checked')
        
        const bread = document.querySelector('#bread')
        list.innerText = '사이즈 : ' + size.value + '\n' +'도우 : ' + bread.value+ '\n' +'토핑 : '
    
        const list_chk = document.querySelectorAll('.chk:checked')
        for(let i=0; i< list_chk.length; i++) {

            list.innerText += list_chk[i].value + ',';
        }
    })


    // 6번
    // TODO
    // 추가 버튼 클릭 : input 내용 추가
    // 할일 체크하면 할일 글씨 취소선
    // 할일 삭저하면 할일 삭제
    // 전체선택 구현
    // 선택취소 구현

    // id가 add인 것을 클릭했을 때
    document.querySelector('#add').addEventListener('click', function(){
        const todo = document.querySelector('#todo').value
        const wrap = document.querySelector('.todo-wrap')

        // div를 추가한다.
        const div = document.createElement('div')
        // 추가한 div에 todo class를 추가한다.
        div.classList.add('todo')
        // innerHTML은 코드를 넣어도 적용된다.
        div.innerHTML = `
                <input type="checkbox" class="chk">
                <span>${todo}</span> 
                <input type="button" class="del" value="삭제">
        `
        // 마지막 자식요소로 추가된다.
        wrap.append(div)

        // 추가후 빈칸으로 만들기
        document.querySelector('#todo').value = ''

        // div의 class가 del인 것을 클릭했을 때
        // document.querySelectorAll로 잡으면 마지막을 제외한 목록들은 여러번 실행되게 됨.
        // 아래 방법이 훨씬 좋은 방법
        div.querySelector('.del').addEventListener('click', function(event){
            console.log('test')

            // event가 발생한 현재와 자식요소까지 출력
            console.log(event.target)
            // event.target의 부모까지 출력
            console.log(event.target.parentNode)
            // 그 부모 삭제
            // confirm은 확인창을 띄워줌
            const isDel = confirm('삭제하시겠습니까?')
            if(isDel){
                // 확인을 누르면 삭제
                event.target.parentNode.remove()
            }
        })

    })

    document.querySelector('#del_chk').addEventListener('click', function(){

        // 타입이 체크박스인 애들중에 id가 all이 아니고 체크된 것들 
        const chks = document.querySelectorAll('[type=checkbox]:not(#all):checked')
        console.log(chks)

        // 부모 지우기
        // 방법1
        for(let i=0; i<chks.length; i++) {
            chks[i].parentNode.remove()
        }
        // // 방법2
        // for(let c of chks){
        //     c.parentNode.remove()
        // }
        // // 방법3
        // chks.forEack(function(c){
        //     c.parentNode.remove()
        // })
        // // 방법4
        // chks.forEack(c => c.parentNode.remove())

        // 같은 부모의 del 버튼 클릭
        // for(let i=0; i<chks.length; i++){
        //     chks[i].parentNode.querySelector('del').click()
        // }

    })
}