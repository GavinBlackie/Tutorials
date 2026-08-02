import numpy as np
import sys

# Nested Loops in Python!!
#  => A loop inside of a loop, and so forth
#     Typically have O(n^k), where k is the number
#     of nested loops!

# O(n^2)
for row in range(0, 5):
    for col in range(0, 5):
        print(str(row + col) + " ", end="")
    print()

print("\n**********************\n")

# Use the "end" parameter to change the ending to a print
for y in range(1, 8):
    print(2**y, end=" ")

# --- Messing around with numpy here (somewhat unrelated) ---
print("\n**********************\n")

A = np.matrix([[1, 2],
               [3, 4]])


print(A)

# A special printing function I made for printing matrix attributes
def matrix_attr_print(str : str, m : np.matrix, func, attr=None, roundingFactor=4):
    FIXED_PADDING = 20
    padding = abs(len(str) - FIXED_PADDING)

    if (func != None):
        # https://stackoverflow.com/questions/29044940/how-can-you-use-a-variable-name-inside-a-python-format-specifier
        print(f"{str}" + f"{float(func(m)):>{padding}.{roundingFactor}}")
    elif (attr == "ndim"):
        print(f"{str}" + f"{float(m.ndim):>{padding}.{roundingFactor}}")

matrix_attr_print("SUM:", A, np.matrix.sum)
matrix_attr_print("STDDEV:", A, np.matrix.std, roundingFactor=2)
matrix_attr_print("Dimensions:", A, None, attr="ndim")

# print(len("SUM: ") + 10)
# print(len("STDDEV: ") + 10)
# print(f"STDDEV: {A.std():>10.2}")
# print(f"Dimensions: {A.ndim:^10}")

print('\n')

B = np.array([[1, 4, 6], [-4, 2, 1], [1, 3, -2]])
for b in B:
    print(b)


print("\n**********************\n")

# A funky checker board 1s and 0s pattern I made
for n in range(5):
    for m in range(5):
        print( (m + n) % 2, end="")
    print()

print("\n**********************\n")

try:
    rows = int(input("Enter the # of rows: "))
    cols = int(input("Enter the # of cols: "))
except ValueError:
    print("That's not a valid number, silly! Terminating early...")
    sys.exit(-1) # apparently this is how you terminate a python program early!

symbol = input("Please enter a symbol to use!: ")

# "row-by-col"
for row in range(rows):
    for col in range(cols):
        print( symbol, end="")
    print()
