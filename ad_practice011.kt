/*
 * Android Developer 練習問題: Kotlin の基本
 * 11. 重複するコードを関数に移動する
 * 1. main() 関数の繰り返しを減らすために、1 つの都市について天気の詳細情報を表示する関数を作成し、残りの都市についても同様にできますか。
 * 2. 都市ごとに作成した関数を呼び出し、適切な天気の詳細情報を引数として渡すように main() 関数を更新できますか。
 */
fun main() {
    displayCityInfo("Ankara", 27, 31, 82)
    println()

    displayCityInfo("Tokyo", 32, 36, 10)
    println()

    displayCityInfo("Cape Town", 59, 64, 2)
    println()

    displayCityInfo("Guatemala City", 50, 55, 7)
    println()
}

fun displayCityInfo(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
}

// fun main() {
//     println("City: Ankara")
//     println("Low temperature: 27, High temperature: 31")
//     println("Chance of rain: 82%")
//     println()

//     println("City: Tokyo")
//     println("Low temperature: 32, High temperature: 36")
//     println("Chance of rain: 10%")
//     println()

//     println("City: Cape Town")
//     println("Low temperature: 59, High temperature: 64")
//     println("Chance of rain: 2%")
//     println()

//     println("City: Guatemala City")
//     println("Low temperature: 50, High temperature: 55")
//     println("Chance of rain: 7%")
//     println()
// }
