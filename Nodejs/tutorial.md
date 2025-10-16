# Hướng dẫn thực hành NestJS tutorial
(Official resource: https://nestjs.com)

## [A] Một số kiến thức trọng tâm
- Kiến trúc Modular
- @Module()  decorator
- Xây dựng routes và controllers, API endpoints với decorators @Get(), @Post(), @Patch(), @Delete()
- Kết nối với database với TypeORM (sử dụng PostgreSQL hoặc MySQL)
- Authencation với JWT
- Exception handling và middlewares (Pipes, Filters, Exception handling)
- ...

## [B] Áp dụng vào xây dựng tutorial
### 1. Thời lượng: ~ 10 ngày

### 2. Spec
Clone trang tin tức Medium với những tính năng sau: https://realworld-docs.netlify.app/implementation-creation/features/
- Authenticate users via JWT (login/signup pages + logout button on settings page)
- CRU- users (sign up & settings page - no deleting required)
- CRUD Articles
- CR-D Comments on articles (no updating required)
- GET and display paginated lists of articles
- Favorite articles
- Follow other users

**Note:**
- Spec có 7 gạch đầu dòng tất cả. Khuyến khích các bạn làm hết 5 ý đầu tiên. 2 ý cuối cùng sẽ tùy vào tiến độ riêng của từng bạn để cân nhắc làm cho phù hợp:
- Khóa học này chúng ta sẽ tập trung vào việc làm Backend API, không làm giao diện frontend

### 3. Design - wireframe
Dùng để hỗ trợ việc đọc hiểu và thảo luận spec khi cần thiết.
M.n tham khảo file bên dưới
https://www.figma.com/design/bQ02ebnAIsjwg1kTimNSPS/Medium-clone--Copy-?node-id=26-58&t=sHwGzyNSrIOFfx9q-1

### 4. API docs khuyến nghị
https://realworld-docs.netlify.app/specifications/backend/endpoints/
Ở giai đoạn làm tutorial này, các bạn có thể cài đặt theo docs khuyến nghị để làm quen, đồng thời sẽ tiện cho quá trình review của trainer khi cần và các bạn khác tham khảo chéo.

### 5. Cách thức thực hành - Cá nhân
**5.1 Làm việc với Git**
- Sử dụng repository trên github cá nhân.
- Mỗi API sẽ implement bởi 1 hoặc nhiều pull request, tùy các bạn quyết định dựa vào độ phức tạp của chức năng (không implement nhiều API trên 1 pull request)
- Chia nhỏ pull (khoảng vài trăm dòng code thay đổi trở xuống) cho tiện control code changes và review pull.

Cách thức triển khai:
- Đầu tiên các bạn tạo 1 repository trống.
- Sau đó tạo pull init code base.
- Pull init model (connect database, add entities, relationships)
- Rồi mới tới các pull chức năng khác.

**5.2 Tool PRTS** - Quản lý trạng thái pull request

Hệ thống: https://prts.sun-asterisk.vn/

Lưu ý:
- Cài đặt theo hướng dẫn ở mục **User guide**
- Báo lại Trainer để được thêm vào channel review pull (channel này để nhận thông báo thay đổi trạng thái pull trên Slack)

**5.3 Review và merge code**
- Tiến hành self-review theo **Coding standard và Coding convention** ở mục 6
- Gửi pull request cho các thành viên nhóm (đã được pick nhóm từ đầu giai đoạn training) review chéo
- Được merge pull khi nhận được APPROVED từ ít nhất 1 thành viên

### 6. Coding Standard & coding Convention
6.1 **Sunlint - Tiêu chuẩn Source Code của Sun*** (bắt buộc)
   - Cài đặt sunlint CLI ở local theo hướng dẫn tại [link](https://coding-standards.sun-asterisk.vn/docs/installation)
   - Chạy tool check code ở local, đọc hiểu và chỉnh sửa theo gợi ý, bắt buộc **fix 100% các rules là error** (các rule là warning thì khuyến khích được sửa)
   - Chụp ảnh kết quả và đính kèm evidence tại phần comment trên pull request

**6.2 Google Typescript Style guide**
    Tham khảo: https://google.github.io/styleguide/tsguide.html
    
Happy training! 
