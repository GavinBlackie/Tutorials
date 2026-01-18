# logical operators = tools to evaluate many boolean conditions
#                     ex. (AND OR NOT XOR)

# Python L.O. : or, and, not

temp = 25
isRaining = True

if temp > 35 or temp < 0 or isRaining:
    print("The outdoor event is cancelled")
else:
    print("The outdoor event is still scheduled")


temp = 0
isSunny = True

if temp >= 28 and isSunny:
    print("It is HOT outside 🥵")
    print("It is SUNNY 🌞")
elif temp <=0 and isSunny:
    print("It is COLD outside 🥶")
    print("It is SUNNY 🌞")
elif 0 < temp < 28 and isSunny:
    print("It is WARM outside 😊")
    print("It is SUNNY 🌞")

if not isSunny:
    print("It is cloudy ☁️")