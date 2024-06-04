<?php

    $url = 'ip.smartproxy.com/json';
    $proxy = 'gate.smartproxy.com';
    $port = 7000;
    $user = 'username';
    $psw = 'password';

    $ch = curl_init($url);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);

    curl_setopt($ch, CURLOPT_PROXY, "$proxy:$port");
    curl_setopt($ch, CURLOPT_PROXYUSERPWD, "$user:$psw");
    $result = curl_exec($ch);
    curl_close($ch);

    if ($result) {
    echo $result . PHP_EOL;
    }
?>
