# Bước 1: Enable CI 
truy cập tại [đây](https://ci.sun-asterisk.com/account/github/repositories?scm=github&namespace=awesome-academy) <br>
click enable CI cho project tương ứng
# Bước 2: Tạo file .sun-ci.yml & database-ci.yml
check image ruby hiện có tại [đây](https://hub.docker.com/r/sunci/ruby/builds) sau đó thay thế image tương ứng<br>
> manhbnt/ruby:2.7.1 nếu ruby ver 2.7.1 
## .sun-ci.yml:

```ruby
workspace: true

stages:
- build
- test

jobs:
- name: build:prepare
  stage: build
  image: sunci/ruby:2.7.0
  script:
  - cp database-ci.yml config/database.yml
  - bundle _2.1.2_ install --path vendor/bundle
  cache:
  - key: vendor_$CI_BRANCH
    paths:
    - vendor/bundle

- name: test:rspec
  stage: test
  image: sunci/ruby:2.7.0
  services:
  - image: mysql:5.7.22
    name: mysql_test
    environment:
      MYSQL_DATABASE: db_test
      MYSQL_USER: user_test
      MYSQL_PASSWORD: password_test
      MYSQL_ROOT_PASSWORD: password_test
  before_script:
  - bundle _2.1.2_ install --path vendor/bundle
  script:
  - bundle _2.1.2_ exec rspec

- name: test:rubocop
  stage: test
  image: sunci/ruby:2.7.0
  before_script:
  - bundle _2.1.2_ install --path vendor/bundle
  script:
  - bundle exec rubocop --require rubocop/formatter/checkstyle_formatter --format RuboCop::Formatter::CheckstyleFormatter --no-color --out .framgia-ci-reports/rubocop.xml app/ lib/
```

## database-ci.yml
```ruby
default: &default
  adapter: mysql2
  encoding: utf8mb4
  collation: utf8mb4_unicode_ci
  host: mysql_test
  port: 3306
  pool: 5

test:
  <<: *default
  database: db_test
  username: user_test
  password: password_test
```
