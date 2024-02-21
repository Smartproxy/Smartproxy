const axios = require("axios");

const url = "https://ip.smartproxy.com/json";
const resp = axios.get(url, {
    proxy: {
        host: 'gate.smartproxy.com',
        port: 7000,
        auth: {
            username: 'username',
            password: 'password'
        }
    }
    
}). then(resp => {
    console.log(resp.data);
});
