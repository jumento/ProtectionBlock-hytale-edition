# ProtectionBlock - Hytale Edition

A server-side mod for Hytale that adds protection blocks, similar to Minecraft's ProtectionStones.

## Features

- Special protection blocks that can only be obtained via console command
- 20x20 protected areas around placed protection blocks
- Prevents unauthorized players from:
  - Breaking blocks
  - Placing blocks
  - Interacting with objects (F key)
- Only the block owner can modify the protected area

## Building

### Prerequisites

- Java 25 JDK
- Gradle
- HytaleServer.jar

### Configuration

**Windows:** The build is pre-configured to use the default Hytale installation path.

**Linux/Custom Path:**

Option 1 - Edit `gradle.properties`:

```properties
hytaleServerJar=/path/to/your/HytaleServer.jar
```

Option 2 - Set environment variable:

```bash
export HYTALE_SERVER_JAR=/path/to/your/HytaleServer.jar
```

### Building the Mod

```bash
gradle build
```

The compiled JAR will be in `build/libs/ProtectionBlock-hytale-edition-1.0-SNAPSHOT.jar`

## Installation

1. Place the compiled JAR in your Hytale server's `mods` folder
2. Start or restart your server

## Commands

- `/giveprotection <player>` - Give a protection block to a player (console only)

## License

MIT License
