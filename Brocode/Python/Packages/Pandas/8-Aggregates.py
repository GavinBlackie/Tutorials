import pandas as pd

# Aggregate Functions = A way to reduce sets of values
#                       into single summary ones

# Are often used with the groupby() function

# eg. Mean average!!

df = pd.read_csv("Brocode/Python/Packages/Pandas/data.csv")

# ----- Whole DataFrame -----

# Finds the average for any column that is numeric
print(df.mean(numeric_only=True))

# Find the sum
print(df.sum(numeric_only=True))

# Find min
print(df.min(numeric_only=True))

# Find max
print(df.max(numeric_only=True))

# ----- Single Column -----

print("\n**********************\n")

print(f"Mean: {df["Height"].mean()}")

print(f"Sum: {df["Height"].sum()}")

print(f"Min: {df["Height"].min()}")

print(f"Max: {df["Height"].max()}")

# print(df["Height"].sort_values())

# ----- GroupBy -----

print("\n**********************\n")

# groupby returns a Series object!!!
group = df.groupby("Type1")

for item in group:
    print(type(item))
    print(item)

print(group["Height"].mean())

print("\nSums: ")
print(group["Height"].sum())

print("\nMin: ")
print(group["Height"].min())

print("\nMax: ")
print(group["Height"].max())

print("\Count: ")
print(group["Height"].count())