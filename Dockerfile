FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac ArraysAndStrings.java
CMD ["java", "ArraysAndStrings"]