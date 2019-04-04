## <img src="https://smartproxy.com/wp-content/themes/smartproxy/images/smartproxy-logo.svg" alt="" width="200" height="50"> 

### Disclaimer

Selenium is a browser automation tool. This particular repository only covers Selenium setup for Python based programming language.

To continue further development with this tool, make sure to read their [documentation](https://selenium-python.readthedocs.io/) for Python.

*Unfortunately, Selenium itself does not support `username:password` authentication for `HTTP/HTTPs` proxies, thus you will need to have your IP whitelisted.*

You can do that by following guidlines listed [here](http://help.smartproxy.com/article/how-to-manage-whitelisted-ips/).

### Prerequisites

- [Python](https://www.python.org/downloads/)
- [Selenium](https://seleniumhq.github.io/selenium/docs/api/py/index.html#installing)

Optional:
- [Chrome WebDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [Firefox WebDriver](https://github.com/mozilla/geckodriver/releases)

Note that you need to have at least one of the above drivers to continue your progress.

### Installation

Once you have all the prerequisites ready, create your project folder:

```
mkdir your_project
```

When project directory is setup, you download our script for proxy authentication:

1. Open Terminal/Command Prompt window.
2. Navigate to the main directory of your project folder using `cd your_project`
3. Download our proxy middleware using the following command: `curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/python/selenium_python.py > selenium_python.py`
4. You should now see your project folder populated with *selenium_python.py* file.

### Configuration

To configure our script for proxy authentication you will need to define required values.

```
HOSTNAME = ''
PORT = ''
DRIVER = ''
DRIVER_PATH = ''
```

You can get information for `HOSTNAME` and `PORT` on our [users dashboard pannel](https://dashboard.smartproxy.com/).

The configuration guidelines for `DRIVER` and `DRIVER_PATH` can be found in the code itself.



### Usage

To start using our proxy configuration script for Selenium you will need to import the `get_driver_settings` and `smartproxy` from `selenium_python` package.

```
from selenium_python import get_driver_settings, smartproxy
```

If you selected a different name for `selenium_python.py` file, make sure to change it when importing as well.

To call the function for proxy authentication simply use `smartproxy()`

Note that Chrome and Firefox has different attributes for that, thus your requests should look along these lines:

*Firefox*

```
browser = webdriver.Firefox(executable_path=r'PATH', proxy=smartproxy())
```

*Chrome*

```
browser = webdriver.Chrome(executable_path=r'PATH', desired_capabilities=smartproxy())
```

*Optional*

Our `selenium_python.py` file comes with `get_driver_settings()` function which will return you an array of options which you have setup in the `selenium_python()` file itself for DRIVER settings.

The following variables are available in the returned array:

```
DRIVER_SETTINGS['DRIVER']
DRIVER_SETTINGS['DRIVER_PATH']
```

*Make sure to assign them to another variable when calling the function itself*

### Testing

If you want to run a quick test with our proxy configuration, you can download our `example.py` file using the following command:

```
curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/python/example.py > example.py
```

In order to run it, simply execute `python example.py` command while in your project directory.

*Note that the `example.py` file should be in the same directory as `selenium_python.py` file.*

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
