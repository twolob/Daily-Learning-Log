const count = document.querySelector('.count');
const start = document.querySelector('.start');
const stops = document.querySelector('.stop');
const restart = document.querySelector('.restart');

let increment = 1;
start.addEventListener('click', () => {
    const counting = setInterval(() => {
        count.innerText = increment++;
        
        stops.addEventListener('click', () => {
            clearInterval(counting);
        });

        restart.addEventListener('click', () => {
            increment = 0;
            count.innerText = increment;
            clearInterval(counting);
        });
    }, 1000)
});
