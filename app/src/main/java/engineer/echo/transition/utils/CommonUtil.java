package engineer.echo.transition.utils;

import android.util.DisplayMetrics;

import engineer.echo.transition.App;

/**
 * AppCtrlFragment
 * Created by Plucky<plucky@echo.engineer> on 2018/1/3 - 17:28
 * more about me: http://www.1991th.com
 */

public class CommonUtil {
    public static float dip2px(float pDipValue) {
        DisplayMetrics dm = App.getApp().getResources().getDisplayMetrics();
        return pDipValue * dm.density;
    }
}