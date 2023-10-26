// Exercícios 1
const btns = document.querySelectorAll("button") // Pega todos os botões

btns[0].onclick = () => alert("Primeiro botão foi clicado")
btns[1].onmouseover = () => alert("Mouse passado sobre o segundo botão")
btns[2].onmouseout = () => alert("Mouse foi retirado do terceiro botão")

// Exarcício 2
const inputs = document.querySelectorAll("input") // Pega todos os inputs

    // Adiciona o valor do input no html
btns[3].onclick = () => document.querySelector("#paragrafoExercicio2 > span").innerHTML = inputs[0].value

// Exercício 3
btns[4].onclick = () => {
    document.getElementById("listaNumeros").innerHTML = ''  // Limpa a lista
    for (let i = inputs[1].value; i > 1; i--) 
        document.getElementById("listaNumeros").innerHTML += i-1 + (i == 2 ? "." : ", ")  // Adiciona o .value do input - 1 + ', ' caso o número não seja 2 (último), se for, add '. '
}

// Exercício 4
const paragrafo = document.getElementById("paragrafoExercicio4")

const mudarStyle = action => {
    switch (action) {
        case "blue":
            paragrafo.style.color = 'blue';
            break;
        case "red":
            paragrafo.style.color = 'red';
            break;
        case "black-bg":
            paragrafo.style.backgroundColor = 'black';
            break;
        case "grey-bg":
            paragrafo.style.backgroundColor = 'grey';
            break;
        case "font-size":
            paragrafo.style.fontSize = '20px';
            break;
        case "reset":
            paragrafo.style.color = 'black';
            paragrafo.style.fontSize = '';
            paragrafo.style.backgroundColor = '';
            break;
    }
}

btns[5].onclick = () => mudarStyle("blue");
btns[6].onclick = () => mudarStyle("red");
btns[7].onclick = () => mudarStyle("black-bg");
btns[8].onclick = () => mudarStyle("grey-bg");
btns[9].onclick = () => mudarStyle("font-size");
btns[10].onclick = () => mudarStyle("reset");