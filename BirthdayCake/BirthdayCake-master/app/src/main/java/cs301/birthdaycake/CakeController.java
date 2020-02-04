package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener {
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

    public void onChecked(CompoundButton button, boolean isChecked){
        if(isChecked){
            cakeModel.hasCandles = true;
            cakeView.invalidate();
        } else {
            cakeModel.hasCandles = false;
            cakeView.invalidate();
        }
    }
}
