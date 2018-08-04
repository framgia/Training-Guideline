# Hướng dẫn học Rails Tutorial

## 1. Thời gian học:
8 ngày (Tối đa 10 ngày nếu trễ tiến độ)

## 2. Link tài liệu:
Các bạn đọc và làm theo cuốn Rails 5 - Tutorial theo link: https://www.railstutorial.org/book

## 3. Về việc gửi pull request
Từ chapter 3 -> chapter 14. Sau mỗi chapter, các bạn thực hiện tạo pull request để gửi trainer review.

#### Yêu cầu:
- 1 pull request tương ứng 1 chapter
- Cách đặt tên:
 + Tên repo github là: sample_app
 + Tên branch tương ứng với tên chapter. Ví dụ: chapter_3, chapter_4
 + Tiêu đề pull request (nội dung commit): Tiêu đề của chapter đó.
	Ví dụ: "Chapter 3: Mostly static pages", "Chapter 6: Modeling users"

## 4. Thiết lập [Rubocop](https://github.com/rubocop-hq/rubocop) vào Project
#### Bước 1: Các bạn cài đặt gem rubocop vào Gemfile:
```gem "rubocop", "~> 0.54.0", require: false```
#### Bước 2: Copy 3 file sau trong tệp nén này [rubocop.ngon.tar.gz (8.49 KB)] gồm:
```
.rubocop.yml
.rubocop_disabled.yml
.rubocop_enabled.yml
```
Dán vào thư mục project, ngang hàng với Gemfile
#### Bước 3: Trước mỗi lần commit gửi pull thì chạy lệnh này: ```rubocop```
#### Bước 4: Chụp lại hình đã pass hết rubocop cho vào phần comment của pull request rồi gửi link cho trainer.

## 5. Thiết lập hệ thống pull request tracking (PRTS) vào repo github của project
Các bạn truy cập url này: http://prts.framgia.vn , chọn mục "User Guide" ở góc trên bên phải rồi làm theo hướng dẫn.

#### LƯU Ý:
- Đăng nhập thông qua tài khoản trang education: https://education.framgia.vn
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
- Tuyệt đối không chờ đợi merged pull request chapter trước rồi mới làm chapter tiếp theo. Thay vào đó, các bạn checkout branch mới từ branch trước ra và làm tiếp, sau này sẽ rebase và fix conflict sau nếu có.
- Pull request sau khi gửi trainer, các bạn chờ đợi trong thời gian tối đa là 3 tiếng, nếu sau 3 tiếng vẫn chưa có người review, các bạn hãy gửi message nhắc nhở trainer.
- Nên để 1 commit/pull trong quá trình học tutorial.
- Đối với pull request đầu tiên thì Chatbot sẽ không có thông báo, từ lần sau thì sẽ có thông báo khi sử dụng hệ thống PRTS.
- Chú ý đọc hiểu hướng dẫn trước khi sử dụng PRTS, tránh tình trạng sai xót.
- Trong quá trình làm nếu gặp vấn đề không giải quyết được thì hãy chủ động hỏi nhờ các bạn khác hoặc Trainer để được support.

## 8. Coding convention
Các bạn self review code của cá nhân theo coding convention của công ty theo link sau:
https://github.com/framgia/coding-standards/blob/master/vn/README.md

### Happy coding!!!
