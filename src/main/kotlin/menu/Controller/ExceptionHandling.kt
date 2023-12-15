package menu.Controller

import menu.Model.Menus
import menu.Model.Messages

class ExceptionHandling {
    fun numOfCoachesNotValid(numOfCoaches: List<String>): Boolean {
        return try {
            require(numOfCoaches.size in 2..5)
            false
        } catch (ex: IllegalArgumentException) {
            println(Messages.NUM_OF_COACHES_ERROR)
            true
        }
    }
    fun cannotEatMenuNotExistErr(cannotEatMenu: List<String>): Boolean{
        return try {
            for(c in cannotEatMenu){
                require(c in Menus.allMenu || c == "")
            }
            false
        } catch (ex: IllegalArgumentException){
            println(Messages.THERE_IS_NO_MENU)
            true
        }
    }
    fun coachNameLengthErr(coachNames: List<String>): Boolean{
        return try{
            for (c in coachNames){
                require(c.length in 2..4)
            }
            false
        } catch (ex: IllegalArgumentException){
            println(Messages.NAME_LENGTH_ERROR)
            true
        }
    }
    fun cannotEatMenuSizeErr(cannotEatMenu: List<String>): Boolean{
        return try{
            require(cannotEatMenu.size in 0..2)
            false
        } catch (ex: IllegalArgumentException){
            println(Messages.CANNOT_EAT_LENGTH_ERROR)
            true
        }
    }
    fun sameCoachNameErr(coachNames: List<String>): Boolean {
        return try{
            require(coachNames.toSet().size == coachNames.size)
            false
        } catch (ex: IllegalArgumentException){
            println("[ERROR] 코치 이름에 중복이 있습니다. 다시 입력해주세요.")
            true
        }
    }
}