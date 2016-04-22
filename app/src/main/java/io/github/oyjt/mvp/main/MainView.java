package io.github.oyjt.mvp.main;

import java.util.List;

/**
 * Created by ouyang on 2016/4/22.
 */
public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
