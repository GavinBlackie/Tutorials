# JSON = JavaScript Object Notation

import json

jsonStr = '''
    {
        "students": [
            {
                "id" : 1,
                "name" : "Spongebob",
                "age" : 30
            },
            {
                "id" : 2,
                "name" : "Patrick",
                "age" : 35
            },
            {
                "id" : 3,
                "name" : "Squidward",
                "age" : 43
            }
        ],
        "isCoolObj" : true
    }
'''
# load a json string into a usable python dict!
# note : loads is different from load
data = json.loads(jsonStr)

spongeDict = data["students"][0]
print(spongeDict)

# for item in spongeDict.items() :
#     print(item)

# for key in spongeDict.keys() :
#     print(key)

for value in spongeDict.values():
    print(value)

# print(data["students"][1])
# print(data["students"][2])

for item in data.items():
    print(item)
    print()

# Modify/add values
data["banana"] = True

# Dumping into a new json string
# sort_keys is a bool if the keys need to be sorted alphabetically
# indent just specifies spacing/formatting
newJsonStr = json.dumps(data, indent=4, sort_keys=True)
print(newJsonStr)