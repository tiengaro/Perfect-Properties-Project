package perfectproperties.vn.perfectpropertiesproject.Partner;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import perfectproperties.vn.perfectpropertiesproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PartnerFragment extends Fragment {

    Button  btnDetailPartner;

    public PartnerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_partner, container, false);
        addControls(view);
        addEvents(view);
        return view;
    }

    private void addControls(View view) {
        btnDetailPartner = (Button) view.findViewById(R.id.btnDetailPartner);
    }

    private void addEvents(View view) {
        btnDetailPartner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetailPartner = new Intent(getActivity(), DetailPartnerActivity.class);
                startActivity(intentDetailPartner);
            }
        });
    }

}
