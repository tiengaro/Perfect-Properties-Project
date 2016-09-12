package perfectproperties.vn.perfectpropertiesproject.Splash;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import perfectproperties.vn.perfectpropertiesproject.Main.MainActivity;
import perfectproperties.vn.perfectpropertiesproject.R;

/**
 * Created by lvant on 01/09/2016.
 */

public class SplashScreen extends AppCompatActivity {

    protected int splashTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splashscreen);

        SplashScreenTask task = new SplashScreenTask();
        task.execute();
    }

    class SplashScreenTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //Set wait time 2
            splashTime = 2000;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            // Start MainActivity when finish time for
            Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
            SplashScreen.this.startActivity(mainIntent);
            SplashScreen.this.finish();
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            int waited = 0;
            while(waited <= splashTime){
                SystemClock.sleep(1000);
                waited += 1000;
            }
            return null;
        }
    }
}
