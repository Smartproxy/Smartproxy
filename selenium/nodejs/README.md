## <img src="https://smartproxy.com/wp-content/themes/smartproxy/images/smartproxy-logo.svg" alt="" width="200" height="50"> 

### Disclaimer

Selenium is a browser automation tool. This particular repository only covers Selenium setup for Node.js(Javascript) based programming language.

To continue further development with this tool, make sure to read their [documentation](https://github.com/SeleniumHQ/selenium/tree/master/javascript/node/selenium-webdriver).

*Unfortunately, Selenium itself does not support `username:password` authentication for `HTTP/HTTPs` proxies, thus you will need to have your IP whitelisted.*

You can do that by following guidlines listed [here](http://help.smartproxy.com/article/how-to-manage-whitelisted-ips/).

### Prerequisites

- [Node](https://nodejs.org/en/download/)
- [Selenium](https://github.com/SeleniumHQ/selenium/tree/master/javascript/node/selenium-webdriver#installation)

Optional:
- [Chrome WebDriver](https://www.npmjs.com/package/chromedriver#building-and-installing)
- [Firefox WebDriver](https://www.npmjs.com/package/geckodriver#install)

Note that you will need to install at least one of the above WebDrivers in the [Installation](#installation) part.

### Installation

1. Once you have all the required prerequisites ready, create your project folder:

```
mkdir node_selenium
cd node_selenium
npm init
```
<img src="https://i.imgur.com/53kgOXn.png">

2. When project directory is setup, you will need to install one of the WebDrivers from the [Prerequisites](#prerequisites) section.

*Firefox*

<img src="https://i.imgur.com/I9czv1a.png">

*Chrome*

<img src="https://i.imgur.com/ALgnAQf.png">

3. Download our example script accordingly to the WebDriver you are using, by using one of these commands: 

*Firefox*

```curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/nodejs/firefox/example.js > example.js```

*Chrome*

```curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/nodejs/chrome/example.js > example.js```

4. You should now see your project folder populated with *example.js* file.

### Configuration

To configure our example script with a different endpoint simply edit the `let addr =` line in within punctuation marks('') as in example:

<img src="https://i.imgur.com/rBL5rWw.png">

### Usage

If you did everything correctly, you can simply test our script by running `node example.js` command while in your project folder.

A browser window will apear with the targeted website, and a proxy IP should be visible in the console output:

<img src="https://i.imgur.com/7Na6wEN.png">

## How to get started with Smartproxy?
[<img src="https://smartproxy.com/wp-content/uploads/2019/04/How-to-buy-Smartproxy-plans-now.svg">](https://dashboard.smartproxy.com/register)
<br><br><center>Accepted payment methods:
<br><img src="https://smartproxy.com/wp-content/uploads/2018/09/payment-methods-smartproxy-residential-rotating-proxies.svg" alt="" width="250" height="50"></center>

## Contacts
Email - sales@smartproxy.com
<br><a href="https://smartproxy.com">Live chat 24/7</a>
<br><a href="https://join.skype.com/invite/bZDHw4NZg2G9">Skype</a>
<br><a href="https://t.me/smartproxy_com">Telegram</a>
