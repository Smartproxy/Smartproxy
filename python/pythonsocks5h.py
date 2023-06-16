import requests

url = 'https://ipinfo.io'
username = ''
password = ''

proxy = f'socks5h://{username}:{password}@gate.smartproxy.com:7000'
  
response = requests.get(url, proxies= {'http': proxy, 'https': proxy})

print(response.text)
