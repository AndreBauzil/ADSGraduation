import React, { useState } from "react";
import { Post, Content, Posts } from "./style";

export const Segundo = () => {
  const [posts, setPosts] = useState([]);
  const [title, setTitle] = useState("");
  const [imageLink, setImageLink] = useState("");

  // Conteúdo usado na geração automática
  const lorem = "Lorem ipsum dolor sit amet, consectetur adipisicing elit.";
  const nomes = ["Ana", "João", "Maria", "Pedro", "Carla", "Luís", "Mariana", "Rafael"];
  const sobrenomes = ["Silva", "Santos", "Oliveira", "Pereira", "Costa", "Martins", "Ferreira", "Almeida"];

  const criarPost = () => {
    const novoPost = {
      data: new Date(
        2023,
        numRandom(12), // mês
        numRandom(30)  // dia
      ).toLocaleDateString("en-GB"),
      desc: lorem,
      nome: nomes[numRandom(nomes.length)] + " " + sobrenomes[numRandom(sobrenomes.length)],
      src: imageLink !== "" ? imageLink : `/assets/imgs/${numRandom(10)}.jpg`,  // Se o link da imagem for vazio, adiciona imagem random
      title: title !== "" ? title : "Padrão" 
    };

    setPosts([...posts, novoPost]); // Seta um novo post junto com os já existentes para persistência dos dados
    setTitle("");       // Reseta input titulo
    setImageLink("");   // Reseta input link
  };
  const numRandom = (max) => Math.floor(Math.random() * max);  // Geração de número random, usado diversas vezes

  return (
    <>
    <div className="form">
      <div className="inputs">
        <label>
          Título:
          <input type="text" value={title} onChange={(e) => setTitle(e.target.value)} />
        </label>
        <label>
          Link da Imagem:
          <input type="text" value={imageLink} onChange={(e) => setImageLink(e.target.value)} />
        </label>
      </div>
      <div className="buttons"> 
        <button onClick={criarPost}>Enviar</button> 
        <button onClick={() => setPosts([])}>↺</button>
      </div>
    </div>

    <Posts className="posts">
      {posts.map((post, i) => (
        <Post key={i} src={post.src}>
          <Content>
            <p>Título: {post.title}</p>
            <br />
            <p>Data: {post.data}</p>
            <p>Nome: {post.nome}</p>
            <p>Descrição: {post.desc}</p>
          </Content>
        </Post>
      ))}
    </Posts>
    </>
  );
};

export default Segundo;