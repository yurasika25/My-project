package ru.startandroid.develop.firstproject.ui.screens.three;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ru.startandroid.develop.firstproject.R;

public class FragmentRegister extends Fragment implements RegisterView {


    private RegisterPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.register, container, false);
        presenter = new RegisterPresenter();

        return  view;

    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.exitFromView();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.enterWithView(this);
    }


    @Override
    public void navigateToRegister() {

    }

    @Override
    public void navigateToPhoto() {

    }
}