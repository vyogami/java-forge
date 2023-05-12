# Java Forge

Java Forge is my personal playground for learning and practicing the art of Java programming. This repository serves as a space where I can document my progress while also storing the code that I write along the way.

## Table of Contents

- [Java Forge](#java-forge)
  - [Table of Contents](#table-of-contents)
  - [Getting Started](#getting-started)
  - [Tools](#tools)
  - [Algorithms](#algorithms)
  - [Data Structures](#data-structures)
  - [Applied Mathematics](#applied-mathematics)
  - [Amity Java Programming](#amity-java-programming)
  - [Playground](#playground)
  - [Snippets](#snippets)
  - [Contributing](#contributing)
  - [License](#license)

## Getting Started

To get started with Java Forge, you'll need to have Java Development Kit (JDK) installed on your computer. You can download the latest version of JDK from the official website at [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html).

Once you have JDK installed, clone this repository to your local machine using the following command:

```bash
git clone https://github.com/legitShivam/java-forge.git
```

Alternatively, you can download the repository as a ZIP file and extract it to your desired location.

## Tools

To make your life easier, you may find the following tools useful:

- **SDKMAN! (Software Development Kit Manager)**: SDKMAN! allows you to manage different versions of Java Development Kits (JDKs) on your system. You can use it to install, switch between, and manage Java versions. Refer to the SDKMAN! documentation for installation and usage instructions. Website: [https://sdkman.io/](https://sdkman.io/)

- **Maven**: Maven is a build automation and dependency management tool for Java projects. It provides a declarative way to define project configurations, manage dependencies, and build Java applications. You can install Maven by following the official documentation. Website: [https://maven.apache.org/](https://maven.apache.org/)

- **Gradle**: Gradle is another build automation and dependency management tool for Java projects. It offers a flexible and efficient way to build, test, and package Java applications. You can install Gradle by referring to the official documentation. Website: [https://gradle.org/](https://gradle.org/)

<details>
  <summary><h2> Basic Commands </h2></summary>

Here are some basic commands that you may find helpful when working with this repository:

<details>
  <summary> SDKMAN! Commands </summary>

- `sdk version`: Checks the version of SDKMAN! installed on your system.

- `sdk install java <version>`: Installs the specified version of Java. For example, `sdk install java 11.0.3-zulu` installs Zulu OpenJDK 11.0.3.
    > you can install maven and gradle using sdkman as well.

- `sdk use java <version>`: Sets the specified version of Java as the current default. For example, `sdk use java 11.0.3-zulu` sets Zulu OpenJDK 11.0.3 as the default Java version.

- `sdk list java`: Lists the available Java versions that can

---
</details>

<details>
  <summary> Maven Commands </summary>

> use `-q` flag to run commands in quite mode.

- `mvn clean`: Cleans the project by deleting the target directory and any generated files.

- `mvn compile`: Compiles the source code of the project.

- `mvn test`: Runs the unit tests for the project.

- `mvn package`: Packages the compiled code and resources into a distributable format, such as a JAR or WAR file.

- `mvn install`: Installs the package into the local Maven repository, making it available for other projects to use as a dependency.

- `mvn clean install`: Performs a clean build, including cleaning the project, compiling, running tests, and packaging the application.

- `mvn dependency:tree`: Displays the dependency tree of the project, showing the dependencies and their versions.
- `mvn exec:java`: Executes the main class of the project, main class is defined in the pom.xml.

---
</details>

<details>
  <summary> Gradle Commands </summary>

> you can subsitute `gradle` with wrapper scripts.
> Use `./gradlew` for linux/mac and `./gradlew.bat` for windows

- `gradle clean`: Cleans the project by deleting the build directory and any generated files.

- `gradle build`: Compiles the source code, runs tests, and packages the application into a distributable format.

- `gradle test`: Runs the unit tests for the project.

- `gradle assemble`: Assembles the outputs of the project without running the tests.

- `gradle install`: Installs the project into the local Maven or Ivy repository, making it available for other projects to use as a dependency.

- `gradle clean build`: Performs a clean build, including cleaning the project, compiling, running tests, and packaging the application.

- `gradle dependencies`: Displays the dependencies of the project, showing the dependencies and their versions.

- `gradle tasks`: Displays the available tasks and their descriptions.

---
</details>

<details>
  <summary> Java Commands </summary>

- `java`: Runs a Java application. For example, `java MyClass` executes the `MyClass` class.

- `javac`: Compiles Java source code files into bytecode. For example, `javac MyClass.java` compiles the `MyClass.java` file into `MyClass.class`.

- `javap`: Disassembles a compiled Java class file and displays its bytecode. For example, `javap MyClass` shows the bytecode of the `MyClass` class.

- `jar`: Creates a Java Archive (JAR) file. For example, `jar cf MyApp.jar MyClass.class` creates a JAR file named `MyApp.jar` containing the `MyClass.class` file.

- `javadoc`: Generates HTML documentation from Java source code comments. For example, `javadoc MyClass.java` generates HTML documentation for the `MyClass` class.

- `javadoc -d doc/ -sourcepath src/ com.example.MyClass`: Generates HTML documentation for the `com.example.MyClass` class and saves it in the `doc/` directory, assuming the source code is located in the `src/` directory.

- `jshell`: Launches the Java Shell (JShell) for interactive Java programming and experimentation.

- `javapackager`: Creates platform-specific native bundles (executable files) for Java applications. It is used to package Java applications as standalone executables.

---
</details>
</details>

## Algorithms

The `algorithms` folder contains implementation of various algorithms in Java. Each algorithm is implemented in a separate file with a brief explanation of the algorithm and how it works.

We have also included some exercises for each algorithm to help you practice and reinforce your understanding of the algorithms.

## Data Structures

The `data-structures` folder contains implementation of various data structures in Java. Each data structure is implemented in a separate file with a brief explanation of the data structure and its use cases.

## Applied Mathematics

the `applied-mathematics` folder contains python code that implements various mathematical concepts and equations. these files cover a range of topics, including linear algebra, calculus, probability, and more.

## Amity Java Programming

The `amity-java-programming` folder contains source code for various projects that are part of the Amity Java Programming course. These projects are designed to help you apply the concepts learned in the course to real-world scenarios.

## Playground

The `playground` directory is where I experiment with new Python concepts and ideas. It contains a `Play.java` file which is untracked in git so feel free to explore and experiment in this directory.

> To omit the changes to `Play.java` run the following command

``` Bash
git update-index --assume-unchanged ./playground/Play.java
```

## Snippets

The `snippets` folder contains small code snippets that demonstrate various concepts in Java programming. These snippets are designed to be concise and easy to understand.

## Contributing

We welcome contributions to Java Forge from the community. If you would like to contribute, please follow these steps:

1. Fork this repository
2. Create a new branch (`git checkout -b feature/my-feature`)
3. Make your changes and commit them (`git commit -am 'Add my feature'`)
4. Push to the branch (`git push origin feature/my-feature`)
5. Open a pull request

Please ensure that your code is well-documented and follows the [Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html).

## License

This repository is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
