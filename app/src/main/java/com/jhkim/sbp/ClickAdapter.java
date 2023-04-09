package com.jhkim.sbp;

import static android.view.View.X;

import android.content.Context;
import android.util.Log;
import android.view.View;

public class ClickAdapter implements View.OnClickListener {

    Context mContext;


    /**
     * 생성자
     *
     * @param context
     */
    public ClickAdapter(Context context) {
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        // TODO: ..
        switch (v.getId()) {
            case R.id.readBtn:
                Log.d("CASE R.id.readBtn", "R.id.readBtn");
                break;
        }
    }

    private void writeUser() {

    }
}
