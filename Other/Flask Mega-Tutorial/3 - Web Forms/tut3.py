from flask import Flask, render_template, request

app = Flask(__name__)

USERS = {"name" : "spongeturd"}

@app.route('/login')
def home():
    return render_template("login.html")

@app.route('/profile', methods=["POST"])
def loadUser():
    # validate the user!

    # get python data from the form!
    username = request.form.get('name')
    password = request.form.get('password')
    #print(username)
    #print(password)

    # then validate it against a python dictionary, OR
    # an SQL database (use SQLlite to return a tuple)!

    return '<b>BananaHAHA</b>'

if __name__ == '__main__':
    app.run(debug=True)