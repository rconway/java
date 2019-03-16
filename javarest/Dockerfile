FROM openjdk:11
EXPOSE 7000
CMD ["./javarest/bin/javarest"]
COPY ./build/distributions/javarest.zip /tmp
WORKDIR /usr/src
RUN unzip /tmp/javarest.zip && rm -f /tmp/javarest.zip
