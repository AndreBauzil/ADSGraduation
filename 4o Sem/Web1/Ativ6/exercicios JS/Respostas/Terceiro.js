// Seleccionar elementos del DOM
const changesFont = document.querySelectorAll("#fonte > span")
const changesColor = document.querySelectorAll("#cor > span")
const showBtns = document.querySelectorAll("#menu > span")
const showDivs = document.querySelectorAll("#menu > div")

const body = document.body

const noticias = document.getElementById('noticias');
const not = document.getElementById('not');
const parceiros = document.getElementById('parceiros');
const par = document.getElementById('par');
const link = document.getElementById('link');

// Func pra trocar o tamanho da fonte
changesFont[0].onclick = () => mudarTamFonte(3)
changesFont[1].onclick = () => mudarTamFonte(0)
changesFont[2].onclick = () => mudarTamFonte(-3)

let atualTam = +window.getComputedStyle(body).fontSize.slice(0,2);
const mudarTamFonte = tamanho => {
    console.log("tamanho add: ", tamanho, "tamanho atual", atualTam)

    // body.style.fontSize = 
    console.log(
        tamanho == 0 ? 
        atualTam = 16 : 
        atualTam += (atualTam >= 12 && atualTam <= 48) ? tamanho : 0
    )
}

// Func pra mudar alto contraste (dark mode)
changesColor[0].onclick = () => altoContraste(true)
changesColor[1].onclick = () => altoContraste(false)

const altoContraste = cond => {
    if (cond) {
        body.style.backgroundColor = 'black'
        body.style.color = 'white'
    } else {
        body.style.backgroundColor = '';
        body.style.color = '';
    }
}

// Funciones para mostrar/ocultar las noticias y los socios
showBtns[1].onclick = () => {
    mostrarDiv();
};

showBtns[2].onclick = () => {
    mostrarParceiros();
};

function mostrarDiv() {
    showBtns.forEach(btn => {
        btn.addEventListener('click', () => {
            showDivs.forEach((div) => div.style.display = (div.style.display = 'none') ? 'show' : 'none')
        })
    });
}

function mostrarParceiros() {
    if (par.style.display === 'none') {
        par.style.display = 'block';
    } else {
        par.style.display = 'none';
    }
}

// Función para mostrar un mensaje cuando se hace clic en el enlace "Veja mais"
link.onclick = evento => {
    evento.preventDefault();
    alert('Enlace no diponible en este momento.');
};
