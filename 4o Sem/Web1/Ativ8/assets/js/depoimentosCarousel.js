$(document).ready(function(){
    $("#myCarousel").owlCarousel({
        items: 1,
        loop: true,
        autoplay: true,
        autoplayTimeout: 5000,
        autoplayHoverPause: true,
        nav: false, // Enable navigation arrows
        dots: true, // Enable dots navigation
        margin: 10,
        responsive: {
            0: {
                items: 1,
            },
            600: {
                items: 1,
            },
            1000: {
                items: 1,
            }
        }
    });
});
