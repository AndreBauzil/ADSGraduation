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
  let lorem = "Lorem ipsum dolor sit amet, consectetur adipisicing elit."
  const nomes = ['Ana', 'João', 'Maria', 'Pedro', 'Carla', 'Luís', 'Mariana', 'Rafael'];
  const sobrenomes = ['Silva', 'Santos', 'Oliveira', 'Pereira', 'Costa', 'Martins', 'Ferreira', 'Almeida'];
  let random = Math.random()*nomes.length


  const criarPost = () => {
    setComponents([...components, "Teste"]) // Seta um novo post junto com os já existentes para persistência dos dados
    debugger
  }

  return (
    <>
     <button onClick={ criarPost }>Criar Posts</button> 
     <div className="posts">
      { components.map((post, i) => (
        <Post 
          key={i} 
          {...post} 
          data={Date.now+i} 
          desc={ lorem } 
          nome={nomes[random] + " " + sobrenomes[random]} 
        /> 
      ))}
     </div>
    </>
  )
}