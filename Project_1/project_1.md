# Hướng dẫn học Rails Tutorial

## 1. Mục tiêu
Dự án tại Sun*Education là sẽ là bước đầu tiên các bạn được làm quen với cách làm việc trong một dự án mô phỏng cách làm việc của một dự án thực tế. Mục tiêu:
- Nắm được các bước, qui trình của một dự án thực tế.
- Áp dụng và thành thục các technical trong rails advance 1.
- Áp dụng Agile Management thông qua dự án.
## 2. Thời gian học:
10 ngày (Tối đa 15 ngày nếu trễ tiến độ)
## 3. Về việc gửi pull request
### Yêu cầu:
- Mỗi 1 pull request không quá 15 file và 1 commit trừ  pull init project và init model.
- Các thành viên REVIEW chéo cho nhau trước khi ready pull.

### Thiết lập [Rubocop](https://github.com/rubocop-hq/rubocop) vào Project
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

### Thiết lập hệ thống pull request tracking (PRTS) vào repo github của project
Các bạn truy cập url này: http://prts.sun-asterisk.vn , chọn mục "User Guide" ở góc trên bên phải rồi làm theo hướng dẫn.

#### LƯU Ý:
- Đăng nhập thông qua tài khoản trang education: https://education.sun-asterisk.vn
- Chatwork room ID là 57274663 (Đối với văn phòng Đà Nẵng)

## 4. Thiết lập Sublime Text
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

## 5. Coding convention
Các bạn self review code của cá nhân theo coding convention của công ty theo link sau:
https://github.com/framgia/coding-standards/blob/master/vn/README.md
## 6. Sử dụng tool redmine quản lý task
- Link: https://edu-redmine.sun-asterisk.vn
- Tạo account và báo với trainer để được active account.
- Thêm task vào redmine sau khi phân task xong.
- Tên account phải giống tên Chatwork
### Happy coding!!!
