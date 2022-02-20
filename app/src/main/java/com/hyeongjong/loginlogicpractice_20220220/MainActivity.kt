package com.hyeongjong.loginlogicpractice_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그인 버튼 구현
        btnLogin.setOnClickListener {
            var inputId = edtInputId.text.toString()
            var inputPw = edtInputPw.text.toString()

//            맞다면
            if (inputId == "admin" && inputPw == "qwer") {

                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
//            아이디가 틀리다면
            else if(inputId != "admin") {
                Toast.makeText(this, "잘못된 아이디입니다.", Toast.LENGTH_SHORT).show()
            }
//            아이디는 맞고 비밀번호가 틀리다면
            else {

                Toast.makeText(this, "잘못된 비밀번호입니다.", Toast.LENGTH_SHORT).show()
            }

        }
    }
}