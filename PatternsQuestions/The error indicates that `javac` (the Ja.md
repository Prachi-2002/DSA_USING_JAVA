The error indicates that `javac` (the Java compiler) is not installed on your system. You can install the Java Development Kit (JDK) using one of the suggested commands. Here’s the most common one:

### Step to Install the JDK

To install the default JDK, which includes `javac`, run:

```bash
sudo apt update
sudo apt install default-jdk
```

Alternatively, if you want to install a specific version, like OpenJDK 11 (a commonly used long-term support version), use:

```bash
sudo apt install openjdk-11-jdk
```

After the installation is complete, confirm that `javac` is available:

```bash
javac -version
```

This should display the installed version of the Java compiler.

### Running Your Program

Once installed, you can compile and run your Java program as before:

```bash
javac BinarySearch.java
java BinarySearch
``` 

Let me know if you encounter any other issues!