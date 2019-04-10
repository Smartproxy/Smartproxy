## <img src="https://smartproxy.com/wp-content/themes/smartproxy/images/smartproxy-logo.svg" alt="" width="200" height="50"> 

### Disclaimer

In case you are not aware of what Scrapy is or how it works, we suggest to reseach [Scrapy](https://docs.scrapy.org/en/latest/) documentation in order to continue development with this tool.

### Prerequisites

To get started with Scrapy you will first need to install it using methods provided in their documentation. [Check here for more information](https://docs.scrapy.org/en/latest/intro/install.html)

### Installation

Once you get Scrapy up and running if you have not yet, make sure that you create your project folder:

```
scrapy startproject yourprojectname
```

<img src="https://content.screencast.com/users/JohanSP/folders/Jing/media/f974b1de-dc9c-4d53-9d43-9215f8742dc9/startproject.png">

When project directory is setup, you can deploy our middleware:

1. Open Terminal window.
2. Navigate to the main directory of your project folder using `cd yourprojectname`
3. Download our proxy middleware using the following command: `curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/scrapy_middleware/smartproxy_auth.py > smartproxy_auth.py`
<img src="https://file2.api.drift.com/drift-prod-file-uploads/5fdb%2F5fdb91ab7c45ffb79ff46e5f37fa6c2b/2.png?mimeType=image%2Fpng">
4. You should now see your project folder populated with *smartproxy_auth.py* file.
<img src="https://file2.api.drift.com/drift-prod-file-uploads/94bb%2F94bb73fc522c281e170a6cc81a077ab5/3.png?mimeType=image%2Fpng">

### Configuration

To start using our middleware for proxy authentication, you'll need to configure settings for our proxy authentication.

Doing so is very simple:

1. Using file manager, navigate to your project folder, you should see *settings.py* file located at the bottom of the directory.
2. Edit the *settings.py* file using an editor of your choice and add the following properties at the bottom:
```
DOWNLOADER_MIDDLEWARES = {
    'scrapy.downloadermiddlewares.httpproxy.HttpProxyMiddleware': 110,
    'yourprojectname.smartproxy_auth.ProxyMiddleware': 100,
}

SMARTPROXY_USER = 'username' ## Smartproxy Username (Sub-user)
SMARTPROXY_PASSWORD = 'password' ## Password for your user
SMARTPROXY_ENDPOINT = 'gate.smartproxy.com' ## Endpoint you'd like to use
SMARTPROXY_PORT = '7000' ## Port of the endpoint you are using.
```
<img src="https://file2.api.drift.com/drift-prod-file-uploads/b7b3%2Fb7b36a1e9a1556fb7b361ed17144159a/4.png?mimeType=image%2Fpng">
<img src="https://file2.api.drift.com/drift-prod-file-uploads/348f%2F348f7143ae28ad224fa3a46c2dc7716e/5.png?mimeType=image%2Fpng">

3. In `DOWNLOADER_MIDDLEWARES` change `yourprojectname` line to the name of your project.

<img src="https://file2.api.drift.com/drift-prod-file-uploads/87d4%2F87d428d4f2d47e29f3e986e109005d26/6.png?mimeType=image%2Fpng">

4. Make sure that you enter your details account details as well as proxy details within punctuation marks (''). 
5. Save the file.

Once all that is done, all of your spiders will be going through our proxies, if you are not sure how to setup a spider, take a look [here](https://docs.scrapy.org/en/latest/intro/tutorial.html#our-first-spider)

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
