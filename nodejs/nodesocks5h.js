const axios = require('axios');
const SocksProxyAgent = require('socks-proxy-agent').SocksProxyAgent;

const proxy = 'socks5h://spt2c4cxep:puh45DMWvx1fpfpy4D@gate.smartproxy.com:7000';
const agent = new SocksProxyAgent(proxy);

axios.get('https://ipinfo.io', { httpsAgent: agent })
 .then(response => {
  console.log(response.data);
 })
 .catch(error => {
  console.log(error);
 });
