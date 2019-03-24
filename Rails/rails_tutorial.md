# Hướng dẫn học Rails Tutorial

## 1. Mục tiêu
Phần này sẽ hướng dẫn cho các bạn cách phát triển một ứng dụng web sử dụng framework RubyonRails. Rails Tutorial được xây dưng để cung cấp cho bạn sự giới thiệu đầy đủ về cách phát triển ứng dụng web, bao gồm nền tảng cơ sở trong Ruby, Rails, HTML & CSS, databases, version control, testing, and deploy ứng dụng. Nếu bạn đã biết phát triển web, khóa học này sẽ nhanh chóng dạy cho bạn các yếu tố cần thiết của framework RubyOnRails, bao gồm MVC và REST, generators, migrations, routing, and embedded Ruby.
Vào cuối khóa học này, sinh viên sẽ có thể:
  - Biết cách cài đặt và cấu hình Ruby, Rails và những package liên quan
  - Hiểu về vòng đời một request trong Rails
  - Ứng dụng kiến ​​trúc Model-View-Controller cho các ứng dụng phía máy chủ
  - Học lập trình các thành phần chính của Rails, bao gồm Active Record, Action Controller và Action View
  - Tìm hiểu các nguyên tắc cơ bản của Ruby
  - Xây dựng các ứng dụng hướng dữ liệu với Rails
  - Thực hiện TDD (test-driven development) cho các ứng dụng Rails.
  - Hoàn thành một ứng dụng blog với những chức năng cơ bản.
## 2. Thời gian học:
8 ngày (Tối đa 10 ngày nếu trễ tiến độ)

## 3. Link tài liệu:
Các bạn đọc và làm theo cuốn Rails 5 - Tutorial theo link: https://www.railstutorial.org/book
Các bạn tham khảo thêm để biết được những điều cần tập trung nghiên cứu trong từng chương - https://drive.google.com/drive/folders/1ZtaDkarfg1Qo9Q1e_AvxB9jMWiCj-Mh5?usp=sharing

## 4. Về việc gửi pull request
Từ chapter 3 -> chapter 14. Sau mỗi chapter, các bạn thực hiện tạo pull request để gửi trainer review.

#### Yêu cầu:
- Mỗi 1 pull request tương ứng 1 chapter
- Cách đặt tên:
  + Tên repo github là: **sample_app**
  + Tên branch tương ứng với tên chapter. Ví dụ: **chapter_3**, **chapter_4**
  + Tiêu đề pull request (nội dung commit): Tiêu đề của chapter đó.
    Ví dụ: "Chapter 3: Mostly static pages", "Chapter 6: Modeling users"

## 5. Thiết lập [Rubocop](https://github.com/rubocop-hq/rubocop) vào Project
#### Bước 1: Các bạn cài đặt gem rubocop vào Gemfile:
```
gem "rubocop", "~> 0.54.0", require: false
```

#### Bước 2: Copy 3 file sau trong tệp nén này [rubocop.ngon.tar.gz (8.49 KB)](https://github.com/framgia/Training-Guideline/blob/master/Rails/rubocop.ngon.tar.gz) gồm:
```
.rubocop.yml
.rubocop_disabled.yml
.rubocop_enabled.yml
```

Dán vào thư mục project, ngang hàng với Gemfile
#### Bước 3: Trước mỗi lần commit gửi pull thì chạy lệnh này:
```
bundle exec rubocop
```

#### Bước 4: Chụp lại hình đã pass hết rubocop cho vào phần comment của pull request rồi gửi link cho trainer.

## 6. Thiết lập hệ thống pull request tracking (PRTS) vào repo github của project
Các bạn truy cập url này: http://prts.sun-asterisk.vn , chọn mục "User Guide" ở góc trên bên phải rồi làm theo hướng dẫn.

#### LƯU Ý:
- Đăng nhập thông qua tài khoản trang education: https://education.sun-asterisk.vn
- Chatwork room ID là 57274663 (Đối với văn phòng Đà Nẵng)

## 7. Thiết lập Sublime Text
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
## 8. Một số lưu ý trong quá trình làm tutorial:
- Tuyệt đối không chờ đợi merged pull request chapter trước rồi mới làm chapter tiếp theo. Thay vào đó, các bạn checkout branch mới từ branch trước ra và làm tiếp, sau này sẽ rebase và fix conflict sau nếu có.
- Pull request sau khi gửi trainer, các bạn chờ đợi trong thời gian tối đa là 3 tiếng, nếu sau 3 tiếng vẫn chưa có người review, các bạn hãy gửi message nhắc nhở trainer.
- Nên để 1 commit/pull trong quá trình học tutorial.
- Đối với pull request đầu tiên thì Chatbot sẽ không có thông báo, từ lần sau thì sẽ có thông báo khi sử dụng hệ thống PRTS.
- Chú ý đọc hiểu hướng dẫn trước khi sử dụng PRTS, tránh tình trạng sai xót.
- Trong quá trình làm nếu gặp vấn đề không giải quyết được thì hãy chủ động hỏi nhờ các bạn khác hoặc Trainer để được support.

## 9. Coding convention
Các bạn self review code của cá nhân theo coding convention của công ty theo link sau:
https://github.com/framgia/coding-standards/blob/master/vn/README.md

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
