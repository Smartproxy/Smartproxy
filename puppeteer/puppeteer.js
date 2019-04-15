const puppeteer = require('puppeteer');

(async() => {
    const proxyUrl = 'http://gate.smartproxy.com:7000';
    const username = 'username';
    const password = 'password';

    const browser = await puppeteer.launch({
        args: [`--proxy-server=${proxyUrl}`],
        headless: false,
    });

    const page = await browser.newPage();

    await page.authenticate({ username, password });
    await page.goto('http://ip.smartproxy.com/');
    const html = await page.$eval('body', e => e.innerHTML);
    console.log(html);
    await browser.close();
})();
