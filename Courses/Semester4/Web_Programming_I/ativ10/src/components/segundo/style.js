import { styled } from "styled-components";

export const Posts = styled.div`
    display: grid;
    align-items: center;
    grid-template-columns: repeat(3, 1fr); 
    grid-gap: 1rem;
    max-height: 618px;
    overflow: hidden scroll;
    scroll-behavior: smooth;
`;

export const Post = styled.div`
    background: ${({ src }) => `url("${src}") no-repeat center`};
    background-size: cover;
    border: 1px solid #ccc;
    margin-bottom: 20px;
    position: relative;
    display: flex;
    overflow: auto; 
    border-radius: 16px;
    box-shadow: 5px 6px 0px rgba(0,0,0,0.2);
    min-height: 15rem;
    max-width: 20rem;
    align-items: flex-end;
`;

export const Content = styled.div`
    background-color: rgba(0, 0, 0, 0.5);
    padding: 1.5rem;
    border-radius: 2rem 2rem 0rem 0rem;
    height: 100%;
    position: relative;
    top: 50%;
    color: white;
`;
