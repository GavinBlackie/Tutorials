# Compound Intrest Calculator Program in Python!
#
# A = P(1 + r/n)ͭ
# 
# A = final amount
# P = principal amount, "present"
# r = intrest rate
# n = number of times compounded per time cycle
# t = time cycles, usually in years

principle = 0
rate = 0
time = 0
compoundsPerYear = 0

def extractPositiveNumber(msg : str, typeOfNum : type) -> float | int:
    isPrompting = True
    while isPrompting:
        try:
            if (typeOfNum == float):
                n = float(input(msg))
            else:
                n = int(input(msg))
            
            if n < 0:
                print("Cannot input a negative number!")
                raise ValueError # this is obiously bad code practice (should be in seperate func)
            
            isPrompting = False

        except ValueError:
            print("That's not a valid number, silly. Try again. \n")
    return n

principle = extractPositiveNumber("Enter the principle, P, amount: ", float)
rate = extractPositiveNumber("Enter the rate, r: ", float)
time = extractPositiveNumber("Enter the number of years, t: ", int)
compoundsPerYear = extractPositiveNumber("Enter the number of times intrest is compounded in a year, n: ", int)

finalAmount = principle * (1 + rate / compoundsPerYear) ** time
print(f"The final amount after {time} years is: ${finalAmount:.2f} " )