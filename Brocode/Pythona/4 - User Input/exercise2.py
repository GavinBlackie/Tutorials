# Exercise 2 Shopping Cart Program

# 3 vars: item, price, quantity
item = input("What item would you like to buy?: ")
price = float(input("What is the item's price?: "))
quantity = int(input("How many are you going to buy?: "))
balance = float(input("What is your bank balance?: "))
total = price * quantity

print(f"You are buying a: {item}")
print(f"Price: ${round(price, 2)}")
print(f"Quanity: {quantity}")
print(f"Current Balance: ${round(balance, 2)}")
print(f"Total cost : ${round(total, 2)}")

if (balance >= total):
    print("You can afford the item!")
else:
    print("You cannot afford the item!")