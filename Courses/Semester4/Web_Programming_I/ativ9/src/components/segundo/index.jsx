import { useState } from "react";


export const Post = ({ data, desc, nome }) => (
  <div className="post">
      <p>Data: {data}</p>
      <p>Desrição: {desc}</p>
      <p>Nome: {nome}</p>
  </div>
);

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
      nome: nomes[numRandom(nomes.length)] + " " + sobrenomes[numRandom(sobrenomes.length)]
    }
    setComponents([...components, novoPost])
  }
  // const criarPost = () => setComponents([...components, "Teste"])   // Seta um novo post junto com os já existentes para persistência dos dados
  const numRandom = max => Math.floor(Math.random()*max)  // Geração de número random, usado diversas vezes


  return (
    <>
     <button onClick={ criarPost }>Criar Posts</button> 
     <div className="posts">
      { components.map((post, i) => (
        <Post 
          key={i} 
          {...post} 
          src={`../../assets/imgs/${numRandom(10)}.png`}
          // data={
          //   new Date(
          //     2023, 
          //     numRandom(12),  // mês
          //     numRandom(30)   // dia
          //   ).toLocaleDateString("en-GB")
          // } 
          // desc={ lorem } 
          // nome={
          //   nomes[numRandom(nomes.length)] + " " + 
          //   sobrenomes[numRandom(sobrenomes.length)]
          // } 
        /> 
      ))}
     </div>
    </>
  )
}