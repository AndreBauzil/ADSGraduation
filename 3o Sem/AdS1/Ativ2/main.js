
const a  = document.getElementById('a');
const b  = document.getElementById('b');
const d  = document.getElementById('d');
const c  = document.getElementById('c');



function calcularValor() {
    let valor = Number(a.value);
    let meses = Number(b.value);
    let juros = Number(c.value)/100; // traz para porcentagem;
    let multa = Number(d.value)/100; // ''      ''         '';

    document.getElementById('juros').innerHTML = c.value+"%";
    document.getElementById('multa').innerHTML = d.value+"%";
 
    console.log(valor);
    console.log(meses);
    console.log(juros);
    console.log(multa);


    let somaMulta = valor + (valor*multa);
    console.log(somaMulta);
    let equacao = somaMulta + ((somaMulta*juros)*meses);
    console.log(equacao);

    document.getElementById('result').innerHTML =  "R$: "+equacao.toFixed(2); 
}