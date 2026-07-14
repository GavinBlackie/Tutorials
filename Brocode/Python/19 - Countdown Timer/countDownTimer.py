import time

# Procedure to count down
def count_down(secs : float):
    # for x in range(0, secs):
    for x in range(secs, 0, -1):
        seconds = x % 60            # get the remainder seconds
        minutes = int(x / 60) % 60  # "60 seconds in a minute", modolo 60 to ensure we're dealing with just 60 minutes at a time
        hours = int(x / 3600) % 24  # "3600 secs in an hour"
        days = int(x / 86400)   # extra days counter I added with math (3600 * 24 = 86400 seconds in a day)
        # :02 means allocate 2 "zero padded spaces"
        time.sleep(1)

        # Perform some logic for the special days string!!
        days_str = ""
        if days > 0:
            days_str = f"{days} day"
            if days > 1:
                days_str += 's'

        if days_str == "":
            print(f"{hours:02}:{minutes:02}:{seconds:02}")
        else:
            print(f"{days_str}, {hours:02}:{minutes:02}:{seconds:02}")

is_prompting = True # I'm trying to use snake_case more often for python :)))
# Continually loop until user gives a valid count time and the timer finishes
while is_prompting:
    try:
        user_time = int(input("Enter the time to sleep in seconds: "))
        count_down(user_time) # count down for that many seconds
        
        print("The timer is up! :0")
        is_prompting = False
    except ValueError:
        print("That's not a valid time value. Try again!")