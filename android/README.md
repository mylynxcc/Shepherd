# Shepherd — Android (GeckoView) quick start

This folder contains an Android app skeleton that uses GeckoView for browsing.

Prerequisites
- JDK 11+
- Android SDK & NDK (if compiling native parts)
- Android Studio (recommended)
- GeckoView artifacts (use Mozilla Maven or local build of GeckoView)

Quick steps
1. Open `android/` in Android Studio.
2. Add GeckoView dependency (use Mozilla's maven or local AAR).
3. Implement a basic Activity with:
   - GeckoSession
   - URL bar and navigation
   - Tabs (keep simple for prototype)
4. Wire privacy toggles:
   - Blocklists (host-based or via content filtering layer)
   - DoH setting (configure network resolver)
   - Tor: support proxy configuration to route traffic to Tor (or integrate Tor binary in later stages)

Notes
- GeckoView provides good anti-fingerprinting features; ensure relevant prefs are enabled.
