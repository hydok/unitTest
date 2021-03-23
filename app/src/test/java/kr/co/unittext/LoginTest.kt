package kr.co.unittext

import kr.co.unittext.login.LoginContract
import kr.co.unittext.login.LoginPresenter
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InOrder
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LoginTest {
    @Mock
    private lateinit var view : LoginContract.View

    @Mock
    private lateinit var repo : LoginContract.Model

    private lateinit var presenter :LoginPresenter
    private lateinit var inOrder: InOrder

    @Before
    fun setUp(){
        presenter = LoginPresenter(view)
        inOrder = Mockito.inOrder(view)
    }

    @Test
    fun test_login_fail_incorrentEmail(){
        //given
        Mockito.`when`(view.getId()).thenReturn("thisisid")
        //when
        presenter.onClickLogin()
        //then
        Mockito.verify(view).showMsgForIncorrentId()
    }


}