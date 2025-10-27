# Roadmap — Shepherd (initial)

MVP (Phase 1) — 3 months (approx)
- Core browsing: URL bar, navigation, tabs, HTTPS indicator
- Privacy: default tracker blocking, private/incognito mode, permission manager
- Network: DNS-over-HTTPS, WebRTC leak protection
- Tor: Optional Tor integration (per-app or per-tab)
- Platforms: Android (GeckoView) and Desktop (Firefox fork)

Phase 2 — Privacy hardening & polish
- Fingerprinting resistance improvements (canvas noise, timer throttling)
- Cookie partitioning and site storage isolation
- Encrypted local storage and optional sync (E2EE)
- Accessibility and localization

Phase 3 — Beta & release
- Security audit and reproducible builds
- Beta testing (closed), fixes, packaging
- Public release and release notes

Notes on timelines
- Desktop Firefox fork requires more initial engineering for builds and packaging.
- Android GeckoView prototype can be produced quickly to validate privacy controls.

Milestones (initial issues to open)
- M1: Create repo and initial scaffolding (README, CONTRIBUTING, LICENSE)
- M2: Android prototype — navigation, tabs, basic privacy toggles
- M3: Desktop prototype — build instructions, navigation, private mode
- M4: Blocklist integration & DoH
- M5: Tor integration proof-of-concept (Android + Desktop)