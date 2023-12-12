import { styled } from "styled-components";

export const Form = styled.form`
    display: flex;
    flex-direction: column;
    align-items: center;
`;

export const Inputs = styled.div`
    display: flex;
    flex-direction: column;
    align-items: flex-end;
    padding: 1rem 0;
`;

export const Input = styled.input`
    margin-left: 2rem;
    max-width: 50%;
`;


export const Button = styled.button`
    margin-top: 1rem;
    align-self: stretch;
`;

export const Label = styled.label`
    font-size: 2rem;
`;

export const Video = styled.video`
    border-radius: 2rem;
`;
