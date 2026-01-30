# validate user input exercise

# 1. username is no more than 12 chars
# 2. username must not contain spaces
# 3. username must not contain digits

username = input("Enter your new username: ")
if len(username) > 12:
    print("Cannot be more than 12 chars, removing extra. ")
    username = username[0:12]

if not username.find(' ') == -1:
    print("Cannot have spaces, removing spaces. ")
    username = username.replace(' ', '')

if not username.isalpha():
    print("Your username can't contain numbers")
    #username = username.replace("123456789", '')

print(f"Welcome {username}")



print(username)

