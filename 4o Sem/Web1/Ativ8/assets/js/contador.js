let result = document.getElementById("contador")

setTimeout(() => {
    let hoje = new Date()
    let data = new Date(2024, 10, 30)
    
    let diffTempo = data - hoje
    let diffDias = Math.ceil(diffTempo / (1000 * 60 * 60 * 24))
    
    result.innerHTML = "Faltam " + (diffDias - 1)  + " dias"
}, 1000);