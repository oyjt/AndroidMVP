package io.github.oyjt.mvp.model;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by ouyang on 2016/11/24
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(final String email, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(email)) {
                    listener.onEmailError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}