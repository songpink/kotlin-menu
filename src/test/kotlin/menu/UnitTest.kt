package menu

import menu.Controller.ExceptionHandling
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UnitTest {
    private val exceptionHandling = ExceptionHandling()
    @Test
    fun `코치가 한명일 때 오류 나는지 테스트`(){
        val test = exceptionHandling.numOfCoachesNotValid(listOf("알송"))

        assertEquals(true, test)
    }
    @Test
    fun `먹을 수 없는 메뉴에 없는 메뉴가 있을때 테스트`(){
        val test = exceptionHandling.cannotEatMenuNotExistErr(listOf("라면"))

        assertEquals(true, test)
    }
}