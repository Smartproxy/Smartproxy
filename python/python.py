import requests

url = 'https://ipinfo.io'
username = 'username'
password = 'password'

proxy = f'http://{username}:{password}@gate.smartproxy.com:7000'
  
response = requests.get(url, proxies={'http': proxy, 'https': proxy})

print(response.text)
