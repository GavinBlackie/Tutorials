# sudo apt install python3-numpy
import numpy as np
print(np.__version__)

# Native python list
my_list = [1, 2, 3, 4]

my_list *= 2 # this does not do vectorized multiplication!

print(my_list)