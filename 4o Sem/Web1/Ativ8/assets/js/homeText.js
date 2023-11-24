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
            setTimeout(startLoop, 2000); // Restart the loop after a delay
        }
    }, 2000);
};

startLoop(); // Start the loop initially
