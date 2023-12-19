import styled from "styled-components";

// Recebe a propiedade com array de randoms e pega cada um deles para uma cor
export const Paragrafo = styled.p`
    font-size: 3rem;
    text-shadow: 3px 3px 6px #000;
`;

export const Escolha = styled.div`
    display: flex;
    align-items: center;
    flex-direction: column;
`;

export const Label = styled.label`
    display: grid;
    justify-items: center;
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

export const onClick = (setEstado, valor) => () => setEstado(valor);

export const onBlur = (setEstado, valor) => e => setEstado(e.target.value === '' ? valor : e.target.value);