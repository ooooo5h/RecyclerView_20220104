package com.neppplus.recyclerview_20220104.models

class Student(
    val name: String,
    val birthYear: Int,
    val address: String
) {


//    2022년 기준 나이를 리턴해주는 함수

    fun getAge() : Int {

        return 2022 - this.birthYear + 1
    }
}