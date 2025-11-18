import socket

# 1. Create a new socket object

# Note: TCP is a stateful protocol
#      & UDP is a stateless protocol

# We will specify the family : AF_INET -> internet family
# The type will depend on preference (TCP vs. UDP)

# use socket.SOCK_DGRAM for UDP "User Datagram Protocol"

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
# 2. Bind the socket to the corresponding IP
server.bind(("127.0.0.1", 5001))
server.listen(5) # Listen for 5 seconds

# 3. Enter into a loop to accept any connections
while True:
    client, addr = server.accept()
    print(client)
    print(client.recv(1024).decode())
    client.sendto("Hello from server".encode(), addr)    