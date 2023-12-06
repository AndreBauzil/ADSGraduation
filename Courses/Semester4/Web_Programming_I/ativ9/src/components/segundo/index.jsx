
const Post = ({ src, data, desc, nome }) => {
  <div>
    <img src={src} alt="Imagem auto-gerada" />
    <p>Data: {data}</p>
    <p>Desrição: {desc}</p>
    <p>Nome: {nome}</p>
  </div>
};


export const Segundo = () => {
  const posts = [
    { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
    { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
    { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
    { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
    { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
    { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
    { src: 'url1', data: '01/01/2023', descricao: 'Descrição 1', nome: 'Nome 1' },
  ]

  return (
    <div>
      {posts.map(post => {
        <Post {...post} />
      })}
    </div>
  )
}