<?php 
$username = 'username'; 
$password = 'password'; 
$proxy = 'gate.smartproxy.com:7000'; 
$target = curl_init('http://ip.smartproxy.com/'); 
curl_setopt($target, CURLOPT_RETURNTRANSFER, 1); 
curl_setopt($target, CURLOPT_PROXY, $proxy); 
curl_setopt($target, CURLOPT_PROXYUSERPWD, "$username:$password"); 
$result = curl_exec($target); 
curl_close($target); 
if ($result) 
echo $result; 
?> 
