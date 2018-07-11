package toong.com.androiddatabindingcomponent;

import android.databinding.BindingAdapter;
import android.databinding.adapters.ViewBindingAdapter;
import android.view.View;

public interface ViewBindingInterface {
    @BindingAdapter("android:paddingLeft")
    public void setPaddingLeft(View view, int padding);

    @BindingAdapter("android:onViewAttachedToWindow")
    public void setListener(View view, ViewBindingAdapter.OnViewAttachedToWindow attached);
}
