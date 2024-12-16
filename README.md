# Java Music Player Application

A modern web-based music player built with Spring Boot and OOP principles.

## Object-Oriented Programming Concepts Implementation

### Encapsulation
- Data hiding is implemented in the MusicPlayer application where audio states and properties are private.
- The application uses getter/setter methods to control access to the player's properties.
- Volume controls and progress tracking are encapsulated within their respective components.

### Inheritance
- The application extends the `SpringBootApplication` base class.
- Test classes inherit from Spring's test framework.
- Custom components can extend base audio player functionality.

### Polymorphism
- Runtime polymorphism through method overriding for different audio formats.
- Different implementations of audio playback methods based on file types.
- Dynamic behavior of player controls based on state.

### Abstraction
- Complex audio processing logic is abstracted away from the user interface.
- Clean separation between the presentation layer and business logic.
- Abstract interfaces for audio manipulation.

---

## Technology Stack
- Java 17+
- Spring Boot 3.4.0
- Maven
- Thymeleaf
- JavaScript
- Tailwind CSS

---

## How to Run

### 1. Clone the Repository
```bash
git clone https://github.com/Mohdjariullah/Music-Player-Java.git
```

### 2. Directory Structure
```bash
musicplayer/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── musicplayer/
│   │   │               └── MusicplayerApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── style.css
│   │       │   ├── favicon.ico
│   │       │   └── 2.png
│   │       ├── templates/
│   │       │   └── index.html
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── musicplayer/
│                       └── MusicplayerApplicationTests.java
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```

### 3. Navigate to the Project Directory
```bash
cd Music-Player-Java
```

### 4. Build & Run Options

#### Using Maven
```bash
mvn clean install
mvn spring-boot:run
```

#### Using Maven Wrapper (Windows)
```bash
mvnw.cmd clean install
mvnw.cmd spring-boot:run
```

#### Using Maven Wrapper (Linux/Mac)
```bash
chmod +x mvnw
./mvnw clean install
./mvnw spring-boot:run
```

---

## 5. Access the Application
Open your browser and navigate to:
```
http://localhost:8080
```

---

## Troubleshooting

### Port Already in Use
If port `8080` is occupied, modify `src/main/resources/application.properties`:
```properties
server.port=8081
```

### Java Version Issues
Ensure `JAVA_HOME` points to Java 17+:
```bash
java -version
```

### Permission Issues (Linux/Mac)
If `mvnw` shows permission denied:
```bash
chmod +x mvnw
```

---

## Development Setup

### IDE Configuration
1. Import the project as a Maven project.
2. Set Java 17 as the project SDK.
3. Enable annotation processing in your IDE.
4. Install Spring Boot IDE plugins (recommended).

### Hot Reload
The application supports **hot reload** using Spring Boot DevTools during development.

---

## Building for Production

### Create Executable JAR

#### Using Maven:
```bash
mvn package
```

#### Using Maven Wrapper:
```bash
./mvnw package
```

### Run the JAR
```bash
java -jar target/musicplayer-0.0.1-SNAPSHOT.jar
```

