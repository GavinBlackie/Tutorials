
// Function that generates a random number between two values
function getRandom(min, max) {
    return Math.floor(Math.random() * (max-min+1)) + min;
}

// Creates a random number between 1 and 6 (+ 1 means offset of 1)
// The floor method gets rid of the random decimal portion
let x = Math.floor(Math.random() * 6) + 1;

// Roll a 20-sided dice (random integer number between 1 and 20)
let y = Math.floor(Math.random() * 20) + 1;

// Random positive "double" between 0 and 100
let z = Math.random() * 10

console.log(x);