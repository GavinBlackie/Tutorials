import json

data = {"Banana" : 100, "Steve" : [{"WOW!" : 3.45}, {"rigatoni" : 203}]}

file = None
try:
    file = open("Other/PY JSON/data2.json", "w")
    json.dump(data, file, indent=4, sort_keys=True)
finally:
    if file is not None:
        file.close()