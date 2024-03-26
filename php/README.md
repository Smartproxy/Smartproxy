<p align="center">
    <a href="https://smartproxy.com/"><img src="https://snipboard.io/3IyORg.jpg"></a>
  </a>
</p>

<p align="center">
    <a href="https://github.com/Smartproxy/Smartproxy"> :house: Main Repository :house: </a>
</p>

## Disclaimer

The example code only shows basic authentication through a proxy while sending requests with PHP. If you want to continue further development, we highly recommend reading their [documentation](https://www.php.net/manual/en/).

## Prerequisites
Install and set up the PHP programming language on your machine. If you don't want to use the [default built-in HTTP server](https://www.php.net/manual/en/features.commandline.webserver.php), you'll also need to install one, such as Apache.
* [PHP](https://www.php.net/manual/en/install.php)
* [Apache](https://httpd.apache.org/) (optional)

You should also have a [Smartproxy account](https://dashboard.smartproxy.com/register) with access to the [dashboard](https://dashboard.smartproxy.com/residential-proxies/proxy-setup) to get your credentials and endpoint information.

## Installation

1. Create a project directory.
2. Open the directory using the Terminal/Command prompt using the `cd directory_name` command.
3. Execute the following command to download the proxy setup example file:

HTTP(s):
`curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/php/php.php > php.php`

SOCKS5:
`curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/php/php.php > phpsocks5h.php`

<img src="https://i.imgur.com/p0Vaxgu.png" alt="curl smartproxy php code sample">

4. You should see a new file named *php.php* in your project folder. Open it using an editor of your choice.

5. To run this example, set your username, password, and endpoint information you'd like to use and enter them in the following sections of the code:

<img src="https://i.imgur.com/sVu5KPa.png" alt="smartproxy php proxy username password authentication">

## Usage

To run this example code, you'll need to set up your HTTP server. 

Once you have it set up, you can access the file with the path it has been stored in your server. For example, `http://localhost/php.php`

You should see an IP address in the console window if everything was set up correctly:

<img src="https://i.imgur.com/tt7naVL.png" alt="smartproxy successful php connection">

## Need help?
Email - sales@smartproxy.com

<a href="https://direct.lc.chat/12092754/">Live chat 24/7</a>

