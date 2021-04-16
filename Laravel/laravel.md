# Hướng dẫn học Laravel Tutorial

## 1. Mục tiêu
- Làm quen và sử dụng framework Laravel.
- Áp dụng Sun* GIT flow.
## 2. Thời gian học:
8 ngày (Tối đa 10 ngày nếu trễ tiến độ)

Trong đó, 5 ngày tự học --> review lần 1 --> 3 ngày làm Quicktask --> review lần 2
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
	- Auth
	- Eloquent orm + query builder
	- CRFS Protection
7. Advance: 
	- Transaction laravel, Helpers, Localization(i18n), repository, cache
	- Blade Template
	- Bower, laravel mix
	- Service provider, service container
## 4. Link tài liệu:
* Document: https://laravel.com/docs
* Book: https://learninglaravel.net/books/laravel
* Ebook: https://goo.gl/hft96o

## 5. Hướng dẫn thực hiện Laravel Quicktask
- Tiến hành làm Laravel Quick task theo hướng dẫn file sau: **(BỎ QUA BƯỚC 3)** https://docs.google.com/document/d/18s2S7JGEvhCUbITNnK5J0veaC5C2Oc1SzKr66Hi0a3o/edit
- Tạo pull và làm theo https://laravel.com/docs/5.2/quickstart, kết hợp với yêu cầu khác của trainer (trong khi code có thể trình bày code theo cách mình hiểu về flow của Laravel).
- Đọc trước file convention của công ty để code đúng chuẩn hơn: https://github.com/framgia/coding-standards/blob/master/vn/README.md#php
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
Các bạn truy cập url này: http://prts.sun-asterisk.vn đăng nhập qua Github, rồi làm theo hướng dẫn ở mục  "User Guide"(https://docs.google.com/document/d/10Cs0LPEYzvvySM1fFZmlZAP9bcdu9TDFDT0F4EBaZYU/edit)

- Cập nhật ngôn ngữ training tương ứng của mình (ví dụ: Ruby, PHP, ...)
- Chọn box chatwork để nhận các thông báo review pull theo hướng dẫn của trainer khi add các bạn vào box. 
Ví dụ văn phòng Đà Nẵng là box: "[edu][DN] Pull Request's Status Checking"
