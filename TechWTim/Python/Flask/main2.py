from flask import Flask, redirect, url_for, render_template

app = Flask(__name__)
# isAdministrator = False

PEOPLE = ["Spongebob", "Jimothy", "Steve", "Shrek"]

@app.route("/<name>")
def home(name):
    return render_template("index.html", name=name, people=PEOPLE)

if __name__ == "__main__":
    app.run(debug=True)