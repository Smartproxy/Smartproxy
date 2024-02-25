<p align="center">
    <a href="https://smartproxy.com/"><img src="https://snipboard.io/3IyORg.jpg"></a>
  </a>
</p>

### Disclaimer

To continue further development with Java, make sure to read their [documentation](https://docs.oracle.com/en/java/javase/12/)

### Prerequisites

- [Java](https://www.java.com/en/)
- [Java SE Runtime Environment 8](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)

### Installation

This particular code was built with [Eclipse](https://www.eclipse.org/) which will be used to build and launch the application.

If you feel like using something else or executing the script with `javac` command, you may need to install [JAVA JRE](https://www.oracle.com/technetwork/java/javase/downloads/server-jre8-downloads-2133154.html).

Once you have all the prerequisites ready, create your project folder:

```
mkdir java_example
```
When project directory is setup, you can now download our example code for Java.

1. Open Terminal/Command Prompt window.
2. Navigate to the main directory of your project folder using `cd java_example`
3. Download our code using the following command:
```
curl https://raw.githubusercontent.com/Smartproxy/Smartproxy/master/java/java.java > java.java
```
<img src="https://i.imgur.com/4NpvtzU.png" alt="curl smartproxy java code sample">

4. You should now see your project folder populated with *java.java* file.

### Configuration

To configure the proxy, simply change the arrow marked lines in the code:

<img src="https://i.imgur.com/1LKiH1K.png" alt="smartproxy java proxy username password authentication">

### Usage

If everything is done correctly, after running the code, you will see an IP address printed in the Console.

<img src="https://i.imgur.com/CS80lMb.png">

As a note, if you are targeting HTTPS, in some setups the Basic Authentication scheme may not work (error: "HTTP/1.1 407 Proxy Authentication Required"). You could resolve this issue by proxying HTTP, changing the authentication scheme of the proxy to Digest Authentication, or disabling Basic Authentication for HTTPS tunneling by setting the system property to "" (empty) when running the code:

```
java -Djdk.http.auth.tunneling.disabledSchemes="" java.java
```

## Need help?
Email - sales@smartproxy.com
<br><a href="https://smartproxy.com">Live chat 24/7</a>

