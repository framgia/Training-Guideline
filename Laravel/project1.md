# Hướng dẫn một số thông tin về Project 1

## 1. Một số thông tin chung
#### Thời gian thực hiện:
10 ngày (Tối đa 20 ngày nếu đi part time)
#### Số lượng thành viên trong team:
1 ~ 3 người
#### Mô hình áp dụng:
Scrum

#### Các kỹ thuật áp dụng trong laravel project 1
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

## 2. Các bước thực hiện
Thực hiện công việc theo từng bước như sau:
1. Confirm requirement
2. Design database (Có thể sử dụng các công cụ online như: https://cacoo.com/ hoặc https://creately.com/) => Gửi trainer review
3. Add tasks on redmine + estimate time (Hướng dẫn ở mục 3) => Gửi trainer review
4. Nhận repository từ trainer => Init project
5. Đẩy pull, làm project 1

#### CHÚ Ý:
- Pull 1: Init project + thêm [file pull_request_template](https://github.com/framgia/Training-Guideline/blob/master/Laravel/PULL_REQUEST_TEMPLATE.md) + [Setup CI](https://github.com/framgia/Training-Guideline/blob/master/Laravel/setup_ci.md)
- Mỗi pull 1 commit, không quá 15 file changes (trừ pull init, auth, view)
- Các bạn trong team review chéo cho nhau + approve pull sau khi review xong mà không có lỗi nào
- Sau khi đã review chéo => gửi pull cho trainer review (ready pull)

## 3. Add tasks on redmine + estimate time
- Thực hiện đăng ký tài khoản redmine trên site [tại đây](https://edu-redmine.sun-asterisk.vn/)
#### Chú ý:
- Tham khảo cách đặt tên account [tại đây](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Mỗi ticket task estimate làm không quá 8 giờ, trường hợp task lớn thì chia nhỏ nhiều ticket để thực hiện
#### Quy trình chuyển đổi trạng thái của ticket như sau:
1. Tất cả công việc cần làm phải được tạo thành ticket redmine rồi mới bắt tay vào làm.
2. Tickets redmine phải điền đầy đủ Category, Target Version, Parent task, Due date, Estimated time.
3. Dev nhận ticket, chuyển status "In Progress", update Start date
4. Dev làm xong, gửi pull request, update vào ticket redmine link của pull request, chuyển %DONE thành 90%, status = "Reviewing".
5. Pull request gửi cho cả team cùng review.
6. Pull request phải có member trong team review OK thì mới được gửi cho trainer review.
7. Pull request được merged, dev update %DONE của ticket redmine thành 100%, status thành Resolved.

## 4. Về pull request gửi review
- Format title pull request: 
```
[Tracker#TicketID] Title ticket/Pull request
Ví dụ: [Task#12345] Handle logic login
```
- Attchment link ticket redmine vào pull
- Attchment hình ảnh chụp kết quả đã pass phpunit
- Attchment hình ảnh chụp layout các chức năng làm của pull đó
- Gửi và theo dõi pull trên hệ thống [PRTS](https://prts.sun-asterisk.vn/) đã làm ở tutorial
- Đối với pull init model/migration cần attachment hình ảnh thiết kế DB

## 5. Review project
- Chỉ được review project khi team hoàn thành >= 85% chức năng yêu cầu của dự án
- Deploy dự án trên heroku (Optional)
- Các dữ liệu đăng nhập cần fake sẵn sàng để trình bày
- Trainer có thể chọn ngẫu nhiên người trình bày, người đó phải trình bày toàn bộ các chức năng trong project
- Trường hợp team hoàn thành dưới 85% yêu cầu thì cần liên hệ với Trainer trước deadline 2 ngày để xin dời lịch và xin thêm thời gian

#### Happy coding!!!
