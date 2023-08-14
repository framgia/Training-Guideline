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
- Sách Tutorial Rails 7: Các bạn tạo tài khoản rồi đăng nhập đọc online trên link [Rails Tutorial 7](https://www.oreilly.com/library/view/ruby-on-rails/9780138050061/?_gl=1*mgpyfg*_ga*OTcxNjQ4NDM1LjE2ODg2MjkzMzI.*_ga_092EL089CH*MTY4ODYyOTMzMS4xLjEuMTY4ODYyOTM3Ny4xNC4wLjA.)
Tham khảo thêm tài liệu nếu cần:
- Sách Rails 6 [Rails Tutorial](https://drive.google.com/drive/folders/1KpDipAHIF4Xpvro-e2_bVnhPyF4F3qdp)
- Tham khảo bản dịch Tutorial bằng tiếng Việt: [Bản dịch Tutorial Rails 6](https://docs.google.com/document/d/1cRZAH6hnrTVDEdceAKrG1eynz_EHoFoB/edit?rtpof=true)


 **Để đẩy nhanh tiến độ hoàn thành các chương, các bạn chủ động tham khảo hướng dẫn cụ thể và các task cần làm bổ sung sau mỗi chương tại [Link](https://docs.google.com/spreadsheets/d/1ME3lk9-kYoQwC-3Exrq9ZkA8F6o0ZJxgGH8PKru7Bug/edit#gid=0)**
- Video và slide có ở trên S-Learn: https://tpiv.wsm.vn/

## 4. Về việc gửi pull request
### 4.1 Cài đặt code base
- B1: Vào repo mẫu trên github để kéo code base về:
https://github.com/awesome-academy/rails_tutorial/tree/main
Dùng câu lệnh `git clone git@github.com:awesome-academy/rails_tutorial.git`
- B2: Đọc kĩ README: Cài đặt phiên bản dự án và config tương ứng https://github.com/awesome-academy/rails_tutorial/tree/main
- B3: Trainee tự tạo 1 repo mới riêng của mình tên sample_app để chế độ public trên https://github.com/
- B4: Tại terminal, truy cập vào repo mẫu rails đã clone về máy `cd rails_tutorial`
  Sau đó đổi remote url thành url của repo đã tạo ở B3
  ```
    git remote set-url origin đườngdẫn
  ```
  VD:
  ```
  git remote set-url origin git@github.com:ngocvt-0484/sample_app.git
  ```
- B4: Đẩy code base lên Repo của mình
  ```
    git push origin main
  ```
### 4.2 Hướng dẫn trainee code các chapter tiếp theo

- Tạo branch mới và checkout sang branch mới: git checkout -b chapter_3_4_5
Sau đó code chapter, code xong thì chạy dòng lệnh sau để kiểm tra convention code (Đọc thêm về Rubocop: https://viblo.asia/p/su-dung-gem-rubocop-trong-rails-4P856NxA5Y3)

```
bundle exec rubocop
```

- Fix các lỗi rubocop để đảm bảo không còn lỗi convention, sau đó đẩy code lên git để review code

```
git add .
git commit -m "Chapter 3,4,5"
git add .
git push origin chapter_3_4_5
```
tương tự như các chapter tiếp theo

#### Yêu cầu:
- Mỗi 1 pull request tương ứng 1 chapter(Riêng chapter 3, 4,5 có thể gộp vào thành 1 pull request)
- Cách đặt tên:
  + Tên branch tương ứng với tên chapter. Ví dụ: **chapter_6**, **chapter_7**
  + Tiêu đề pull request (nội dung commit): Tiêu đề của chapter đó.
    Ví dụ: "Chapter 3: Mostly static pages", "Chapter 6: Modeling users"

Các bạn sử dụng hệ thống reviewboard để anh chị review code trước khi được merged vào master. Các bạn cài đặt hệ thống theo các bước dưới đây:

- Các bạn đăng nhập vào trang https://prts.sun-asterisk.vn/ bằng tài khoản Github của mình.
- Cài đặt theo hướng dẫn: [https://docs.google.com/document/d/10Cs0LPEYzvvySM1fFZmlZAP9bcdu9TDFDT0F4EBaZYU/edit](https://docs.google.com/document/d/1-4rqYPmGpDBkjvecVkjICYfdLFjw4pvxVTNYf3ebnMo/edit)
- Báo trainer add vào box slack review pull request

Từ bây giờ mỗi khi gửi pull request, các bạn sẽ làm theo các bước sau:
- Khi tạo pull xong thì comment đầu tiên vào pull là pull này thực hiện chức năng gì
- Sau đó comment thứ 2 với nội dung là "ready" (tức là OK rồi ae chi review đê)
- Sử dụng hệ thống ReviewBoard để quản lý các pull của mình, mọi người có thể thấy các trạng thái của pull trên đó nhé
- Nếu có commented thì bạn sửa, sau khi sửa xong lại comment vào pull: "ready"

#### Chụp lại hình đã pass Rubocop cho vào phần comment của pull request rồi gửi link cho trainer.

## 5. Thiết lập Sublime Text
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

VS code
```yaml
{
    "explorer.confirmDelete": false,
    "editor.tabSize": 2,
    "explorer.confirmDragAndDrop": false,
    "files.trimTrailingWhitespace": true,
    "files.insertFinalNewline": true,
    "files.trimFinalNewlines": true,
    "workbench.startupEditor": "newUntitledFile",
    "window.zoomLevel": 0,
    "workbench.colorTheme": "Atom One Dark",
    "javascript.format.enable": false,
    "javascript.format.insertSpaceAfterCommaDelimiter": false,
    "javascript.format.insertSpaceAfterConstructor": false,
    "[ruby]": {
        "editor.formatOnSave": false
    },
    "workbench.iconTheme": "vscode-great-icons"
}
```
## 6. Một số lưu ý trong quá trình làm tutorial:
- Tuyệt đối không chờ đợi merged pull request chapter trước rồi mới làm chapter tiếp theo. Thay vào đó, các bạn checkout branch mới từ branch trước ra và làm tiếp, sau này sẽ rebase và fix conflict sau nếu có.
- Pull request sau khi gửi trainer, các bạn chờ đợi trong thời gian tối đa là 3 tiếng, nếu sau 3 tiếng vẫn chưa có người review, các bạn hãy gửi message nhắc nhở trainer.
- Nên để 1 commit/pull trong quá trình học tutorial.
- Đối với pull request đầu tiên thì Chatbot sẽ không có thông báo, từ lần sau thì sẽ có thông báo khi sử dụng hệ thống PRTS.
- Chú ý đọc hiểu hướng dẫn trước khi sử dụng PRTS, tránh tình trạng sai xót.
- Trong quá trình làm nếu gặp vấn đề không giải quyết được thì hãy chủ động hỏi nhờ các bạn khác hoặc Trainer để được support.

## 7. Coding convention
Các bạn self review code của cá nhân theo coding convention của công ty theo link sau:
https://github.com/framgia/coding-standards/blob/master/vn/README.md

### Happy coding!!!
