import { useState } from "react";
import { Post, Content, Posts } from "./style";

export const Segundo = () => {
  const [components, setComponents] = useState([])

  // variáveis usadas na geração automática
  let lorem = "Lorem ipsum dolor sit amet, consectetur adipisicing elit."
  const nomes = ['Ana', 'João', 'Maria', 'Pedro', 'Carla', 'Luís', 'Mariana', 'Rafael'];
  const sobrenomes = ['Silva', 'Santos', 'Oliveira', 'Pereira', 'Costa', 'Martins', 'Ferreira', 'Almeida'];
  
  // funções
  const criarPost = () =>{
    const novoPost = {
      data: new Date(
        2023, 
        numRandom(12),  // mês
        numRandom(30)   // dia
      ).toLocaleDateString("en-GB"),
      desc: lorem,
      nome: nomes[numRandom(nomes.length)] + " " + sobrenomes[numRandom(sobrenomes.length)],
      src: `/assets/imgs/${numRandom(10)}.jpg`
    }
    setComponents([...components, novoPost])       // Seta um novo post junto com os já existentes para persistência dos dados
  }
  const numRandom = max => Math.floor(Math.random()*max)  // Geração de número random, usado diversas vezes

   
  return (
    <>
     <button onClick={ criarPost }>Criar Post</button> 
     <Posts className="posts">
      { components.map((post, i) => (
        <Post key={i} src={ post.src } >
          <Content>
            <p>Data: { post.data }</p>
            <p>Nome: { post.nome }</p>
            <p>Desrição: { post.desc }</p>
          </Content>
        </Post>
      ))}
    </Posts>
    </>
  )
}