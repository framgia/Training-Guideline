# GIT guideline

## 1. Goal
- Understand Git and VCS fundamentals (Version Control System)
- Install and configure Git
- Using Git to control version during application development life cycle
- Working with GitHub

## 2. Training time:
 2 working days (In case of training part-time, training time is calculated up to 5 consecutive days from the start date)

(*) NOTE: For Malaysia training course, the training time for this GIT module is: 4 lessons (20th July -23rd July)

## 3. Document link:
[Slide]
  - Sub: https://drive.google.com/drive/u/1/folders/1RxWi807p9ZTxgzLj_UOneiUIBllcjb0h
  - videos: https://drive.google.com/drive/u/1/folders/1eSTzUcKEz3JHEkKhXQPYnJxiUrX9wP0w


[References]
- http://git-scm.com/book - the first 4 chapters
- http://backlogtool.com/git-guide/vn/intro/intro1_1.html
- https://learngitbranching.js.org/ - Tool to practice git branch
- http://chris.beams.io/posts/git-commit/

[Video]
- https://www.youtube.com/watch?v=OBCnmcgx4CE

[Note]
  - Trainees use company email (if any) or personal email registered with HR to register for an account.
  - Trainees have to set the account name similar to your account chatwork name
  - For Malaysia training course, Trainees use the personal email registered with Mr. Ikeuchi to create an account at this link: https://github.com/

## 4. Test link:
Host: http://training.sun-asterisk.vn

Account: Use personal mail to register for an account

NOTE:  You must set an account similar to your account chatwork

  `` For example:``

  ``Full name: Nguyen Van A``

  ``Account name: [Malay_Ruby] Nguyen Van A``

## Some tips when working with GIT
- "Let's go together"
  + before run command ``git checkout``, must run ``git status``
  + run ``git log --oneline`` before ``git commit``

- when to use commit -m and commit --amend

  `` git commit -m "content comment" ``// for the first commit

  ``git commit --amend ``// for the 2nd commit onwards.

    how do you know that be the first commit?

    -> you run the command `` git log --oneline ``

- Error more many commits in a pull request:

  Practice: executing rebase 2 commits in the pull request

  `` git rebase -i HEAD ~ 2
  // read and follow the instructions in terminal
  ``

- Before pushing the code to github, remember to rebase with branch master - the latest

  stand at your branch
  `` git rebase develop ``

  + with conflict: fix conflict -> git add -A -> git rebase --continue
  + no conflict: `` git push origin name_branch``

- Missed to push an unnecessary file / folder onto the pull request

  ``
  // file
  git rm --cached file_name
  // folder
  git rm -r --cached folder
  ``

- Accidentally fixed the wrong branch comment (yaoming)

  Step 1. If you run ``git commit`` not yet, you  just git checkout to branch

  Step 2. If  you run commit command, you run  `` git reflog ``

  Select the commit you want to return `` git reset id_commit ``
  then follow the Step 1

  Also, you can learn more ``git reset``

### Happy coding !!
