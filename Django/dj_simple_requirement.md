# Yêu cầu xây dựng ứng dụng SIMPLE LOCAL LIBRARY

## 1. Mục tiêu
Phát  triển và "làm đẹp" web site LOCAL LIBRARY từ module Django tutorial.
Sau giai đoạn này, học viên có thể:
- Biết cách áp dụng 1 template đơn giản và "làm đẹp" cho hệ thống
- Xây dựng hoàn chỉnh các tính năng của một hệ thống quản lý thư viện
- Thực hành thêm cách xây dựng ứng dụng với Django framework

## 2. Thời gian thực hiện
7 ngày

## 3. Nội dung yêu cầu
Hệ thống được phân chia thành 2 đối tượng người dùng:
#### Quyền Người dùng thông thường
- Có thể xem danh sách Sách và tìm kiếm thông tin của sách (theo Tên sách, Thể loại, Tác giả, ...)
- Có thể xem danh sách Tác giả và tìm kiếm thông tin của tác giả (theo Tên, Năm sinh, ...)
- Có thể xem thông tin chi tiết 1 cuốn sách
- Có thể tạo yêu cầu mượn sách (yêu cầu đăng nhập trước khi mượn sách). Thông tin yêu cầu bao gồm: Người mượn, Ngày mượn sách, Ngày trả (dự kiến)
- Có thể xem lại lịch sử mượn sách và trạng thái của đơn mượn
- Có thể hủy yêu cầu mược sách khi đơn mượn chưa được Admin xác nhận 

#### Quyền Quản lý - Admin
- Có thể quản lý thông tin Sách (bao gồm: Thêm, Sửa, Xóa)
- Có thể quản lý thông tin Tác giả (bao gồm: Thêm, Sửa, Xóa)
- Có thể quản lý thông tin Yêu cầu mượn sách (bao gồm: Tìm kiếm, Lọc thông tin theo trạng thái (ngày mượn/ngày trả) đơn mượn, Từ chối đơn mượn)

## 4. Yêu cầu
- Phát triển tiếp tính năng trên project Django tutorial (KHÔNG tạo github repository mới)
- Áp dụng template cho toàn bộ các trang
- Tinh chỉnh database (nếu có), logic của các chức năng theo mục 3.
- Làm việc với Redmine (tham khảo mục 5.)
- Quy trình làm việc với pull request tương tự module Django tutorial


## 5. Quản lý tasks trên Redmine
- Thực hiện đăng ký tài khoản redmine trên site [tại đây](https://edu-redmine.sun-asterisk.vn/)
#### Chú ý:
- Tham khảo cách đặt tên account [tại đây](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Mỗi ticket task estimate làm không quá 8 giờ, trường hợp task lớn thì chia nhỏ nhiều ticket để thực hiện
- Chuyển đổi trạng thái ticket theo hướng dẫn [tại đây](https://github.com/framgia/Training-Guideline/blob/master/WorkingProcess/redmine/redmine.md)

### Quy trình chuyển đổi trạng thái của ticket như sau:
1. Tất cả công việc cần làm phải được tạo thành ticket redmine rồi mới bắt tay vào làm
2. Tickets redmine phải điền đầy đủ Category, Target Version, Parent task, Start date, Due date, Estimated time
3. Dev nhận ticket, chuyển status "In Progress"
4. Dev làm xong, gửi pull request, update vào ticket redmine link của pull request, chuyển %DONE thành 90%
5. Pull request gửi cho cả team cùng review
6. Pull request phải có member trong team review OK thì mới được gửi cho trainer review.
7. Pull request được merged, dev update %DONE của ticket redmine thành 100%, status thành Resolved

## 6. Về pull request gửi review
- Attchment link ticket redmine vào pull request
- Attchment hình ảnh chụp layout các chức năng làm của pull request đó
- Gửi và theo dõi pull trên hệ thống [PRTS](https://prts.sun-asterisk.vn/) đã làm ở tutorial
