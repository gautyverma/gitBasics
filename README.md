# 🐙 Git Survival Guide

A practical Git reference for real-world development, teamwork, and problem-solving.

---

## 📌 1. Git Basics (Foundation)

| Command | Description |
|---------|-------------|
| `git init` | Start a new repo |
| `git clone <url>` | Download repo from remote |
| `git status` | Show changed files |
| `git add <file>` | Stage file for commit |
| `git commit -m "message"` | Commit staged changes |
| `git log` | Show commit history |
| `git diff` | Show unstaged changes |
| `git diff --staged` | Show staged changes |

---

## 🌱 2. Branching & Merging

| Command | Description |
|---------|-------------|
| `git branch` | List branches |
| `git branch <name>` | Create branch |
| `git checkout <name>` | Switch branch |
| `git checkout -b <name>` | Create & switch |
| `git merge <branch>` | Merge into current branch |
| `git rebase <branch>` | Reapply commits on top of another branch |

---

## 🌍 3. Remote & Collaboration

| Command | Description |
|---------|-------------|
| `git remote add origin <url>` | Link to remote repo |
| `git push -u origin main` | Push to remote for first time |
| `git pull` | Fetch + merge changes |
| `git fetch` | Fetch changes without merging |
| `git push` | Push changes to remote |

---

## 🚨 4. Real Dev Problem-Solving

### 🔹 Merge Conflicts
```bash
git pull origin main
# Fix conflicts in files marked with <<<<<<< and >>>>>>>
git add <file>
git commit
```

## 5. Undoing Changes
| Command                       | Description                     |
|-------------------------------|---------------------------------|
| `git restore <file>`          | # Discard unstaged changes      |
| `git restore <file>`          | # Discard unstaged changes      |
| `git restore --staged <file>` | # Unstage file                  |
| `git reset --hard HEAD~1`     | # Remove last commit & changes  |
| `git revert <commit-id>`      | # Undo commit with a new commit |

## 6. Fixing the Last Commit
    - git commit --amend -m "new message"
## 7. Recover Lost Commits
    - git reflog
    - git checkout <commit-id>
## 8. Stashing Work
    - git stash
    - git stash list
    - git stash apply
    - git stash pop
    - git stash drop

## 9. Find a Bug (Bisect)
    - git bisect start
    - git bisect bad
    - git bisect good <commit-id>
    - git bisect reset

## 10. Cherry-pick a Commit
    - git cherry-pick <commit-id>