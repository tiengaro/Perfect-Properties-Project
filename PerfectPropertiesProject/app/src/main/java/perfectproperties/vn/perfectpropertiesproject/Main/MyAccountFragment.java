package perfectproperties.vn.perfectpropertiesproject.Main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import perfectproperties.vn.perfectpropertiesproject.Entity.SaleListData;
import perfectproperties.vn.perfectpropertiesproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyAccountFragment extends Fragment {

    private Button btn_check;

    ArrayList<SaleListData> myList = new ArrayList<SaleListData>();

    String[] title = new String[]{
            "Title 1", "Title 2", "Title 3", "Title 4",
            "Title 5", "Title 6", "Title 7", "Title 8"
    };
    String[] desc = new String[]{
            "Desc 1", "Desc 2", "Desc 3", "Desc 4",
            "Desc 5", "Desc 6", "Desc 7", "Desc 8"
    };
    int[] img = new int[]{
            R.drawable.splashscreen_logo, R.drawable.splashscreen_logo, R.drawable.splashscreen_logo, R.drawable.splashscreen_logo,
            R.drawable.splashscreen_logo, R.drawable.splashscreen_logo, R.drawable.splashscreen_logo, R.drawable.splashscreen_logo
    };


    public MyAccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDataInList();
        View view = inflater.inflate(R.layout.fragment_my_account, container, false);
        addControls(view);
        return view;

    }

    //Add Action for UI
    private void addControls(View view) {
        btn_check = (Button) view.findViewById(R.id.btn_check);
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaleListData data = myList.get(2);
                CheckFragment fragment_Check = new CheckFragment();
                Bundle arguments = new Bundle();
                arguments.putSerializable("Dungn",data);
                fragment_Check.setArguments(arguments);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_home_page, fragment_Check);
                fragmentTransaction.commit();
            }
        });
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
