# Example Geb, Appium and Gradle Project

## 概要

[Example Geb and Gradle Project](https://github.com/geb/geb-example-gradle)
を、[Appium](https://github.com/appium/appium/)を使ってAndroid上のChromeブラウザでも動作するようにしたものです。

Appium 1.6.1を立ち上げた状態で、以下のコマンドを実行してください。

    ./gradlew appiumTest

## 動作確認環境 

Appium 1.6.1とChrome 54.0.2840.85の組み合わせで動作確認しています。


## オリジナルからの修正内容

### `build.gradle`

- `drivers`配列に`"appium"`を追加し、`appiumTest`タスクを利用できるようにしました。
  `appiumTest`タスクを実行すると、`geb.env`プロパティに`appium`が設定された状態でテストが実行されます。
- Appium Java Clientを依存関係に追加しました。

### `src/test/resources/GebConfig.groovy`

`GebConfig.groovy`の`appium`ブロックを追加し、その中で、WebDriver実装として`AndroidDriver`を返すようにしています。

## License

Modification Copyright 2016 TOYAMA Sumio <jun.nama@gmail.com>  
Licensed under the Apache License, Version 2.0.
