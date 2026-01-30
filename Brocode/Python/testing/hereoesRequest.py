import requests as rq

response = rq.get("http://localhost:8080/api/heroes")

print(response)

spider_man = {"firstName" : "Spongebob Sq", 
              "house" : "Earth",
              "id" : "12",
              "knownAs" : "Spongebob",
              "lastName" : "rigatoni"}

response = rq.post("http://localhost:8080/api/heroes", spider_man)

print(response)