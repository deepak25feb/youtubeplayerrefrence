package com.example.testcase1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
//frag 1
public class fragment1 extends Fragment {
    List<Model> list;
    int resId;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag1,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView listview = getActivity().findViewById(R.id.listview);
        list = new ArrayList<>();
        additionoflist();
//        list.add(new Model("SUBJECT 1",R.drawable.ic_check_black));
//        list.add(new Model("SUBJECT 2",R.drawable.ic_check_black));
//        list.add(new Model("SUBJECT 3",R.drawable.ic_check_black));
//        list.add(new Model("SUBJECT 4",R.drawable.ic_check_black));
//        list.add(new Model("SUBJECT 5",R.drawable.ic_check_black));
        Adapter adapter = new Adapter(getActivity(),0,list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    fraginfo frag = new fraginfo();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,frag).addToBackStack("one").commit();
                }

            }
        });

    }


    void additionoflist(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("IMAGEDATA", Context.MODE_PRIVATE);
        int image1 = sharedPreferences.getInt("IMAGE 1",R.drawable.ic_check_green);
        int image2 = sharedPreferences.getInt("IMAGE 2",R.drawable.ic_check_green);
        int image3 = sharedPreferences.getInt("IMAGE 3",R.drawable.ic_check_green);
        int image4 = sharedPreferences.getInt("IMAGE 4",R.drawable.ic_check_green);
        int image5 = sharedPreferences.getInt("IMAGE 5",R.drawable.ic_check_green);
        list.add(new Model("SUBJECT 1",image1));
        list.add(new Model("SUBJECT 2",image2));
        list.add(new Model("SUBJECT 3",image3));
        list.add(new Model("SUBJECT 4",image4));
        list.add(new Model("SUBJECT 5",image5));
    }

}
