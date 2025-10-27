# Shepherd

Shepherd is a privacy-first browser project: a Firefox/Gecko fork for Desktop, GeckoView for Android, and a hardened WKWebView for iOS. It focuses on blocking trackers, resisting fingerprinting, defending against surveillance, and offering multi-layered encryption with optional Tor integration included in the MVP.

Key goals
- Browse privately. Explore freely.
- Block trackers and ads by default.
- Resist fingerprinting and reduce surface area for surveillance.
- Multi-layered network privacy: DoH/DoT, WebRTC leak protection, optional Tor (MVP).
- Minimal or no telemetry (opt-in only).

Platforms (MVP focus)
- Desktop: Firefox/Gecko fork (privacy-first)
- Android: GeckoView
- iOS: WKWebView (hardened; follow App Store constraints)

License
- MPL-2.0 (compatible with Firefox source components). See LICENSE.md for details.

MVP highlights
- Default tracker & fingerprinting protections
- Private/Incognito mode
- DNS-over-HTTPS support
- WebRTC leak protections
- Tor integration (per-app or per-tab in MVP)

Quick start (developer)
1. Create repository: mylynxcc/Shepherd (MPL-2.0).
2. Clone and create platform subfolders:
   - /android
   - /desktop
   - /ios
   - /docs
3. See platform READMEs (android/README.md, desktop/README.md) for build notes.
4. Create issues from ROADMAP.md to track milestones.

Contributing
- See CONTRIBUTING.md for coding standards, branch strategy, and PR guidance.

Security & reporting
- Security policy (TBD). For now, open an issue with "security" label for responsible disclosure.
