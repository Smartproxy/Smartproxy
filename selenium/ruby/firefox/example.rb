require 'rubygems'
require 'selenium-webdriver'

profile = Selenium::WebDriver::Firefox::Profile.new
proxy = Selenium::WebDriver::Proxy.new(http: "gate.smartproxy.com:7000")
profile.proxy = proxy
options = Selenium::WebDriver::Firefox::Options.new(profile: profile)
driver = Selenium::WebDriver.for :firefox, options: options
driver.navigate.to "http://ip.smartproxy.com/"
element = driver.find_element(:css, 'body')

puts element.text

driver.quit
