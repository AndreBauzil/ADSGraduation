// Puxa as var do html
const a  = document.getElementById('a');
const b  = document.getElementById('b');
const d  = document.getElementById('d');
const c  = document.getElementById('c');

function calcularValor() {
    // Declaração das var
    let valor = Number(a.value);
    let meses = Number(b.value);
    let juros = Number(c.value)/100; // traz para porcentagem;
    let multa = Number(d.value)/100; // ''      ''         '';

    // Substituição no passoAPasso
    document.getElementById('juros').innerHTML = c.value+"%";
    document.getElementById('multa').innerHTML = d.value+"%";
 
    // Consulta console
    console.log(valor);
    console.log(meses);
    console.log(juros);
    console.log(multa);

    // Equações
    let somaMulta = valor + (valor*multa);
    console.log(somaMulta);

    let equacao = somaMulta + ((somaMulta*juros)*meses);
    console.log(equacao);

    // Mostra o valor final no html
    document.getElementById('result').innerHTML =  "R$: "+equacao.toFixed(2); 
}