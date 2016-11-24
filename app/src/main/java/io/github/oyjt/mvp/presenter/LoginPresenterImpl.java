package io.github.oyjt.mvp.presenter;

import io.github.oyjt.mvp.model.LoginModel;
import io.github.oyjt.mvp.model.LoginModelImpl;
import io.github.oyjt.mvp.view.LoginView;

/**
 * Created by ouyang on 2016/11/24
 */
public class LoginPresenterImpl implements LoginPresenter, LoginModel.OnLoginFinishedListener {
    private LoginView mLoginView;
    private LoginModel mLoginModel;

    public LoginPresenterImpl(LoginView loginView) {
        mLoginView = loginView;
        mLoginModel = new LoginModelImpl();
    }

    @Override
    public void attemptLogin(String email, String password) {
        if (mLoginView != null) {
            mLoginView.showProgress();
        }

        mLoginModel.login(email, password, this);
    }

    @Override
    public void onDestroy() {
        mLoginView = null;
    }

    @Override
    public void onEmailError() {
        if (mLoginView != null) {
            mLoginView.setEmailError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.setPasswordError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (mLoginView != null) {
            mLoginView.navigateToHome();
        }
    }
}