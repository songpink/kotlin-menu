package menu.Model

object Messages {
    const val START_SUGGESTION = "점심 메뉴 추천을 시작합니다."
    const val INPUT_NAMES = "코치의 이름을 입력해 주세요. (, 로 구분)"
    const val INPUT_CANNOT_EAT_MENU = "%s(이)가 못 먹는 메뉴를 입력해 주세요."
    const val THIS_IS_SUGGESTION_MENU = "메뉴 추천 결과입니다."
    const val TOP_OF_CHART = "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"
    const val CATEGORY_OF_CHART = "[ 카테고리 | %s | %s | %s | %s | %s ]"
    const val NAME_OF_CHART = "[ %s | %s | %s | %s | %s | %s ]"
    const val SUGGESTION_COMPLETE = "추천을 완료했습니다."

    const val NUM_OF_COACHES_ERROR = "[ERROR] 코치는 2~5명이어야 합니다. 다시 입력해주세요."
    const val THERE_IS_NO_MENU = "[ERROR] 입력한 메뉴는 존재하지 않는 메뉴입니다. 다시 입력해주세요."
    const val NAME_LENGTH_ERROR = "[ERROR] 코치의 이름이 2~4자가 아닙니다. 다시 입력해 주세요."
    const val CANNOT_EAT_LENGTH_ERROR = "[ERROR] 못 먹는 메뉴는 0~2개 이어야 합니다. 다시 입력해 주세요."
}