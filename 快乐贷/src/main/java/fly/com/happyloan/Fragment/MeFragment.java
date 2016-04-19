package fly.com.happyloan.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import fly.com.happyloan.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {


    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter adapter;
    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        init();
        ListView list_me = (ListView) view.findViewById(R.id.list_me);
        adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,list);
        list_me.setAdapter(adapter);
        return view;
    }
    private void init(){
        list.clear();
        for (int i = 0 ; i < 10 ; i++){
            list.add("我"+i);
        }
    }

}
