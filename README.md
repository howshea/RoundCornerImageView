# RoundCornerImageView

最近想在github上找个圆角带边框的ImageView，找了几个或者不支持Color、或者不支持gif、或者不支持Glide，所以干脆自己用 Kotlin 写一个。

效果图：

![](https://github.com/howshea/RoundCornerImageView/raw/master/gif/ezgif-3-b44cae533193.gif)

## Gradle


```groovy
dependencies {
    ...
    implementation 'com.howshea:roundCornerImageView:1.0.0'
}
```

如果依赖不了，可能是 jcenter 审核尚未结束，可以直接加上仓库地址：

```groovy
allprojects {
    repositories {
        ...
        maven {
            url 'https://dl.bintray.com/howshea/maven'
        }
    }
}
```
## Usage

`XML`

```xml
<com.howshea.roundcornerimageview.RoundCornerImageView
    android:id="@+id/img_gif"
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

Kotlin版本为1.2.71，使用时注意Kotlin插件版本不要低于此版本。