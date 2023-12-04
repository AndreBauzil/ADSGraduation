const btn1 = document.getElementById("btn1")
const aniverInser = document.getElementById("aniver")
let result1 = document.getElementById("result1")

btn1.onclick = () => {
    let hoje = new Date()
    let aniverDate = new Date(aniver.value)
    
    // Se o aniversário é esse ano ainda, seta a data pro ano atual
    if (hoje.getMonth() <= aniverDate.getMonth() && hoje.getDate() <= aniverDate.getDate()) {
        aniverDate.setFullYear(hoje.getFullYear());
    } else {
        // Senão ele "joga" a data pro ano que vem
        aniverDate.setFullYear(hoje.getFullYear() + 1);
    }
    
    let diffTempo = aniverDate - hoje
    let diffDias = Math.ceil(diffTempo / (1000 * 60 * 60 * 24))
    
    result1.innerHTML = diffDias
}