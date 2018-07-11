package toong.com.androiddatabindingcomponent;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public interface ImageViewBindingInterface {
    @BindingAdapter({"bind:imageUrl", "bind:error"})
    public  void loadImage(ImageView view, String url, Drawable error);
}