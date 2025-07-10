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

    // 4번
    // 썸네일 클릭 도는 mouseover 시 큰 그림 변경 및 유지

    // 5번 
    // 피자 주문 시스템
    // 사이즈, 토핑, 도우를 선택한 정보 한번에 표시

    // 6번
    // TODO
    // 추가 버튼 클리 : input 내용 추가
    // 할일 체크하면 할일 글씨 취소선
    // 할일 삭저하면 할일 삭제
    // 전체선택 구현
    // 선택취소 구현


}