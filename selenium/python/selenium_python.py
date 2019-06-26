HOSTNAME = ''
PORT = ''
### DRIVER
"""
Define the driver as follows:
    Firefox:
    DRIVER = 'FIREFOX'
    Chrome:
    DRIVER = 'CHROME'
"""
DRIVER = ''
### DRIVER PATH
"""
Make sure that this exact part is configured with exact location of your webdriver/webdrivers.
The location should link to either geckodriver.exe or chromedriver.exe on Windows.
On MacOS/Linux Systems it should link to chromedriver/geckodriver.

Make sure that DRIVER_PATH is linking to the according Webdriver that you specify below. Example:
    DRIVER_PATH = "C:/bin/geckodriver.exe"
"""
DRIVER_PATH = ''

"""
Make sure to not edit settings beyond this point unless you know what you are doing!
"""

from selenium import webdriver
from selenium.webdriver.common.proxy import Proxy, ProxyType


def get_driver_settings():
    DRIVER_SETTINGS = {}
    DRIVER_SETTINGS['DRIVER'] = DRIVER
    DRIVER_SETTINGS['DRIVER_PATH'] = DRIVER_PATH
    return DRIVER_SETTINGS

def smartproxy():
    prox = Proxy()

    prox.proxy_type = ProxyType.MANUAL

    prox.http_proxy = '{hostname}:{port}'.format(hostname = HOSTNAME, port = PORT)
    prox.ssl_proxy = '{hostname}:{port}'.format(hostname = HOSTNAME, port = PORT)

    if DRIVER == 'FIREFOX':
        capabilities = webdriver.DesiredCapabilities.FIREFOX
    elif DRIVER == 'CHROME':
        capabilities = webdriver.DesiredCapabilities.CHROME
    prox.add_to_capabilities(capabilities)

    return capabilities
