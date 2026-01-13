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

**IMPORTANT:** You must use **Java 21 JDK** (not Java 25).

- Java 21 JDK - [Download Here](https://adoptium.net/temurin/releases/?version=21)
- Gradle (included with wrapper)

### Quick Start

Just like Minecraft mods:

```bash
git clone <repository-url>
cd ProtectionBlock-hytale-edition
gradle build
```

That's it! The build automatically finds and copies `HytaleServer.jar` from your Hytale installation.

### Build Output

The compiled JAR will be in:

```
build/libs/ProtectionBlock-hytale-edition-1.0-SNAPSHOT.jar
```

## Installation

1. Ensure your Hytale Server is running **Java 21**
2. Place the compiled JAR in your Hytale server's `mods` folder
3. Start or restart your server

## Commands

- `/giveprotection <player>` - Give a protection block to a player (console only)

## Troubleshooting

### "UnsupportedClassVersionError"

Your server is running the wrong Java version. Install Java 21:

```bash
# Linux
sudo apt install openjdk-21-jdk -y

# Verify
java -version  # Should show "21.x.x"
```

### Build fails with "wrong version" error

You're using Java 25 instead of Java 21. Install Java 21 JDK and set `JAVA_HOME` to point to it.

## License

MIT License
