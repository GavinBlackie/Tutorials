import numpy as np

# Multidimensional array, or a "Matrix"!!!
arr = np.array([['S', 'P', 'O'], 
               ['N', 'G', 'E'], 
               ['B', 'O', 'B']])

print(arr)

print("\narr dimensions: " + str(arr.ndim))


# A 3D array
# NOTE: must keep a consistent "shape", will cause ValueErrors otherwise
arr2 = np.array([
                  [ ['P', 'A', 'T'], ['R', 'I', 'C'], ['K', ' ', 'S'] ], 
                  [ ['T', 'A', 'R'], [' ', 'I', 'S'], [' ', 'C', 'O']], 
                  [ ['O', 'L', ' '], [' ', ' ', ' '], [' ', ' ', ' ']],
                  [ [' ', ' ', ' '], [' ', ' ', ' '], [' ', ' ', ' ']], 
                  [ [' ', ' ', ' '], [' ', ' ', ' '], [' ', ' ', ' ']],
                  [ ['A', 'B', 'C'], ['D', 'E', 'F'], ['G', 'H', 'I']],
                  [ ['J', 'K', 'L'], ['M', 'N', 'O'], ['P', 'Q', 'R']],
                  [ ['S', 'T', 'U'], ['V', 'W', 'X'], ['U', 'Z', ' ']],
                  [ [' ', ' ', ' '], [' ', ' ', ' '], [' ', ' ', ' ']]
                  ])

print(arr2)

print("\narr2 dims: " + str(arr2.ndim))

# Shape = tuple to describe the "x, y, z" sizes
print(f"arr2 shape (row, col, depth): {arr2.shape}")

# Accessing elements
print(f"(1, 0, 1) = {arr2[1][0][1]}")
print(f"(0, 0, 0) = {arr2[0, 0, 0]}") # For numPy arrs only!

# test = [[[0, 1]], [], []]
# print(test[0][0][0])

word = arr2[5, 0, 0] + arr2[7, 0, 0] + arr2[7, 0, 0] 
print(word)