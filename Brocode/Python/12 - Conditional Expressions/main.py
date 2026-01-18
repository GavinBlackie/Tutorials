# conditional expression = A one-line shortcut for if-else
#                          also called the ternary operator
# NOTE: python does not have traditional ternary op., 
#       instead it has  ____ if ___ else ___

num = -7

print("Positive" if num > 0 else "Negative")

result = "EVEN" if num % 2 == 0 else "ODD"
print(result)

a = 6
b = 7

maxNum = a if a > b else b
minNum = a if a < b else b
print(f'Max: {maxNum}')
print(f'Min: {minNum}')

age = 20
status = "Adult" if age >= 18 else "Child"
print(status)

temperature = 23
weather = "HOT" if temperature >= 25 else "COLD"
print(weather)

user_role = "admin      "
user_role = user_role.strip()
access_level = "Full Access" if user_role == "admin" else "Limited"
print(access_level)