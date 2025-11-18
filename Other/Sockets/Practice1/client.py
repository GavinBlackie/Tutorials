import socket

# 1. Create a new socket object for client 
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# 2. Connect to server
client.connect(("127.0.0.1", 5001))

# 3. Send any message(s) to server
client.send("Hello from client".encode())

# 4. Recieve any message(s) from server
print(client.recv(1024).decode())