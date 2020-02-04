package cs301.birthdaycake;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private CakeView cakeView;
   private CakeController cakeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        cakeView = findViewById(R.id.cakeview);
        cakeController = new CakeController(cakeView);

        View blowOut = findViewById(R.id.BlowOut);
        blowOut.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                cakeController.onClick(view);
            }
        });

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
