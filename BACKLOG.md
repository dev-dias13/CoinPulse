# CoinPulse — Backlog

Status: `new` — not started · `dev` — in progress · `done` — merged into `main`

Labels: `feat` — new functionality · `fix` — corrects broken behaviour · `chore` — build, tooling, dependencies, docs

One task — one branch — one PR.
Branch: `feat/AND-0018-coins-list` · `fix/AND-0005-remove-template-code` · `chore/AND-0003-ci`
Commit: `feat(coins): AND-0018 add coins list screen`

**At most one** task may sit at `dev` at a time.

---

## M0 — Setup (closed)

| ID | Task | Label | Status |
|----|------|-------|--------|
| AND-0001 | Project scaffold: module structure, convention plugins, version catalog, JVM toolchain 17, build configuration, Navigation 3 | chore | done |

---

## M1 — Repository hygiene

Small tasks. The point is that the repo should not read as a generated template.

| ID | Task | Label | Status |
|----|------|-------|--------|
| AND-0002 | README: overview, screenshots, module graph, stack, build steps, API key setup | chore | done   |
| AND-0003 | GitHub Actions: `build` + `test` + `lint` on PRs and pushes to `main` | chore | new    |
| AND-0004 | Repository description, topics, LICENSE | chore | new    |
| AND-0005 | Remove template code: `Greeting`, `GreetingPreview`, `keepRules/rules.keep` | chore | new    |
| AND-0006 | Bump stale versions: `coreKtx`, `lifecycle`; verify Kotlin/KSP compatibility with AGP 9 | chore | new    |
| AND-0007 | Rename `uikit` → `core:ui-kit` for a consistent module layout | chore | new    |
| AND-0008 | Tech debt: migrate to AGP 9 built-in Kotlin, drop `builtInKotlin`/`newDsl` | chore | new    |

---

## M2 — Core

Foundation for the feature work. Build exactly as much as M3 needs, no more.

| ID | Task | Label | Status |
|----|------|-------|--------|
| AND-0009 | `core:mvi` — hand-rolled MVI: `Store`, `State`, `Intent`, `Effect`, base `MviViewModel` | feat | new |
| AND-0010 | `core:network` — OkHttp, Retrofit, `Json`, interceptors, Hilt module | feat | new |
| AND-0011 | `core:network` — result wrapper and mapping of network errors to domain errors | feat | new |
| AND-0012 | CoinGecko API key via `local.properties` → `BuildConfig`, key never committed | chore | new |
| AND-0013 | `core:database` — Room: `CoinEntity`, DAO, database, Hilt module | feat | new |
| AND-0014 | `core:ui-kit` — loading, error and empty states | feat | new |
| AND-0015 | `core:nav` — `NavKey` definitions, `NavDisplay` wired into `MainActivity` | feat | new |

---

## M3 — MVP: coin list

**MVP boundary.** Once this milestone closes, the app is worth showing. Nothing from M4 starts until M3 is fully done.

| ID | Task | Label | Status |
|----|------|-------|--------|
| AND-0016 | Domain: `Coin` model, repository interface, coin list use case | feat | new |
| AND-0017 | Repository implementation: offline-first, network → Room → UI | feat | new |
| AND-0018 | Coin list screen: store, states, Compose UI | feat | new |
| AND-0019 | Pull-to-refresh | feat | new |
| AND-0020 | Coin detail screen: price, volume, 24h change | feat | new |
| AND-0021 | Unit tests: list store (Turbine), repository (MockK) | chore | new |
| AND-0022 | Screenshot in README, first release APK in GitHub Releases | chore | new |

---

## M4 — Post-MVP

Not before M3 is closed. Order within the milestone is flexible.

| ID | Task | Label |
|----|------|-------|
| AND-0023 | Watchlist: favourites in Room, dedicated tab | feat |
| AND-0024 | Coin search and sorting | feat |
| AND-0025 | List pagination (Paging 3) | feat |
| AND-0026 | Price sparkline on the detail screen (Vico) | feat |
| AND-0027 | Live prices over the Binance WebSocket | feat |
| AND-0028 | Price alerts: WorkManager + notifications | feat |
| AND-0029 | Settings: theme, display currency (DataStore) | feat |
| AND-0030 | Screenshot tests (Roborazzi) in CI | chore |
| AND-0031 | Baseline Profile | chore |

---

## Notes

- Numbering is frozen. IDs are never changed or reused: a cancelled task stays in the file with status `cancelled` and a reason.
- New tasks go at the end of their milestone with the next free number.
- If a task does not fit into one PR, split it into new IDs rather than growing the branch.
- Status changes in the same PR as the code: `new` → `dev` in the first commit of the branch, `dev` → `done` in the last.
- The label here matches the PR label and the branch prefix. If the label turns out wrong mid-flight, fix it in both places.