# SETUP GUIDE

## Prerequisites
- Install [Java SDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Android Studio](https://developer.android.com/studio)
- Android Emulator or a physical Android device

## Cloning the Repository
Clone the repository using the following command:
```bash
git clone https://github.com/YOUR_USERNAME/Radio-Maximum-prime.git
```

## Setting Up the Environment
- Open Android Studio and follow prompts to set up the SDK.
- Set the environment variables if needed by navigating to your system settings and configuring path variables.

## Running the Emulator
1. Open Android Studio.
2. Go to `Tools > AVD Manager` to create a new virtual device.
3. Select a device configuration and choose a system image.
4. Click `Finish` and then click the play button to launch the emulator.

## Running on a Physical Device
1. Connect your Android device to your computer via USB.
2. Enable Developer Options on your device:
   - Go to `Settings > About phone > Software information` and tap the `Build number` 7 times.
   - Go back to `Settings > Developer options` and enable `USB debugging`.
3. In Android Studio, select your device from the device dropdown.

## Building and Running the App
To build and run the app, use the following command:
```bash
./gradlew assembleDebug
```
Then run the app with:
```bash
./gradlew installDebug
```

## Deploying to Google Play Store
1. Build a signed APK or AAB using Android Studio:
   - Go to `Build > Generate Signed Bundle/APK`.
2. Follow prompts to create a signed APK.
3. Sign in to the [Google Play Console](https://play.google.com/console/about/) and create your app listing.
4. Upload the signed APK/AAB in the `Release` section.

## Troubleshooting
- **Emulator won't start:** Ensure the correct system image is installed.
- **App crashes on startup:** Check the logs in the Logcat for error messages and fix bugs accordingly.
- **Deployment errors:** Verify app listing details in the Play Console and make sure all required fields are filled.

---