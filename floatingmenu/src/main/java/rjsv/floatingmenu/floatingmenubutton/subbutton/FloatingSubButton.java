package rjsv.floatingmenu.floatingmenubutton.subbutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FloatingSubButton extends FrameLayout {

    public FloatingSubButton(Context context) {
        this(context, null);
    }

    public FloatingSubButton(Context context, AttributeSet attr) {
        super(context, attr);
    }

    @Override
    public void setBackground(Drawable background) {
        super.setBackground(background);
    }

    /**
     * Set the background and icon of the button
     *
     * @param background Resource ID
     * @param icon       Resource ID
     */
    public void setBackgroundWithIcon(int background, int icon) {
        Drawable drawableBackground = getResources().getDrawable(background);
        Drawable drawableIcon = getResources().getDrawable(icon);

        setBackgroundWithIcon(drawableBackground, drawableIcon);
    }

    /**
     * Set the background and icon of the button
     */
    public void setBackgroundWithIcon(Drawable background, Drawable icon) {
        setBackground(getLayerDrawable(background, icon));
    }
    // General Methods

    /**
     * Combine two drawables into one
     *
     * @return a combination of the images
     */
    private LayerDrawable getLayerDrawable(Drawable... image) {
        return new LayerDrawable(image);
    }
}
