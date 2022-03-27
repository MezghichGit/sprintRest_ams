From openjdk:8
copy ./target/ams_rest_mars_2022-0.0.1-SNAPSHOT.jar ams_rest_mars_2022-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","ams_rest_mars_2022-0.0.1-SNAPSHOT.jar"]