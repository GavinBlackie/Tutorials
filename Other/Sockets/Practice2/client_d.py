import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

client.sendto("Hello from client!?!?!".encode(), ("127.0.0.1", 5001))
print(client.recv(1024).decode())