# Hướng dẫn một số thông tin về Project 2

## Thời gian thực hiện:
10 ngày (Tối đa 20 ngày nếu đi part time) <br>

Phát triển dựa trên Project 1 với các kỹ thuật sau:

**Note:** Các gem* là những gem nên tìm hiểu và áp dụng vào project 2


#### [Rails Advance 2]
##### 1. Gem Devise*
https://github.com/plataformatec/devise
##### 2. Gem CanCanCan*
https://github.com/CanCanCommunity/cancancan
##### 3. Gem Ransack*
https://github.com/activerecord-hackery/ransack

Khi áp dụng gem ransack khuyến khích áp dụng hết các tính năng và kĩ thuật này 

| STT | Tính năng |
| -------- | -------- |
| 1     | Tìm kiếm trên 1 trường có thể tìm kiếm dc theo title, description, name, note...(nhớ sử dụng  ransack_alias)     |
| 2     |  Tìm kiếm lớn hơn cái gì đó, nhỏ hơn cái gì đó (giá tiền, ngày tạo ...)     |
| 3     |  Tìm kiếm 1 trường trong bảng quan hệ . Ví dụ ở màn search Employee có 1 trường search tên của department (Mỗi employee thuộc về 1 department)     | 
| 4     | Dùng ransackable_attributes cho phép có thể search những trường nào. VD: là admin có thể search all các trường, nhưng là user bình thường chỉ có thể search 1 số, cho dù có submit params lên cũng k trả về kết quả theo điều kiện search nếu như k dc phép search     | 
| 5     | Dùng ransacker để search theo ngày tạo  (https://github.com/activerecord-hackery/ransack/wiki/using-ransackers)     | 
| 6     | Ứng dụng dùng ransackable_scopes để tìm kiếm (tìm kiếm theo tên scope, hoặc k dc tìm kiếm 1 số scope (dù có submit params tên scope thì cũng k dc trả về kết quả))     | 
| 7     | Có 1 query group sử dụng OR thay vì mặc định AND     | 
##### 4. Background job: sidekiq, resque, delayed job*
https://github.com/mperham/sidekiq<br>
https://github.com/resque/resque<br>
https://github.com/codez/delayed_cron_job
##### 5. Cronjob: whenever
https://github.com/javan/whenever
##### 6. Unit Test (Rspec)*
http://rspec.info/
https://github.com/rspec/rspec
##### 7. Metaprogramming (send, eval, class_eval, ...)
https://blog.codeship.com/metaprogramming-in-ruby/<br>
https://www.toptal.com/ruby/ruby-metaprogramming-cooler-than-it-sounds
##### 8. Authenticate via Facebook, Twitter, Google
https://developers.facebook.com/docs/php/howto/example_facebook_login/)
##### 9. Social button share
https://github.com/huacnlee/social-share-button
##### 10. Gem paranoia
https://github.com/rubysherpas/paranoia
##### 11. Gem public_activity
https://github.com/chaps-io/public_activity
##### 12. Gem kaminari
https://github.com/amatsuda/kaminari
##### 13. Pretty URL/Friendly_id
https://github.com/norman/friendly_id
##### 14. Chart
https://chartkick.com/
https://github.com/airblade/chartjs-ror
##### 15. Google map
https://github.com/apneadiving/Google-Maps-for-Rails<br>
https://anadea.info/blog/how-to-integrate-google-maps-into-ruby-on-rails-app
##### 16. Polymorphic
https://launchschool.com/blog/understanding-polymorphic-associations-in-rails
##### 17. Facebook comment plugin
https://developers.facebook.com/docs/plugins/comments/
##### 18. Pagy (replace kaminari)
https://github.com/ddnexus/pagy
##### 19. Gem rails_admin
https://github.com/sferik/rails_admin
##### 20. Rake task
https://www.stuartellis.name/articles/rake/<br>
https://viblo.asia/p/rake-task-rails-DzVkpLQLknW
##### 21. Auto suggestion (jquery autocomplete)
https://github.com/bigtunacan/rails-jquery-autocomplete<br>
https://www.lugolabs.com/articles/jquery-ui-autocomplete-with-ruby-on-rails
##### 22. Dynamic form (gem cocoon)
https://github.com/nathanvda/cocoon

## Chú ý
- Các pull áp dụng gem Devise, Cancancan thì không cần viết Unit test
- Các pull còn lại phải áp dụng viết Unit test khi thay đổi code tại controller và model

## Tham khảo thêm
#### [Rails Advance 3]
##### 1. API
http://apionrails.icalialabs.com/book
##### 2. WebSocket
https://blog.heroku.com/real_time_rails_implementing_websockets_in_rails_5_with_action_cable
##### 3. Service Object
https://medium.freecodecamp.org/service-objects-explained-simply-for-ruby-on-rails-5-a8cc42a5441f<br>
https://www.toptal.com/ruby-on-rails/rails-service-objects-tutorial
##### 4. Caching (Redis)
https://opensource.com/article/18/4/ruby-rails-redis
##### 5. Fulltext search (Elastic search)
http://valve.github.io/blog/2014/02/22/rails-developer-guide-to-full-text-search-with-solr/<br>
https://code.tutsplus.com/articles/full-text-search-in-rails-using-elasticsearch--cms-22920
##### 6. Webservice
https://www.ibm.com/developerworks/library/os-ws-rubyrails/index.html
##### 7. Payment online
https://www.netguru.co/tips/how-to-integrate-rails-with-paypal
##### 8. Nodejs
https://nodejs.org/en/docs/
##### 9. AngularJS
https://github.com/hiravgandhi/angularjs-rails
##### 10. ReactJS
https://github.com/reactjs/react-rails<br>
https://medium.com/quick-code/simple-rails-crud-app-with-react-frontend-using-react-rails-gem-b708b89a9419
##### 11. S3
https://docs.aws.amazon.com/AmazonS3/latest/dev/Welcome.html
##### 12. Crawler
http://ruby.bastardsbook.com/chapters/web-crawling/<br>
https://rossta.net/blog/how-to-write-a-simple-web-crawler-in-ruby-revisited.html
##### 13. Facebook Graph API
https://developers.facebook.com/docs/graph-api/

#### [Rails Advance 4]
##### 1. Capistrano/puma
https://github.com/capistrano/rails<br>
https://github.com/puma/puma
##### 2. Slim/Haml
http://slim-lang.com/
https://github.com/slim-template/slim-rails
##### 3. Override lib (Exception, Method, ...)
http://rubylearning.com/satishtalim/ruby_overriding_methods.html<br>
https://solidfoundationwebdev.com/blog/posts/how-to-override-a-default-scope-in-rails<br>
https://karolgalanciak.com/blog/2017/11/26/traps-on-rails-overriding-boolean-methods-in-models/<br>
https://medium.com/@morgler/overriding-setter-method-after-attr-accessor-in-rails-14594abc653f
##### 4. Chatwork
https://github.com/asonas/chatwork-ruby
##### 5. Unicorn, puma, passenger
https://devcenter.heroku.com/articles/rails-unicorn<br>
https://www.digitalocean.com/community/tutorials/how-to-deploy-a-rails-app-with-unicorn-and-nginx-on-ubuntu-14-04<br>
https://www.phusionpassenger.com/library/walkthroughs/deploy/ruby/<br>
https://www.phusionpassenger.com/library/dev/ruby/rails_integration.html
##### 6. Nginx/Load Balancing
https://www.engineyard.com/blog/application-load-balancer-vs-classic-load-balancer<br>
https://www.digitalocean.com/community/tutorials/how-to-scale-ruby-on-rails-applications-across-multiple-droplets-part-1

#### Happy coding!!!
