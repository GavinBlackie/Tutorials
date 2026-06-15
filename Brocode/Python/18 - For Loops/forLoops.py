# for loop => execute a code block for a fixed number of times.
#             Typically iterates over a list, string, range, sequence, etc.
#             Python has different looking for-loops compared to other languages!!!
#
# As always, for loops and while loops are always interchangable

# ANY object in python that is ITERABLE, can be used in a for loop
# Python for loops do not use indexes in the same way that other languages do!!! :(

for num in range(10):
    print(num)
print('\n')

for num in range(1, 11): # inclusive, exclusive!
    print(num)
print('\n')


# This will print nothing because the given range does not make sense
# with the negative step value!!! :00 WOW bananrama spongar
for num in range(1, 11, -1):
    print(num)
print('\n')

for num in range(11, 1, -1):
    print(num)
print('\n')

for count in range(0, 9, 2):
    print(count)
print('\n')

for count in range(0, 10, 3):
    print(count)
print('\n')

# -- Iterating over a String --

credit_card = "4323-5542-5645-2345"
for num in credit_card:
    print(num) if (num != '-') else print('') # Python ternary operator statement :0
    # print(num) # prints each individual char!! (but python treats them like mini strings)
print('\n')

for x in range(1, 17):
    if x == 13:
        continue # can use contnues and breaks in for loops as well!!
    else:
        print(x)
    