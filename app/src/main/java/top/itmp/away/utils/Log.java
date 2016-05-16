package top.itmp.away.utils;

/**
 * Created by hz on 16/5/16.
 */
public final class Log {

    public static void v(String tag, String msg){
        if(Constants.DEBUG){
            android.util.Log.v(tag, msg);
        }
    }

    public static void v(String tag, String msg, Throwable tr){
        if(Constants.DEBUG){
            android.util.Log.v(tag, msg, tr);
        }
    }

    public static void d(String tag, String msg){
        if(Constants.DEBUG){
            android.util.Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable tr){
        if(Constants.DEBUG){
            android.util.Log.d(tag, msg, tr);
        }
    }

    public static void i(String tag, String msg){
        if(Constants.DEBUG) {
            android.util.Log.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Throwable tr){
        if(Constants.DEBUG){
            android.util.Log.i(tag, msg, tr);
        }
    }

    public static void w(String tag, String msg){
        android.util.Log.w(tag, msg);
    }

    public static void w(String tag, String msg, Throwable tr){
        android.util.Log.w(tag, msg, tr);
    }

    public static void w(String tag, Throwable tr){
        android.util.Log.w(tag, tr);
    }

    public static void e(String tag, String msg){
        android.util.Log.d(tag, msg);
    }

    public static void e(String tag, String msg, Throwable tr){
        android.util.Log.e(tag, msg, tr);
    }
}
