from selenium import webdriver
from selenium_python import get_driver_settings, smartproxy

def webdriver_example():
    driver = get_driver_settings()
    if driver['DRIVER'] == 'FIREFOX':
        browser = webdriver.Firefox(executable_path=r'{driver_path}'.format(driver_path=driver['DRIVER_PATH']), proxy=smartproxy())
    elif driver['DRIVER'] == 'CHROME':
        browser = webdriver.Chrome(executable_path=r'{driver_path}'.format(driver_path=driver['DRIVER_PATH']), desired_capabilities=smartproxy())
    browser.get('http://ip.smartproxy.com/')

    body_text = browser.find_element_by_tag_name('body').text

    print(body_text)

if __name__ == '__main__':
    webdriver_example()
