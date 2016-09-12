package perfectproperties.vn.perfectpropertiesproject.Sale;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import perfectproperties.vn.perfectpropertiesproject.R;
import perfectproperties.vn.perfectpropertiesproject.Rent.DetailForRentActivity;

public class DetailSaleActivity extends AppCompatActivity {

    private TextView toolbar_title;
    private Toolbar toolbar;
    private TextView txt_Desc;
    private Button btn_location;
    private Button btn_Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sale);
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
        addControls();
        addEvents();
    }
    private void addControls() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar_title = (TextView) toolbar.findViewById(R.id.toolbar_title);
        txt_Desc      = (TextView) findViewById(R.id.textview_Rent_DetailContent);
        btn_location  = (Button) findViewById(R.id.button_Rent_Location);
        btn_Email     = (Button) findViewById(R.id.button_Rent_Email);
        btn_Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto: dungn@.com"));
                startActivity(Intent.createChooser(emailIntent, "Information Land"));
            }
        });

        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLocationForSale = new Intent(DetailSaleActivity.this, LocationSaleActivity.class);
                startActivity(intentLocationForSale);
            }
        });


        txt_Desc.setText("“Verde” có nghĩa là xanh ngát trong tiếng Tây Ban Nha, Vista Verde được thiết kế như một vườm ươm xanh mát, nhằm đem lại cho cư dân cảm giác đang nghe bản giao hưởng của thiên nhiên.\n" +
                "\n" +
                "Nằm ở vị trí chiến lược giữa khu hành chính Quận 2 và chỉ mất năm phút là tiếp cận được với những tiện ích cần thiết như siêu thị Metro, khu mua sắm Parkson, rạp xem phim Lotte Cinema, bệnh viện Phúc An Khang và nhiều trường học quốc tế uy tín như ACG International School. Vista Verde cũng chỉ cách các quận lân cận như Quận 7, quận 1 có mười phút rất tiện lợi nhờ hầm Thủ Thiêm, cầu Thủ Thiêm, cầu Sài Gòn và cầu Phú Mỹ. Dự án được lên kế hoạch sẽ hoàn thiện vào giữa năm 2017.\n" +
                "\n" +
                "Vista Verde cung cấp cho cư dân nhiều tiện ích vượt trội như phòng tập gym có tầm nhìn 360°, hồ bơi sang trọng như resort, ghế thư giãn, trảng cỏ chạy bộ, và sân tennis. Ngoài ra, tầng trệt được thiết kế như một thị trấn mua sắm sẽ cho cư dân nhiều tiện lợi với nhiều cửa hàng thông dụng. Vista Verde có hơn 30 kiểu căn hộ được thiết kế hoàn chỉnh, bao gồm những căn hộ đặc biệt như căn hộ thông tầng (duplex) và những căn hộ với nhiều không gian riêng tư ngăn cách. Vì chúng tôi thiết kế cho môi trường sống hiện đại, nên các kiểu căn hộ đều có phòng khách và phòng ăn rộng rãi, gió trời thông thoáng và có ban-công với tầm nhìn đẹp.");

        toolbar_title.setText("Detail Sale");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
    }

    private void addEvents() {
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

}
