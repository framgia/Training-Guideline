# Setup project

## 1.Add .gitignore in root
1. Create file .gitignore in root
2. Copy content of [file](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.gitignore) into recent created file

## 2. Add pull request template
1. Create file .github/pull_request_template.md
2. Copy content of [file](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.github/pull_request_template.md) into recent created file.

## 3. Add Sun* CI
Create file .sun-ci.yml with [template](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.sun-ci.yml) to your project root
### Edit environment
1. Replace info chatwork box's id in ROOM_ID by your box's id
2. Replace info chatwork accounts in MEMBERS by your team's chatwork accounts
```
# This is Android review pull request box 
ROOM_ID: "123456"
# Insert the chatwork accounts which you want to mention when the pull request was verified
MEMBERS: "[To:1234567] Nguyen Van A"
```
## 4.Review
1. Add changes and create pull request
2. Send to Trainers review
