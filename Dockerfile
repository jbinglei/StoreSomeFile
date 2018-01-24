FROM codecentric/springboot-maven3-centos
MAINTAINER jbl
ADD demo.jar /usr/tmp
WORKDIR /usr/tmp
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/tmp/demo.jar"]