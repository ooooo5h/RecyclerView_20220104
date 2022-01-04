package com.neppplus.recyclerview_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.recyclerview_20220104.models.Student

class MainActivity : AppCompatActivity() {

//    여러 학생을 담아줄, 일종의 그릇같은 개념으로 사용할 변수 생성
    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        임시방편 : 코드에 직접 타이핑해서 학생 목록을 추가
        mStudentList.add( Student("조경진", 1988, "서울시 동대문구"))
        mStudentList.add( Student("김범준", 1995, "서울시 송파구"))
        mStudentList.add( Student("김현희", 1995, "서울시 성북구"))
        mStudentList.add( Student("이승훈", 1994, "서울시 구로구"))
        mStudentList.add( Student("전은형", 1991, "서울시 중랑구"))

    }
}