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

[Ruby on Rails Tutorial] Tạm thời sử dụng các link bên dưới
- Chaper1: https://www.evernote.com/shard/s570/sh/5a77c563-d93f-48de-8ed0-c96d7a1c4e70/7d8f14660d3573a1ed3d851d092f9316
- Chaper2: https://www.evernote.com/shard/s570/sh/3aa5e8b2-c637-4ab9-bf32-3860b3da9b74/8f514503b5264b535a58be7b4ce96aab
- Chaper3: https://www.evernote.com/shard/s570/sh/cb8c73d6-ed93-4af3-9564-8ad73430ac9b/c0458357e22e3dfb5496dbc5816a2050
- Chaper4: https://www.evernote.com/shard/s570/sh/bb7fc6c6-bbc6-4f8b-b9f8-8f71c27f62ec/956f4934d6dd5a975c462dc8f602d4b8
- Chaper5: https://www.evernote.com/shard/s570/sh/f95ef4a1-f5cd-4f11-aab3-9af7a22bc834/4e0a43be206d9bb21bfb2cfe3b717ed8
- Chaper6: https://www.evernote.com/shard/s570/sh/08d6d7c4-e643-497e-b28c-bc755f885373/37e9d2c6fbf656da2161bba3ffc46bbd
- Chaper7: https://www.evernote.com/shard/s570/sh/5413057a-1383-4494-aee0-9c658fa18fe9/087939a3a4df0be9c284004aaa2f5feb
- Chaper8: https://www.evernote.com/shard/s570/sh/ba814de4-e079-4bd5-b8a7-4d24d349e3aa/44b17f727cad1a2bfc148e21abdc5fd9
- Chaper9: https://www.evernote.com/shard/s570/sh/5c8fb4ce-bc4a-418b-837c-4aa1a80e443a/26a48203878ef703f22ad7e9789558a2
- Chaper10: https://www.evernote.com/shard/s570/sh/8ce3bdf8-f05c-4d88-a97c-1ab32b7b54f9/7dda4226cd5a1c0c0250e21817faee41
- Chaper11: https://www.evernote.com/shard/s570/sh/fe6b0633-1ed2-414b-8426-a4b0efa92cd2/d3a46ed14f627530f7386c367acb7a81
- Chaper12: https://www.evernote.com/shard/s570/sh/79d7a2e9-57fd-416d-8cb9-ec289925fb30/88824d26d1ee215d815a0f6e4a4db583
- Chaper13: https://www.evernote.com/shard/s570/sh/4bd07645-34d9-4277-a21f-7fbeb6a1c8f1/b90110b972f426a5124d09f5e68b81fb
- Chaper14: https://www.evernote.com/shard/s570/sh/92c16224-951f-4119-b333-6aa4d45d8204/f77a6584176e162c8332756d4cca8ee9

Các bạn tham khảo thêm để biết được những điều cần tập trung nghiên cứu trong từng chương - https://drive.google.com/drive/folders/1rbNhaszUQ8Dx5rWPwU1Ieks7Lz4S_dfp?usp=sharing

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
##### > Với Ruby 2.5.x trở về trước
```ruby
group :development, :test do
  gem "rubocop", "~> 0.54.0", require: false
end
```

##### > Với Ruby 2.6.x trở đi
```ruby
group :development, :test do
  gem "rubocop", "~> 0.74.0", require: false
  gem "rubocop-rails", "~> 2.3.2", require: false
end
```

#### Bước 2: Tải tệp nén tương ứng với phiên bản rubocop cài đặt ở bước 1: 
##### > Với Ruby 2.5.x trở về trước
Tải file [Rubocop v0.54.0 config file](https://github.com/framgia/Training-Guideline/blob/master/Rails/rubocop_config-0.54.0.tar.gz)

##### > Với Ruby 2.6.x trở đi
Tải file [Rubocop v0.74.0 config file](https://github.com/framgia/Training-Guideline/blob/master/Rails/rubocop_config-0.74.0.tar.gz)

Sau đó copy 3 file sau trong tệp nén vừa tải về gồm:
```
.rubocop.yml
.rubocop_disabled.yml
.rubocop_enabled.yml
```

Dán vào thư mục project, ngang hàng với Gemfile
#### Bước 3: Trước mỗi lần commit gửi pull thì chạy lệnh này:
```bash
bundle exec rubocop
```

#### Bước 4: Chụp lại hình đã pass hết rubocop cho vào phần comment của pull request rồi gửi link cho trainer.

## 6. Thiết lập hệ thống pull request tracking (PRTS) vào repo github của project
Các bạn truy cập url này: http://prts.sun-asterisk.vn đăng nhập qua Github, rồi làm theo hướng dẫn ở mục  "User Guide"(https://docs.google.com/document/d/10Cs0LPEYzvvySM1fFZmlZAP9bcdu9TDFDT0F4EBaZYU/edit)

- Cập nhật ngôn ngữ training tương ứng của mình (ví dụ: Ruby, PHP, ...)
- Chọn box chatwork để nhận các thông báo review pull theo hướng dẫn của trainer khi add các bạn vào box. 
Ví dụ văn phòng Đà Nẵng là box: "[edu][DN] Pull Request's Status Checking"

## 7. Thiết lập Sublime Text
Các bạn sử dụng setting này dành cho sublime để xử lý indent, trailing space và end of file, bằng cách:
Preference -> Setting User -> xóa hết cái cũ và paste đoạn code sau vào:
```yaml
{
  "ensure_newline_at_eof_on_save": true,
  "font_size": 14,
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
  "trim_trailing_white_space_on_save": true,
  "binary_file_patterns":
  [
    ".bundle/",
    "bin/",
    "log/",
    "tmp/",
    "test/",
    "vendor/assets/fonts/"
  ],
  "draw_minimap_border": true,
  "update_check": false,
  "word_wrap": true
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
