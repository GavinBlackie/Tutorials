# 1. Import flask module's Flask obj
from flask import Flask, render_template
import json
import os

# 2. Create flask object!
app = Flask(__name__)

user = {"username" : "Spongebob123"}

# 3. Create functionality - a basic hello world html file
#   BUT - this time we will render a template (uses jinja engine)!
@app.route('/')
def hello():

    return render_template("index.html", user=user)

@app.route('/conditional')
def conditional():
    #subheadType = "crazy"
    subheadType = "amazing"
    return render_template("conditionals.html", user=user, subhead=subheadType)

@app.route('/loop')
def loop():
    posts = []

    # NOTE: may need to search for file depending on where you start it!
    #print(os.getcwd())
    path = os.path.join(os.getcwd(), 'Flask Mega-Tutorial/2 - Templates/funny.json')
    #print(path)
    with open(path, 'r') as jsonFile:
        posts = json.load(jsonFile)
    
    return render_template("loops.html", user=user, posts=posts)


# 4. Run the program!
if __name__ == '__main__':
    app.run(debug=True)
