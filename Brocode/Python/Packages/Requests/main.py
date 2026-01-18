import requests

base_url = "https://pokeapi.co/api/v2/"

def get_poke_info(name):
    url = f"{base_url}/pokemon/{name}"

    # Perform a GET request!
    res = requests.get(url)
    # print(res)
    # print(res.status_code)
    status_code = res.status_code
    match (status_code):
        case 200:
            print("OK")
            poke_data = res.json()
            return poke_data
        case _:
            print(f"Failed to retrieve data, got: {status_code}")
            return None

# pokemon_name = "pikachu"
pokemon_name = "typhlosion"
poke_info = get_poke_info(pokemon_name)

if poke_info:
    print(f"Name: {poke_info["name"]}")
    print(f"ID: {poke_info["id"]}")
    print(f"Height: {poke_info["height"]}")
    print(f"Weight: {poke_info["weight"]}")

