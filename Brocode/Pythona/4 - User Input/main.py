# input() = A built-in function prompting user to enter data based
#           on the given string parameter. Returns entered data

name = input("What is your name?: ")
age = int( input("How old are you?: ") ) # Convert to integer
age += 1 # cannot do age++ !!!!

print(f"Hello {name}!")
print(f"You are {age} years old!")