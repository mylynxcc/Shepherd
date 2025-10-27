# Shepherd — Desktop (Firefox/Gecko fork) notes

This folder will hold desktop-specific build instructions and patches for a privacy-first Firefox fork.

Notes & recommendations
- Fork a recent Firefox ESR or stable baseline to reduce surface changes.
- Apply privacy-hardening patches in small, auditable commits.
- Keep a reproducible build cache and document toolchain steps.
- Packaging and signing: prepare per-OS packaging (Windows, macOS, Linux).
- Consider distribution channels and how to handle updates securely.

Initial tasks
- Document baseline Firefox revision and applied patches.
- Create a build matrix for CI.
