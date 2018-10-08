# RoundCornerImageView

最近想在github上找个圆角带边框的ImageView，找了几个或者不支持Color、或者不支持gif、或者不支持Glide，所以干脆自己写一个。

效果图：

![](https://github.com/howshea/RoundCornerImageView/raw/master/gif/ezgif-3-b44cae533193.gif)

Gradle

---------

```groovy
dependencies {
    ...
    implementation 'com.howshea:roundCornerImageView:1.0.0'
}
```

如果依赖不了，可能是审核尚未结束，可以直接加上仓库地址：

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

Usage

-----

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

