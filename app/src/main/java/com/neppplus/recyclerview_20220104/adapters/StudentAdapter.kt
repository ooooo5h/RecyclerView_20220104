package com.neppplus.recyclerview_20220104.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView

// 학생들 한 명 데이터 + 학생 한 명의 xml을 조합해서 => 위치에 맞게 보내주는 역할
// 안드로이드에서 제공하는 기초 작업을 상속받아서 일부만 수정하자

class StudentAdapter : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

//    StudentAdapter 클래스 안에서 사용할, 내부 전용 클래스를 추가로 생성해야함
    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {


    }

}