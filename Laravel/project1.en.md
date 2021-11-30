# Project 1 Guidline

## 1. Normal information:
#### Working time:
10 days (Maximum 20 days for part time)
#### Number of team member :
1 ~ 3
#### Model approach:
Scrum

#### Technical apply for laravel project 1
1. Related Model
2. Seeder
3. Eager Loading Associations
4. Scope
5. Accessors & Mutators
6. Eloquent
7. Migration
8. Middleware
9. RESTful
10. Route & Resource Controller
11. Transaction
12. Authentication
13. Authorization
14. I18n (Internationalization)
15. Namespace
16. Helpers
17. CSRF Protection
18. AJAX

## 2. Step by step

1. Design database
2. Add tasks on redmine + estimate time
3. Init project
4. Add file pull_request_template to your project [here](https://github.com/framgia/Training-Guideline/blob/master/Laravel/PULL_REQUEST_TEMPLATE.md)
5. Setup CI. Follow guidline [here](https://github.com/framgia/Training-Guideline/blob/master/Laravel/setup_ci.md)
6. Init models, add relationship
7. Design static pages
8. Other pulls



#### ATTENTION:
- Each pull from step 6. is no more than 15 files changed
- The team members cross-review each other + approve pull after the review is done without any errors
- After the cross-review is ok, then send the pull to the trainer for review (ready pull).

## 3. Add tasks on redmine + estimate time
- Signup redmine account at [here](https://edu-redmine.sun-asterisk.vn/)
#### Attention:
- Name account format: [here](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Each ticket task estimate does not exceed 8 hours, in case of large task, divide many tickets to perform
#### The process to change the status of a ticket is as follows:
1. All work that needs to be done must be created into a redmine ticket before starting to work
2. Redmine tickets must fill in Category, Target Version, Parent task, Start date, Due date, Estimated time
3. Dev receives ticket, changes status "In Progress"
4. Dev has done, send pull request, update redmine ticket link of pull request, change %DONE to 90%
5. Send pull request to the whole team to review
6. Pull request must have been approved by at least a member in the review team before sending to the trainer for review.
7. After pull request has been merged, dev updates %DONE of redmine ticket to 100%, status to Resolved

## 4. pull request send to review
- Format title pull request: 
```
[Tracker#TicketID] Title ticket/Pull request
Example: [Task#12345] Handle logic login
```
- Attchment link ticket redmine into pull request
- Attchment pass phpunit image
- Attchment function layout image for pull request
- Send and follow pull on [PRTS](https://prts.sun-asterisk.vn/)
- init model/migration pull need to attachment DB design image

## 5. Review project
- Only review the project when the team completes >= 85% of the required functions of the project
- Requires deploying the project on heroku
- Use heroku link to present the project
- The login data needs to be fake ready for presentation
- Which member function does that member present
- In case the team completes less than 85% of the requirements, it is necessary to contact the Trainer 2 days before the deadline to request a reschedule and ask for more time.
#### Happy coding!!!
