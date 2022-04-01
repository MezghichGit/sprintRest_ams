From openjdk:8-alpine
copy ./target/amsrest.jar amsrest.jar
CMD ["java","-jar","amsrest.jar"]

