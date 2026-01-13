#!/bin/bash
# Setup script for ProtectionBlock Hytale mod on Linux servers

echo "🔧 ProtectionBlock Linux Setup"
echo "================================"
echo ""

# Check if HytaleServer.jar exists
HYTALE_JAR="/home/aqua/hytale/Server/HytaleServer.jar"

if [ ! -f "$HYTALE_JAR" ]; then
    echo "❌ Error: HytaleServer.jar not found at $HYTALE_JAR"
    echo "Please update the HYTALE_JAR variable in this script with the correct path."
    exit 1
fi

echo "✅ Found HytaleServer.jar at $HYTALE_JAR"
echo ""

# Update gradle.properties
echo "📝 Updating gradle.properties..."

if grep -q "^hytaleServerJar=" gradle.properties; then
    echo "⚠️  hytaleServerJar already configured in gradle.properties"
else
    echo "" >> gradle.properties
    echo "# Linux server configuration" >> gradle.properties
    echo "hytaleServerJar=$HYTALE_JAR" >> gradle.properties
    echo "✅ Added hytaleServerJar to gradle.properties"
fi

echo ""
echo "🔨 Building mod..."
./gradlew build

if [ $? -eq 0 ]; then
    echo ""
    echo "✅ BUILD SUCCESSFUL!"
    echo ""
    echo "📦 Compiled JAR location:"
    echo "   build/libs/ProtectionBlock-hytale-edition-1.0-SNAPSHOT.jar"
    echo ""
    echo "📋 Next steps:"
    echo "   1. Copy the JAR to your Hytale server's mods folder"
    echo "   2. Restart your Hytale server"
else
    echo ""
    echo "❌ BUILD FAILED"
    echo ""
    echo "Common issues:"
    echo "   - Java version mismatch (requires Java 21+)"
    echo "   - Check that HytaleServer.jar path is correct"
    exit 1
fi
