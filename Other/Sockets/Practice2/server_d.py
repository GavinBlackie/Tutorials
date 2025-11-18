import socket

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server.bind(('127.0.0.1', 5001))

while True:
    data, addr = server.recvfrom(1024)
    print(data)
    print(data.decode())
    print(addr)
    server.sendto("Banana".encode(), addr)
