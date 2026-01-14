# C. B. L. H. C.
# CBLSC
import socket
import threading

# addr = "127.0.0.1"
# print(socket.gethostname())
# print(socket.gethostbyname(socket.gethostname()))

# 1. Create the socket object
HEADER = 64
PORT = 5050
SERVER_ADDR = socket.gethostbyname(socket.gethostname())
print(SERVER_ADDR)
FORMAT = 'utf-8'
DISCONNECT_MSG = "!DISCONNECT"
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# 2. Bind the address
server.bind((SERVER_ADDR, PORT))

def handleClient(conn : socket.socket, addr : str):
    # 4. Handle connections
    print(f"[NEW CONNECTION] {addr} connected.")

    connected = True
    while connected:
        msg_len = conn.recv(HEADER).decode(FORMAT) # Recieve initial max of size 64
        if msg_len == '' or msg_len is None:
            continue

        try:
            msg_len = int(msg_len)
        except ValueError:
            print(f"[END CONNECTION] {addr} sent invalid header")
            break
        
        # We are assuming the header specifies the size of what is sent after
        msg = conn.recv(msg_len).decode(FORMAT)
        print(f"[FROM {addr} RECIEVED] {msg}")

        # Handle the disconnection!
        if msg == DISCONNECT_MSG:
            connected = False
            print(f"[DISCONNECTING] {addr}")
        
        # Send a message back to the client!
        conn.send("Msg recieved".encode(FORMAT))

    conn.close() # Close connection from server side


def start():
    # 3. Listen for connections
    server.listen(5)
    print(f"[LISTENING] Server is listening on {SERVER_ADDR}")

    while True:

        # Recieve the next client obj and address
        conn, addr = server.accept()

        # Create a new thread to handle that client's session!
        thread = threading.Thread(target=handleClient, args=(conn, addr))
        thread.start()
        print(f"[ACTIVE CONNECTIONS] {threading.active_count() - 1}")



print("[STARTING] server is starting...")
start()

# 5. Close connections
server.close()
