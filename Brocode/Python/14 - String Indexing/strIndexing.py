
# indexing => Accessing elements of a sequence using [] index operators
#            Python syntax: [start : end : step]

# sequence => defined as an order of things based on some pattern, 
#             an enumerated collection/arrangement of things :)
# eg. 1, 2, 3, 4, 5, 6, ... is a sequence 
#     2, 4, 8, 16, 32, 64, ... is also a sequence
#
#     ^ this is related to reccurence relations that I learned in DS&Algorithms

credit_number = "1234-5678-9012-3456"

print(credit_number[0]) # Prints "1"

credit_number = "5445-2345-7883-2430"
print(credit_number[0]) # Prints "5"

# self note: [start : end : step] functions kindof like a for-loop in other languages

print(credit_number[5 : 9]) # predicted output: "2345"

print(credit_number[ : 5]) # predicted output: "1234" (it was actually "1234-"!)
# remember: [start inclusive : end exclusive], and to properly count indexes

print(credit_number[10 : 14 ]) # predicted output "7883"

print(credit_number[10 : ]) # can also use this to go to the end

print(credit_number[-6]) # Python also has negative indexing!!!    "3"

print(credit_number[ len(credit_number) - 1])
print(credit_number[ len(credit_number) * -1]) # "5"
try:
    print(credit_number[ len(credit_number) * -1 - 1]) # "5"
except IndexError:
    print("Wahhh that negative index is too large!! :(")


print(credit_number[::3]) # prints everything in a 3 index jump range
# ^ "inclusive" when it reaches the 3rd thing! 
# "5445-2345-7883-2430"
# "5  5  3  -  8  2  0"

# Task: get last 4 digits of a given credit card number
credit_number = "4545-9877-1260-0035"

last_digits = credit_number[-4:]     # credit_number[-4: len(credit_number) ]
print("The last digits are: " + last_digits)
print(f"XXXX-XXXX-XXXX-{last_digits}")

# Get last 4 digits in reverse order:
last_digits_rev = credit_number[-1:-5:-1] 
print("The last digits in reverse are: " + last_digits_rev)


credit_number = credit_number[::-1] # reverse the whole number!
print("The new reversed credit number is: " + credit_number)