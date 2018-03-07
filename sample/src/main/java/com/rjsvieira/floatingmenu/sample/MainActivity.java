package com.rjsvieira.floatingmenu.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;

import rjsv.floatingmenu.animation.enumerators.AnimationType;
import rjsv.floatingmenu.floatingmenubutton.FloatingMenuButton;
import rjsv.floatingmenu.floatingmenubutton.MovementStyle;
import rjsv.floatingmenu.floatingmenubutton.subbutton.FloatingSubButton;

public class MainActivity extends Activity {

    FloatingMenuButton fab_1;
    FloatingMenuButton fab_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
    }

    private void initUi() {
        fab_1 = (FloatingMenuButton) findViewById(R.id.fab_1);
        fab_1.setStartAngle(0)
                .setEndAngle(360)
                .setRadius(200)
                .setAnimationType(AnimationType.EXPAND)
                .setMovementStyle(MovementStyle.STICKED_TO_SIDES)
                .setBackgroundWithIcon(R.drawable.circle_background, R.drawable.one)
                .setStickedToSidesPadding(10);

        fab_1.getAnimationHandler()
                .setOpeningAnimationDuration(500)
                .setClosingAnimationDuration(200)
                .setLagBetweenItems(0)
                .setOpeningInterpolator(new FastOutSlowInInterpolator())
                .setClosingInterpolator(new FastOutLinearInInterpolator())
                .shouldFade(true)
                .shouldScale(true)
                .shouldRotate(false);

        fab_2 = (FloatingMenuButton) findViewById(R.id.fab_2);
        fab_2.setStartAngle(0)
                .setEndAngle(360)
                .setRadius(200)
                .setTransparentAfterMilliseconds(0)
                .setAnimationType(AnimationType.EXPAND)
                .setMovementStyle(MovementStyle.STICKED_TO_SIDES);

        fab_2.getAnimationHandler()
                .setOpeningAnimationDuration(500)
                .setClosingAnimationDuration(200)
                .setLagBetweenItems(0)
                .setOpeningInterpolator(new FastOutSlowInInterpolator())
                .setClosingInterpolator(new FastOutLinearInInterpolator())
                .shouldFade(true)
                .shouldScale(true)
                .shouldRotate(false);

        FloatingSubButton floatingSubButton = new FloatingSubButton(this);
        floatingSubButton.setBackgroundWithIcon(R.drawable.circle_background, R.drawable.three);

        fab_1.addFloatingSubButton(floatingSubButton);

    }
}
