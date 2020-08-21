package ru.startandroid.develop.firstproject.ui.screens.main;

import ru.startandroid.develop.firstproject.ui.mvp.BasicPresenter;

public class MainPresenter extends BasicPresenter<MainView> {

    @Override
    protected void onEnterScope() {
        super.onEnterScope();
        getView().onNavigateToFirst();
    }
}
