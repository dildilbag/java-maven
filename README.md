# Java Template

This is a Java 17 template with Maven and JUnit which can use the preview features of Java. Building happens with `make`
, running with `./hello`. The project built happens via the Maven wrapper which means that you do not need Maven on your
machine.

To use this template for your code, update the file `pom.xml` with your actual main class. If the class `Hello` in the
package `se.kth.compilers` contains the main method of your application, the maven file includes the following line.

```xml
<mainClass>se.kth.compilers.Hello</mainClass>
```

After running the command `make` in your home directory, Maven compiles a JAR of your application. To run this JAR via
the provided executable script `hello`, change the name of the JAR in the script to the name of your compiled JAR. For
the JAR name `java-17-maven-project-1.0-SNAPSHOT`, the script includes the following line.

```bash
exec java --enable-preview -jar target/java-17-maven-project-1.0-SNAPSHOT.jar "$@"
```

You can also rename the executable script. If the executable should be called `hola`, then run:

```bash
mv hello hola
```
