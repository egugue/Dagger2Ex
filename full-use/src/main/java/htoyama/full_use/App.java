package htoyama.full_use;

import android.app.Application;
import android.content.Context;

public class App extends Application{

    public static App with(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }


}
