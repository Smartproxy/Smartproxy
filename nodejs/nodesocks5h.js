const axios = require('axios');
const SocksProxyAgent = require('socks-proxy-agent').SocksProxyAgent;

const proxy = 'socks5h://username:password@gate.smartproxy.com:7000';
const agent = new SocksProxyAgent(proxy);

axios.get('https://ip.smartproxy.com/json', { httpsAgent: agent })
 .then(response => {
  console.log(response.data);
 })
 .catch(error => {
  console.log(error);
 });
