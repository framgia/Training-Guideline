# Android Project 1 Guide

## 1. General Information
#### Execution time:
10 working days (Maximum 20 working days)
#### Team size
1 ~ 2 people

#### Reference topics:
https://sal.vn/kinsDW

#### Coding convention
https://github.com/framgia/coding-standards/blob/master/eng/android/coding_convention_android_kotlin.md

#### Techniques apply
1. Android Architecture
2. Layout Container
3. Activity Lifecycle
4. Fragment Lifecycle
5. Intent
6. Drawable, Style, Theme
7. RecyclerView
8. Menu, pickers, user navigation
9. Executor
10. Internet connection
11. Broadcast receiver
12. Service
13. MVP partern (require) [reference](https://github.com/daolq-2712/Structure_Android/tree/mvp_kotlin)

## 2. Steps to take:
Do the work step by step as follows:
1. Create ideas, requirements and send trainer review according to the template
    https://sal.vn/YZHBxP
2. If approved by the trainer, then design the prototype on:
   https://www.figma.com
   then send the trainer for review, if approved, go to step 3
3. Breaks tasks like the above template, remember to arrange by priority, each task is less than 4h
    https://sal.vn/trhiVs
    And send the trainer review, approved, then notify the trainer to issue redmine (to import tasks instead of using sheet files)
    After breaking tasks on redmine, send trainer review, if approved, trainer will provide github repo for you
    
    Redmine guide: https://sal.vn/JeaPe6
4. After receiving the github repo, proceed to create a pull init project including:
    - Template pull request
    - File .gitignore
    - Install Sun*CI
    on [here](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project)
5. After being approved merged pull init, create the next pull request and send it to the trainer for review

#### NOTE:
- The 2nd pull onwards each pull no more than 20 file changes and 500 lines of code
- You in the team review each other + approve pull after the review is done without any errors.
- After the cross-review is ok, then send the pull to the trainer for review.

## 3. Add tasks on redmine + estimate time
- Register for a redmine account on the site [here](https://edu-redmine.sun-asterisk.vn/) and then send information to the trainer
#### Note:
- Refer to the account naming [here](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Each ticket task estimate does not exceed 4 hours, in case of large task, divide many tickets to perform.
- Change ticket status according to instructions [here](https://github.com/framgia/Training-Guideline/blob/master/WorkingProcess/redmine/redmine.md)

#### The process of changing the status of a ticket is as follows:
1. All work to be done must be created into a redmine ticket before starting to work
2. Tickets redmine must fill in Category, Target Version, Parent task, Start date, Due date, Estimated time
3. Dev receives ticket, changes status "In Progress"
4. Dev done, send pull request, update ticket redmine link of pull request, change %DONE to 90%
5. Pull request sent to the whole team to review
6. Pull request must have a member in the review team OK to be sent to the trainer for review.
7. Pull request merged, dev updates %DONE of redmine ticket to 100%, status to Resolved

## 4. Review project
- Only review the project when the team completes >= 85% of the required functions of the project
- Always try to proactively receive feedback from trainers and others early and continuously
- In case the team completes less than 85% of the requirements, it is necessary to contact the Trainer 2 days before the deadline to request a reschedule and ask for more time.

#### Happy coding!!!
