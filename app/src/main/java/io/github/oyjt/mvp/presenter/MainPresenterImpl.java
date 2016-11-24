package io.github.oyjt.mvp.presenter;


import java.util.List;

import io.github.oyjt.mvp.model.ItemModel;
import io.github.oyjt.mvp.model.ItemModelTmpl;
import io.github.oyjt.mvp.view.MainView;

/**
* Created by ouyang on 2016/11/24
*/

public class MainPresenterImpl implements MainPresenter,ItemModel.OnFinishedListener{
    private MainView mMainView;
    private ItemModel mItemModel;

    public MainPresenterImpl(MainView mainView) {
        mMainView = mainView;
        mItemModel = new ItemModelTmpl();
    }

    @Override
    public void onResume() {
        if (mMainView != null) {
            mMainView.showProgress();
        }

        mItemModel.getItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        if (mMainView != null) {
            mMainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        mMainView = null;
    }

    @Override
    public void onFinished(List<String> items) {
        if (mMainView != null) {
            mMainView.setItems(items);
            mMainView.hideProgress();
        }
    }

}