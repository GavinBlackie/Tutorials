import pandas as pd

df = pd.read_csv("Brocode/Python/Packages/Pandas/data.csv")

# Filtering = Keeping rows that match a condition,
#             searching based on a condition

# Each column is a series!!!
# 
# so we can just treat the internal column as a series!

tall_pokemon = df[df["Height"] >= 2]

print(tall_pokemon)
print(tall_pokemon["Height"])

# All heights are floats!!!
# for item in tall_pokemon["Height"]:
#     print(type(item))

heavy_pokemon = df[ df["Weight"] >= 100 ]
print(heavy_pokemon)

# True also means 1 in python
legendary = df[ df["Legendary"] == True ]
print(legendary)

# Searching for water based pokemon!!!
# NOTE: MUST use | or & for bitwise conditions!!!, 
#       and also use brackets () for each conditition
water_pokemon = df[ (df["Type1"] == "Water") | 
                    (df["Type2"] == "Water")]

print(water_pokemon)

fire_flying_pokemon = df[ (df["Type1"] == "Fire") &
                          (df["Type2"] == "Flying") ]

print(fire_flying_pokemon)