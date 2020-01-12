# Hướng dẫn quy trình làm việc trên hệ thống Redmine cho Developer

## I. Mục tiêu
- Nắm được flow chuyển trạng thái ticket trong dự án
- Nắm được cách thức tạo và cập nhật nội dung ticket theo từng loại trong dự án
- Sử dụng và cập nhật tiến độ công việc trên hệ thống redmine

## II. Hướng dẫn đăng ký tài khoản Redmine
- Truy cập link hệ thống: https://edu-redmine.sun-asterisk.vn/account/register
- Đăng ký account theo hướng dẫn [tại đây](https://github.com/framgia/Training-Guideline/blob/master/Rails/RegisterEduRedmine.png)
- Sau khi đăng ký thành công thì báo lại với Trainer/Manager để được kích hoạt account

### III. Hướng dẫn luồng chuyển đổi trạng thái của ticket (Status Flow)
- NEW : QA/Dev/BrSE/Leader tạo ticket. Có thể assignee hoặc không
- IN PROGRESS : Dev bắt tay vào làm
- REVIEWING : Dev đã đẩy pull request (PR) và đang chờ leader review (% Done = 90%). Gắn link github vào trường "Pull request links"
- APPROVED : PR của dev đã được merged và đang đợi deploy. Assign ticket qua cho leader
- RESOLVED : Ticket đã được deploy và sẵn sàng chờ QA test
- TESTING : QA test ticket
- BUG Fixing : QA test có bug, tạo bug mới ở trạng thái NEW, còn ticket gốc để là "BUG FIXING" (Trường hợp status này chưa có trên repo redmine thì để là TESTING)
- REOPEN : Với task: QA test nhưng không PASS được 70% TestCase hoặc dính lỗi Critical. Với bug: QA xác định bug chưa fix. Thay đổi cả % Done.
- FEEDBACK : Dev không đồng ý với nhận định của QA, cần trao đổi. Và ngược lại
- CLOSED : Với task: QA kiểm tra và Pass được 70% Testcases và không dính lỗi Critical. Với bug: QA xác định đã hết bug, hay đã Pass ticket.

### IV. Quy trình làm việc với ticket có tracker là "TASK"
#### 1. Khi nhận task
Cần cập nhật đủ thông tin:
 + Assignee: Là người sẽ xử lý task này
 + Estimated time: Ước lượng số giờ (hour) cần để hoàn thành ticket
 + Due date: Ngày hạn chót để hoàn thành và bàn giao ticket QA để test. Cần confirm lại với TeamLeader và các bên liên quan nếu có thay đổi.
 + Start date: Ngày bắt đầu xử lý ticket
Mô tả cách thực hiện của task theo như format sau:
```
  *Purpose:* Mô tả chức năng của pull request
  *Requirement:* Cần phải thực hiện như thế nào. Ràng buộc liên quan
  *Solution:* Cách thực hiện trong pull Request này như thế nào. 
  Mô tả ngắn cách thực hiện để người khác nắm được không cần quá chi tiết.
  *Related link:* Ví dụ link design, spec, ...
```
Xem ví dụ [tại đây](https://github.com/framgia/Training-Guideline/blob/master/WorkingProcess/redmine/inprogress_task.png)

#### 2. Khi làm xong task
- Cập nhật Spent time : Thời gian thực tế đã dùng để hoàn thành ticket
- Cập nhật % Done về 90%
- Update link pull request và note "Reviewing PR"
- Note *Scope:* phạm vi ảnh hưởng vào trong ticket.
- Có thể update lại phần các thông tin khác của ticket ví dụ như về "*Solution* "
- Cập nhật title của pull request:
```
  Refs [Tracker] [Ticket id] [ticket content]
  ví dụ: Refs [TASK][11000] Staff create a new form off
```
- Gửi reivew pull request
- Xem ví dụ [tại đây](https://github.com/framgia/Training-Guideline/blob/master/WorkingProcess/redmine/done_task.png)

#### 3. Pull request đã được review and merge
- Chuyển status thành Resolved
- Assign ticket lại Teamleader

#### 4. Trường hợp task có bug
- QA test có bug sẽ log bug và gắn link refer đến task đó và follow cho đến khi nào tất cả các bug liên quan đến task đã được fix
Lưu ý: Task chỉ được close khi tất cả các bug liên quan đều đã fix và v

#### 5. Follow task
Theo dõi đến khi task được Team Leader chuyến status về Closed

### III. Quy trình làm việc với ticket có tracker là "BUG"
#### 1. Khi nhận bug
- Khi bắt đầu fix bug, chuyển status từ New --> In progress
- Cập nhật đủ thông tin:
 + Assignee: Là người sẽ xử lý task này
 + Estimated time: Ước lượng số giờ (hour) cần để hoàn thành ticket
 + Due date: Ngày hạn chót để hoàn thành và bàn giao ticket QA để test. Cần confirm lại với TeamLeader và các bên liên quan nếu có thay đổi.
 + Start date: Ngày bắt đầu xử lý ticket
- Mô tả cách thực hiện của bug theo như format sau:
```
  *Reason:* : Vì sao phát sinh bug
  *Solution:* : Cách thực hiện trong Pull Request này như thế nào. 
  Mô tả ngắn cách thực hiện để người khác nắm được không cần quá chi tiết.
```
- Ví dụ:
```
*Reason:*  Thiếu điều kiện query danh sách học viên theo course_id
*Solution:* Query danh sách học viên theo course_id
*Related link:*
+ Link spec ABC.XYZ
+ Link pull request: https://...
```

#### 2. Khi fix xong Bug
- Cập nhật spent time
- Cập nhật % Done về 90%
- Update link pull request và note "Reviewing PR"
- Note *Scope:* phạm vi ảnh hưởng vào trong ticket.
- Ví dụ:
```
*Scope:* List học viên của site admin và site user. 
Vì fix lại scope query list học viên đã sử dụng tại 2 màn hình này
```
- Cập nhật title của Pull Request:
```
  Refs [Tracker] [Ticket id] [ticket content]
  ví dụ: Refs [BUG][19000] Fix bug crack app when user create form off
```
- Gửi reivew

#### 3. Pull request đã được review and merge
- Chuyển status thành Resolved
- Assign ticket lại Teamleader

#### 4. Sau khi deploy môi trường Test (Staging)
- Teamleader assign ticket lại cho QA để re-test

#### 5. Trường hợp ticket vẫn còn bug
- Sau khi QA test nếu vẫn xảy ra Bug sẽ chuyển status ticket là "Re-open" và assign lại cho dev đã fix bug đó
- Developer flow các ticket task có status "Re-open" và assign cho mình để fix
- Thực hiện nhận ticket để fix, khi nhận ticket chuyển status sang "In-progress" và thao tác như hướng dẫn ở trên kia.

#### 6. Follow Bug
Theo dõi đến khi Bug được QA chuyến status về Closed
