/* Variable = A container that stores a value!
              Behaves as if it were the contained value,
              depends on type!!!

JS Types:
number, string, boolean, null, undefined, unknown, any

*/

// Declaration: let x, y, z;
// Assignment:  x = 100;

let x;
x = 23424;

console.log(x);

let age = 20;       // number
let price = 14.99;  // number
let gpa = 2.1;      // number
let favColour = "Blue"; // string
let isRich = false; // boolean

console.log("You are " + age + " years old. ");
console.log(`The type of age is: ${typeof age}\n`);

console.log("The price is $" + price);
console.log(`Your GPA is: ${gpa}`);
console.log(`Your favourite colour is: ${favColour}`)

let firstName = "Bob", lastName = "Dylan";
console.log(`Welcome, ${firstName}, ${lastName}`);
document.getElementById("box").innerHTML = `<p>Welcome, ${firstName}</p>`

let favFood = "chinese food";
console.log(`${firstName}'s favourite food is: ${favFood}`)

let email = "spongebob123@bikinibottom.sea";

let isOnline = true;
console.log(typeof isOnline);
if (isOnline) {
    console.log("You are online!!!");
}
else {
    console.log("You are offline!!!");
}

let forSale = false;
let isStudent = true;