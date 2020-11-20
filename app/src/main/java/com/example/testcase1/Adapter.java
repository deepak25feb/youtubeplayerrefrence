package com.example.testcase1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<Model> {

    public Adapter(@NonNull Context context, int resource, @NonNull List<Model> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.inflation, parent, false);
        }

        Model model = getItem(position);
        ImageView image = listItemView.findViewById(R.id.image);
        TextView textView = listItemView.findViewById(R.id.text);
        ImageView imagecheck = listItemView.findViewById(R.id.buttoncheck);

        imagecheck.setImageResource(model.getImgResId());
        textView.setText(model.getTitle());

        return listItemView;
    }
}
