# Laravel Tutorial Guidline

## 1. Goal
- Get acquainted and use framework Laravel.
- Apply Sun* GIT flow.

## 2. Training Time
8 days (Maximum: 10 days)

Including: 5 days of self-study -> 1st review -> 3 days of doing Quicktask -> 2nd review

## 3. Basic knowledge:
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

## 4. Document Link:
* Document: https://laravel.com/docs
* Book: https://learninglaravel.net/books/laravel
* Ebook: https://goo.gl/hft96o

## 5. Laravel Quicktask Guidline:
- Proceed to do Laravel Quick task according to the following file instructions: **(Skip STEP 3)** https://docs.google.com/document/d/18s2S7JGEvhCUbITNnK5J0veaC5C2Oc1SzKr66Hi0a3o/edit
- Create pull request and follow https://laravel.com/docs/5.2/quickstart, combine with some extra requirement from your trainers (while coding you may write it in the way of how you understand the flow of Laravel).
- Please read the company's convention file to make the code more correct: https://github.com/framgia/coding-standards/blob/master/vn/README.md#php
- If using sublime text, you can configure the following code to help control the company's convention, by:
Preference -> Setting User -> clear all and paste this code bellow:
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
## 6. Set up a pull request tracking (PRTS) system to the project's github repo
You access this url: http://prts.sun-asterisk.vn login via Github, then follow the instructions in section "User Guide"(https://docs.google.com/document/d/10Cs0LPEYzvvySM1fFZmlZAP9bcdu9TDFDT0F4EBaZYU/edit)

- Update their respective training languages (e.g. Ruby, PHP, ...)
- Select the chatwork box to receive pull review notifications according to the trainer's instructions when adding you to the box.
For example, the Da Nang office is the box: "[edu][DN] Pull Request's Status Checking"
