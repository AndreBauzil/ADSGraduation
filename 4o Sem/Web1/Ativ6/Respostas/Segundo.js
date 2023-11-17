const input = document.getElementById('texto');
const btns = document.querySelectorAll("button")
const datas = document.querySelectorAll("td")

// Para cada botão recebe index e adiciona um listener por click, quando for clicado procura a célula e adiciona o texto
btns.forEach((btn, index) => btn.addEventListener('click', () => datas[index].innerHTML = input.value))
