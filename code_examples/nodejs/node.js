require('request-promise') ( { 

   url: 'https://ipinfo.io/ip', 
   proxy: 'http://username:password@gate.smartproxy.com:7000' 

}).then( 
   function(data ){ 
      console.log(data); 
    }, 
    function(err){ 
       console.error(err); 
   } 
);
