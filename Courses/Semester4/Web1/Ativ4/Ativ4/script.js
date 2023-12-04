const link = document.getElementById("link");
const btns = document.getElementsByClassName("btn")

btns[0].addEventListener("click", function() {
    link.href="./style1.css"
});

btns[1].addEventListener("click", function() {
    link.href="./style2.css"
});

btns[2].addEventListener("click", function() {
    link.href="./style3.css"
});

btns[3].addEventListener("click", function() {
    link.href="./global.css"
});