package io.github.oyjt.mvp.login;

/**
 * Created by ouyang on 2016/4/22.
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setEmailError();

    void setPasswordError();

    void navigateToHome();
}
