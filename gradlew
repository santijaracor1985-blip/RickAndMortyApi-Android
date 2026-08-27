#!/bin/sh
# Gradle wrapper launcher. If gradle-wrapper.jar is not present, open this project in Android Studio and sync Gradle.
APP_HOME=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd -P)
CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar
if [ ! -f "$CLASSPATH" ]; then
  echo "gradle-wrapper.jar is missing. Open the project in Android Studio and use the configured Gradle version."
  exit 1
fi
exec java -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
