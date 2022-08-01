# SwiftLint Installation

- We can install swiftlint in 2 ways i.e Globally in our system or Locally in our project
### 1. Global Installation :
* Using homeBrew:
```
brew install swiftlint
```


## Evidence (Screenshot or Video)

You can download SwiftLint.pkg from the latest [GitHub release](https://github.com/realm/SwiftLint/releases) and running it.

### 2. On project Level
* Using CocoaPods
Simply add the following line to your Podfile:
```
pod 'SwiftLint'
```

## Integrate SwiftLint With Xcode
- In order to integrate SwiftLint with the Xcode project target to get warnings and errors displayed in the Xcode IDE, you just need to add a new “Run Script Phase” and we need to add a small Script in it.

- If you have installed Swiftlint using CocoaPods then you need to add `${PODS_ROOT}/SwiftLint/swiftlint` in your Script Build Phases. 

- And if you have installed Swiftlint using HomeBrew then you need to add the following code in your Script build Phase:

```
if which swiftlint >/dev/null; then
swiftlint
else
echo "warning: SwiftLint not installed, download from https://github.com/realm/SwiftLint"
fi
```
