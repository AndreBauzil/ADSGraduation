import { styled } from "styled-components";

export const Post = styled.div`
    width: 100%;
    height: auto;
    ${({ src }) => `background: url(${src}) no-repeat center`}
`;