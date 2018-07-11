package toong.com.androiddatabindingcomponent;

import android.databinding.BindingAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @BindingAdapter("paddingRightCustom")
    public static void paddingRightCustom(View view, int padding){

    }
}
