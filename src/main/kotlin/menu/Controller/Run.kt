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
        val coachNames = coachNameErrHandling()
        val cannotEatMenus: MutableList<List<String>> = mutableListOf()
        cannotEatMenuErrHandling(coachNames, cannotEatMenus)
        suggestionAndPrintChart(coachNames, cannotEatMenus)
    }
    private fun coachNameErrHandling(): List<String>{
        var coachNames: List<String> = inputView.inputCoachName()
        while (exceptionHandling.sameCoachNameErr(coachNames)){
            coachNames = inputView.inputCoachName()
        }
        while (exceptionHandling.numOfCoachesNotValid(coachNames)) {
            coachNames = inputView.inputCoachName()
        }
        while (exceptionHandling.coachNameLengthErr(coachNames)){
            coachNames = inputView.inputCoachName()
        }
        return coachNames
    }
    private fun cannotEatMenuErrHandling(
        coachNames: List<String>,
        cannotEatMenus: MutableList<List<String>>
    ) {
        for (c in coachNames) {
            var cannotEatMenusByCoach = inputView.inputCannotEatMenusByCoach(c)
            while (exceptionHandling.cannotEatMenuNotExistErr(cannotEatMenusByCoach)) {
                cannotEatMenusByCoach = inputView.inputCannotEatMenusByCoach(c)
            }
            while (exceptionHandling.cannotEatMenuSizeErr(cannotEatMenusByCoach)){
                cannotEatMenusByCoach = inputView.inputCannotEatMenusByCoach(c)
            }
            cannotEatMenus.add(cannotEatMenusByCoach)
        }
    }

    private fun suggestionAndPrintChart(
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