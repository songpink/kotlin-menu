package menu.View

import camp.nextstep.edu.missionutils.Console
import menu.Model.Messages

class InputView {
    fun inputCoachName(): List<String> {
        println(Messages.START_SUGGESTION)
        println()
        println(Messages.INPUT_NAMES)

        return Console.readLine().split(",").map { it.trim() }
    }

    fun inputCannotEatMenus(coachNames: List<String>): MutableList<List<String>> {
        val cannotEatMenuList: MutableList<List<String>> = mutableListOf()
        for (i in coachNames) {
            println(Messages.INPUT_CANNOT_EAT_MENU.format(i))
            val temp = Console.readLine().split(",").map { it.trim() }
            cannotEatMenuList.add(temp)
        }
        return cannotEatMenuList
    }
}
