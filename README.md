## servlet-test
Пример простого сервлета.
* путь доступа к сервлету
 `http://localhost:8080/examples/servlets/simple/`

* maven
 - [плагин мавена](http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/usage.html) для tomcat 7
 - деплоит через manager'а

* [tomcat 7](http://tomcat.apache.org/tomcat-7.0-doc/introduction.html)
 - установленный tomcat должен быть добавлен как [сервер](http://www.vogella.com/tutorials/EclipseWTP/article.html#webserver_configuration_starting) в Eclipse
 
* launch конфигурации
 1. [package](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle) - собрать war файл с помощью maven
 2. start tomcat - для запуска установленного tomcat из под eclipse
 3. [tomcat-deploy](http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/deploy-mojo.html) - для деплоя на tomcat из Eclipse

 
## servlet-vogella
Пример простого сервлета от [vogella](http://www.vogella.com/tutorials/EclipseWTP/article.html)
* путь доступа к сервлету
 `http://localhost:8080/servlet-vogela/FileCounter`
 - деплоится не через manager, а напрямую, поэтому доступ из браузера только к этому сервлету
* использовались стандартные WTP команды eclipse (без мавена)
 - Servlet > Run As > Run on Server
 - project > export > to WAR
* tomcat 7
 - интеграция сервера с Eclipse из коробки
 
 
## jersey-ws
Пример сервлета ~3.0 без использования web.xml. 
```#java
@ApplicationPath("/rest")
public class RestApplication extends ResourceConfig {
	public RestApplication() {
        packages("cane.brothers.jersey.web");
    }
}
```
Имплементация web-сервиса на [jersey](https://jersey.java.net/). 
```java
@Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
```
* путь доступа к сервлету
 `http://localhost:9090/jersey-ws/`
* путь до веб-сервиса
 `http://localhost:9090/jersey-ws/rest/hello`
* Проект подключает либы через мавен.
* деплоится на сервер [Glassfish](https://glassfish.java.net/) не через maven, а напрямую. В Eclipse:
 - `Run As > Run on Server`
