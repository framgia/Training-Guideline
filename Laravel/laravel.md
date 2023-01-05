# Hướng dẫn học Laravel Tutorial

## 1. Mục tiêu
- Làm quen và sử dụng framework Laravel.
- Áp dụng Sun* GIT flow.
## 2. Thời gian học và quy trình:
8 ngày (Tối đa 10 ngày nếu trễ tiến độ)

**Quy trình:**
- Tìm hiểu kiến thức và thực hành Quicktask theo hướng dẫn ở mục 5.
- Demo và review sau khi kết thúc module Laravel.

## 3. Các kiến thức cơ bản cần nắm được:
1. Init project, Directory Structure
2. Migration
3. Seeder, factory, faker
4. Model : 
	- Mass assignment
	- Relationship 
	- Accessors, mutators
	- Eager loading
	- Scope
5. Route:
	- Route + Resource controller
	- Middleware
	- REST & RESTful
6. Controller:
	- Validation
	- Form request
	- Authentication
	- Eloquent orm + query builder
	- CSRF Protection
7. Advance: 
	- Transaction laravel, Helpers, Localization(i18n), repository, cache
	- Authorization: Gate và policy
	- Blade Template
	- Bower, laravel mix
	- Service provider, service container
## 4. Link tài liệu:
* Document: https://laravel.com/docs
* Book: https://learninglaravel.net/books/laravel
* Ebook: https://goo.gl/hft96o

## 5. Hướng dẫn thực hiện Laravel Quicktask
- Tiến hành làm Laravel Quick task theo [hướng dẫn](https://docs.google.com/document/d/1kHcZpufGJZrFWWmg_qAuTb3gahDzX14nnO-Cy43HsqQ/edit)
- Thiết lập hệ thống pull request tracking (PRTS) như mục 6.
- Tạo pull và làm theo [hướng dẫn](https://docs.google.com/spreadsheets/d/1luk5S5GsirCrur2tDMwvkgBh-RoJ1z2lr0nwFjI5jAM/edit?usp=drive_web&ouid=110804383788796312369), kết hợp với yêu cầu khác của trainer (trong khi code có thể trình bày code theo cách mình hiểu về flow của Laravel).
Tham khảo: https://laravel.com/docs/5.2/quickstart
- Đọc trước file [convention của công ty](https://github.com/framgia/coding-standards/blob/master/vn/README.md#php) để code đúng chuẩn hơn.
- Nếu  dùng sublime text có thể config theo đoạn code sau giúp việc kiểm soát convention của công ty, bằng cách:
Preference -> Setting User -> xóa hết cái cũ và paste đoạn code sau vào:
```
{
	"bootstrapped": true,
	"ensure_newline_at_eof_on_save": true,
	"in_process_packages":
	[
	],
	"installed_packages":
	[
		"Icon Fonts",
		"Package Control",
		"Phpcs",
		"SideBarEnhancements",
		"SublimeLinter-phpcs",
		"Theme - Eightlime",
		"Vue Syntax Highlight",
		"VueFormatter",
		"Vuejs Snippets"
	],
	"phpcs_additional_args":
	{
		"--standard": "Framgia",
		"-n": ""
	},
	"phpcs_executable_path": "/home/framgia/.composer/vendor/bin",
	"tab_size": 4,
	"translate_tabs_to_spaces": true,
	"trim_trailing_white_space_on_save": true
}
```
## 6. Thiết lập hệ thống pull request tracking (PRTS) vào repo github của project
Các bạn truy cập url này: http://prts.sun-asterisk.vn đăng nhập qua Github, rồi làm theo hướng dẫn ở mục [User Guide](https://docs.google.com/document/d/1-4rqYPmGpDBkjvecVkjICYfdLFjw4pvxVTNYf3ebnMo/edit)

- Cập nhật ngôn ngữ training tương ứng của mình (ví dụ: Ruby, PHP, ...)
- Chọn box chatwork để nhận các thông báo review pull theo hướng dẫn của trainer khi add các bạn vào box. 
văn phòng Đà Nẵng là box: "[edu][DN] Pull Request's Status Checking"
văn phòng Hà Nội là box: "[edu][HN] PHP checking pull request"
