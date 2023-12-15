package menu.View

import camp.nextstep.edu.missionutils.Console
import menu.Model.Messages

class InputView {
    fun printInputCoachName() {
        println(Messages.START_SUGGESTION)
        println("\n" + Messages.INPUT_NAMES)
    }
    fun inputCoachName(): List<String> {
        return Console.readLine().split(",").map { it.trim() }
    }
    fun inputCannotEatMenusByCoach(coachName: String): List<String> {
        println("\n" + Messages.INPUT_CANNOT_EAT_MENU.format(coachName))
        return Console.readLine().split(",").map { it.trim() }
    }
}
