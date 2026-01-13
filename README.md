# ProtectionBlock (Hytale Edition)

A Hytale server-side mod that adds a protection block (similar to ProtectionStones in Minecraft).

## Project Structure

This project includes **local stubs** for the Hytale Server API (`net.hytale.api`) to allow compilation and development before the official API is public.

## Prerequisites

- **Java JDK 17** (Required)
- Gradle (optional, wrapper provided if initialized, otherwise use local gradle)

## How to Build

1. **Clone the repository**:

    ```bash
    git clone <repository-url>
    cd ProtectionBlock-hytale-edition
    ```

2. **Compile the mod**:
    If you have Gradle installed globally:

    ```bash
    gradle build
    ```

    *Note: The `gradlew` wrapper script is not currently committed. Use your local gradle installation.*

3. **Output**:
    The compiled JAR file will be located in:
    `build/libs/ProtectionBlock-hytale-edition-1.0-SNAPSHOT.jar`

## Features

- **Protection Block**: A special block that protects a 20x20 area around it.
- **Commands**:
  - `/giveprotection` (alias `/gp`): Gives the player a protection block.
- **Protection Logic**:
  - Prevents other players from breaking blocks in the protected area.
  - Prevents other players from placing blocks in the protected area.
  - Prevents other players from interacting with blocks in the protected area.
