package com.example.menu1;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class galeria extends Fragment implements View.OnClickListener {
ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_galeria, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.linearLayout);
        imageView = (ImageView) view.findViewById(R.id.imageView);
        for (int i=0; i<6; i++) {
            ImageView localView = new ImageView(getActivity());
            localView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
            localView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int resID = getResources().getIdentifier("r"+i, "drawable", getActivity().getPackageName());
            localView.setImageResource(resID);
            localView.setOnClickListener(this);
            linearLayout.addView(localView);
        }
        return view;
    }

    public void onClick(View view) {
        ImageView localView = (ImageView) view;
        imageView.setImageDrawable(localView.getDrawable());
    }
}
