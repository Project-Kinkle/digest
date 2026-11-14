# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

- Support for JVM and Android targets.
- Chose a JVM bytecode target of 1.8 and Android `minSdk` 24 / `compileSdk` 36
  to maximize consumer compatibility while covering ~99% of active Android devices.
