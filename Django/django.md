# Hướng dẫn học Django Tutorials

## 1. Mục tiêu
Django là một web framework khá nổi tiếng được viết hoàn toàn bằng ngôn ngữ Python. Nó không phải là một micro-framework như Flask, mà là một framework với đầy đủ các thư viện, module hỗ trợ các web-developer.
Vào cuối khóa học này, sinh viên sẽ có thể:
  - Biết cách cài đặt và cấu hình Python, Django và những package liên quan
  - Hiểu về vòng đời một request trong Django
  - Ứng dụng kiến ​​trúc Model-View-Template cho các ứng dụng phía máy chủ
  - Tìm hiểu các nguyên tắc cơ bản của Python, Django
  - Tự mình hoàn thiện được một ứng dụng web sử dụng Python và Django
## 2. Thời gian học:
9 ngày (Bao gồm các buổi review kiến thức tổng hợp, cá nhân tự ôn tập và làm bài test)

- 3 ngày đọc và làm theo [link này](https://docs.djangoproject.com/en/3.0/intro/). Không cần gửi pull request, daily report gửi repository github hằng ngày cho trainer review tiến độ
- 6 ngày đọc và làm theo [link này](https://developer.mozilla.org/en-US/docs/Learn/Server-side/Django). Yêu cầu từ part 2 trở đi phải gửi pull request sau mỗi part

## 3. Link tài liệu:
  Các bạn tham khảo thêm slide tổng hợp kiến thức [tại đây](https://drive.google.com/drive/folders/1xKe1-cZYNq2Yft3WftMxJzbZXL2y20VH?usp=sharing)

## 4. Thiết lập gửi pull request
- Mỗi 1 pull request tương ứng 1 part, 1 pull request là 1 commit
- Cách đặt tên:
  + Tên repo github là: **mysite**
  + Tên branch tương ứng với tên part. Ví dụ: **part2**, **part3**
  + Tiêu đề pull request (nội dung commit): Tiêu đề của part đó.
    Ví dụ: "Django Tutorial Part 2: Creating a skeleton website", "Django Tutorial Part 3: Using models"

Các bạn sử dụng hệ thống Pull Request Tracking System (PRTS) để gửi và theo dõi review pull request. Thực hiện theo các bước dưới đây:
- Các bạn đăng nhập vào trang https://prts.sun-asterisk.vn/ bằng tài khoản Github của mình.
- Cài đặt theo hướng dẫn ở mục "User Guide": https://docs.google.com/document/d/1B3n86p8S2_slltZdNGgzMtu8OnTH6ua6VNrN6w_0-6I/edit?usp=sharing
- Báo trainer add vào box chatwork review pull request

## 5. Thiết lập Sublime Text
Các bạn sử dụng setting này dành cho sublime để xử lý indent, trailing space và end of file, bằng cách:
Preference -> Setting User -> xóa hết cái cũ và paste đoạn code sau vào:
```
{
	"ensure_newline_at_eof_on_save": true,
	"font_size": 11,
	"highlight_line": true,
	"ignored_packages":
	[
		"Vintage"
	],
	"rulers":
	[
		80
	],
	"show_encoding": true,
	"show_line_endings": true,
	"tab_size": 2,
	"translate_tabs_to_spaces": true,
	"trim_trailing_white_space_on_save": true
}
```
## 6. Một số lưu ý trong quá trình làm tutorial:
- Tuyệt đối không chờ đợi merged pull request part trước rồi mới làm part tiếp theo. Thay vào đó, các bạn checkout branch mới từ branch trước ra và làm tiếp, sau này sẽ rebase và fix conflict sau nếu có.
- Pull request sau khi gửi trainer, các bạn chờ đợi trong thời gian tối đa là 3 tiếng, nếu sau 3 tiếng vẫn chưa có người review, các bạn hãy gửi message nhắc nhở trainer.
- Nên để 1 commit/pull trong quá trình học tutorial.
- Đối với pull request đầu tiên thì Chatbot sẽ không có thông báo, từ lần sau thì sẽ có thông báo khi sử dụng hệ thống PRTS.
- Chú ý đọc hiểu hướng dẫn trước khi sử dụng PRTS, tránh tình trạng sai xót.
- Trong quá trình làm nếu gặp vấn đề không giải quyết sau khi tự tìm hiểu, hãy chủ động hỏi nhờ các bạn khác hoặc Trainer để được support.

## 7. Link bài test:
Kết thúc quá trình tutorial, sinh viên phải thực hiện bài test online để ôn tập kiến thức
  - Link: http://training.sun-asterisk.vn
  - Account: Các bạn tự tạo bằng mail đăng ký với HR hoặc mail công ty nếu có

Lưu ý: Đặt tên giống với chatwork
```
Ví dụ:
  Họ và tên: Nguyễn Văn A
  Khóa: Python 03
  Vị trí: Open Education
  Văn Phòng: Đà Nẵng
  Tên tài khoản: [DN_OE03_Python]Nguyen Van A
```
### Happy coding!!!
