import json

# Loading json data from a file!

with open("Other/PY JSON/data.json", "r") as file:
    data = json.load(file)

print(data)
# print(data.items())