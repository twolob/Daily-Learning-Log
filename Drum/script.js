const numberOfDrums = document.querySelectorAll(".drum").length;

for(let i = 0; i < numberOfDrums; i++) {
    document.querySelectorAll(".drum")[i].addEventListener("click", () =>{
        let sound = new Audio(`sound/drum-${i}.mp3`);
        sound.play();
    })
}