# Hướng dẫn một số thông tin về Project 1

## 1. Một số thông tin chung
#### Thời gian thực hiện:
10 ngày (Tối đa 20 ngày nếu đi part time)
#### Số lượng thành viên trong team:
1 ~ 3 người
#### Chủ đề tham khảo:

https://docs.google.com/spreadsheets/d/1TjPuQu7fe6CxDWmlttp0LTjQs8nw7Equ/edit#gid=940143881

#### Mô hình áp dụng:
Scrum
#### Coding convention
##### Ruby coding convention
[English version](https://github.com/framgia/coding-standards/blob/master/eng/ruby/standard.md)
[Vietnamese version](https://github.com/framgia/coding-standards/blob/master/vn/ruby/standard.md)
##### Rails coding convention
[English version](https://github.com/framgia/coding-standards/blob/master/vn/rails/standard.md)
[Vietnamese version](https://github.com/framgia/coding-standards/blob/master/eng/rails/standard.md)

#### Các kỹ thuật áp dụng trong rails project 1
1. [Nested Attribute (fields_for, reject_if, allow_destroy, ...)](http://api.rubyonrails.org/classes/ActiveRecord/NestedAttributes/ClassMethods.html)
2. [Batch Update](https://apidock.com/rails/ActiveRecord/Relation/update_all)
3. [form_for](http://api.rubyonrails.org/v5.1/classes/ActionView/Helpers/FormHelper.html)
4. [Call back function](http://api.rubyonrails.org/classes/ActiveRecord/Callbacks.html)
5. Macro (generate, rake, spring, ...)
6. Ajax (Rails ajax, jQuery ajax)
7. [Seed](https://codedecoder.wordpress.com/2013/04/25/rake-db-seed-in-rails/)
8. [RESTful](http://www.infoq.com/articles/rest-introduction)
9. [Association (has_many/has_one/belongs_to)](http://guides.rubyonrails.org/association_basics.html)
10. [Transaction](http://api.rubyonrails.org/classes/ActiveRecord/Transactions/ClassMethods.html)
11. [Resources, Nested Resources](http://guides.rubyonrails.org/routing.html)
12. [Resource](http://guides.rubyonrails.org/routing.html)
13. [Export CSV, Excel](http://railscasts.com/episodes/362-exporting-csv-and-excel)
14. [Rake task](https://viblo.asia/p/rake-task-rails-DzVkpLQLknW)
15. [CSRF Protection](http://guides.rubyonrails.org/security.html)
16. [Coffee](https://www.sitepoint.com/using-coffeescript-in-rails/)
17. [Concerns](http://api.rubyonrails.org/v5.1/classes/ActiveSupport/Concern.html)
18. [Scope](http://api.rubyonrails.org/classes/ActiveRecord/Scoping/Named/ClassMethods.html)
19. [I18n(mutilple language, dictionary, time format, number format, ...)](http://guides.rubyonrails.org/i18n.html)
20. Search form, filter form
21. [Gem Config](https://github.com/railsconfig/config)
22. [Eager Loading Associations](http://guides.rubyonrails.org/active_record_querying.html#eager-loading-associations)
23. [Validation](http://guides.rubyonrails.org/active_record_validations.html)
24. [Environment Variable](http://railsapps.github.io/rails-environment-variables.html)
25. [MVC](https://www.sitepoint.com/model-view-controller-mvc-architecture-rails/)
26. [Module mixin](https://www.tutorialspoint.com/ruby/ruby_modules.htm)
27. Proc / Lambda
28. Debug Javascript code
29. [Jquery selector](https://api.jquery.com/category/selectors/)
30. [CSS selector](https://www.w3schools.com/cssref/css_selectors.asp)
31. [Ruby Nil Object](https://ruby-doc.org/core-2.4.0/NilClass.html)

Các bạn focus vào các kĩ thuật Must và Should trong đây, vào buổi demo project trainer sẽ hỏi các bạn về các kĩ thuật này

https://docs.google.com/spreadsheets/u/1/d/1Wy41t95MLgk0aYb2-e_HQ818AZkReG7FxChFow3YePk/edit#gid=0


## 2. Các bước thực hiện
Thực hiện công việc theo từng bước như sau:
1. Thiết kế Database, Requirements
2. Add tasks on redmine + estimate time
3. Init project + setup CI tương tự rails tutorial<br>
   Thêm gem sau vào Gemfile nếu chưa có:
    ```ruby
    group :development, :test do
      gem "rspec-rails", "~> 4.0.1"
    end
    ```
    sau đó chạy 
    ```
    bundle install
    rails generate rspec:install
    ```
4. Tạo 1 pull Setup Sun*CI theo hướng dẫn tại [đây](https://github.com/framgia/Training-Guideline/blob/master/Rails/setup_ci.md)
5. Init models, add relationship
6. Design static pages
7. Other pulls

#### CHÚ Ý:
- Các pull từ mục 6. trở đi mỗi pull không quá 15 file changes.
- Các bạn trong team review chéo cho nhau + approve pull sau khi review xong mà không có lỗi nào.
- Sau khi đã review chéo ok thì mới gửi pull cho trainer review.

## 3. Add tasks on redmine + estimate time
- Thực hiện đăng ký tài khoản redmine trên site [tại đây](https://edu-redmine.sun-asterisk.vn/) rồi gửi thông tin cho trainer
#### Chú ý:
- Tham khảo cách đặt tên account [tại đây](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Mỗi ticket task estimate làm không quá 8 giờ, trường hợp task lớn thì chia nhỏ nhiều ticket để thực hiện.
- Chuyển đổi trạng thái ticket theo hướng dẫn [tại đây](https://github.com/framgia/Training-Guideline/blob/master/WorkingProcess/redmine/redmine.md)

#### Quy trình chuyển đổi trạng thái của ticket như sau:
1. Tất cả công việc cần làm phải được tạo thành ticket redmine rồi mới bắt tay vào làm
2. Tickets redmine phải điền đầy đủ Category, Target Version, Parent task, Start date, Due date, Estimated time
3. Dev nhận ticket, chuyển status "In Progress"
4. Dev làm xong, gửi pull request, update vào ticket redmine link của pull request, chuyển %DONE thành 90%
5. Pull request gửi cho cả team cùng review
6. Pull request phải có member trong team review OK thì mới được gửi cho trainer review.
7. Pull request được merged, dev update %DONE của ticket redmine thành 100%, status thành Resolved

## 4. Về pull request gửi review
- Attchment link ticket redmine vào pull
- Attchment hình ảnh chụp kết quả đã pass test rubocop
- Attchment hình ảnh chụp layout các chức năng làm của pull đó
- Gửi và theo dõi pull trên hệ thống [PRTS](https://prts.sun-asterisk.vn/) đã làm ở tutorial
- Đối với pull init model cần attachment hình ảnh thiết kế DB

## 5. Review project
- Chỉ được review project khi team hoàn thành >= 85% chức năng yêu cầu của dự án
- Yêu cầu deploy dự án trên heroku
- Sử dụng link heroku để trình bày project
- Các dữ liệu đăng nhập cần fake sẵn sàng để trình bày
- Chức năng thành viên nào làm thành viên đó trình bày
- Trường hợp team hoàn thành dưới 85% yêu cầu thì cần liên hệ với Trainer trước deadline 2 ngày để xin dời lịch và xin thêm thời gian

#### Happy coding!!!
