# Kotiln コーディング規約

## 命名規則 (Naming Rules)

### パッケージ名

- パッケージ名は小文字で記述します。

```kotlin
package jp.co.example.domain

```

- アンダースコア（`_`）は使用しません。

```kotlin
// NG
package jp.co.example.domain_module

```

- 必要に応じて複数の単語をつなぐ場合は **キャメルケース (camelCase)** を使用します。

```kotlin
package jp.co.example.myProject

```

---

### 関数名

### ViewModel の `observe()` 関数に関連する名前

```kotlin
setupXXX()

```

### サーバーからデータを取得する関数名

```kotlin
fetchXXX()

```

### サーバーにデータを保存する関数名

```kotlin
saveXXX()

```

### 値を返すデータを取得する関数名

```kotlin
getXXX()

```

### 特定のオブジェクトを検索する関数名

```kotlin
findXXX()

```

### 複数形のデータを取得する場合

```kotlin
getBrands()      // OK
getBrandList()   // NG

```

### 列挙型を Raw 値から検索する関数名

```kotlin
enum class Color {
    RED, BLUE, GREEN;

    fun find(rawColor: String): Color = when (rawColor) {
        "red" -> RED
        "blue" -> BLUE
        "green" -> GREEN
        else -> throw IllegalArgumentException("invalid color: $rawColor")
    }
}

```
