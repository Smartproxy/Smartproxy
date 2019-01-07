require('request-promise')({ 

url: 'https://ipinfo.io/ip', 
proxy: 'http://username:password@ip:port' 

}).then(function(data){ console.log(data); }, function(err){ console.error(err); });
