package perfectproperties.vn.perfectpropertiesproject.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import perfectproperties.vn.perfectpropertiesproject.About.AboutActivity;
import perfectproperties.vn.perfectpropertiesproject.Exchange.ExchangeActivity;
import perfectproperties.vn.perfectpropertiesproject.R;
import perfectproperties.vn.perfectpropertiesproject.Rent.RentActivity;
import perfectproperties.vn.perfectpropertiesproject.Sale.SaleActivity;

/**
 * Created by lvant on 04/09/2016.
 */
public class HomePageFragment extends Fragment {

    public HomePageFragment() {
        // Required empty public constructor
    }

    Button btnSale;
    Button btnAbout;
    Button btnRent;
    Button btnExchange;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_homepage, container, false);

        addControls(view);
        addEvents(view);

        return view;
    }

    private void addControls(View view) {
        btnSale = (Button) view.findViewById(R.id.btnSale);
        btnAbout=(Button) view.findViewById(R.id.btnAbout);
        btnRent=(Button) view.findViewById(R.id.btnRent);
        btnExchange=(Button) view.findViewById(R.id.btnExchange);

    }

    private void addEvents(View view) {
        //Go to SaleActivity when click sale button
        btnSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SaleActivity.class);
                startActivity(intent);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),AboutActivity.class);
                startActivity(intent);
            }
        });

        btnExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),ExchangeActivity.class);
                startActivity(intent);
            }
        });

        btnRent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),RentActivity.class);
                startActivity(intent);
            }
        });
    }


}
