package ru.startandroid.develop.firstproject.ui.screens.one;

import ru.startandroid.develop.firstproject.ui.mvp.BasicPresenter;

public class OnePresenter extends BasicPresenter<OneView> {

    public void onLoginButtonClicked(String login, String password) {
        if (login.equals("м'яу") && password.equals("кусь-кусь")) {
            getView().onNavigateToTwo();

        } else {
            getView().onCredentialsWrong();
        }
    }
}


//        if(password.length()>3) {
//            getView().onNavigateToTwo();
//        }
//        else
//        {
//            getView().onCredentialsError();
//        }
//    }

