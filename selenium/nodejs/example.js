require('chromedriver');

var webdriver = require('selenium-webdriver'), By = webdriver.By,
    until = webdriver.until,  chrome = require("selenium-webdriver/chrome");

let addr = 'gate.smartproxy.com:7000'
let opt = new chrome.Options().addArguments(`--proxy-server=http://${addr}`)

var driver = new webdriver.Builder()
 .forBrowser('chrome')
 .setChromeOptions(opt)
 .build();

driver.get('http://ip.smartproxy.com/')

var textPromise = driver.findElement(webdriver.By.css('body')).getText();
textPromise.then((text) => {
  console.log(text);
});
