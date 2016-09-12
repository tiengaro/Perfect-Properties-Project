package perfectproperties.vn.perfectpropertiesproject.Main;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import perfectproperties.vn.perfectpropertiesproject.Entity.SaleListData;
import perfectproperties.vn.perfectpropertiesproject.R;

/**
 * Created by DungNguyen on 9/8/16.
 */
public class CheckFragment  extends android.support.v4.app.Fragment {

    private TextView txt_title ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check, container, false);

        txt_title = (TextView) view.findViewById(R.id.txt_test);
        Intent intent = getActivity().getIntent();
        Bundle bundle = this.getArguments();
        SaleListData saledata = (SaleListData) bundle.getSerializable("Dungn");
        Toast.makeText(getActivity(), ""  + saledata.getTitle(), Toast.LENGTH_SHORT).show();
        txt_title.setText(saledata.getTitle());
        return view;
    }

    private void addView (View view) {

    }

    public CheckFragment() {
        // Required empty public constructor
    }

}
