import React, { useState } from 'react';
import { Escolha, Paragrafo, Input, onClick, onBlur } from './style';  // Estilização do parágrafo


export const Primeiro = () => {
  // Boolean enviada ou não
  const [enqueteEnviada, setEnqueteEnviada] = useState(false);
  // Inputs
  const [pergunta, setPergunta] = useState('Escreva uma pergunta');
  const [opcao1, setOpcao1] = useState('Primeira Resposta');
  const [opcao2, setOpcao2] = useState('Segunda Resposta');
  // Contador
  const [votosOpcao1, setVotosOpcao1] = useState(0);
  const [votosOpcao2, setVotosOpcao2] = useState(0);

  // Função para resetar a pergunta
  const resetar = () => {
    setEnqueteEnviada(true)
    setVotosOpcao1(0)
    setVotosOpcao2(0)
  }
  

  return (
    <> 
    {!enqueteEnviada ? ( // se enquente não foi enviada, mostra inputs
      <>
          <Input
            value={pergunta}
            onClick={onClick(setPergunta, '')}
            onBlur={onBlur(setPergunta, 'Escreva uma pergunta')}
            onChange={e => setPergunta(e.target.value)}
          />

        <div className="opcoes">
            <Input
              value={opcao1}
              onClick={onClick(setOpcao1, '')}
              onBlur={onBlur(setOpcao1, 'Primeira Resposta')}
              onChange={e => setOpcao1(e.target.value)}
            />
            <Input
              value={opcao2}
              onClick={onClick(setOpcao2, '')}
              onBlur={onBlur(setOpcao2, 'Segunda Resposta')}
              onChange={e => setOpcao2(e.target.value)}
            />
        </div>
        <button onClick={resetar}>Enviar</button>
      </>
      ) : ( // senão, mostra a enquete
       <>
        <div className="header">
          <Paragrafo>{pergunta}</Paragrafo>
          <button onClick={() => setEnqueteEnviada(false)}>↺</button>
        </div>


        <div className="votos">
          <Escolha>
            <Paragrafo>{opcao1}</Paragrafo> 
            <button onClick={() => setVotosOpcao1(votosOpcao1 + 1)}>
              {votosOpcao1} votos
            </button>
          </Escolha>

          <Escolha>
            <Paragrafo>{opcao2}</Paragrafo> 
            <button onClick={() => setVotosOpcao2(votosOpcao2 + 1)}>
              {votosOpcao2} votos
            </button>
          </Escolha>

        </div>
        </>
      )}
    </>
  );
};

export default Primeiro;