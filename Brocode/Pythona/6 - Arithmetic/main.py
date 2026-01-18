import math

friends = 0
# friends = friends + 1
friends += 1

# Rembember: friends++ does not work in python!

# Math operators: + - * / // %

friends *= 3
friends ** 2
friends //= 7
friends -= 4
friends += 6
friends *= 5

# "Divide people into groups of 3 - find who is a lone bum"
remainder = friends % 3

print(friends)
print(remainder)

# Math functions - round(), floor(), ceiling(), pow(),
#                  max(), min
# fxns inside math package: floor, ceil, sqrt
# math.pi, math.e, are constants

x = 3.14
y = 7
z = -1

print(math.floor(4.7)) # 4
print(math.ceil(6.8)) # 7

print( round( pow(y, x), 2) ) # 450.41

print(max(x, y, z)) # 7
print(min(x, y, z)) # -1

print(math.sqrt(9)) # 3.0 (sqrt returns float)

# Calculate circumference of a circle 2 * pi * r
print("\n---------------------------\n")

radius = float(input("Enter the radius of a circle: "))
circumference = 2 * math.pi * radius

print(f"\nThe circumference is: {round(circumference, 2)}")


# Also calculate area of a circle pi * (r ** 2)
area = 2 * math.pi * radius
print(f"The area is: {round(area, 2)} cm²")

# Pythagorean theorem - finding hypotenuse
# c = sqrt (a**2 + b**2)
print("\n---------------------------\n")

a = float(input("Enter side A: "))
b = float(input("Enter side B: "))

c = math.sqrt( pow(a, 2) + pow(b, 2) )
print(f"The hypotenuse is about: {round(c, 8)}") 