gitbucket-explorer-plugin [![Gitter](https://img.shields.io/gitter/room/gitbucket/gitbucket.js.svg?style=flat-square)](https://gitter.im/gitbucket/gitbucket) [![Travis](https://img.shields.io/travis/gitbucket/gitbucket-explorer-plugin.svg?style=flat-square)](https://travis-ci.org/gitbucket/gitbucket-explorer-plugin)
===

This plugin provides an explorer like file tree for GIT repositories with [GitBucket](https://github.com/gitbucket/gitbucket).

![screenshot](screenshot.png)

Version
---

Plugin version|GitBucket version
:---|:---
5.0|4.21.x+  |  
4.0|4.16+
3.x|4.11+
2.0.0| 4.10+
1.0.x|4.9.x

Download
---

You can download the JAR file from the [Release](https://github.com/gitbucket-plugins/gitbucket-explorer-plugin/releases) page.

Installation
---

Copy the downloaded plug-in JAR file to your `GITBUCKET_HOME/plugins` directory, and then restart the GitBucket instance.

Building
---
Pre-requisites are Node, NPM, SBT, and Java 8.
 - Run `npm install` to install all node dependencies.
 - Run `npm run-script release` to create a **complete** release (this will call SBT too).

See `package.json` for more details.

Releases
---

### 5.0.0 - 29 Jan 2018
- Bump to GitBucket 4.21.2

### 4.0.0 - 5 Sept 2017
- Bump to GitBucket 4.16

### 3.0.0 - 7 Apr 2017

- Bump to GitBucket 4.11

### 2.0.0 - 28 Feb 2017

- Bump to GitBucket 4.10

### 1.0.2 - 16 Feb 2017

- (bugfix) No redirect to css on deny anonymous access

### 1.0.2 - 15 Feb 2017

- Fixed some bugs

### 1.0.1 - 8 Feb 2017

- Display tree of selected branch

### 1.0.0 - 6 Feb 2017

- first release

Credits
---

This plug-in was developed by [@tomoki1207](https://github.com/tomoki1207).
