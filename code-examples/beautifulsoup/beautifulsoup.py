import requests
from bs4 import BeautifulSoup

url = 'https://www.whatismyip.com/'

headers = {'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36'}

proxies = {'https': 'https://gate.smartproxy.com:7000'} # Your desired endpoint within punctuation marks ('')
auth = requests.auth.HTTPProxyAuth('username','password') # Your username and password for proxy authentication

soup = BeautifulSoup(requests.get(url, headers=headers, proxies=proxies, auth=auth).text, 'lxml')

info_box = soup.find('div', attrs={'class': 'card-body'})

ip = info_box.findAll('li')[0]

print(ip.get_text())
