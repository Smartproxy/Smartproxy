const request = require('request')
const cheerio = require('cheerio')

var options = {
    proxy: 'http://username:password@gate.smartproxy.com:7000'
};

request('http://ip.smartproxy.com/', options, (error, response, html) => {
  if(!error && response.statusCode == 200) {
      const $ = cheerio.load(html);

      const siteBody = $('body')

      const output = siteBody.text();

      console.log(output)
  } else {
      console.log('Something went wrong..')
  }
});
