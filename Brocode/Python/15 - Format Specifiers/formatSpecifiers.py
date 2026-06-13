# format specifiers = {:flags} formats a value based on what
#                              flags are inserted
#
#  They are used inside of f-strings in Python!

# Self NOTE: these are closely related to format specifiers in C!!!
#            eg. prinf("%.2f", floatNum);
# .(number)f = round to that many decimal places
# :(number) = allocate that many spaces
# :03 = allocate and zero pad that many spaces (eg. 2 is 2.000 and 3.45 is 3.450)
# :< = left justify
# :> = right justify
# :^ = center align
# :+ = use plus sign to indicate positive value
# := = place sign to leftmost position
# :  = insert a space before positive numbers
# :, = comma separator


price1 = 3.1459
price2 = -234.542
price3 = 18.43

print(f"Price 1 is ${price1:.2f}") # Round to 2 places!
print(f"Price 2 is ${price2:.3f}") # Rounds to 3 decimal places
print(f"Price 3 is ${price3:.1f}")

print(f"Price 1 is ${price1:10}") # adds 10 spaces
print(f"Price 2 is ${price2:10.3f}")
print(f"Price 3 is ${price3:10.1f}")
print(f"Price 1 is ${price1:010}") # this adds 0s whereever a space would normally be in the alignment
print(f"Price 2 is ${price2:010.3f}")
print(f"Price 3 is ${price3:010.1f}")

print(f"Price 1 is ${price1:>15}") # right justify
print(f"Price 2 is ${price2:>15}")
print(f"Price 3 is ${price3:>15}")

print(f"Price 1 is ${price1:<15}") # left justify (does nothing here)
print(f"Price 2 is ${price2:<15}")
print(f"Price 3 is ${price3:<15}")

print(f"Price 1 is ${price1:^15}") # centre align
print(f"Price 2 is ${price2:^15}")
print(f"Price 3 is ${price3:^15}")

print(f"Price 1 is ${price1: }") # a space allows them to line-up with negative ones!
print(f"Price 2 is ${price2: }")
print(f"Price 3 is ${price3: }")

price1 = 4543.4324
price2 = -67657.23
price3 = -9836146.453453

print(f"Price 1 is ${price1: ,}") # adds commas to thousands
print(f"Price 2 is ${price2: ,}") # note that the space aligns them for negatives like before
print(f"Price 3 is ${price3: ,}")


print(f"Price 1 is ${price1: 20,.2f}")
print(f"Price 2 is ${price2: 20,.2f}")
print(f"Price 3 is ${price3: 20,.2f}")

print(f"Price 1 is ${price1:+,.2f}") # + adds plus for positives!
print(f"Price 2 is ${price2:0>15,.2f}")
print(f"Price 3 is ${price3:0>15,.2f}")