package menu.View

import menu.Model.Messages

class OutputView {
    fun printChart(
        categoriesNameByDay: List<String>, coachNames: List<String>,
        suggestionMenuByDay: MutableMap<String, MutableList<String>>
    ) {
        println("\n" + Messages.THIS_IS_SUGGESTION_MENU)
        println(Messages.TOP_OF_CHART)
        println(
            Messages.CATEGORY_OF_CHART.format(
                categoriesNameByDay[0], categoriesNameByDay[1],
                categoriesNameByDay[2], categoriesNameByDay[3], categoriesNameByDay[4]
            )
        )
        printMenuByDay(coachNames, suggestionMenuByDay)
        println("\n" + Messages.SUGGESTION_COMPLETE)
    }
    private fun printMenuByDay(
        coachNames: List<String>,
        suggestionMenuByDay: MutableMap<String, MutableList<String>>
    ) {
        for (c in coachNames) {
            println(
                Messages.NAME_OF_CHART.format(
                    c, suggestionMenuByDay[c]!![0],
                    suggestionMenuByDay[c]!![1], suggestionMenuByDay[c]!![2],
                    suggestionMenuByDay[c]!![3], suggestionMenuByDay[c]!![4]
                )
            )
        }
    }
}