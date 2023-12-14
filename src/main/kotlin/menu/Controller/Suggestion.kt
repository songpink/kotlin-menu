package menu.Controller

import camp.nextstep.edu.missionutils.Randoms
import menu.Model.Menus

class Suggestion {
    val suggestionMenuByDay: MutableMap<String, MutableList<String>> = mutableMapOf()
    fun decideCategory(): MutableList<List<String>> {
        val dayCnt: MutableList<Int> = mutableListOf(0, 0, 0, 0, 0)
        val categoriesByDay: MutableList<List<String>> = mutableListOf()
        while (dayCnt.sum() < 5) {
            val pickIndex = Randoms.pickNumberInRange(0, 4)
            if (dayCnt[pickIndex] >= 2) {
                continue
            }
            dayCnt[pickIndex]++
            val category: List<String> = Menus.category[pickIndex]
            categoriesByDay.add(category)
        }
        return categoriesByDay
    }

    fun setSuggestionMenuByDay(coachNames: List<String>) {
        for (i in coachNames) {
            suggestionMenuByDay[i] = mutableListOf()
        }
    }

    fun decideMenu(coachNames: List<String>, category: List<String>) {
        var coachIndex = 0
        while (coachIndex < coachNames.size) {
            val menu = Randoms.shuffle(category)[0]
            if (menu in suggestionMenuByDay[coachNames[coachIndex]]!!) {
                continue
            }
            suggestionMenuByDay[coachNames[coachIndex]]!!.add(menu)
            coachIndex++
        }

    }
}