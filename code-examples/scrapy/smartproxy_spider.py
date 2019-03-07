import scrapy
from w3lib.http import basic_auth_header

class SmartproxySpider(scrapy.Spider):
    name = "smartproxy"

    def start_requests(self):
        urls = [
            'https://www.whatismyip.com/'
        ]
        for url in urls:
            yield scrapy.Request(url=url, callback=self.parse,
                meta={'proxy': 'https://gate.smartproxy.com:7000'}, ## Your desired Endpoint
                headers={
                        'Proxy-Authorization': basic_auth_header(
                        'username', 'password') ## Your username and password for the proxy user
                }
            )

    def parse(self, response):
        for data in response.css('ul.list-group.text-center'):
            yield {
                'ip': data.css('li.list-group-item::text').get(),
            }
