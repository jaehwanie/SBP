import static android.view.View.X;

import android.content.Context;
import android.view.View;

public class ClickAdapter implements View.OnClickListener {

    Context mContext;

    /**
     * 생성자
     * @param context
     */
    public ClickAdapter(Context context) {
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        // TODO: .. 진행해야함
        switch (v.getId()){
            

        }
    }

    private void writeUser() {

    }
}
