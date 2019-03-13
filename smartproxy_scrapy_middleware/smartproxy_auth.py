import base64

class ProxyMiddleware(object):

    @classmethod
    def from_crawler(cls, crawler):
        return cls(crawler.settings)

    def __init__(self, settings):
        self.user = settings.get('SMARTPROXY_USER').encode('UTF8')
        self.password = settings.get('SMARTPROXY_PASSWORD').encode('UTF8')
        self.endpoint = settings.get('SMARTPROXY_ENDPOINT')
        self.port = settings.get('SMARTPROXY_PORT')

    def process_request(self, request, spider):

        user_credentials = self.user + b":" + self.password
        host = 'http://{endpoint}:{port}'.format(endpoint=self.endpoint, port=self.port)
        request.meta['proxy'] = host
        request.headers['Authorization'] = 'Basic {creds}'.format(creds=user_credentials)
