
name = input("Enter your full name: ")

# len => gives a # of how many characters are in the string
nameLength = len(name)
print("Length: " + str(nameLength))

# find => gives the first occurance of a certain char
# (returns -1 if no result)

spaceIndex = name.find(' ')

print(f"Index of Space: {spaceIndex}")

# rfind => gives last occurance of certain char

reverseSpaceIndex = name.rfind('o')
print(f"Reverse index of 'o': {reverseSpaceIndex}")

# Finding an entire string!
print(f'Index of "Gavin":  {name.find("Gavin")}')

# capitalize => makes first letter uppercase, rest lower
print("Capitalized: " + name.capitalize())

# upper => make all chars uppercase
print("UPPER: " + name.upper())

# lower => make all chars lowercase
print("lower: " + name.lower())


# isdigit => true or false if it is a number string
print(f"isDigit: {name.isdigit()}")

# isalpha => true or false if it is only alphabetical
#            (spaces do NOT count!!!)
print(f"isalpha: {name.isalpha()}")


# isalnum => true or false if alphanumeric
print(f"isalnum: {name.isalnum()}")



print("\n****************\n")
# Another example: phone numbers!!
phone_number = input("Enter your phone number: ")

# count => counts how many times a string occurs

# Lets count how many dashes are in the phone number
print(phone_number.count("-"))
print(phone_number.split("-"))

print(phone_number.replace('-', ' '))
print(phone_number)

phone_number = phone_number.replace("-", ' ')
print(phone_number)


print(help(str))