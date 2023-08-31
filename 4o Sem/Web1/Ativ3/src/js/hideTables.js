const table2 = document.getElementsByClassName(table2);
const table3 = document.getElementsByClassName(table3);

const btn = document.getElementsById("btnHide");

btn.addEventListener('click', function () {
    const table1 = document.getElementsById("table1");

    if (table1.style.display === "none") {
        table1.style.display = "block";
    } else {
        table1.style.display = "none";
    }
});