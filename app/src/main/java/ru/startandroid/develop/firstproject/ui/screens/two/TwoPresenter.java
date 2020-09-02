package ru.startandroid.develop.firstproject.ui.screens.two;

import ru.startandroid.develop.firstproject.ui.mvp.BasicPresenter;

public class TwoPresenter extends BasicPresenter<TwoView> {

    public void onRedButtonClicked(){
        getView().navigateToRegister();
    }

    public void onGreenButtonClicked(){
        getView().navigateToRegister();
    }
    public void onBlueButtonClicked(){
        getView().navigateToPhotos();
    }
}
