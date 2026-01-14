from flask import Flask, redirect, url_for, render_template

app = Flask(__name__)
# isAdministrator = False

@app.route("/")
def home():
    return "<h1>Hello</h1>"

@app.route("/<name>")
def user(name):
    return f"<h1>Hello {name}</h1>"

@app.route("/admin")
def admin():
    # if isAdministrator:
    # return redirect(url_for("home"))
    return redirect(url_for("user", name="Admin!"))

if __name__ == "__main__":
    app.run(debug=True)