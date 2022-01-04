package com.neppplus.recyclerview_20220104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.recyclerview_20220104.R
import com.neppplus.recyclerview_20220104.models.Student

// 학생들 한 명 데이터 + 학생 한 명의 xml을 조합해서 => 위치에 맞게 보내주는 역할
// 안드로이드에서 제공하는 기초 작업을 상속받아서 일부만 수정하자

class StudentAdapter(
    val mContext: Context,  // 어느 화면에서 이 어댑터를 쓸꺼야?
    val mList: List<Student>, // 어떤 목록을 보여줄건지, 그 목록을 통째로 받아오기
) : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

//          StudentAdapter 클래스 안에서 사용할, 내부 전용 클래스를 추가로 생성해야함
    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {
    
//          xml의 id가 붙어있는 태그들을 멤버변수에 담아두자
    
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)

//        찾아낸 태그 변수/실제 목록의 데이터를 반영 함수
    
        fun bind(data: Student) {
            
//            학생 데이터를 하나 받으면, 텍스트뷰에 연결해주는 함수
            txtName.text = data.name
            txtAddress.text = data.address
            txtAge.text = "(${data.birthYear}세)"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        1. 한 줄을 표현하는 xml을 가지고, 코틀린의 변수에 담아두자(inflate)
        val row = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, parent, false)

//        2. row를 MyViewHolder로 감싸서 리턴
        return MyViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

//        원래는 여기에서 실 데이터 반영을 MyViewHolder에 bind함수로 대체했음

        holder.bind(mList[position])

    }

    override fun getItemCount(): Int {
//        mList에 몇개의 데이터가 들어있나? => 뿌려줄 줄의 갯수
        return mList.size

    }

}