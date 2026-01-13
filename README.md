# ProtectionBlock - Hytale Edition

A server-side mod for Hytale that adds protection blocks, similar to Minecraft's ProtectionStones.

## Features

- Special protection blocks obtainable only via console command
- 20x20 protected areas around placed protection blocks
- Prevents unauthorized players from:
  - Breaking blocks
  - Placing blocks
  - Interacting with objects (F key)
- Only the block owner can modify the protected area

## Building

### Prerequisites

- Java 25 JDK (or Java 21+ for compatibility)
- Gradle
- HytaleServer.jar

### Quick Start

**The build system automatically detects HytaleServer.jar** in common locations:

**Linux:**

- `/home/aqua/hytale/Server/HytaleServer.jar`
- `~/hytale/Server/HytaleServer.jar`

**Windows:**

- `%APPDATA%/Roaming/Hytale/install/release/package/game/latest/Server/HytaleServer.jar`

Simply run:

```bash
gradle build
```

### Custom HytaleServer.jar Location

If your `HytaleServer.jar` is in a different location, you have two options:

**Option 1** - Edit `gradle.properties`:

```properties
hytaleServerJar=/path/to/your/HytaleServer.jar
```

**Option 2** - Set environment variable:

```bash
export HYTALE_SERVER_JAR=/path/to/your/HytaleServer.jar
gradle build
```

### Build Output

The compiled JAR will be in:

```
build/libs/ProtectionBlock-hytale-edition-1.0-SNAPSHOT.jar
```

## Installation

1. Place the compiled JAR in your Hytale server's `mods` folder
2. Start or restart your server

## Commands

- `/giveprotection <player>` - Give a protection block to a player (console only)

## Linux Server Setup (Automated)

For quick setup on Linux servers:

```bash
git clone <repository-url>
cd ProtectionBlock-hytale-edition
chmod +x setup_linux.sh
./setup_linux.sh
```

## License

MIT License
