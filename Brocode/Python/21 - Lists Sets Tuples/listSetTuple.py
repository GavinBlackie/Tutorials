# Collection = single "variable" (data structure) used to store multiple values
# 
#   List    = [] ordered and mutable (changable). Duplicates OK
#   Set     = {} unordered and immutable, but Add/Remove OK. NO duplicates
#   Tuple   = () ordered and immutable (unchangable). Duplicates OK. FASTER access
#
# Mutable   => Contents can be changed without creating whole new object
# Immutable => Must create new object for changes to "happen"
#
# Ordered   => Data is stored and accessed sequentially (is indexed)
# Unordered => Data is NOT stored and accessed sequentially

# Try to add an "s" to collection names!!
fruits = ["apple", "pineapple", "pear", "orange", "banana", "lime", "coconut"]

try:
    print(fruit)
except NameError:
    print("Thats not the correct variable name, silly!")

print(fruits)

print(fruits[0]) # apple
print(fruits[5]) # lime
print(fruits[-1]) # coconut

print("\n****************\n")

for fruit in fruits:
    print(fruit)

print("\n****************\n")
print(fruit[1:4]) # actually accesses the loose "fruit" var, 
                  # and then prints the chars from [1, 4) -> "oco"
print(fruits[1:4]) # pineapple, pear, orange

#print("\n****************\n")
## Prints the different methods available for that type:
#print(dir(fruits))
## Prints some help about that collection type
#print(help(fruits))
#print("\n****************\n")
print("apple" in fruits) # technically this is a py boolean
print(type("apple" in fruits))
fruits[1] = "pineBananaApple"
print(fruits)

# append => add an element to the end of a list
fruits.append("pineapple")
print(fruits)

fruits.append("pasta")

# remove => removes an element based on a given value to compare to
fruits.remove("pasta")
print("Pasta in Fruits?: " + str("pasta" in fruits))

# sort => sorts the list by some ascending order
fruits.sort() # sorts the strings in alphabetical order, ascending
print(fruits)
# reverse => sort list in descending order
fruits.reverse() # descending alphabetical order
print(fruits)

# clear => empties collection of all elements
fruits.clear()
print(fruits)

fruits = ["apple", "pineapple", "pear", "orange", "banana", "lime", "coconut"]

# index => prints index of an element
print(fruits.index("apple"))
try:
    print(fruits.index("afsfdsfs"))
except ValueError:
    print("That element does not exist, an index cannot be found :(")

# count => returns the count of that element
print(fruits.count("banana"))

fruits.insert(3, "banana")
print(fruits)
print(fruits.count("banana"))

# ---- Sets ----
print("\n************* Sets ****************\n")

fruits = {"apple", "orange", "banana", "coconut", "lime", "lemon", "peach"}
print(fruits)
# print(dir(fruits)) # remember: dir gives some help about a type!
# print(help(fruits))
try:
    print(fruits[0])
except TypeError:
    print("Cannot access a set by index, sets are NOT indexed/are NOT sequential")

fruits.add("pineapple")
fruits.remove("apple")
fruits.remove("banana")
fruits.remove("coconut")
try:
    fruits.remove("a")
except KeyError:
    print("That key does not exist, silly!")

epicFruits = {"lime", "lemon"}

print(epicFruits.issubset(fruits)) # true

# pop => remove whatever element is "first"
print()
print(fruits)
fruits.pop()
print("\n*pop*\n")
print(fruits)

fruits.pop()
print("\n*pop*\n")
fruits.pop()
print("\n*pop*\n")

print(epicFruits.issubset(fruits)) # false

# has no effect - lime is already present, and no exceptions are ever raised
fruits.add("lime")

# "Sets are good for constants!!"

fruits.clear()


print("\n************** Tuples *********************\n")
# print(dir(tuple))
grades = (3.5, 3.3, 3.2, 2.7, 2.9, 2.1, 2.3, 4.0, 2.6, 3.4, 2.1)

print(grades)
print(len(grades))

for grade in grades:
    print(grade)