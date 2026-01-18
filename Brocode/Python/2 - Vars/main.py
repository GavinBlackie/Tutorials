# Variable = A container for a value (string, char, int, float, bool)
#            A variable behaves as if it was the value it contains

firstName = "Gavin"
food = "pizza"
email = "spongebobfake@fake.com"

# --- Strings ---
# Formatted string prints:
print(f"Hello {firstName}")
print(f"You like {food}\n")
print(f"Your email is: {email}")

# --- Ints ---
age = 25
qty = 3
print("You are: " + str(age) + " years old.")
print("You are buying " + qty.__str__() + " items.")

x = 4
y = 6
print("The sum is: " + str(x + y))

# --- Floats ---
price = 10.99
gpa = 3.2
weight = 55.4

print(f"The price is ${price}")
print(f"Your gpa is: {gpa}")
print(f"You weigh {weight}kg")

# --- Bools ---
isStudent = False
forSale = True
isOnline = True

# Python "kind of" has a ternary operator (no ? : ; pattern though)
print("You are a student") if isStudent else print("You are not a student")

if forSale:
    print("That item is for sale!")
else:
    print("That item is not for sale...")

# "Assignment" : make 4 creative variables

balance = 45.64
isEatingApples = False
isGoodProgrammer = False
numberBigMacs = 16
numCars = 45
msg = "This is an insane message!!!"
fruit = '''APPLE'''