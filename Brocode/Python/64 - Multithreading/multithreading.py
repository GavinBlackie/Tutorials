# multithreading = Method used to perform multiple tasks cocurrently
#                   (multitasking)
#                  Good for I/O bound tasks like reading files, 
#                  fetching data from APIs in the background
#
#                  threading.Thread(target=my_function)

import threading
import time

def walk_dog(first, last):
    print("You take the dog for a walk...")
    time.sleep(8)
    print(f"You finish walking {first} {last}.")

def take_out_trash():
    print("*Picked up garbage bag*")
    time.sleep(3)
    print("You throw out the trash")

def drive_to_krusty_krab():
    time.sleep(10)
    print("You drive to the krusty krab")

def get_mail():
    time.sleep(6)
    print("You get the mail")
def get_mail2():
    time.sleep(6)
    print("You get the mail again")

# Without multithreading, these all run on the Main thread
#       They will execute one at a time
# walk_dog()
# take_out_trash()
# drive_to_krusty_krab()
# get_mail()

# With multithreading, tasks complete at same time
# "A thread is like a chore"
chore1 = threading.Thread(target=walk_dog, args=["Scooby", "Doo"] )
# chore1 = threading.Thread(target=walk_dog, args=("Scooby",)  )
chore1.start()

chore2 = threading.Thread(target=take_out_trash)
chore2.start()

chore3 = threading.Thread(target=drive_to_krusty_krab)
chore3.start()

chore4 = threading.Thread(target=get_mail)
chore5 = threading.Thread(target=get_mail2)
chore4.start()
chore5.start()

chore1.join()
chore2.join()
chore3.join()
chore4.join()
chore5.join()

# Will print immediately unless tasks are JOINED
print("All chores are complete!!")