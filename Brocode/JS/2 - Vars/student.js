
let fullName = "Patrick Star";
let age = 35;
let isStudent = false;

document.getElementById("p1").textContent = `Your name is ${fullName}`;
document.getElementById("p2").textContent = `You are ${age} years old`;

const P3 = document.getElementById("p3");
P3.textContent = isStudent ? "You are a student" : "You are not a student";