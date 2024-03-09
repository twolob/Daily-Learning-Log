const mousePointer = document.querySelector(".mouse-pointer");

document.addEventListener("pointermove", (event) => {
    const { clientX, clientY } = event;
    mousePointer.animate({
        left: `${clientX}px`,
        top: `${clientY}px`
    }, {duration: 3000, fill: "forwards"});
});