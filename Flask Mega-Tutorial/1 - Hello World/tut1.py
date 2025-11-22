# 1. Import flask module's Flask obj
from flask import Flask

# 2. Create flask object!
app = Flask(__name__)

# 3. Create functionality - a basic hello world html file
@app.route('/')
def hello():
    return '<html><body><h1>Hello, World!</h1></body></html>'

# 4. Run the program!
if __name__ == '__main__':
    app.run(debug=True)
