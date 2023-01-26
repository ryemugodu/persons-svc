From openjdk:17
copy ./build/libs/persons-svc-0.0.1-SNAPSHOT.jar persons-svc-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","persons-svc-0.0.1-SNAPSHOT.jar"]