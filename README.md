single-project-maven-layout
===========================
This project is a seed/skeleton of a Maven-based project, set up with relevant dependencies, plugins and configuration
files.

Not all dependencies are relevant for all projects, but are included as a reminder of useful packages. Delete the ones
you do not need.


Potentially useful dependencies
-------------------------------
Beyond the references already included in the `pom.xml` here are a couple of more specialized libraries which can come
in handy:

### [Jdbi](http://jdbi.org/)
This is largely what JDBC should have been since Java 8. It is a convenient, fluent way to write queries and map them
to objects (including annotation-based automatic mapping), but it is deliberately _not_ a full ORM framework.

### [jBCrypt](https://www.mindrot.org/projects/jBCrypt/)
A Java implementation of the industry-standard BCrypt password salting.

    <dependency>
      <groupId>org.mindrot</groupId>
      <artifactId>jbcrypt</artifactId>
      <version>0.4</version>
    </dependency>

### [DSI Utilities](http://dsiutils.di.unimi.it/)
A grab bag of interesting functions. Notably, it has some very strong random number generators such as 
[XoRoShiRo128PlusRandom](http://dsiutils.di.unimi.it/docs/index.html?it/unimi/dsi/util/XoRoShiRo128PlusRandom.html),
though note that Java 8+ has a
[SplittableRandom](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/SplittableRandom.html)
which provides far better performance and randomness than the old
[Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html),
so you might not need this.

    <dependency>
      <groupId>it.unimi.dsi</groupId>
      <artifactId>dsiutils</artifactId>
      <version>2.6.5</version>
    </dependency>


IntelliJ template
-----------------
As a convenience in IntelliJ, you can set up the class template to always include a logger.  
Go to **Settings / Editor / File and Code Templates** and update **Class** to

    #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
    #parse("File Header.java")
    
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import javax.annotation.ParametersAreNonnullByDefault;
    
    @ParametersAreNonnullByDefault
    public class ${NAME} {
     private static final Logger LOGGER = LoggerFactory.getLogger(${NAME}.class);
    }

(and then possibly disallow `System.out` under **Editor / Inspections**,
**Java / Code maturity / Use of System.out or System.err** to make sure you always get traceable output.)
