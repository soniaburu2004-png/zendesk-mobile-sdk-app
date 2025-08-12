
# Zendesk Mobile SDK Sample (Android)

**What this is:** A minimal Android app that opens Zendesk Messaging with your **Channel Key**.

## Quick start
1) In Zendesk Admin Center → Channels → **Mobile SDK** → Add app (Android) → copy the **Channel key**.
2) Replace `YOUR_CHANNEL_KEY_HERE` in `app/src/main/java/com/atcltd/zendeskapp/MainActivity.kt`.
3) Build with GitHub Actions (workflow included) or Android Studio.

## GitHub Actions build
- Add a repo secret: `CHANNEL_KEY=<your key>`
- Run the **Build APK** workflow → Download artifact `app-debug.apk`

