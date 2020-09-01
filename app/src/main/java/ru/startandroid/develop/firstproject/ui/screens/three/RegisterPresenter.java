package ru.startandroid.develop.firstproject.ui.screens.three;

import ru.startandroid.develop.firstproject.ui.mvp.BasicPresenter;
import ru.startandroid.develop.firstproject.ui.screens.two.TwoView;

public class RegisterPresenter extends BasicPresenter<RegisterView> {

    public void onGreenButtonClicked() {
        getView().navigateToRegister();
    }
}