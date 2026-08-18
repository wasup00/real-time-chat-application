# real-time-chat-application

A Java-based real-time chat app with WebSocket technology. Features private/group messaging, authentication, and online status indicators.

## Layout

This is a monorepo with two independent projects:

- `backend/` — Spring Boot (Java 17, Maven) WebSocket server.
- `android/` — Android client app (Kotlin).

## Running the backend

```bash
cd backend
./mvnw.cmd spring-boot:run
```

## Running the Android app

Open the `android/` folder as a project in Android Studio, let Gradle sync, then Run on an emulator or device.
