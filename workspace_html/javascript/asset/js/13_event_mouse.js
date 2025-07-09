let view
window.onload = function() {
    view = document.querySelector("#view");

    const cursor = document.querySelector("#cursor");
    cursor.style.top = '-1000px';
    cursor.style.left = '-1000px';

    bind();
}
function bind() {
    view.innerHTML = '안녕?<br>'

    document.querySelector('#mouse').addEventListener('mousedown', function(evt){
        view.innerHTML = 'mousedown 발생 <br>' + view.innerHTML;

        console.log(evt);
        /*
            offset : DOM의 좌상단 기준
            page : 문서 좌상단 기준 ( 스크롤 하여도 +해서 그 좌표를 인식)
            client : 스크롤과 관계없이 현재 보이는 브라우저 화면 기준
        */
        view.innerHTML = `
            event.offsetX : ${evt.offsetX}, event.offsetY : ${evt.offsetY}<br> 
            event.pageX : ${evt.pageX}, event.pageY : ${evt.pageY}<br> 
            event.clientX : ${evt.pageX}, event.clientY : ${evt.pageY}<br> 
        
            ${view.innerHTML}
        `

        // offset 개념을 아니가 그 DOM으로 바로 스크롤 하기
        // window.scrollTo( view.offsetTop, null );
    })
    document.querySelector('#mouse').addEventListener('mouseup', function(){
        view.innerHTML = 'mouseup 발생 <br>' + view.innerHTML;
    })
    document.querySelector('#mouse').addEventListener('mousemove', function(){
        // 잘되는거 확인함.
        // view.innerHTML = 'mousemove 발생 <br>' + view.innerHTML;
    })
    // 마우스 들어옴 mouseover 또는 mouseenter
    document.querySelector('#mouse').addEventListener('mouseover', function(){
        view.innerHTML = 'mouseover 발생 <br>' + view.innerHTML;
        
        document.querySelector('#mouse').style.backgroundColor = 'yellow';
    })
    document.querySelector('#mouse').addEventListener('mouseout', function(){
        view.innerHTML = 'mouseout 발생 <br>' + view.innerHTML;
        
        document.querySelector('#mouse').style.backgroundColor = 'white';
    })
    
    // 마우스 따라다니는 이미지 만들기
    document.querySelector('body').addEventListener('mousemove', function(evt){
        const cursor = document.getElementById('cursor');
        
        // absolute가 스크롤에 관계없이 작용해야하므로 page 를 사용해야한다.
        cursor.style.top = evt.pageY + 1 + 'px';
        cursor.style.left = evt.pageX + 1 + 'px';
    })
    
    
    // 드래그 앤 드랍 만들기
    

    
}