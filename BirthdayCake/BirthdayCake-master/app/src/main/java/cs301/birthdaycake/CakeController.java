package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener{
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

    public void onCheckedChanged(CompoundButton button, boolean isChecked){
        if(isChecked){
            cakeModel.hasCandles = true;
            cakeView.invalidate();
            cakeModel.isLit = true;
        } else {
            cakeModel.hasCandles = false;
            cakeView.invalidate();
            cakeModel.isLit = true;
        }
    }
}
