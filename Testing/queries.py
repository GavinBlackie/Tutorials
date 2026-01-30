import sqlite3 as sq

conn = sq.connect('Testing/test.db')
cursor = conn.cursor()

cursor.execute('''
    CREATE TABLE Characters(
        id INT PRIMARY KEY,
        name STRING,
        age INT       
)''')

cursor.close()