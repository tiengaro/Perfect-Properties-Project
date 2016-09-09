package perfectproperties.vn.perfectpropertiesproject.Main;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import perfectproperties.vn.perfectpropertiesproject.News.NewsFragment;
import perfectproperties.vn.perfectpropertiesproject.Partner.PartnerFragment;
import perfectproperties.vn.perfectpropertiesproject.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private TextView toolbar_title;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();

    }

    private void addControls() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar_title = (TextView) toolbar.findViewById(R.id.toolbar_title);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);

        fragmentManager = getSupportFragmentManager();

        loadSelection(R.id.nav_homepage);
    }

    private void addEvents() {
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case R.id.nav_my_account:
                loadSelection(id);
                break;
            case R.id.nav_homepage:
                loadSelection(id);
                break;
            case R.id.nav_news:
                loadSelection(id);
                break;
            case R.id.nav_partner:
                loadSelection(id);
                break;
            case R.id.nav_recruiment:
                loadSelection(id);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void loadSelection (int id){
        switch (id){
            case R.id.nav_my_account:
                toolbar_title.setText(R.string.my_account);
                fragmentTransaction = fragmentManager.beginTransaction();
                MyAccountFragment myAccountFragment = new MyAccountFragment();
                fragmentTransaction.replace(R.id.fragment_home_page, myAccountFragment).commit();
                break;
            case R.id.nav_homepage:
                toolbar_title.setText(R.string.homepage);
                fragmentTransaction = fragmentManager.beginTransaction();
                HomePageFragment homePageFragment = new HomePageFragment();
                fragmentTransaction.replace(R.id.fragment_home_page, homePageFragment).commit();
                break;
            case R.id.nav_news:
                toolbar_title.setText(R.string.news);
                fragmentTransaction = fragmentManager.beginTransaction();
                NewsFragment newsFragment = new NewsFragment();
                fragmentTransaction.replace(R.id.fragment_home_page, newsFragment).commit();
                break;
            case R.id.nav_partner:
                toolbar_title.setText(R.string.partner);
                fragmentTransaction = fragmentManager.beginTransaction();
                PartnerFragment partnerFragment = new PartnerFragment();
                fragmentTransaction.replace(R.id.fragment_home_page, partnerFragment).commit();
                break;
            case R.id.nav_recruiment:
                toolbar_title.setText(R.string.recruitment);
                fragmentTransaction = fragmentManager.beginTransaction();
                RecruitmentFragment recruitmentFragment = new RecruitmentFragment();
                fragmentTransaction.replace(R.id.fragment_home_page, recruitmentFragment).commit();
                break;
        }
    }
}
