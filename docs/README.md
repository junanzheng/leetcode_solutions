# Introduction

{% hint style="success" %}
这里保存了一些常用的力扣代码模板
{% endhint %}

## 说明

这个repo主要是自己练手用，几天不做题，就容易手生。

* [x] **一题多解，一题多遍**
* [x] 做题时**注释**很重要，尽量多写注释
* [x] 不要太重视解题代码，**解题的思路才是关键**

## 环境

* `VSCode`编辑器 + `leetcode`插件
* `java` ：`java extention pack`插件、`jdk 13.0.2`
* `c++` ：`c++ intellisense`、`c/c++`插件、`mingw64`
* `python` ：`python`插件、`python 3.8.1`
* `leetcode`其中的`setting.json`文件的一部分配置

```javascript
// 用来配置源代码文件存放目录及文件名
"leetcode.filePath": {
    "default": {
        "folder": "",
        "filename": "${id}.${kebab-case-name}.${ext}"
    },
    "java": {
        "folder": "${tag}\\${id}-${kebab-case-name}",
        "filename": "Solution.${ext}"
    },
    "python3": {
        "folder": "${tag}\\${id}-${kebab-case-name}",
        "filename": "Solution.${ext}"
    },
    "cpp": {
        "folder": "${tag}\\${id}-${kebab-case-name}",
        "filename": "Solution.${ext}"
    }
},
"leetcode.endpoint": "leetcode-cn",
"leetcode.hint.setDefaultLanguage": false,
```
