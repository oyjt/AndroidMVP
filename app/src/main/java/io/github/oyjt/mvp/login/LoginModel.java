package io.github.oyjt.mvp.login;

/**
 * Created by ouyang on 2016/4/22.
 */
public interface LoginModel {

    interface OnLoginFinishedListener {
        void onEmailError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String email, String password, OnLoginFinishedListener listener);
}
