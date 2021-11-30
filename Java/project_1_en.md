# Guideline about Project 1

## 1. Some general information
#### Execution time:
Up to 15 days
#### Number of team members:
1 ~ 3 members

## 2. Steps to take
Work step by step as follows:
1. Design database
2. Add tasks on Redmine + estimate time
3. Init project
4. Init models, add relationship
5. Design static pages
6. Other pulls

#### NOTE:
- The pulls from step 6: each pull no more than 15 file changes
- The team members cross-review each other + approve pull
- After the cross-review is ok, let ready the pull to the trainer for review

## 3. Add tasks on redmine + estimate time
- Register account on Redmine at[here](https://edu-redmine.sun-asterisk.vn/)

#### Note:
- Refer to how to set the account name [here](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Each ticket task estimate takes no more than 8 hours, in case the task is large, should break down ticket

#### The process to change the status of a ticket is as follows:
1. Created ticket on redmine before starting to work
2. Tickets must fill in Category, Target Version, Parent task, Start date, Due date, Estimated time
3. Changes status "In Progress" when receiving ticket
4. Task implement done, send pull request, update link of pull request, change %DONE to 90%
5. Sent pull request to the whole team to review
6. Pull requests must be approved by the member before they can be sent to the trainer for review.
7. Pull request merged, update %DONE to 100%, status to Resolved

## 4. About pull request send review
- Attachment link ticket redmine into pull request
- Attachment evidence about layout (UI/UX) into pull request for function.
- Send and track pull on the system [PRTS](https://prts.sun-asterisk.vn/)
- For pull request for init model need to attach DB design image

## 5. Review project
- Only review the project when the team completes >= 80% of the required functions of the project
- Use deploy link to present the project
- The login data needs to be fake ready for presentation
- The author of the function will present that function
- In case the team completes less than 80% of the requirements, Team need contact the Trainer 2 days before the deadline to request an extension of the deadline.

#### Happy coding!!!
