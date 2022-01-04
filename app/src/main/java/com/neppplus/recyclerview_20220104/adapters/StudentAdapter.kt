package com.neppplus.recyclerview_20220104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.recyclerview_20220104.R
import com.neppplus.recyclerview_20220104.models.Student

// 학생들 한 명 데이터 + 학생 한 명의 xml을 조합해서 => 위치에 맞게 보내주는 역할
// 안드로이드에서 제공하는 기초 작업을 상속받아서 일부만 수정하자

class StudentAdapter(
    val mContext: Context,  // 어느 화면에서 이 어댑터를 쓸꺼야?
    val mList: List<Student>, // 어떤 목록을 보여줄건지, 그 목록을 통째로 받아오기
) : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

//    StudentAdapter 클래스 안에서 사용할, 내부 전용 클래스를 추가로 생성해야함
    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        1. 한 줄을 표현하는 xml을 가지고, 코틀린의 변수에 담아두자(inflate)
        val row = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, parent, false)

//        2. row를 MyViewHolder로 감싸서 리턴
        return MyViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
//        mList에 몇개의 데이터가 들어있나? => 뿌려줄 줄의 갯수
        return mList.size

    }

}