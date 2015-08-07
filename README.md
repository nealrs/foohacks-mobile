# Simple Webview Boilerplate for Android Studio

This is an Android Studio project that allows you to wrap your website or web app in a super simple Android app.

I wanted a boilerplate that was literally "drag and drop" - I'm pretty happy with this result. Originally, I forked slymax's webview repo but I ended up deleting all the code and making a new branch. I got inspiration from him though so thanks!

It is compatible with Android devices running Ice Cream Sandwich and higher (API 22).

<img src="https://github.com/nabilfreeman/android-webview-boilerplate/raw/master/readme-screenshots/telefono.png" alt="the finished product!" width="450">

# Setup
- Clone this repo, or hit "Download ZIP" in the Github sidebar.

### Local mode (recommended)
- Replace the stuff in `app/src/main/assets/web_content` with your own mobile website.
- Hit Run!

### Internet mode
- In `MainActivity.java` (see below screenshot), switch around the commented out URL lines.
- Set your URL...
- Hit Run!

<img src="https://github.com/nabilfreeman/android-webview-boilerplate/raw/master/readme-screenshots/files.png" alt="MainActivity.java location within the boilerplate" width="650">

### Bonus settings

There are some extra settings in `MainActivity.java` too. They're all code commented so check out the file!

- Toggle Javascript
- Toggle the opening of a full browser when a user clicks a link.

# Why?

So you can easily build an Android app in HTML/CSS/JS without using Cordova. And, as awesome as the Chrome home screen bookmark stuff is, for certain projects it might make a lot more sense if people can search through the Google Play / Amazon store.

HTML web apps are totally awesome for layout content and typography. Tons of big apps like Instagram use HTML layouts and CSS styling for parts of their apps.

If you are a web developer who wants to release an Android app, this should help you cut some corners when it comes to learning Java.

# Ideal use

Single page web app with on-screen/no navigation. For example, a game, interactive page, web based slideshow, etc.
