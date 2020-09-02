package ru.startandroid.develop.firstproject.ui.screens.four;

import ru.startandroid.develop.firstproject.ui.mvp.BasicPresenter;

public class PhotosPresenter extends BasicPresenter<PhotosView> {
    public void exitFromView() {
    }

    public void enterWithView(FragmentPhotos fragmentPhotos) {
    }
    public void onBlueButtonClicked(){
        getView().navigateToPhotos();
    }
}
