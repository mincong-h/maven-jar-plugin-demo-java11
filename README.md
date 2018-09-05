# maven-jar-plugin-demo-java11 [![Build Status][travis-img]][travis]

Maven JAR Plugin demo in Java 11. See also [maven-jar-plugin-demo-java8](https://github.com/mincong-h/maven-jar-plugin-demo-java8).

Blog: <https://mincong-h.github.io/2018/09/05/maven-jar-plugin-understanding/>

## Usage

macOS/Linux (use `:` as separator):

```
$ mvn clean package
$ java --module-path shop-api/target/shop-api-1.0-SNAPSHOT.jar:shop-core/target/shop-core-1.0-SNAPSHOT.jar \
       --module shop-core/shop.core.Main
Welcome to Java 11
```

Windows (use `;` as separator):

```
$ mvn clean package
$ java --module-path shop-api/target/shop-api-1.0-SNAPSHOT.jar;shop-core/target/shop-core-1.0-SNAPSHOT.jar \
       --module shop-core/shop.core.Main
Welcome to Java 11
```

[travis]: https://travis-ci.org/mincong-h/maven-jar-plugin-demo-java11
[travis-img]: https://travis-ci.org/mincong-h/maven-jar-plugin-demo-java11.svg?branch=master
