# PRIVATE-allwinner-HDMI

A simple Android app that automatically switches to HDMI by launching the `com.softwinner.awlivetv/.MainActivity` activity.

## Features

- Single-purpose app that launches HDMI on startup
- Production-ready with signed APK builds
- Automated CI/CD with GitHub Actions
- Clean, minimal design with proper icon

## Building

The app is automatically built and signed on GitHub Actions when code is pushed to the main branch.

To build locally:
```bash
./gradlew assembleRelease \
  -PKEYSTORE_FILE=path/to/keystore \
  -PKEYSTORE_PASSWORD=password \
  -PKEY_ALIAS=alias \
  -PKEY_PASSWORD=password
```

## Installation

Download the latest release APK from the [Releases](https://github.com/probonopd/PRIVATE-allwinner-HDMI/releases) page and install it on your Android device.

## How it works

When you launch the HDMI app, it immediately starts the Allwinner HDMI activity (`com.softwinner.awlivetv/.MainActivity`) and closes itself. This provides a seamless transition to the HDMI input.

## Requirements

- Android 5.0 (API 21) or higher
- Device with Allwinner chipset and HDMI support
- The `com.softwinner.awlivetv` app must be installed on the device
