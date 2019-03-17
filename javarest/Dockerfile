FROM openjdk:11
EXPOSE 7000
CMD ["./javarest/bin/javarest"]
COPY javarest.tar /tmp
WORKDIR /usr/src
RUN tar -xf /tmp/javarest.tar && rm -f /tmp/javarest.tar
