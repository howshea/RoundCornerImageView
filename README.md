# RoundCornerImageView

![](https://img.shields.io/badge/version-1.0.3-brightgreen.svg)

最近想在github上找个圆角带边框的ImageView，找了几个或者不支持Color、或者不支持gif、或者不支持Glide，所以干脆自己用 Kotlin 写一个。

效果图：

![](https://github.com/howshea/RoundCornerImageView/raw/master/gif/simple.gif)

## 功能

- 设置边框粗细和颜色
- 设置圆角半径
- 设置宽高比

## 更新说明
**V 1.0.3** 修复使用代码修改控件属性时内半径未重新计算的bug
**V 1.0.2** 更新边框内圆角半径和图片显示尺寸的计算规则，让图片边缘不会被边框遮挡掉一部分

## Gradle


```groovy
dependencies {
    implementation 'com.howshea:roundCornerImageView:1.0.3'
}
```

如果你的项目里没有依赖 Kotlin 的标准库，还要依赖一下 Kotlin 的标准库才能使用

```groovy
implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.2.71"
```

## Usage

`XML`

```xml
<com.howshea.roundcornerimageview.RoundCornerImageView
    android:layout_width="250dp"
    android:layout_height="wrap_content"
    app:ratio="1.7"
    app:borderColor="#DBDBDB"
    app:borderWidth="0.4dp"
    app:radius="4dp" />
```

or  `Kotlin`

```kotlin
RoundCornerImageView(context).apply {
    borderColor = Color.parseColor("#DBDBDB")
    borderWidth = dp(0.4f).toFloat()
    radius = dp(3).toFloat()
}
```

其中 `ratio `属性是图片宽高比，值要大于0，当设置了ratio，`android:layout_height` 属性便会不起作用，高度会根据宽度自动计算，这个属性在图片宽度需要适应屏幕宽度时比较有用。

## Other

- 当borderWidth或者radius大于0时，图片仅支持 centerCrop 和 fitXY，默认为centerCrop,当borderWidth和radius都等于0时，和普通ImageView没有区别
- Drawable 转 bitmap 的处理参考了[CircleImageView](https://github.com/hdodenhof/CircleImageView)
- 对CENTER_CROP的处理参考了[SWImageView](https://github.com/sw950729/SWImageView)
