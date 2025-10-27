# Architecture — Shepherd

This document summarizes the recommended architecture for Shepherd (privacy-first browser).

High-level approach
- Use platform-native privacy-focused engines:
  - Desktop: Firefox/Gecko fork (preferred for strongest anti-fingerprinting)
  - Android: GeckoView
  - iOS: WKWebView (App Store requires WKWebView)
- Keep UI layer separate from engine layer. Use native toolkits:
  - Android: Kotlin + Jetpack Compose
  - Desktop: C++/Rust (if forking Firefox) or suitable build system used by Firefox
  - iOS: Swift + SwiftUI

Core components
- UI layer
  - Address bar, tab manager, settings, privacy quick toggles, downloads, bookmarks
- Engine layer
  - Gecko (desktop + Android) or WKWebView (iOS) with injected privacy policies
- Network layer
  - System resolver or embedded resolver; support DoH/DoT selection
  - Per-app/per-tab Tor proxy support (MVP)
  - Tracker-blocking engine (blocklist + heuristics)
- Privacy enforcement
  - Tracker/blocklist manager (uBlock-like lists)
  - Fingerprinting mitigation: reduce precision (timers, canvas noise, WebGL controls)
  - API mediation: default-deny for high-risk APIs (camera, mic, sensors)
  - Cookie partitioning / first-party isolation
  - WebRTC leak prevention
- Storage & sync
  - Local encrypted storage for bookmarks and preferences
  - Optional end-to-end encrypted sync backend (post-MVP)
- Updates & supply chain
  - Signed update channel, reproducible build guidance

Threat model (summary)
- Trackers and cross-site profiling
- Browser fingerprinting by remote sites
- Network-level surveillance and traffic analysis
- Device-level compromise is out-of-scope (assume reasonable OS patching)

Privacy-by-default decisions (MVP)
- Block trackers/ad networks by default with curated blocklists
- Private mode (no persistent storage)
- Restrict high-entropy APIs, low-resolution timers
- Disable or mediate canvas, audio, and WebGL by default (with site exceptions)
- Use DoH and make resolver selectable
- Optional Tor integration (explicit user opt-in per session or per-tab)

Extensibility & future-proofing
- Allow curated extension support (careful — extensions increase fingerprinting risk)
- Modular blocklist updates via signed feeds
- Provide audit and transparency pages and reproducible build instructions
