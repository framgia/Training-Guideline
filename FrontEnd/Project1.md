# Hướng dẫn một số thông tin về Project 1

## 1. Một số thông tin chung
#### Thời gian thực hiện:
10 ngày (Tối đa 20 ngày nếu đi part time)
#### Số lượng thành viên trong team:
1
#### Design:
Gửi email cho trainer nhờ trainer share
#### Technical:
Html, css, not JS

#### Cài đặt môi trường PUG, SCSS với Gulp
https://docs.google.com/document/d/10eZDhMGN5aR2a8e66vu3EMftM-GU9Ef7mzCuOHH4c_I/edit?usp=sharing
#### Cấu trúc thư mục tham khảo
https://drive.google.com/file/d/1kPT59tgzgK-X0DxlQ0xYVldf-dH6_5yD/view?usp=sharing

## 2. Add tasks on redmine + estimate time
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

## 3. Về pull request gửi review
- Attchment link ticket redmine vào pull
- Attchment hình ảnh chụp kết quả đã pass test rubocop
- Attchment hình ảnh chụp layout các chức năng làm của pull đó
- Gửi và theo dõi pull trên hệ thống [PRTS](https://prts.sun-asterisk.vn/)
- Đối với pull init model cần attachment hình ảnh thiết kế DB

## 4. Review project
- Chỉ được review project khi team hoàn thành >= 85% chức năng yêu cầu của dự án
- Yêu cầu deploy dự án trên heroku
- Sử dụng link heroku để trình bày project
- Các dữ liệu đăng nhập cần fake sẵn sàng để trình bày
- Chức năng thành viên nào làm thành viên đó trình bày
- Trường hợp team hoàn thành dưới 85% yêu cầu thì cần liên hệ với Trainer trước deadline 2 ngày để xin dời lịch và xin thêm thời gian

#### Happy coding!!!
