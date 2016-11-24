package io.github.oyjt.mvp.presenter;

/**
 * Created by ouyang on 2016/4/22.
 */
public interface LoginPresenter {
    void attemptLogin(String email, String password);

    void onDestroy();
}
