import React, { useState } from 'react';
import { Escolha, Paragrafo } from './style';  // Estilização do parágrafo


export const Primeiro = () => {
  const [pergunta, setPergunta] = useState('Faça uma pergunta');
  const [opcao1, setOpcao1] = useState('');
  const [opcao2, setOpcao2] = useState('');
  const [votosOpcao1, setVotosOpcao1] = useState(0);
  const [votosOpcao2, setVotosOpcao2] = useState(0);
  const [enqueteEnviada, setEnqueteEnviada] = useState(false);

  return (
    <>
      {enqueteEnviada ? (
        <>
          <Paragrafo>{pergunta}</Paragrafo>

          <div className="votos">
            <Escolha>
                <Paragrafo>{opcao1}</Paragrafo> 
                <button onClick={() => setVotosOpcao1(votosOpcao1 + 1)}>{votosOpcao1} votos</button>
            </Escolha>
            <Escolha>
                <Paragrafo>{opcao2}</Paragrafo> 
                <button onClick={() => setVotosOpcao2(votosOpcao2 + 1)}>{votosOpcao2} votos</button>
            </Escolha>
          </div>
        </>
      ) : (
        <>
            <label>Pergunta:
                <input
                    type="text"
                    value={pergunta}
                    onChange={e => setPergunta(e.target.value)}
                />
            </label>

            <div className="opcoes">
                <label>Opção 1:
                    <input
                        type="text"
                        value={opcao1}
                        onChange={e => setOpcao1(e.target.value)}
                    />
                </label>
                <label>Opção 2:
                    <input
                        type="text"
                        value={opcao2}
                        onChange={e => setOpcao2(e.target.value)}
                    />
                </label>
                <button onClick={() => setEnqueteEnviada(true)}>Enviar</button>
            </div>
        </>
      )}
    </>
  );
};

export default Primeiro;