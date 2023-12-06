import { useState } from "react";

const Post = ({ src, data, desc, nome }) => (
  <div className="post">
    <img src={src} alt="Imagem auto-gerada" />
    <p>Data: {data}</p>
    <p>Desrição: {desc}</p>
    <p>Nome: {nome}</p>
  </div>
);


export const Segundo = () => {
  const [components, setComponents] = useState([])

  // const posts = [
  //   { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  //   { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  //   { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  //   { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  //   { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  //   { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  //   { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  // ]

  const criarPost = () => {
    setComponents([...components, "Teste"]) // Seta um novo post junto com os já existentes para persistência dos dados
  }

  return (
    <>
     <button onClick={ criarPost }>Criar Posts</button> 
     <div className="posts">
      { components.map((post, i) => ( <Post key={i} {...post} />)) }
     </div>
    </>
  )
}