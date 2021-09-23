// changeColor(): Đổi màu chữ của 3 đoạn văn theo thứ tự xanh, vàng, đỏ.
function changeColor(){
    document.querySelector("#p1").style.color = 'green';
    document.querySelector("#p2").style.color = 'yellow';
    document.querySelector("#p3").style.color = 'red';
}
// changeBgColor(color): Thay đổi màu nền của trang thành màu color.
function changeBgColor(color){
    document.querySelector(".container").style.backgroundColor  = color;
}
// copyContent(paragraph1, paragraph2): Thay đổi nội dung của đoạn văn paragraph1 thành giống nội dung của đoạn văn paragraph2 (tham số truyền vào là id của 2 đoạn văn hoặc thứ tự của đoạn văn).
function copyContent(id_p1, id_p2){
    var content_p1 = document.getElementById(id_p1).textContent;
    var content_p2 = document.getElementById(id_p2).textContent;
    document.getElementById(id_p1).innerText = content_p2;
    document.getElementById(id_p2).innerText = content_p1;
}
// changeFontSize(x): Thay đổi kích thước font chữ của cả 3 đoạn văn thành x pixels (x là một số nguyên)
function changeFontSize(size){
    var content = document.getElementsByClassName("sub-content");
    var i;
    for (i = 0; i < content.length; i++) {
        content[i].style.font = size + "px arial";
    }
}
// increaseFontSize(paragraph): Tăng kích thước font chữ của đoạn văn mong muốn 
//(tham số truyền vào là id đoạn văn hoặc thứ tự đoạn văn) lên 1 pixel so với kích thước hiện tại,
//kích thước tăng lên không được vượt quá 30 pixels (Sử dụng sau khi gọi hàm changeFontSize()
//hoặc dùng window.getComputedStyle).
function increaseFontSize(paragraph){
    var elem = document.getElementById("p2");
    var theCSSprop = window.getComputedStyle(elem, null).getPropertyValue("font");
    var index_px = theCSSprop.indexOf("px");
    var size = theCSSprop.slice(0,index_px);
    size = Number(size) + 1;
    if(size > 30)
        size = 30;
    elem.style.font = size + "px arial";

}
// decreaseFontSize(paragraph): Giảm kích thước font chữ của đoạn văn mong muốn
//(tham số truyền vào là id đoạn văn hoặc thứ tự đoạn văn) xuống 1 pixels so với kích thước hiện tại,
//kích thước giảm xuống không vượt quá 10 pixels.
function  decreaseFontSize(paragraph){
    var elem = document.getElementById("p2");
    var theCSSprop = window.getComputedStyle(elem, null).getPropertyValue("font");
    var index_px = theCSSprop.indexOf("px");
    var size = theCSSprop.slice(0,index_px);
    size = Number(size) - 1;
    if(size < 10)
        size = 10;
    elem.style.font = size + "px arial";
}
