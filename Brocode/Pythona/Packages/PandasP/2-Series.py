import pandas as pd

# Series = A Pandas 1-D labeled array that can hold any data type
#          Think of it like a single column in a spreadsheet (1D)

# Learning about series! (1D)

data = [100.1, 12435.2, 104.3, 23.4, 12.7, 5.0]
data2 = ["A", "B", "wgrrgwgw"]
data3 = [True, False, True]

# Use index parameter to set displayed strings for each value
# If index does not match num. of data, ValueError will be thrown
series = pd.Series(data, index=["fruit#1:", 
                                "fruit#2", 
                                "fruit#3:",
                                "fruit#4:",
                                "fruit#5:",
                                "fruit#6:"])
print(series)

print("\n--------------\n")

# loc -> locate data based on index
# KeyError will be thrown if nothing is found
print(series.loc["fruit#1:"])
print(series.loc["fruit#3:"])

# printing based on a condition (a "query")
print("\n------Query------\n")
print(series[series >= 100])
print("\n--------------\n")

# iloc -> find based on "index", or "integer" location
print(series.iloc[1])

series2 = pd.Series(data2)
print(series2)

series3 = pd.Series(data3)
print(series3)