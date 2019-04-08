var Nightmare = require('nightmare');

let nightmare = Nightmare({
      switches: {
        'proxy-server': 'gate.smartproxy.com:7000', // Endpoint
        'ignore-certificate-errors': true
      }
    });

    nightmare
    .authentication('username','password') // Username and Password for your Sub-user
    .goto('https://whatismyipaddress.com')
    .evaluate(() => document.querySelector('div#ipv4').textContent)
    .end()
    .then(ip => console.log(ip))
    .catch(error => console.error('Something went wrong...', error));
