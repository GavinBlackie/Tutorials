# if = Do some block of statements only IF the condition is true
#      Else do something else (optional)

while True:
    try:
        age = int(input("Enter your age: "))
        break
    except ValueError as err:
        print("That is an invalid integer!")


if age >= 100:
    print("You are too old to sign up!")
elif age >= 18: 
    print("You are now signed up!")
elif age < 0:
    print("You have not been born yet!")
else:
    print("You are too young to sign up!")

name = input("Enter your name: ")
if name == "":
    print("No name!")
else:
    print(f"Hello {name}")


online = False

print("User is online") if online else print("User is offline")

# This is why switches are better when possible (literal elif structure):
# if ____ :
# else:
#   if:
#       else:
#           if:
#               else: