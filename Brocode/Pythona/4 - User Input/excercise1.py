# Exercise Rectangle Area Calculator

length = float(input("Enter the length: "))
width = float(input("Enter the width: "))
areaRect = length * width
areaTri = areaRect / 2

# Num lock (Fn) + alt + 0178 = ² 
print(f"The rectangle's area is: {round(areaRect, 2)} cm². ")
print(f"The triangle's area is: {round(areaTri, 2)} cm². ")
