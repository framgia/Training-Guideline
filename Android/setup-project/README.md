# Setup project

## 1.Add .gitignore in root
1. Create file .gitignore in root
2. Copy content of [file](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.gitignore) into recent created file

## 2. Add pull request template
1. Create file .github/pull_request_template.md
2. Copy content of [file](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.github/pull_request_template.md) into recent created file.

## 3. Add ktlint check
Follow this link to get the source of library and the lastest version of ktlint: [JLLeitschuh_ktlint](https://github.com/JLLeitschuh/ktlint-gradle#importing)
### Simple setup
1. Add plugin in gradle module
   ``` 
   plugins {
      id "org.jlleitschuh.gradle.ktlint" version"
   }
   ```
   
   Make sure that you have mavenCentral()
   
   ``` 
   repositories {
      // Required to download KtLint
      mavenCentral()
   }
   ```
   
2. Add classpath dependency

   ```
   buildscript {
      repositories {
         maven {
            url "https://plugins.gradle.org/m2/"
         }
      }

      dependencies {
         classpath "org.jlleitschuh.gradle:ktlint-gradle:<lastest version>"
      }
   }
   ```

   ```
   apply plugin: "org.jlleitschuh.gradle.ktlint"
   ```

3. Run ktlint
   
   ``` 
   ./gradlew ktlintCheck
   ```
   
   If the gradlew is denied , set the flag before run the syntax:

   ``` 
   chmod +x gradlew
   ```

## 4.Install Sun*CI
1. Create file .sun-ci.yml in root
2. Copy content of [file](https://github.com/framgia/Training-Guideline/blob/master/Android/setup-project/.sun-ci.yml) into recent created file

## 5.Review
1. Add changes and create pull request
2. Send to Trainers review
