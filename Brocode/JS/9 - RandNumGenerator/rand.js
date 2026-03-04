
// Generates a random number between 1 and 6!!!
let randNum = Math.floor(Math.random() * 6) + 1;

console.log(randNum);


// Define a dice roll func!:
function diceRoll() {
    return Math.floor(Math.random() * 6) + 1;
}

function getRandInt(min, max) {
    let range = max - min;
    return Math.floor(Math.random() * range) + min;
}