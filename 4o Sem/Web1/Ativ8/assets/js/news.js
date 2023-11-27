document.addEventListener('DOMContentLoaded', () => {
    // Pega as fotos principais and thumbnail container elements
    var mainPhoto = document.querySelector('.news__main-photo');

    // Pega as imagens das thumbnail 
    var thumbnailImages = document.querySelectorAll('.news__thumbnail');

    // Adiciona um click event listeners para cada thumbnail
    thumbnailImages.forEach(thumbnail => {
        thumbnail.addEventListener('click', () => {
            // Troca a imagem de fundo da foto principal para a thumbnail clicada 
            mainPhoto.style.background = 'no-repeat center url(' + thumbnail.src + ')';
            mainPhoto.style.backgroundSize = 'cover'

            // Remove a classe 'active' de todas as thumbnails
            thumbnailImages.forEach(thumb => {
                thumb.classList.remove('active');
            });

            // adiciona a classe 'active' na thumbnail clicada
            thumbnail.classList.add('active');
        });
    });

    // Seta a imagem de fundo padrão para a foto principal
    mainPhoto.style.background = 'no-repeat center url(' + thumbnailImages[1].src + ')';
    mainPhoto.style.backgroundSize = 'cover'

    // Add a classe 'active' na thumbnail principal 
    thumbnailImages[1].classList.add('active');
});