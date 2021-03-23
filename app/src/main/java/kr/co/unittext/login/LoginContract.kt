package kr.co.unittext.login

class LoginContract {


    interface View{

        fun getId() : String
        fun getPw() : String
        fun showMsgForIncorrentId()


    }
    interface Presenter{
        fun onClickLogin()

    }
    interface Model{


    }
}