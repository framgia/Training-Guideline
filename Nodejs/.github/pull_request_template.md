## Checklist tự review pull trước khi ready để trainer review
- [ ] Kiểm tra mỗi pull request chỉ 1 commit, nếu nhiều hơn 1 commit thì hãy gộp commit thành 1 rồi đẩy lại lên git
- [ ] Chạy eslint ở local để check và fix các lỗi liên quan đến syntax, coding convention. Khi gửi thì chụp ảnh PASS eslint đính kèm trong pull
- [ ] Sử dụng thụt lề 2 spaces/4 spaces đồng nhất ở tất cả các files (setting lại vscode /sublime text nếu chưa cài đặt)
- [ ] Cuối mỗi file kiểm tra có end line (khi đẩy lên git xem file change không bị lỗi tròn đỏ ở cuối file)
- [ ] Mỗi dòng nếu quá dài, cần xuống dòng (maximum: 80 kí tự mỗi dòng, setting trong IDE hoặc dùng Prettier để config format code)
- [ ] Tham khảo Typescript coding convention https://google.github.io/styleguide/tsguide.html

## Related Tickets
- ticket redmine

## WHAT (optional)
- Change number items `completed/total` in admin page.

## HOW
- I edit js file, inject not_vary_normal items in calculate function.

## WHY (optional)
- Because in previous version - number just depends on `normal` items. But in new version, we have `state` and `confirm_state` depends on both `normal` + `not_normal` items.

## Evidence (Screenshot or Video)


## Notes (Kiến thức tìm hiểu thêm)
