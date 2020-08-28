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
9 ngày (Tính theo ngày làm việc, trường hợp đi part-time tối đa 15 ngày liên tiếp tính từ ngày bắt đầu)

## 3. Link tài liệu:
Các bạn đọc và làm theo cuốn Rails 6 - Tutorial theo link: https://link.sun-asterisk.vn/aJ2pQ9

[Slide]
https://link.sun-asterisk.vn/TVb5lZ

## 4. Về việc gửi pull request
Pull đầu tiên sẽ là init_project :D .Các bạn lên github tạo 1 repo mới chọn Initialize this repository with a README, add .gitignore chọn Ruby => Tạo repo, Sau đó clone về máy. Sau đó
```
git checkout -b init_project
rails new .
git add .
git commit -m "Init Project"
git push origin init_project
```
Rồi kiểm tra trên git tạo 1 pull request mới, đọc hướng dẫn bên dưới để trainer có thể review pull.

Từ chapter 3 -> chapter 14. Sau mỗi chapter, các bạn thực hiện tạo pull request để gửi trainer review.

#### Yêu cầu:
- Mỗi 1 pull request tương ứng 1 chapter
- Cách đặt tên:
  + Tên repo github là: **sample_app**
  + Tên branch tương ứng với tên chapter. Ví dụ: **chapter_3**, **chapter_4**
  + Tiêu đề pull request (nội dung commit): Tiêu đề của chapter đó.
    Ví dụ: "Chapter 3: Mostly static pages", "Chapter 6: Modeling users"

Các bạn sử dụng hệ thống reviewboard để anh chị review code trước khi được merged vào master. Các bạn cài đặt hệ thống theo các bước dưới đây:

- Các bạn đăng nhập vào trang https://prts.sun-asterisk.vn/ bằng tài khoản Github của mình.
- Cài đặt theo hướng dẫn: https://docs.google.com/document/d/10Cs0LPEYzvvySM1fFZmlZAP9bcdu9TDFDT0F4EBaZYU/edit
- Báo trainer add vào box chatwork review pull request

Từ bây giờ mỗi khi gửi pull request, các bạn sẽ làm theo các bước sau:
- Khi tạo pull xong thì comment đầu tiên vào pull là pull này thực hiện chức năng gì
- Sau đó comment thứ 2 với nội dung là "ready" (tức là OK rồi ae chi review đê)
- Sử dụng hệ thống ReviewBoard để quản lý các pull của mình, mọi người có thể thấy các trạng thái của pull trên đó nhé
- Nếu có commented thì bạn sửa, sau khi sửa xong lại comment vào pull: "ready"

## 5. Thiết lập CI local vào Project
#### Bước 1: Các bạn cài đặt gem vào Gemfile:

```ruby
group :development, :test do
  gem "rubocop", "~> 0.74.0", require: false
  gem "rubocop-checkstyle_formatter", require: false
  gem "rubocop-rails", "~> 2.3.2", require: false
end
```
##### Cài đặt framgia-ci
Với Linux
```bash
sudo curl -o /usr/bin/framgia-ci https://raw.githubusercontent.com/framgia/ci-report-tool/master/dist/framgia-ci
sudo chmod +x /usr/bin/framgia-ci
sudo apt install python3-pip
sudo apt install libcurl4-openssl-dev libssl-dev
pip3 install framgia-ci
pip3 uninstall cleo clikit
pip3 install cleo==0.6.8
```
#### Bước 2: Tải tệp nén :
Tải file [setup_ci_local](https://github.com/framgia/Training-Guideline/blob/master/Rails/setup_ci_local.tar.gz)

Sau đó copy 6 file sau trong tệp nén vừa tải về gồm:
```
.rubocop.yml
.rubocop_disabled.yml
.rubocop_enabled.yml
.rspec
.framgia-ci.yml
```

Dán vào thư mục project, ngang hàng với Gemfile
#### Bước 3: Trước mỗi lần commit gửi pull thì chạy lệnh này:
```bash
framgia-ci run --local
```
##### cho những file này vào .gitignore
```
.framgia-ci-reports/
.framgia-ci-result.temp.yml
```
#### Bước 4: Chụp lại hình đã pass hết CI local cho vào phần comment của pull request rồi gửi link cho trainer.

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
