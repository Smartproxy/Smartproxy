import urllib.request as request

url = 'https://ipinfo.io'
username = 'username'
password = 'password’

proxy = ('http://%s:%s@gate.smartproxy.io:7000' % (username, password))

query = request.build_opener(request.ProxyHandler({'http': proxy, 'https': proxy}))

print(query.open(url).read())
