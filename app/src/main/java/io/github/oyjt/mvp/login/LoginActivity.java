package io.github.oyjt.mvp.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import io.github.oyjt.mvp.R;
import io.github.oyjt.mvp.main.MainActivity;

/**
 * Created by ouyang on 2016/4/22.
 */
public class LoginActivity extends AppCompatActivity implements LoginView,View.OnClickListener {

    private EditText mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        mEmailView = (EditText) findViewById(R.id.email);
        mPasswordView = (EditText) findViewById(R.id.password);
        mProgressView = findViewById(R.id.login_progress);
        findViewById(R.id.email_sign_in_button).setOnClickListener(this);

        mLoginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    protected void onDestroy() {
        mLoginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {
        mProgressView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressView.setVisibility(View.GONE);
    }

    @Override
    public void setEmailError() {
        mEmailView.setError(getString(R.string.error_invalid_email));
    }

    @Override
    public void setPasswordError() {
        mPasswordView.setError(getString(R.string.error_invalid_password));
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        mLoginPresenter.attemptLogin(mEmailView.getText().toString(), mPasswordView.getText().toString());
    }
}
