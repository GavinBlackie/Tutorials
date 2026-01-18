import pandas as pd

# A python dictionary
calories = { "Day 1" : 1750, "Day 2" : 2100, "Day 3" : 1700}

# Create a new series object!
# Let index just be the default values
series = pd.Series(calories)

# print the whole series (will be in the special format)
print(series)

# print the loc (print an index based on key)
try:
    print(f"Value: {series.loc["Day 1"]}")
except KeyError:
    print("Thats not a key, silly!")


# print based off a query (condition)
print("\n---------------------\n")
print("The days I did NOT stick to my diet: ")
print(series[series >= 2000])
print("The days I DID stick to my diet: ")
print(series[series < 2000])

print("\n---------------------\n")

# Imagine this is a dict of titles to book isbns
books = {"The Lord of the Rings" : 435467, 
         "Banana Book" : 243,
         "Monkey Chef" : 43543,
         "Education on Rigatoni" : 4535}

bookSer = pd.Series(books)

print(bookSer.loc["Banana Book"])
print(bookSer.loc["Monkey Chef"])
print(bookSer[bookSer > 5000])