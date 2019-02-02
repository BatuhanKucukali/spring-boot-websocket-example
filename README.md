# Spring Boot WebSocket Example #

## Technologies ##
* [Spring Boot](https://spring.io/)

## Prerequisites ##
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [JDK](https://www.java.com/en/download/)
* [Gradle](https://gradle.org/)

## Run this project ##
1 . Clone project on your machine and run
```
git clone git@github.com:BatuhanKucukali/spring-boot-websocket-example.git
```
2 . Open **Google Chrome Console** and paste the code
```
ws = new WebSocket('ws://localhost:8080/message');
```
3 . Start connection and check **Network Tab**
```
ws.send("hello")
```
4 . Close connection
```
ws.close();
```

## Getting help ##

If you're having trouble getting this project running, feel free to [open an issue](https://github.com/BatuhanKucukali/spring-boot-websocket-example/issues/new) or [email me](mailto:mail@batuhankucukali.com)!
