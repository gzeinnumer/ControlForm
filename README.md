<p align="center">
  <img src="https://github.com/gzeinnumer/ControlForm/blob/master/preview/example1.gif" width="300"/>
</p>

<h1 align="center">
    MyLibUtils
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple.</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Example Code/App](#example-codeapp)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:AndroidFormValidation:version'
}
```

---
# Feature List
- [x] [ControlForm](#ControlForm)

---
# Tech stack and 3rd library
- [TextWatcher](https://developer.android.com/reference/android/text/TextWatcher)

---
# Usage

### **ControlForm.**
```java
ControlForm controlForm = new ControlForm();
```
* Register Form
```java
controlForm.addForm(binding.edittext1);
```
* Register Form With CallBack
```java
controlForm.addForm(binding.edittext2, (ControlFormCallBack) s -> { //s is @Nullable
    if (s==null)
        Toast.makeText(MainActivity.this, "null", Toast.LENGTH_SHORT).show();
    else
        Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
});

//or ControlFormCallBackDisableSpace -> Disable Space At First
controlForm.addForm(binding.edittext2, (ControlFormCallBackDisableSpace) s -> {});

//or ControlFormCallBackDisableSpace -> Disable Zero At First
controlForm.addForm(binding.edittext2, (ControlFormCallBackDisableZero) s -> {});

//or ControlFormCallBackDisableSpace -> Disable Zero/Space At First
controlForm.addForm(binding.edittext2, (ControlFormCallBackDisableZeroSpace) s -> {});
```
* Clear All Form
```java
controlForm.clearForm();
```
* Full Code
```java
ControlForm controlForm = new ControlForm();

controlForm.addForm(binding.edittext1);
controlForm.addForm(binding.edittext2, (ControlFormCallBackDisableZeroSpace) s -> {
    if (s==null)
        Toast.makeText(MainActivity.this, "null", Toast.LENGTH_SHORT).show();
    else
        Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
});

binding.btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        controlForm.clearForm();
    }
});
```

---
# Example Code/App

[]()

[Sample Code And App](https://github.com/gzeinnumer/ControlFormExample)

---
# Version
- **1.0.0**
  - First Release

---
# Contribution
You can sent your constibution to `branch` `open-pull`.

### Fore More [All My Library](https://github.com/gzeinnumer#my-library-list)

---

```
Copyright 2021 M. Fadli Zein
```
