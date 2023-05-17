FROM ubuntu:latest
EXPOSE 8080

RUN apt update
RUN apt -y upgrade
RUN apt -y install openjdk-19-jdk
RUN apt -y install maven
RUN apt -y install git

RUN git clone https://github.com/Kulis129/KalkulatorAPI.git

WORKDIR /KalkulatorAPI/

RUN jshall -v
RUN mvn clean install
RUN mvn test
