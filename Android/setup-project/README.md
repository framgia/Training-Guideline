# Setup project

## 1.Add .gitignore in root
1. Create file .gitignore in root
2. Copy content of [file](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.gitignore) into recent created file

## 2. Add pull request template
1. Create file .github/pull_request_template.md
2. Copy content of [file](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.github/pull_request_template.md) into recent created file.

## 3. Add ktlint check
Follow this link to get the source of library and the lastest version of ktlint: [Pinterest_ktlint](https://github.com/pinterest/ktlint)
### Simple setup
1. Add file ktlint.gradle in app folder
   Create a file with name ktlint.gradle in app folder with this content: [ktlint.gradle](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/ktlint.gradle)
   
2. Change version number

   Get newest version number of [Pinterest Ktlint](https://github.com/pinterest/ktlint)
   Change version number of ktlint in ktlint gradle file

   ``` 
   dependencies {
      ktlint "com.pinterest:ktlint:version_number"
   }  
   ```
   
   Make sure that you have mavenCentral()
   
   ``` 
   repositories {
      // Required to download KtLint
      mavenCentral()
   }
   ```

3. Run ktlint
   
   ``` 
   ./gradlew ktlintCheck
   ```
   
   If the gradlew is denied , set the flag before run the syntax:

   ``` 
   chmod +x gradlew
   ```

## 4.Install detekt
### Simple setup
Add dependence into module build gradle file

   ``` 
   plugins {
      id 'io.gitlab.arturbosch.detekt' version '1.22.0-RC2'
   }
   ```

## 6.Review
1. Add changes and create pull request
2. Send to Trainers review
