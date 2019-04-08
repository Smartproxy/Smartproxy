## <img src="https://smartproxy.com/wp-content/themes/smartproxy/images/smartproxy-logo.svg" alt="" width="200" height="50"> 

### Disclaimer

The following example provides you with a basic request using a proxy to a specific website, if you want to learn more about Beautiful Soup, make sure to check their documentation [here](https://www.crummy.com/software/BeautifulSoup/bs4/doc/#quick-start).

### Prerequisites

To run our example script, you are going to need a few Python libraries as well as Python 3.7.x itself with Beautiful Soup 4.

* [Python](https://www.python.org/downloads/)
* [Beautiful Soup 4](https://www.crummy.com/software/BeautifulSoup/bs4/doc/#installing-beautiful-soup)
* [Python's Requests Library](https://realpython.com/python-requests/)
* [lxml](https://lxml.de/installation.html)

### Installation

Once you have all the prerequisites ready, enter your project folder or create a new one.

<img src="https://i.imgur.com/RaLIVjy.png">
<img src="https://i.imgur.com/1TeL3xI.png">

When project directory is setup, you can download our script:

`curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/code_examples/beautifulsoup/beautifulsoup.py > beautifulsoup.py`

<img src="https://i.imgur.com/KrvorTW.png">

You should now see your project folder populated with *beautifulsoup.py* file.

### Configuration

To start using our example script, all you need to do is to configure the lines below.

Endpoint:
```
proxies = {'https': 'https://gate.smartproxy.com:7000'} # Your desired endpoint within punctuation marks ('')
```
Username and password:
```
auth = requests.auth.HTTPProxyAuth('username','password') # Your username and password for proxy authentication
```

<img src="https://i.imgur.com/wbTPbx5.png">

### Usage

To execute the example, simply run python command:

```
python beautifulsoup.py
```

If everything was done correctly, you should be seeing the output as proxy IP:

<img src="https://i.imgur.com/yglY5EA.png">

## How to get started with Smartproxy?
<br><img src="https://smartproxy.com/wp-content/uploads/2019/02/order-smartproxy.png">
<br> 1. To utilize residential proxies you will require smartproxy account, register here -> https://dashboard.smartproxy.com
<br> 2. You will need an active subscription too. If you're interested in testing it out first - our plans Starter and above have 3 day money back policy -> https://smartproxy.com/pricing
<br> 3. Once you purchase it you will get access to whole pool, regardless of plan!
<br><br><center>Accepted payment methods:
<br><img src="https://smartproxy.com/wp-content/uploads/2018/09/payment-methods-smartproxy-residential-rotating-proxies.svg" alt="" width="250" height="50"></center>

## Contacts
Email - sales@smartproxy.com
<br><a href="https://smartproxy.com">Live chat 24/7</a>
<br><a href="https://join.skype.com/invite/bZDHw4NZg2G9">Skype</a>
<br><a href="https://t.me/smartproxy_com">Telegram</a>
