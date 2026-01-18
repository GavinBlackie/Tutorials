import pandas as pd

# DataFrame = A tabular data structure with rows AND columns (2D)
#             Simular to an excel spreadsheet
#             Think of it as an object with many series inside it!

data = {
    "Name" : ["Spongebob", "Patrick", "Squidward", "Eugine", "Sandy"],
    "Age" : [30, 35, 42, 60, 27]
}

# dataframe or df
df = pd.DataFrame(data, index=["Employee 1", "Employee 2", "Employee 3", "Employee 4", "Employee 5"])

print(df)

# loc -> location by label
key = input("Please enter a label to find the row of (empty to quit): ")
key.strip()
while key is not None and key != "":
    try:
        print("")
        print(df.loc[key])
        print("\n--------------\n")
        break
    except KeyError:
        print("Invalid Emp id")
    key = input("Please enter a label to find the row of (empty to quit): ")
    key.strip()
print(key)

# iloc -> location by actual index value
# for i in range(len(df)) :
#     print(df.iloc[i])

# Adding a new column:
df["Job"] = ["Cook", "N/A", "Cashier", "Manager", "Engineer"]

# Adding a new row:
newRow = pd.DataFrame([{"Name" : "Plankton", "Age" : 49, "Job": "Engineer"},
                       {"Name" : "Steve", "Age" : 30, "Job": "Woodcutter"}], 
                       index=["Employee 6", "Employee 7"])
df = pd.concat([df, newRow])

print(df)


