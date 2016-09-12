package perfectproperties.vn.perfectpropertiesproject.Sale;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import perfectproperties.vn.perfectpropertiesproject.Adapter.SaleAdapter;
import perfectproperties.vn.perfectpropertiesproject.Entity.SaleListData;
import perfectproperties.vn.perfectpropertiesproject.R;

public class SaleActivity extends AppCompatActivity {

    private TextView toolbar_title;
    private Toolbar  toolbar;
    private Button   btnDetailSale;
    private ListView lstSale;
    Context context = SaleActivity.this;

    ArrayList<SaleListData> myList = new ArrayList<SaleListData>();

    String[] title = new String[]{
            "Resort", "Land", "House", "Luxury",
            "Villa", "Land"
    };
    String[] desc = new String[]{
            "Good Value Consultancy", "Prashant Properties", "Yash Properties", "Best Deal Realtors",
            "RR Associates", "Anil Shegal"
    };
    int[] img = new int[]{
            R.drawable.house_demo, R.drawable.house_demo, R.drawable.house_demo, R.drawable.house_demo,
            R.drawable.house_demo, R.drawable.house_demo
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
        addControls();
        //addEvents();

        //find view id
        lstSale = (ListView) findViewById(R.id.lvCustomList);
        getDataInList();
        lstSale.setAdapter(new SaleAdapter(context, myList));


        lstSale.setClickable(true);
        lstSale.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Intent intentDetailForSale = new Intent(SaleActivity.this, DetailSaleActivity.class);
                startActivity(intentDetailForSale);
            }
        });
    }

    private void addControls() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar_title = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbar_title.setText("Sale");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

      //  btnDetailSale = (Button) findViewById(R.id.btnDetailSale);
    }

    private void addEvents() {
        btnDetailSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SaleActivity.this, DetailSaleActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
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

    //Set Data List
    private void getDataInList() {
        for (int i = 0; i < title.length; i++) {
            // Create a new object for each list item
            SaleListData ld = new SaleListData();
            ld.setTitle(title[i]);
            ld.setDescription(desc[i]);
            ld.setImgResId(img[i]);
            // Add this object into the ArrayList myList
            myList.add(ld);
        }
    }
}
