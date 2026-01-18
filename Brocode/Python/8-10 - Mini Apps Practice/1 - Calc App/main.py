# Python Calculator App
# Get two operands, and the operator!

operator = input("Enter an operator (+ - * /  // % **): ")

while True:
    try:
        num1 = float(input("Enter the first operand: "))
        num2 = float(input("Enter the second operand: "))
        break
    except ValueError:
        print("Thats not a number, silly!")
        continue

result = 0
match operator :
    case '+':
        result = num1 + num2
    case '-':
        result = num1 - num2
    case '*':
        result = num1 * num2
    case '/':
        result = num1 / num2
    case '//':
        result = int(num1) / int(num2)
    case '%':
        result = num1 % num2
    case '**':
        result = num1 ** num2
    case _:
        assert("Unexpected operator type")

print(f"The result of {num1} {operator} {num2} = {result}")


def factorial(num) -> int :
    factorial = 1
    for i in range(num-1):
        factorial *= num
        num -= 1
    return factorial

factorial(2)
factorial(7)
factorial(6)
factorial(923)