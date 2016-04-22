package io.github.oyjt.mvp.main;

import java.util.List;

/**
 * Created by ouyang on 2016/4/22.
 */
public interface ItemModel {
    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void getItems(OnFinishedListener listener);
}
