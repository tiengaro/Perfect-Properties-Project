package perfectproperties.vn.perfectpropertiesproject.About;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import perfectproperties.vn.perfectpropertiesproject.R;

public class AboutActivity extends AppCompatActivity {

    private TextView toolbar_title;
    private Toolbar  toolbar;
    //Dungn
    private WebView  wb_about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
        addControls();

        wb_about = (WebView) findViewById(R.id.activity_about_webview);
        wb_about.getSettings().setJavaScriptEnabled(true);
        wb_about.loadUrl("http://www.perfectproperties.vn/gioi-thieu/lich-su-phat-trien.html");
    }

    //Add Controls Toolbar
    private void addControls() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar_title = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbar_title.setText("About Us");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            //Back Form
            onBackPressed();
            return true;
        }
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
    }

}
