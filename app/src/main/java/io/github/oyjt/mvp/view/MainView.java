package io.github.oyjt.mvp.view;

import java.util.List;

/**
* Created by ouyang on 2016/11/24
*/

public interface MainView{
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}