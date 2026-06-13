import random
# While Loop => executes a code block while some condition remains true
# NOTE: code blocks are indents in Python unlike compiled languages!!!
# As always, consider cases where the loop can be infinite!

name = input("Enter your name: ")

while name == "" and name.isdigit():
    print("You did not enter your name")
    name = input("Please reenter your name: ") # This is required to escape the loop!
print(f"Hello {name}")

# Can be used interchangably with "for-loops" in theory
count = 5
while count > 0:
    print(count)
    count -= 1
print("Happy New Year!!!\n")

# Loop I created with a "try-catch" block to validate the input before escaping the loop :0
# This is similar structure to what I do in Java command line programs :)
age = None
while age is None:
    try:
        age = int(input("Enter your age in years: "))
    except ValueError:
        print("That's not a valid age, silly! Try again. ")
print(f"You are {age} year{ 's' if age > 1 else ''} old. ") # Added a simple ternary statement for plurals


# Food example
food = input("Enter your favourite food (q to quit): ")
while food.strip() != 'q':
    print(f"You like {food}")
    food = input("Enter another favourite food (q to quit): ")
print("Banana Bye!!! :0")


# My own number guessing game!
num = None
answer = random.randint(1, 10)
while num != answer:
    try:
        num = int(input("Guess a number between 1 and 10: "))
    except ValueError:
        print("That's not a number! Please try again. ")
        continue
print("You guessed the number! Congrats :0 !")