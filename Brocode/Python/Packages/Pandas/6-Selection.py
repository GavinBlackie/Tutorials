import pandas as pd

#df = pd.read_csv("Brocode/Python/Packages/Pandas/data.csv")
df = pd.read_csv("Brocode/Python/Packages/Pandas/data.csv", index_col="Name")

# SELECTION BY COLUMN!
# NOTE: each individual column is a series object

#print(df["Name"])
#print(df["Name"].to_string())

#print(df["Height"].to_string())
#print(df["Weight"].to_string())

#print(df[ ["Name", "Height", "Weight"] ])

# SELECTION BY ROWS
print(df.loc["Pikachu"])

# : means "everything from HERE to THERE"
print(df.loc["Charizard":"Blastoise", ["Height", "Weight"]].index)

# Print everything from 0 to 10 (second # is exclusive)
print(df.iloc[0:11])

# With a step of 2:
print(df.iloc[0:11:2])


print("\n**********************\n")

# Searching by user input
pokemon = input("Enter a Pokemon name: ")
try:
    print(df.loc[pokemon])
except KeyError:
    print(f"{pokemon} not found")