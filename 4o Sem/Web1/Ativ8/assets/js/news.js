document.addEventListener('DOMContentLoaded', function() {
    // Get the container element for the news photos
    var newsPhotosContainer = document.querySelector('.news__photos');

    // Get the main photo and thumbnail container elements
    var mainPhoto = document.querySelector('.news__photos');
    var thumbnailContainer = document.querySelector('.news__thumbnail-container');

    // Get the thumbnail images
    var thumbnailImages = document.querySelectorAll('.news__thumbnail');

    // Add click event listeners to each thumbnail
    thumbnailImages.forEach(function(thumbnail, index) {
        thumbnail.addEventListener('click', function() {
            // Change the background image of the main photo to the clicked thumbnail
            mainPhoto.style.background = 'no-repeat center url(' + thumbnail.src + ')';
            mainPhoto.style.backgroundSize = cover

            // Remove the 'active' class from all thumbnails
            thumbnailImages.forEach(function(thumb) {
                thumb.classList.remove('active');
            });

            // Add the 'active' class to the clicked thumbnail
            thumbnail.classList.add('active');
        });
    });

    // Set the initial background image for the main photo
    mainPhoto.style.background = 'no-repeat center url(' + thumbnailImages[0].src + ')';

    // Add the 'active' class to the first thumbnail
    thumbnailImages[0].classList.add('active');
});
