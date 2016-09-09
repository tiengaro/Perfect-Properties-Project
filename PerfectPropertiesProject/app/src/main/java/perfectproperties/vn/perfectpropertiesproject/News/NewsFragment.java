package perfectproperties.vn.perfectpropertiesproject.News;


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
public class NewsFragment extends Fragment {

    private Button btnDetailForNews;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        addControls(view);
        addEvents(view);

        return view;
    }

    private void addControls(View view) {
        btnDetailForNews = (Button) view.findViewById(R.id.btnDetailForNews);
    }

    private void addEvents(View view) {
        btnDetailForNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetailForNews = new Intent(getActivity(), DetailForNewsActivity.class);
                startActivity(intentDetailForNews);
            }
        });
    }

}
