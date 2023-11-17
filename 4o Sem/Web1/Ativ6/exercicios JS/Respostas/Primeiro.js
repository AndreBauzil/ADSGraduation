// Exercícios 1
const btns = document.querySelectorAll("button")

btns[0].onclick = () => alert("Primeiro botão foi clicado")
btns[1].onmouseover = () => alert("Mouse passado sobre o segundo botão")
btns[2].onmouseout = () => alert("Mouse foi retirado do terceiro botão")

// Exarcício 2
const inputs = document.querySelectorAll("input")

btns[3].onclick = () => {
    document.querySelector("#paragrafoExercicio2 > span").innerHTML = inputs[0].value
}

// Exercício 3
btns[4].onclick = () => {
    let numero = inputs[1].value;
    for (let i = numero; i > 1; i--) {
        debugger
        document.getElementById("listaNumeros").innerHTML += numero + ", "
    }
}

// Exercício 4
const paragrafo = document.getElementById("paragrafoExercicio4")

btns[5].onclick = () => {
    btns.indexOf(id = "exercicio4btn1") // Encontra o index do botão do exercício 4
    debugger
    btns.forEach((btn, index) => {
        debugger
        switch (index) {
            case 5:
                paragrafo.style.color = "blue";
                break;
            case 6:
                paragrafo.style.color = "red"
                break;
            case 7:
                paragrafo.style.backgroundColor = "black"
                break;
            case 8: 
                paragrafo.style.backgroundColor = "grey"
                break;
            case 9:
                paragrafo.style.fontSize = "20px"
                break;
        }
    })
}


// Exarcício 2
let nome = document.querySelector("#paragrafoExercicio2 > span")
const inputs = document.querySelectorAll("input")

let nomeDigitado

btns[3].onclick = () => {
    nomeDigitado = inputs[0].value
    console.log(nomeDigitado)
    nome.innerHTML= nomeDigitado
}

// Exercício 3
let lista = document.getElementById("listaNumeros")

btns[4].onclick = () => {
    let numero = inputs[1].value;
    for (let i = numero; i > 1; i--) {
        debugger
        lista.innerHTML += numero + ", "
        console.log(numero + ",");
    }
}

// Exercício 4
const paragrafo = document.getElementById("paragrafoExercicio4")



btns[5].onclick = () => {
    btns.indexOf(id = "exercicio4btn1")
    debugger
    btns.forEach((btn, index) => {
        debugger
        switch (index) {
            case 5:
                paragrafo.style.color = "blue"
                break;
            case 6:
                paragrafo.style.color = "red"
                break;
            case 7:
                paragrafo.style.color = "black"
                break;
            case 8: 
                paragrafo.style.color = "grey"
                break;
            case 9:
                paragrafo.style.fontSize = "20px"
                break;
        }
    })
}