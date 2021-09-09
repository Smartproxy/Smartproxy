import requests
from requests.auth import HTTPProxyAuth

url = 'https://ipinfo.io'
username = 'username'
password = 'password'

proxy = f'http://gate.smartproxy.com:7000'

response = requests.get(
    url=url,
    proxies={'http': proxy, 'https': proxy},
    auth=HTTPProxyAuth(username, password)

)

print(response.text)
