## Kotlin Calculator

<p>
Small application that performs a few operations just to try Kotlin 
</p>
<p>

## About Kotlin

<p>
It uses JVM and all his power, offers interoperability with Java, and it is also more concise, safer and funnier.
</p>

## Requirements
<p>
This POC assumes that the user has gradle installed.
</p>

* Gradle 6.7
* OpenJDK 15

## Running the tests

To run tests just
```
gradle test -i
```

## Running the application

Build the image and run the container application using [Docker](https://www.docker.com/) 
```
docker build -t calculator . && docker run -i calculator
```
Or 
If you just want to build the image:
```
docker build -t calculator .
```
and then 
run the container as many times as you want (once you have created the image):
```
docker run -i calculator
```

Run the application using [Gradle](https://docs.gradle.org/current/userguide/userguide.html)
```
gradle run
```

Run the application using [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html)
```
./gradlew run
```

## Author

* **Adolfo Rodriguez** - *kotlin-calculator* - [adolsalamanca](https://github.com/adolsalamanca)


## References

* [Kotlin](https://kotlinlang.org/)


## License

This project is licensed under MIT License.




