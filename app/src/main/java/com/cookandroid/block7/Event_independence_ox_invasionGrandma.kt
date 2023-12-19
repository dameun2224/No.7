package com.cookandroid.block7

// Event_invasion_robbery: 침입 - 강도
class Event_independence_ox_invasionGrandma(GameActivity: GameActivity, eventName: String, type: Int, weight: Int, isAvailable: Boolean)
    : Event(GameActivity, eventName, type, weight, isAvailable){

    // 생성자 - 기본 preScript, postScript 설정
    init {
        setPreScript(getScript("event_invasion_grandma_pre"))
        setPostScript(getScript("event_invasion_grandma_post"))
    }

    // isAvailable, weight 수정 메소드
    override fun setIsAvailable() {
        isAvailable = true
    }

    // 이벤트 효과 메소드
    override fun eventEffect(choose_value: Boolean) {
        if(choose_value) { // 문을 열어준 경우
            hurtRandomMember() // 안에 있는 멤버중 랜덤으로 1명이 다침
            loseRandomItem() // 가지고 있는 아이템 중, 랜덤으로 하나를 잃음
        } else { // 문을 열어주지 않은 경우
            setPostScript(getScript("event_invasion_grandma_post_tmp"))
        }
    }
}
