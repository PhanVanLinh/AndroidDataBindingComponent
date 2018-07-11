package toong.com.androiddatabindingcomponent;

import android.databinding.BindingAdapter;
import android.widget.TextView;

public interface TextViewBindingInterface {
    @BindingAdapter({"bind:font"})
      void setFont(TextView textView, String fontName);
}