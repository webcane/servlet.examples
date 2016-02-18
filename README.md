## servlet.examples
Пример простого сервлета.

* использовался [tomcat 7](http://tomcat.apache.org/tomcat-7.0-doc/introduction.html)
 - установленный tomcat должен быть добавлен как [сервер](http://www.vogella.com/tutorials/EclipseWTP/article.html#webserver_configuration_starting) в Eclipse
 - [плагин мавена](http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/usage.html) тоже для tomcat 7
 
* путь доступа к сервлету
 `http://localhost:8080/examples/servlets/simple/`
 
* launch конфигурации для быстрого запуска в Eclipse:
 1. [package](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle) - собрать war файл с помощью maven
 2. start tomcat - для запуска установленного tomcat из под eclipse
 3. [tomcat-deploy](http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/deploy-mojo.html) - для деплоя на tomcat
