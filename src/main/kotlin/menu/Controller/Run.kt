package menu.Controller

import menu.View.InputView
import menu.View.OutputView

class Run {
    private val inputView = InputView()
    private val suggestion = Suggestion()
    private val outputView = OutputView()
    private val exceptionHandling = ExceptionHandling()
    fun run() {
        inputView.printInputCoachName()
        var coachNames: List<String> = inputView.inputCoachName()
        while (exceptionHandling.numOfCoachesUnderTwoErr(coachNames)) {
            coachNames = inputView.inputCoachName()
        }
        val cannotEatMenus: MutableList<List<String>> = mutableListOf()
        for (c in coachNames) {
            var cannotEatMenusByCoach = inputView.inputCannotEatMenusByCoach(c)
            while (exceptionHandling.cannotEatMenuErr(cannotEatMenusByCoach)) {
                cannotEatMenusByCoach = inputView.inputCannotEatMenusByCoach(c)
            }
            cannotEatMenus.add(cannotEatMenusByCoach)
        }
        suggestionAndprintChart(coachNames, cannotEatMenus)
    }

    private fun suggestionAndprintChart(
        coachNames: List<String>,
        cannotEatMenus: MutableList<List<String>>
    ) {
        suggestion.decideCategory()
        suggestion.setSuggestionMenuByDay(coachNames)
        for (i in 0..4) {
            suggestion.decideMenu(coachNames, suggestion.categoriesByDay[i], cannotEatMenus)
        }
        outputView.printChart(
            suggestion.categoriesNameByDay,
            coachNames, suggestion.suggestionMenuByDay
        )
    }
}