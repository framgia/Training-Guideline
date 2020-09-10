# Trainer Enable Sun*CI for project

# Tạo file .sun-ci.yml tại thư mục dự án ngang hàng với .env.example
## .sun-ci.yml:

```ruby
workspace: true

stages:
  - build
  - test

jobs:
- name: build
  stage: build
  image: sunasteriskrnd/php-workspace:7.4
  services:
    - image: mysql:5.7
      name: mysql_test
      environment:
         MYSQL_DATABASE: mysql
         MYSQL_USER: user_test
         MYSQL_PASSWORD: password_test
         MYSQL_ROOT_PASSWORD: root
  environment:
    APP_ENV: testing
  cache:
  - key: comopser_vendor_$CI_BRANCH
    paths:
      - vendor
  before_script:
  - cp .env.example .env.testing
  - composer install
  - php artisan key:generate
  - php artisan migrate
  - php artisan config:cache
  - php artisan config:clear
  - php artisan cache:clear
  script:
  - composer install
  after_script:
  - echo "Finish job"

- name: test:node
  stage: test
  image: node:12-alpine
  script:
  - yarn

- name: test:phpunit
  stage: test
  image: sunasteriskrnd/php-workspace:7.4
  before_script:
  - composer install
  script:
  - php vendor/bin/phpunit

```

## Sửa file .env.example lại như sau:
```ruby
DB_CONNECTION=mysql
DB_HOST=mysql_test
DB_PORT=3306
DB_DATABASE=mysql
DB_USERNAME=user_test
DB_PASSWORD=password_test

```
