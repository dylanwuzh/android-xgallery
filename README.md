# android\-xgallery

根据 `ViewPager` 实现

自定义的 Gallery，可以实现下图的效果：

![效果图][1]

## Gradle

[![](https://www.jitpack.io/v/wuzhendev/android-xgallery.svg)](https://www.jitpack.io/#wuzhendev/android-xgallery)

``` groovy
repositories {
    maven {
        url "https://www.jitpack.io"
    }
}

dependencies {
    compile 'com.github.wuzhendev:android-xgallery:x.y.z'
}
```

## Attrs

``` xml
<!-- Item的宽度 -->
<attr name="xGallery_itemWidth" format="dimension" />

<!-- Item的高度 -->
<attr name="xGallery_itemHeight" format="dimension" />
```

## Sample

[Sample sources][2]

[Sample APK](https://github.com/wuzhendev/android-xgallery/raw/master/assets/XGallery_Demo_v1_0_0.apk)

## License

```
Copyright 2016 wuzhen

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[1]: ./assets/1.gif
[2]: ./samples

