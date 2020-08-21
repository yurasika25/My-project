package ru.startandroid.develop.firstproject.ui.mvp;

import java.lang.ref.WeakReference;

public abstract class BasicPresenter <V extends  BasicView> {

    private WeakReference<V> view = null;

    private void bindView(V view)
    {
        this.view =new  WeakReference<V>(view);
    }

    private void unbindView()
    {
        this.view =null;
    }

    protected void onEnterScope(){}

    protected void onExitScope(){}

    protected V getView() {
        return view.get();
    }

    public void enterWithView(V v){
        bindView(v);
        onEnterScope();
    }

    public void exitFromView()
    {
        onExitScope();
        unbindView();
    }
}
