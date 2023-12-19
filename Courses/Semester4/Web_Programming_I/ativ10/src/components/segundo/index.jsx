import React, { useState } from 'react';

export const Segundo = () => {
  const [titulo, setTitulo] = useState('');
  const [imagem, setImagem] = useState('');
  const [posts, setPosts] = useState([]);

  const enviarPost = () => {
    const novoPost = {
      titulo,
      imagem,
    };

    setPosts([...posts, novoPost]);
    setTitulo('');
    setImagem('');
  };

  return (
    <div>
      <label>Título:</label>
      <input
        type="text"
        value={titulo}
        onChange={(e) => setTitulo(e.target.value)}
      />
      <label>Link da Imagem:</label>
      <input
        type="text"
        value={imagem}
        onChange={(e) => setImagem(e.target.value)}
      />
      <button onClick={enviarPost}>Enviar</button>

      <div>
        {posts.map((post, index) => (
          <div key={index}>
            <p>{post.titulo}</p>
            <img src={post.imagem} alt={post.titulo} />
          </div>
        ))}
      </div>
    </div>
  );
};

export default Segundo