# remember: .upper() .lower() .strip()
# split()
# find()
# isdigit() isalnum() isalpha()

unit = input("Enter temperature unit (C, F): ").upper().strip()
temp = float(input("Enter the temperature: "))

match unit:
    case 'C':
        temp *= 9/5
        temp += 32
        print(f"The temperature in fahrenheit is: {round(temp, 2)}°F")
    case 'F':
        temp -= 32
        temp *= 5/9
        print(f"The temperature in celcius is: {round(temp, 2)}°C")
    case _:
        assert("Invalid unit type")


