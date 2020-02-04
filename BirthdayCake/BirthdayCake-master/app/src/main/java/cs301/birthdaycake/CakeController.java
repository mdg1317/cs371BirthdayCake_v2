package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController {
    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cv){
        cakeView = cv;
        cakeModel = cakeView.getModel();
    }

    public void onClick(View v){
        Log.d("BlowOut", "Blow Out");
        cakeModel.isLit = false;
        cakeView.invalidate();
    }
}
