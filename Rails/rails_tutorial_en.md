# Rails Tutorial guideline

## 1. Goal

This section will show you how to develop a web application using the Ruby on Rails framework. The Rails Tutorial is designed to give you a complete introduction to how to develop web applications, including the foundations in Ruby, Rails, HTML & CSS, databases, version control, testing, and deploying applications. If you already know web development, this course will quickly teach you the essentials of the Ruby on Rails framework, including MVC and REST, generators, migrations, routing, and embedded Ruby.
At the end of this course, students will be able to:
  - Know how to install and configure Ruby, Rails and related packages
  - Understand the life cycle of a request in Rails
  - Model-View-Controller architecture application for server-side applications
  - Learn to program the main components of Rails, including Active Record, Action Controller and Action View
  - Learn Ruby's fundamentals
  - Build data-driven applications with Rails
  - Implement TDD (test-driven development) for Rails applications.
  - Complete a blog application with basic functions.
  
## 2. Training time
From 10/8/2021 to 10/9/2021

## 3.Document link

- [Book] https://drive.google.com/drive/folders/1y6xUxiFsuI3Qyx53yajYUcvRDJINPpUN

- [Slides]
https://drive.google.com/drive/folders/1emu0CkbO0nSORHrJL6isgljCIugixa9s

- [Videos]
https://link.sun-asterisk.vn/6FW345

## 4. About send pull request
The first pull request will be init project :
+ Go to github to create new repository name is `sample_app`, select `Initialize this repository with a README`, `add .gitignore` choose `Ruby` => Create repository. 
After that, you clone this repository to local computer.
+ n locale computer: open terminal `cd sample_app`
```
# create new branch name is init_project
git checkout -b init_project 

# initialize project rails
rails new .

git add .
git commit -m "Init Project"
git push origin init_project
```

Then check on github to create a new pull request, read the instructions below so the trainer can review the pull.

From chapter 3 -> chapter 14.  After each chapter, you make a pull request.

#### Regulations on pull request:
- Each pull request corresponds to each chapter
- Naming:
  + The github repo name is: **sample_app**
  + The git branch name corresponds to the chapter name. For example: **chapter_3**, **chapter_4**
  + Pull request title: The title of that chapter.
    Ex: "Chapter 3: Mostly static pages", "Chapter 6: Modeling users"

You use the reviewboard system PRTS to review the code before being merged into the master. You install the system according to the steps below:

 - You log into the PRTS page https://prts.sun-asterisk.vn/ with your Github account.
- Install according to the instructions:
https://link.sun-asterisk.vn/Bxdu3v



## 5. Setting Sublime Text
You use this setting for sublime to handle indent, trailing space and end of file, by:
Preference -> User Settings -> remove the old one and paste the following code into:
```yaml
{
  "ensure_newline_at_eof_on_save": true,
  "font_size": 14,
  "highlight_line": true,
  "ignored_packages":
  [
    "Vintage"
  ],
  "rulers":
  [
    80
  ],
  "show_encoding": true,
  "show_line_endings": true,
  "tab_size": 2,
  "translate_tabs_to_spaces": true,
  "trim_trailing_white_space_on_save": true,
  "binary_file_patterns":
  [
    ".bundle/",
    "bin/",
    "log/",
    "tmp/",
    "test/",
    "vendor/assets/fonts/"
  ],
  "draw_minimap_border": true,
  "update_check": false,
  "word_wrap": true
}
```
## 6. Some notes during the tutorial
- You are absolutely not allowed to wait for the merged pull request chapter first and then do the next chapter. Instead, checkout new branch from the previous branch and continue your work, then rebase and fix conflict if any.
- Please wait up to 3 hours to get feedback after sending a pull request to the trainer. If you have not received a trainer review after 3 hours , please send them reminder message.
- You should create only one commit per pull request.
- Read and understand thoroughly the instructions before using `PRTS` to avoid mistakes.
- You should actively ask friends or Trainer for support if you have problems that cannot be solved by yourself

## 7. Coding convention
You self-review individual code according to the company's coding convention by the following link:

- Ruby: https://link.sun-asterisk.vn/tVYuqK
- Rails: https://link.sun-asterisk.vn/TerjZi

## 8. Test Link
Host: http://training.sun-asterisk.vn

Account: Use personal mail to register for an account

NOTE:  You have to set an account similar to your Chatwork account

  `` For example:``

  ``Full name: Nguyen Van A``

  ``Account name: [Malay_Ruby] Nguyen Van A``

### Happy coding!!!
