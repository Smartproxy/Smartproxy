import urllib.request as request

url = 'https://ipinfo.io/json'
username = 'username'
password = 'password'

proxy = f'http://{username}:{password}@gate.smartproxy.com:7000'
  
query = request.build_opener(request.ProxyHandler({'http': proxy, 'https': proxy}))

print(query.open(url).read())
