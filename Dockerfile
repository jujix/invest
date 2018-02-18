FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/invest.jar /invest/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/invest/app.jar"]
