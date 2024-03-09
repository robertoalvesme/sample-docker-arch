#sdk use java 21.0.2-zulu
#./gradlew build

#Create a docker image
docker build -t rhfactor/sample-docker-arch .

#Run image
docker run -p 8080:8080 rhfactor/sample-docker-arch