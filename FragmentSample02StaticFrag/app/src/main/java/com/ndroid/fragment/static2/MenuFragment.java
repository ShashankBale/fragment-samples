package com.ndroid.fragment.static2;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MenuFragment extends ListFragment {

    String[] AndroidOS = new String[]{"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "Android 10"};
    String[] Version = new String[]{"1.5", "1.6", "2.0-2.1", "2.2", "2.3", "3.0-3.2", "4.0", "4.1-4.3", "4.4", "5.0 – 5.1.1", "6.0 – 6.0.1", "7.0 – 7.1.2", "8.0 – 8.1", "9.0", "10.0"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                                                          android.R.layout.simple_list_item_1,
                                                          AndroidOS);
        setListAdapter(adapter);

        return view;

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        TextFragment txt = (TextFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(AndroidOS[position], "Version : " + Version[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}