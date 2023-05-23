# aws-lambda-intermettent-exception

aws-lambda-intermettent-exception is an AWS Lambda written in Java, to generate exception intermettently.


The project source includes function code and supporting resources:
- `src/main` - A Java function.
- `pom.xml` - A Maven build file.

Use the following instructions to deploy the sample application.

# Requirements
- [Java 8 runtime environment (SE JRE)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven 3](https://maven.apache.org/docs/history.html)


# Setup
Download or clone this repository.

    $ git clone https://github.com/dhirajraut/aws-lambda-intermettent-exception.git
    $ cd aws-lambda-intermettent-exception
    $ mvn clean install

    [INFO] Scanning for projects...
    [INFO] -----------------------< com.github.dhirajraut:aws-lambda-intermettent-exception >-----------------------
    [INFO] Building aws-lambda-intermettent-exception 0.0.1-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    ...

# Create AWS Lambda and Upload
Create AWS Lambda using AWS console or CLI, and upload the jar.


# Run
Run the application using AWS Lambda -> test functionality
