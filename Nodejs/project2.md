# Hướng dẫn một số thông tin về Project 2

## 1. Một số thông tin chung
Thời gian thực hiện: 10 ngày
Số lượng thành viên: 1-3 thành viên

## 2. Các bước thực hiện
- Thực hiện công việc theo các yêu cầu đã cam kết từ giai đoạn xây dựng Project requirement
- Áp dụng unit test trong project đảm bảo **mức độ coverage là >60% cho toàn bộ services**, tham khảo tài liệu [tại đây](https://www.albertgao.xyz/2017/05/24/how-to-test-expressjs-with-jest-and-supertest/)
- Tài liệu khác: https://jestjs.io/docs/testing-frameworks

## 3. Add tasks on redmine + estimate time
- Mỗi ticket task estimate làm không quá 8 giờ, trường hợp task lớn thì chia nhỏ nhiều ticket để thực hiện
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
- Attchment link ticket redmine vào pull request
- Attchment hình ảnh chụp layout các chức năng làm của pull request đó
- Đối với các pull request viết unit test cần attchment hình ảnh chụp kết quả run test
- Gửi và theo dõi pull trên hệ thống [PRTS](https://prts.sun-asterisk.vn/) đã làm ở Project 1

## 5. Review project
- Chỉ được review project khi team hoàn thành >= 80% chức năng yêu cầu của dự án
- Chuẩn bị sẵn sàng dữ liệu để trình bày
- Lần lượt từng thành viên sẽ trình bày chức năng mà mình thực hiện
- Nếu team hoàn thành dưới 80% yêu cầu chức năng so với cam kết ban đầu thì cần liên hệ với Trainer **trước deadline 2** ngày để xin dời lịch và hoàn thiện tiếp các chức năng còn lại

#### Happy coding!!!
