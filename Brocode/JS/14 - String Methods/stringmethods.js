// String Methods => Ways to manipulate strings

// JavaScript uses "string" type!

// Syntax: stringVar.stringmethod(*params here*)

let userName = "PatrickStar5     ";

// charAt => get a single character of a string
//          given an index value
console.log(userName.charAt(0));
console.log(userName.charAt(7));

// indexOf => returns the first index of that character or string
console.log(userName.indexOf("a"));
// lastIndexOf => same as indexOf, but returns the last index
console.log(userName.lastIndexOf("a"));

// trim => trims off excess white space
console.log(`Trimming "${userName}" down to "${userName.trim()}"!!!`);
userName = userName.trim();

// length => returns the size of that string
//           IS NOT a method, just a property/attribute
console.log(`The char length of ${userName} is: ${userName.length}`);


// toUpperCase => changes all chars to their uppercase varients 
console.log(`UPPERCASE: ${userName.toUpperCase()}`);
// toLowerCase
console.log(`lowercase: ${userName.toLowerCase()}`);


// ----- Bool methods ------

// startsWith => returns bool if string starts with that char/string
if ( userName.startsWith(" ") ) {
    console.log("Your username cannot start with a space!")
}
else {
    console.log("Your username follows spacing guidelines ;)")
}

// endsWith => same as startswith, but at end
userName.endsWith("5") ? console.log("username ends with a 5") : console.log("no 5 :(");


// includes => returns bool if that char occurs at all
userName.includes(" ") ? console.log("has spaces") : console.log("no spaces");

// ---------------------------


// Phone # Demo:
let phoneNumber = "123-456-7890";
console.log(phoneNumber);

// ReplaceAll => replaces all chars with another char
phoneNumber = phoneNumber.replaceAll("-", "/");
console.log(phoneNumber);

// PadStart => adds some amount of characters to the start given a size and char
console.log(phoneNumber.padStart(15, "0"));
// PadEnd
console.log(phoneNumber.padEnd(15, "0"));
console.log(phoneNumber.padEnd(17, "WOW"));