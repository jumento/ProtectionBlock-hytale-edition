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

### Setup

1. Clone the repository
2. Copy `HytaleServer.jar` into the `libs/` directory
3. Run the build:

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
