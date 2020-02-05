package com.example.menu1;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class aktualnosci extends Fragment implements View.OnClickListener {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_aktualnosci, container, false);

        ImageView spotkanieImg = (ImageView) view.findViewById(R.id.spotkanieImg);
        spotkanieImg.setOnClickListener(this);

        TextView spotkanieTxt = (TextView) view.findViewById((R.id.spotkanieTxt));
        spotkanieTxt.setOnClickListener(this);

        ImageView babelkiImg = (ImageView) view.findViewById(R.id.babelkiImg);
        babelkiImg.setOnClickListener(this);

        TextView babelkiTxt = (TextView) view.findViewById((R.id.babelkiTxt));
        babelkiTxt.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotkanieImg:
            case R.id.spotkanieTxt:
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.Fragment_container, new aktualnosc1());
                fr.addToBackStack(null);
                fr.commit();
                break;

            case R.id.babelkiImg:
            case R.id.babelkiTxt:
                FragmentTransaction fr2 = getFragmentManager().beginTransaction();
                fr2.replace(R.id.Fragment_container, new aktualnosc2());
                fr2.addToBackStack(null);
                fr2.commit();
                break;
        }
    }
}
