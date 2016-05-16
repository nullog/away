package top.itmp.away.ui;

import android.app.Application;

import top.itmp.away.helper.PreferenceHelper;
import top.itmp.away.utils.Constants;
import top.itmp.away.utils.Log;
import top.itmp.rtbox.RtBox;

/**
 * Created by hz on 16/5/16.
 */
public class AwayApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        try {
            Log.d(Constants.TAG, "Setting workaround for AsyncTask...");
            Class.forName("android.os.AsyncTask");
        }catch (Exception e){
        }

        if(PreferenceHelper.getDebugEnabled(this)){
            Constants.DEBUG = true;
            Log.d(Constants.TAG, "Debug enabled!!");
            RtBox.DebugMode = Constants.DEBUG;
        }else {
            Constants.DEBUG = false;
            RtBox.DebugMode = Constants.DEBUG;
        }
    }
}
