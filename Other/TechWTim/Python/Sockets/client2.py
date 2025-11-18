# C. C. S. R. E.
# CCSRE
import socket

HEADER = 64
PORT = 5050
FORMAT = "utf-8"
DISCONNECT_MSG = "!DISCONNECT"
SERVER_ADDR = "192.168.2.169"

for i in range(4):
    
    # 1. Create client
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    # 2. Connect
    client.connect((SERVER_ADDR, PORT))

    # 3. Send Messages

    def send(msg : str):
        msg = msg.encode(FORMAT)
        msg_len = len(msg)
        send_len = str(msg_len).encode(FORMAT)
        send_len += b' ' * (HEADER - len(send_len))

        # Send the header, then the msg
        client.send(send_len)
        client.send(msg)

    send("Hello")
    send("Banana Bytes")
    send("Rigatoni")

    # 4. Recieve Msgs (optional)

    # 5. Exit
    send(DISCONNECT_MSG)
