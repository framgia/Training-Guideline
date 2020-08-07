## 1. Mục tiêu
- Nắm được tầm quan trọng của Unit test
- Nắm được phương pháp và kỹ thuật phân tích khi viết Unit Test
- Có thể viết test rspec được ở Controller và Model
## 2. Thời gian thực hiện
3 ngày (Tối đa 5 ngày nếu đi part time)
## 3. Cách thức thực hiện
- Áp dụng kiến thức học và tìm hiểu được để viết rspec cho model và controller

1.  Controller: Chọn 1 controller có đầy đủ các action để viết test
2.  Model: Ngoài các rspec cho association, enum, .. chọn 5 method, scope để viết cho phần model 
- Từ thời điểm này đến hết Project 2 các pull request đều phải viết unit test nếu có sự thay đổi controller và model

## 4. Setup CI local for rspec
- mở file .framgia-ci.yml sau đó uncomment dòng
```
rspec:
    command: bundle exec rspec --format html --out .framgia-ci-reports/rspec.html spec/
```
sau đó chạy
```bash
framgia-ci run --local
```
Chụp lại hình đã pass hết CI local cho vào phần comment của pull request.

## 5. Link tài liệu
### 1. Homepage
http://rspec.info/<br>
[Github](https://github.com/rspec/rspec)

### 2. Document
[Slide]:

https://link.sun-asterisk.vn/9BzzO5

[Book]: 

https://drive.google.com/drive/u/1/folders/14eHAwSI4HKCKYQyVs2o7L9junTEHDkpC

[References]

https://relishapp.com/rspec
<br>
http://www.relishapp.com/rspec/rspec-expectations/v/3-2/docs/built-in-matchers/type-matchers
<br>


### 3. Test style guide
[Vietnamese version](https://github.com/framgia/coding-standards/blob/master/vn/rails/test.md)

[English version](https://github.com/framgia/coding-standards/blob/master/eng/rails/test.md)

### 4. Some Gems
https://github.com/thoughtbot/shoulda-matchers
