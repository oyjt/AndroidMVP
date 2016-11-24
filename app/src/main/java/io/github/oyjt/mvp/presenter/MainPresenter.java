package io.github.oyjt.mvp.presenter;

/**
 * Created by ouyang on 2016/4/22.
 */
public interface MainPresenter {
    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
