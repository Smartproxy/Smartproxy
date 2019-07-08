## <img src="https://smartproxy.com/wp-content/themes/smartproxy/images/smartproxy-logo.svg" alt="" width="200" height="50"> 

### Disclaimer

Selenium is a browser automation tool. This particular repository only covers Selenium setup for C# based programming language.

To continue further development with this tool, make sure to read their [documentation](https://seleniumhq.github.io/selenium/docs/api/dotnet/index.html) for C#.

*Unfortunately, Selenium itself does not support `username:password` authentication for `HTTP/HTTPs` proxies, thus you will need to have your IP whitelisted.*

You can do that by following guidlines listed [here](http://help.smartproxy.com/article/how-to-manage-whitelisted-ips/).

### Prerequisites

To run these particular examples, we used Visual Studio 19 to download Webdrivers and Selenium package itself using C# NuGet:

* [Visual Studio with Visual Basic](https://docs.microsoft.com/en-us/visualstudio/ide/quickstart-visual-basic-console?view=vs-2019)

If you are using something else, you will need to download these packages seperately:

- [Selenium](https://www.seleniumhq.org/download/)
- [Chrome WebDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [Firefox WebDriver](https://github.com/mozilla/geckodriver/releases)

Note that you need to have at least one of the above drivers to continue your progress.

### Installation

This particular code was built with [Visual Studio with Visual Basic](https://docs.microsoft.com/en-us/visualstudio/ide/quickstart-visual-basic-console?view=vs-2019) which will be used to build and launch the application.

You can run it using these steps:

1. Create a new Console Application.
2. Using a terminal of your choice navigate to the projects directory.
3. Run the cURL command to download the code or copy it directly from the repository by clicking on the preferred WebDriver hyperlink above.

[*Firefox*](https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/csharp/firefox/example.cs)

```
curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/csharp/firefox/example.cs > example.cs
```

<img src="https://i.imgur.com/pdoz0b9.png">

[*Chrome*](https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/csharp/chrome/example.cs)

```
curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/selenium/csharp/chrome/example.cs > example.cs
```

<img src="https://i.imgur.com/NvGcgpL.png">

4. You should see a new file named example.cs in your project folder.

### Configuration

To configure the proxy, simply change the following string in the code depending on the WebDriver:

*Firefox*

```
HttpProxy = "gate.smartproxy.com:7000"
```

*Chrome*
```
HttpProxy = "http://gate.smartproxy.com:7000"
```

<img src="https://i.imgur.com/R0CPyut.png">

### Testing

If everything is done correctly, after running the code, selected WebDriver will apear with a new IP from the proxy service. You will also get a printed output of the IP in the Console:

<img src="https://i.imgur.com/kQOZsn9.png">

## How to get started with Smartproxy?
[<img src="https://smartproxy.com/wp-content/uploads/2019/04/How-to-buy-Smartproxy-plans-now.svg">](https://dashboard.smartproxy.com/register)
<br><br><center>Accepted payment methods:
<br><img src="https://smartproxy.com/wp-content/uploads/2018/09/payment-methods-smartproxy-residential-rotating-proxies.svg" alt="" width="250" height="50"></center>

## Contacts
Email - sales@smartproxy.com
<br><a href="https://smartproxy.com">Live chat 24/7</a>
<br><a href="https://join.skype.com/invite/bZDHw4NZg2G9">Skype</a>
<br><a href="https://t.me/smartproxy_com">Telegram</a>
