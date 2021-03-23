package kr.co.unittext.login

class LoginPresenter(
    private val view: LoginContract.View,
    private val model: LoginRepo = LoginRepo()
) : LoginContract.Presenter {


    override fun onClickLogin() {

        val inputId = view.getId()

        if(inputId == "thisisid"){
            view.showMsgForIncorrentId()
        }
    }


}