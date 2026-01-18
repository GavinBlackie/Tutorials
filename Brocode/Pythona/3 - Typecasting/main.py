# Typecasting = process/ability to convert variable values from one
#               type to another
# str(), int(), float(), bool()

name = "Patrick"
age = 34
gpa = 1.2
isStudent = True
isFullTime = False

print(age)
age = float(age)
print(age)
print(type(age))
age = str(age)
print(age)
print(type(age))
age += "1"
print(age)
print(type(age))

print("\n------------\n")

name = bool(name)
print(name)
print(bool(""))