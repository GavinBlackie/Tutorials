# Python weight converter

KILO_STR = "kg"
POUND_STR = "lb"

weight = float(input("Enter your weight: "))
unit = input("Kilograms or Pounds? (K or L): ").upper()

cWeight = 0
cUnit = ""
match unit:
    case 'K':
        unit = KILO_STR
        cWeight = weight * 2.20462
        cUnit = POUND_STR
    case 'L':
        unit = POUND_STR
        convertedWeight = weight * 0.453592
        cUnit = KILO_STR

print(f"Converted {weight} {unit}s to {cWeight} {cUnit}s ")