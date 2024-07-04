/*
 * Android Developer 練習問題: Kotlin の基本
 * 9.歩数計
 * ベスト プラクティスに基づいて、このプログラムの関数、関数パラメータ、変数の名前を変更する。
 * 
 */
// fun main() {
//     val Steps = 4000
//     val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
//     println("Walking $Steps steps burns $caloriesBurned calories")
// }

// fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
//     val CaloriesBURNEDforEachStep = 0.04
//     val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
//     return TotalCALORIESburned
// }

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
