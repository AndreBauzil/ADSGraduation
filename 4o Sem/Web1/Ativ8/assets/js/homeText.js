const span = document.querySelector(".home > h1 > span");

var chars = ['o', '', 'a', ''];

let attSpan = (index) => {
    span.innerHTML = chars[index];
};

let startLoop = () => {
    let i = 0;

    let intervalId = setInterval(() => {
        attSpan(i);
        i++;

        if (i >= chars.length) {
            clearInterval(intervalId);
            startLoop(); // Restart the loop after a delay
        }
    }, 1500);
};

startLoop(); // Start the loop initially
