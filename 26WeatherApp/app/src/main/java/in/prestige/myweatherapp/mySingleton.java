package in.prestige.myweatherapp;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class mySingleton {
    private static mySingleton mInstance;
    private RequestQueue requestQueue;
    private static Context mCtx;

    private mySingleton(Context context) {
        mCtx = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized mySingleton getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new mySingleton(context);
        }
        return mInstance;
    }

    public void addToRequestQue(Request request) {
        requestQueue.add(request);
    }
}
