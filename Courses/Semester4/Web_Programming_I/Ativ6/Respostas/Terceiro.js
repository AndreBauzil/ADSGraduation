// Seleciona elementos do DOM
const changesFont = document.querySelectorAll("#fonte > span")
const changesColor = document.querySelectorAll("#cor > span")
const showBtns = document.querySelectorAll("#menu > span")
const divs = document.querySelectorAll("#menu > div")
const body = document.body

// Func pra trocar o tamanho da fonte
changesFont[0].onclick = () => mudarTamFonte(3)
changesFont[1].onclick = () => mudarTamFonte(0)
changesFont[2].onclick = () => mudarTamFonte(-3)

let tamAtual = +window.getComputedStyle(body).fontSize.slice(0,2); // pega o tamanho atual pegando o fontSize do body e recortando o 'px'

const mudarTamFonte = tamanho => {
    body.style.fontSize = (
        tamanho == 0 ?        // se entrada da func for 0
        tamAtual = 16 :       // normaliza a fonte
            tamAtual += tamanho > 0 && tamAtual < 48 ? // senão se tamanho passado for maior que 0 e tamanho atual menor que 48 
                tamanho :       // adiciona o tamanho negativo passado
                    tamanho < 0 && tamAtual > 12 ?  // senão se tamanho passado for menor que 0 e tamanho atual maior que 12 
                        tamanho :   // adiciona o tamanho positivo passado
                        0           // se nenhuma opção for válida retorna 0 (nada)
    ) + "px"
}

// Func pra mudar alto contraste (dark mode)
changesColor[0].onclick = () => altoContraste(true)
changesColor[1].onclick = () => altoContraste(false)

// caso cond for true troca cor do fundo pra preto, senão default (vermelho)
const altoContraste = cond => cond ? body.style.backgroundColor = 'black' : body.style.backgroundColor = ''

// Func pra mostrar/ocultar noticias e parceiros
const showDivs = index => {
    (divs[index].style.display == 'none' || divs[index].style.display == '') ? // caso o style da div referente ao index passado na func for igual a none ou vazio
        divs[index].style.display = 'block' : // então mostra o div especificado
        divs[index].style.display = 'none'    // senão oculta o div 
}

showBtns.forEach((btn, index) => {
    btn.addEventListener('click', () => {
        showDivs(index);    // chama a func e passa o index referente ao span clicado (1º ou 2º)
    });
})

// Func para mostrar msg quando clica no link
document.getElementById('link').onclick = () => alert('Link não disponível no momento.')
