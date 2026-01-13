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

Just like Minecraft mods:

```bash
git clone <repository-url>
cd ProtectionBlock-hytale-edition
gradle build
```

That's it! The build automatically finds and copies `HytaleServer.jar` from your Hytale installation.

### Prerequisites

- Java 21+ (Java 25 recommended)
- Gradle
- Hytale Server installed in a standard location

The build searches these locations automatically:

- **Linux:** `/home/aqua/hytale/Server/HytaleServer.jar` or `~/hytale/Server/HytaleServer.jar`
- **Windows:** `%APPDATA%/Roaming/Hytale/install/release/package/game/latest/Server/HytaleServer.jar`

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

## License

MIT License
