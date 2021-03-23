package kr.co.unittext.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.unittext.R

class LoginActivity : AppCompatActivity(), LoginContract.View {

    private lateinit var presenter : LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)


    }

    override fun getId(): String {
        TODO("Not yet implemented")
    }

    override fun getPw(): String {
        TODO("Not yet implemented")
    }


    override fun showMsgForIncorrentId() {

    }
}