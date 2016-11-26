package io.github.oyjt.mvp.model;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;

import io.github.oyjt.mvp.model.ItemModel;

/**
 * Created by ouyang on 2016/4/22.
 */
public class ItemModelImpl implements ItemModel {
    @Override
    public void getItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);
    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        );
    }
}
