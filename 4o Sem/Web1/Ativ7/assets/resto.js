

const btnProcurar = document.getElementById("procurar")
const btnAddInicio = document.getElementById("addInicio")
const btnAddFinal = document.getElementById("addFinal")
let btns = document.querySelectorAll(".exercicio3 > button")

let listaArray = ["Teste", "Passe", "Leite", "Café", "HTML", "JAVA", "JS", "CSS", "Casa"]
let lista = document.querySelector("#lista")


let carregarLista = () => {
    lista.innerHTML = ''
    listaArray.forEach(item => {
        let novoItem = document.createElement("li")
        novoItem.textContent = item
        lista.appendChild(novoItem)
    });
} 
carregarLista()

btns.forEach((btn) => {
    btn.onclick = () => {
        const palavra = document.getElementById("String").value
        console.log(listaArray);
        
        switch (btn.id) {
            case "addInicio":
                listaArray.unshift(palavra)
                
                carregarLista()
                break;
            case "addFinal":
                listaArray.push(palavra)
                debugger
                
                carregarLista()
                break
            case "procurar":
                for (let i = 0; i < listaArray.length; i++) {
                    const itemLista = listaArray[i];
                    debugger
                    
                    if(itemLista.toLowerCase().includes(palavra.toLowerCase())) {
                        alert(`Item achado no index: ${i}`)
                        return;
                    } 
                }
                alert("Item não achado :(")
                break
            default:
                alert("null")
                break;
        }
    }    
})
