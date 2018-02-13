document.body.onmouseover = document.body.onmouseout = hendler;
function hendler(event) {
    if ((event.type == "mouseover") && document.getElementsByid('buy_id')) {
        event.target.style.color = 'red';
    }
    if ((event.type == "mouseout") && document.getElementsByName('buy_id')){
        event.target.style.color = ''
    }

}