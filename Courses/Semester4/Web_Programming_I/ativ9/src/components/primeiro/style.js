import styled from "styled-components";

// Recebe a propiedade com array de randoms e pega cada um deles para uma cor
export const Paragrafo = styled.p`
    ${({ randoms }) => `color: rgb(${ randoms[0] }, ${ randoms[1] }, ${ randoms[2] })`};
    font-size: 3rem;
    text-shadow: 3px 4px 3px #000;
`;
