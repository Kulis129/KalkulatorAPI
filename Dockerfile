FROM ubuntu:latest
EXPOSE 8080

RUN apt update
RUN apt upgade
RUN apt install -y openjdk-17-jdk
RUN apt install -y maven
RUN apt install -y git

RUN git clone https://github.com/Kulis129/KalkulatorAPI.git

WORKDIR /KalkulatorAPI

RUN jshall
RUN mvn clean install
RUN mvn test