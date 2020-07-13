# Rails Tutorial guideline

## 1. Goal

This section will show you how to develop a web application using the Ruby on Rails framework. The Rails Tutorial is designed to give you a complete introduction to how to develop web applications, including the foundations in Ruby, Rails, HTML & CSS, databases, version control, testing, and deploying applications. If you already know web development, this course will quickly teach you the essentials of the Ruby on Rails framework, including MVC and REST, generators, migrations, routing, and embedded Ruby.
At the end of this course, students will be able to:
  - Know how to install and configure Ruby, Rails and related packages
  - Understand the life cycle of a request in Rails
  - Model-View-Controller architecture application for server-side applications
  - Learn to program the main components of Rails, including Active Record, Action Controller and Action View
  - Learn Ruby's fundamentals
  - Building data-driven applications with Rails
  - Implementing TDD (test-driven development) for Rails applications.
  - Complete a blog application with basic functions.
  
## 2. Training time
9 working days (In case of training part-time, the training time is calculated up to 15 consecutive days from the start date)

(*) NOTE: For Malaysia training course, the training time for this module is: 18 lessons (6th August - 3rd September)

## 3.Document link

- [Book] https://link.sun-asterisk.vn/aJ2pQ9

- [Slides]
https://link.sun-asterisk.vn/TVb5lZ

- [Videos]
https://link.sun-asterisk.vn/6FW345

## 4. About send pull request
The first pull request will be init project :
+ Go to github to create new repository name is `sample_app`, select `Initialize this repository with a README`, `add .gitignore` choose `Ruby` => Create repository. 
After that, you clone this repository to local computer.
+ in locale computer: open terminal `cd sample_app`
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

You use the reviewboard system to review the code before being merged into the master. You install the system according to the steps below:

 - You log into the page https://prts.sun-asterisk.vn/ with your Github account.
- Install according to the instructions:
https://link.sun-asterisk.vn/Bxdu3v

## 5. Setup [Rubocop](https://github.com/rubocop-hq/rubocop) into Project
#### Step 1:  Add rubocop into Gemfile:
##### > With Ruby 2.5.x and earlier
```ruby
group :development, :test do
  gem "rubocop", "~> 0.54.0", require: false
end
```

##### > With Ruby 2.6.x onwards
```ruby
group :development, :test do
  gem "rubocop", "~> 0.74.0", require: false
  gem "rubocop-rails", "~> 2.3.2", require: false
end
```

#### Step 2: Download the zip file corresponding to the rubocop version installed in step 1:
##### >With Ruby 2.5.x and earlier
Download file [Rubocop v0.54.0 config file](https://github.com/framgia/Training-Guideline/blob/master/Rails/rubocop_config-0.54.0.tar.gz)

##### > With Ruby 2.6.x onwards
Download file [Rubocop v0.74.0 config file](https://github.com/framgia/Training-Guideline/blob/master/Rails/rubocop_config-0.74.0.tar.gz)

Then copy the following 3 files in the downloaded zip file including:
```
.rubocop.yml
.rubocop_disabled.yml
.rubocop_enabled.yml
```

Paste into the project directory, on par with Gemfile
#### Step 3: Before each commit, run this command:

```bash
bundle exec rubocop
```

#### Step 4: Take a screenshot of the pass rubocop, enter the comment of the pull request.


## 7. Setting Sublime Text
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
## 8. Some notes during the tutorial
- Absolutely do not wait for the merged pull request chapter first and then do the next chapter. Instead, you checkout new branch from the previous branch and continue, later rebase and later conflict if any.
- Pull request after sending the trainer, you wait for a maximum of 3 hours, if after 3 hours there is still no review, send the trainer reminder message.
- Make a commit / pull during the tutorial learning process.
- Read and understand the instructions before using PRTS, avoid mistakes.
- In the course, if you encounter a problem that cannot be solved, please ask for help from another friend or Trainer for support.

## 9. Coding convention
You self-review individual code according to the company's coding convention by the following link:
https://link.sun-asterisk.vn/6j5stN
## 10. Test Link
Host: http://training.sun-asterisk.vn

Account: Use personal mail to register for an account

NOTE:  You have to set an account similar to your Chatwork account

  `` For example:``

  ``Full name: Nguyen Van A``

  ``Account name: [Malay_Ruby] Nguyen Van A``

### Happy coding!!!
