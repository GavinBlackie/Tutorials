import pandas as pd

# NOTE: need path from working directory!!!
df = pd.read_csv("Brocode/Python/Packages/Pandas/data.csv")

print(df) # For the pandas summary
#print(df.to_string()) # For the whole file

# print a column
# print(df["Name"])
# for name in df["Name"]:
#     print(name)
