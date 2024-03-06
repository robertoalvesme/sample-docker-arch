#sdk use java 21.0.2-zulu
./gradlew build
docker build -t rhfactor/sample-docker-arch .
docker run -p 8080:8080 rhfactor/sample-docker-arch
