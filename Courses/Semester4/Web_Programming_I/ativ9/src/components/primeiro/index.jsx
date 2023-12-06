import React, { useState } from 'react';
import { Paragrafo } from './style';  // Estilização do parágrafo


export const Primeiro = () => {
  // estados
  const [random, setRandom] = useState('0');
  const [nome, setNome] = useState('Digite o seu nome...');
  
  // variáveis
  let randomNums = []
  let i=0;

  // funções
  const setarNome = () => setNome(document.getElementById("input").value)
  const alterarRandom = () => { 
    do {    // adiciona ao array três números aleatórios entre 0 e 256 
      randomNums.push(Math.floor(Math.random()*256))
      i++
    } while (i<3);
    setRandom(randomNums)
  };

  // condição do componente
  if (nome.includes("...")) {
    return (
      <>
        <input placeholder={ nome } id="input"/>
        <button onClick={ setarNome }>Começar</button>
      </>
    )
  } else {  
    return (
      <>
        <Paragrafo randoms={ random }>{ nome }</Paragrafo>
        <button onClick={ alterarRandom }>Alterar Cor</button>
      </>
    )
  }


};
