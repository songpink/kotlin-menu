package menu.Controller

import menu.Model.Menus

class ExceptionHandling {
    fun numOfCoachesUnderTwoErr(numOfCoaches: List<String>): Boolean {
        return try {
            require(numOfCoaches.size >= 2)
            false
        } catch (ex: IllegalArgumentException) {
            println("[ERROR] 코치는 최소 2명 이상 입력해야 합니다. 다시 입력해주세요.")
            true
        }
    }
    fun cannotEatMenuErr(cannotEatMenu: List<String>): Boolean{
        return try {
            for(c in cannotEatMenu){
                require(c in Menus.allMenu)
            }
            false
        } catch (ex: IllegalArgumentException){
            println("[ERROR] 입력한 메뉴는 존재하지 않는 메뉴입니다. 다시 입력해주세요.")
            true
        }
    }
}