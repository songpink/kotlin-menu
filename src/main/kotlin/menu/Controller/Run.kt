package menu.Controller

import menu.View.InputView

class Run {
    val inputView = InputView()
    val suggestion = Suggestion()
    fun run(){
        val coachNames = inputView.inputCoachName()
        val cannotEatMenus = inputView.inputCannotEatMenus(coachNames)
        val categoriesByDay = suggestion.decideCategory()
        suggestion.setSuggestionMenuByDay(coachNames)
        for (i in 0..4){
            suggestion.decideMenu(coachNames, categoriesByDay[i])
        }
        print(suggestion.suggestionMenuByDay)
    }
}