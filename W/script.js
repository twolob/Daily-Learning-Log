const mousePointer = document.querySelector('#pointer');
const container = document.querySelector('.container');

container.addEventListener('pointermove', (event) => {
    const {clientX, clientY} = event;
    mousePointer.animate({
        left: `${clientX}px`,
        top: `${clientY}px`
    }, {duration: 3000, fill: 'forwards'});
})