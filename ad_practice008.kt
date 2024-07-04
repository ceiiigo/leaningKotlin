/*
 * Android Developer 練習問題
 * 8.デフォルトのパラメータ
 * 
 * step1.
 * 「There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.」を出力する。
 * OSとメールアドレスを受け取り、上記の文を出力する関数「displayAlertMessage()」を定義して、使用する。
 * 
 * step2.
 * ユーザーのオペレーティング システムを特定できない場合はOSを「Unknown OS」とするが
 * 関数を呼び出す度に指定しなくて良いように最適化する。
 */
fun main() {
// step.1 main()
//     val operatingSystem = "Chrome OS"
//     val emailId = "sample@gmail.com"

//     println(displayAlertMessage(operatingSystem, emailId))

// step.2 main()
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
