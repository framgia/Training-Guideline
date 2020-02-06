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
8 ngày (Tối đa 10 ngày nếu trễ tiến độ)

## 3. Link tài liệu:
Các bạn đọc và làm theo link: https://docs.djangoproject.com/en/3.0/intro/
Các bạn tham khảo thêm để biết được những điều cần tập trung nghiên cứu trong từng chương - https://drive.google.com/drive/folders/1ZtaDkarfg1Qo9Q1e_AvxB9jMWiCj-Mh5?usp=sharing

## 4. Về việc gửi pull request
Sau mỗi part, các bạn thực hiện tạo pull request để gửi trainer review.

#### Yêu cầu:
- Mỗi 1 pull request tương ứng 1 chapter
- Cách đặt tên:
  + Tên repo github là: **mysite**
  + Tên branch tương ứng với tên part. Ví dụ: **part_1**, **part_2**
  + Tiêu đề pull request (nội dung commit): Tiêu đề của part đó.
    Ví dụ: " Part 1: Requests and responses", " Part 2: Models and the admin site"

## 5. Thiết lập hệ thống pull request tracking (PRTS) vào repo github của project
Các bạn truy cập url này: http://prts.sun-asterisk.vn , chọn mục "User Guide" ở góc trên bên phải rồi làm theo hướng dẫn.

#### LƯU Ý:
- Đăng nhập thông qua tài khoản trang education: https://education.sun-asterisk.vn
- Chatwork room ID là 57274663 (Đối với văn phòng Đà Nẵng)

## 6. Thiết lập Sublime Text
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
## 7. Một số lưu ý trong quá trình làm tutorial:
- Tuyệt đối không chờ đợi merged pull request part trước rồi mới làm part tiếp theo. Thay vào đó, các bạn checkout branch mới từ branch trước ra và làm tiếp, sau này sẽ rebase và fix conflict sau nếu có.
- Pull request sau khi gửi trainer, các bạn chờ đợi trong thời gian tối đa là 3 tiếng, nếu sau 3 tiếng vẫn chưa có người review, các bạn hãy gửi message nhắc nhở trainer.
- Nên để 1 commit/pull trong quá trình học tutorial.
- Đối với pull request đầu tiên thì Chatbot sẽ không có thông báo, từ lần sau thì sẽ có thông báo khi sử dụng hệ thống PRTS.
- Chú ý đọc hiểu hướng dẫn trước khi sử dụng PRTS, tránh tình trạng sai xót.
- Trong quá trình làm nếu gặp vấn đề không giải quyết được thì hãy chủ động hỏi nhờ các bạn khác hoặc Trainer để được support.

## 10. Link bài test:
Host: http://training.sun-asterisk.vn

Account: Các bạn tự tạo bằng mail đăng ký với HR

Lưu ý: Đặt tên giống với chatwork
```
Ví dụ:
  Họ và tên: Nguyễn Văn A
  Khóa: Ruby 03
  Vị trí: Open Education
  Văn Phòng: Đà Nẵng
  Tên tài khoản: [DN_OE03_Ruby]Nguyen Van A
```

### Happy coding!!!
