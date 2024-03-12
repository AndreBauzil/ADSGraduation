import styled from "styled-components";

export const Paragrafo = styled.p`
    font-size: 3rem;
    text-shadow: 4px 4px 4px #000;
    color: #FFF;
`;

export const Escolha = styled.div`
    display: flex;
    align-items: center;
`;

export const Input = styled.input`
    border-radius: 10px;
    text-align: center;
    padding: .5rem;
    margin: 0 1rem;
    text-shadow: 3px 3px 6px #000;
  
    display: flex;
    align-items: center;
    flex-direction: column;
`;

// seta os estados com base nos especificados
export const onClick = (setEstado, valor) => () => setEstado(valor);
// reseta o valor do "placeholder" do input
export const onBlur = (setEstado, valor) => e => setEstado(e.target.value === '' ? valor : e.target.value);