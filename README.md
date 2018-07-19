# CheckerboardDrawable [![gitHub release](https://img.shields.io/github/release/duanhong169/CheckerboardDrawable.svg?style=social)](https://github.com/duanhong169/CheckerboardDrawable/releases) [![platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html) <a target="_blank" href="https://android-arsenal.com/api?level=14"><img src="https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat"></a> [![license](https://img.shields.io/badge/license-Apache%202-green.svg)](https://github.com/duanhong169/CheckerboardDrawable/blob/master/LICENSE)


A custom Drawable to use as background which embody "transparent", AKA checkerboard grid.

<img src='art/screen-shot.png' height='500px'/>

## Gradle

```
dependencies {
    implementation 'com.github.duanhong169:checkerboarddrawable:${latestVersion}'
    ...
}
```

> Replace `${latestVersion}` with the latest version code. See [releases](https://github.com/duanhong169/CheckerboardDrawable/releases).

## Usage

### Use `CheckerboardDrawable.create()` and set as background drawable

```java
    yourView.setBackgroundDrawable(CheckerboardDrawable.create());
```

### Custom

```java
    CheckerboardDrawable drawable = new CheckerboardDrawable.Builder()
            .colorOdd(Color.LTGRAY)
            .colorEven(Color.DKGRAY)
            .size(20)
            .build();
    yourView.setBackgroundDrawable(drawable);
```

## License

See the [LICENSE](./LICENSE) file.