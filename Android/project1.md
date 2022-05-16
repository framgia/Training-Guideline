# Hướng dẫn một số thông tin về Android Project 1

## 1. Một số thông tin chung
#### Thời gian thực hiện:
10 ngày (Tối đa 20 ngày nếu đi part time)
#### Số lượng thành viên trong team:
1 ~ 2 người
#### Chủ đề tham khảo:
// TODO udpate link later

#### Coding convention
https://sal.vn/8yo1Eq

#### Các kỹ thuật áp dụng trong project 1
1. Android Architecture
2. Layout Container
3. Activity Lifecycle
4. Fragment Lifecycle
5. Intent
6. Drawable, Style, Theme
7. RecyclerView
8. Menu, pickers, user navigation
9. AsyncTask
10. Internet connection
11. Broadcast receiver
12. Service
13. MVP partern (bắt buộc)

## 2. Các bước thực hiện
Thực hiện công việc theo từng bước như sau:
1. Lên ý tưởng, requirements và gửi trainer review theo template
    https://sal.vn/YZHBxP
2. Nếu được trainer duyệt thì design prototype trên:
   https://www.figma.com
   sau đó gửi trainer review, được duyệt thì chuyển sang bước 3
3. Breaks tasks như temaplate trên, nhớ sắp xếp theo độ ưu tiên, mỗi task nhỏ hơn 4h
   https://sal.vn/XscfSi
   Và gửi trainer review, được duyệt thì thông báo để trainer cấp redmine (để import tasks vào thay vì dùng file sheet)
   Breaks tasks trên redmine xong thì gửi trainer review, nếu được duyệt trainer sẽ cung cấp repo github cho các bạn
   
   HDSD redmine: https://sal.vn/JeaPe6
4. Sau khi nhận repo github thì tiến hành tạo pull init project gồm:
  - Template pull request
  - Cài đặt CI
  - File .gitignore
  ở [đây](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project)
5. Sau khi được approve merged pull init thì tạo các pull request tiếp theo và gửi lên để trainer review

#### CHÚ Ý:
- Các pull thứ 2 trở đi mỗi pull không quá 20 file changes và 500 dòng code
- Các bạn trong team review chéo cho nhau + approve pull sau khi review xong mà không có lỗi nào.
- Sau khi đã review chéo ok thì mới gửi pull cho trainer review.

## 3. Add tasks on redmine + estimate time
- Thực hiện đăng ký tài khoản redmine trên site [tại đây](https://edu-redmine.sun-asterisk.vn/) rồi gửi thông tin cho trainer
#### Chú ý:
- Tham khảo cách đặt tên account [tại đây](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Mỗi ticket task estimate làm không quá 4 giờ, trường hợp task lớn thì chia nhỏ nhiều ticket để thực hiện.
- Chuyển đổi trạng thái ticket theo hướng dẫn [tại đây](https://github.com/framgia/Training-Guideline/blob/master/WorkingProcess/redmine/redmine.md)

#### Quy trình chuyển đổi trạng thái của ticket như sau:
1. Tất cả công việc cần làm phải được tạo thành ticket redmine rồi mới bắt tay vào làm
2. Tickets redmine phải điền đầy đủ Category, Target Version, Parent task, Start date, Due date, Estimated time
3. Dev nhận ticket, chuyển status "In Progress"
4. Dev làm xong, gửi pull request, update vào ticket redmine link của pull request, chuyển %DONE thành 90%
5. Pull request gửi cho cả team cùng review
6. Pull request phải có member trong team review OK thì mới được gửi cho trainer review.
7. Pull request được merged, dev update %DONE của ticket redmine thành 100%, status thành Resolved

## 4. Review project
- Chỉ được review project khi team hoàn thành >= 85% chức năng yêu cầu của dự án
- Luôn cố gắng chủ động nhận feedback từ trainer và người khác một cách sớm và liên tục
- Trường hợp team hoàn thành dưới 85% yêu cầu thì cần liên hệ với Trainer trước deadline 2 ngày để xin dời lịch và xin thêm thời gian

#### Happy coding!!!
