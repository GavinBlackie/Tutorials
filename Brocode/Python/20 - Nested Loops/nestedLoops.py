# Nested Loops in Python!!
#  => A loop inside of a loop, and so forth
#     Typically have O(n^k), where k is the number
#     of nested loops!

for row in range(0, 5):
    for col in range(0, 5):
        print(str(row + col) + " ", end="")
    print()
