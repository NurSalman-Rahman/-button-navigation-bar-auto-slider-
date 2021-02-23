package com.example.chipnavigation.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.chipnavigation.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    LinearLayout search,drugbyIndication,myvisitingCard,
            drugbyClass,history,drugbyGeneric,
            addDrug, prescription, job;

    ImageSlider imageSlider;

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        //declaration
        intFunction(root);


        //Lisener
        intListener();


        //Slider
        auto_imageSlider(root);




        return root;
    }





    private void auto_imageSlider(View root)
    {


        List<SlideModel> slideModels = new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.banner1));
        slideModels.add(new SlideModel(R.drawable.banner2));
        slideModels.add(new SlideModel(R.drawable.banner3));

        imageSlider.setImageList(slideModels,true);



    }


    private void intListener() {  //stat on intListener backet
        //Implement

        //Search


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Salman", "onClick: HAPPY CODEING ");

            }
        });




        //Drug by Indication
        drugbyIndication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, " Drug Indication Empty", Toast.LENGTH_SHORT).show();


            }
        });


        //My Visiting card


        myvisitingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, " Sorry! Please Wait ", Toast.LENGTH_SHORT).show();


            }
        });


        //Drug By Class

        drugbyClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Toast.makeText(MainActivity.this, " No Drag Class Add ", Toast.LENGTH_SHORT).show();


            }
        });


        //History

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, "  No History ", Toast.LENGTH_SHORT).show();


            }
        });


        //Drug by   Generic

        drugbyGeneric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Toast.makeText(MainActivity.this, " No Drug Generic ", Toast.LENGTH_SHORT).show();



            }
        });

        //Add Drug

        addDrug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Toast.makeText(MainActivity.this, " No Drug  Added", Toast.LENGTH_SHORT).show();




            }
        });




        //Prescription

        prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //  Toast.makeText(MainActivity.this, "There is no Prescription ", Toast.LENGTH_SHORT).show();



            }
        });



        //Job

        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Toast.makeText(MainActivity.this, " No Job  available", Toast.LENGTH_SHORT).show();

            }
        });



    } //End of  intListener  backet.



    private void intFunction(View root) {     //start on intFunction backet


        // Implement


        search =root.findViewById(R.id.search_layout);
        drugbyIndication =root.findViewById(R.id.drug_byIndicationLayout);
        myvisitingCard = root.findViewById(R.id.my_visitingCardLayout);
        drugbyClass = root.findViewById(R.id.drug_byClassLayout);
        history = root.findViewById(R.id.historyLayout);
        drugbyGeneric = root.findViewById(R.id.drug_byGenericLayout);
        addDrug = root.findViewById(R.id.add_drugLayout);
        prescription = root.findViewById(R.id.prescriptionLayout);
        job = root.findViewById(R.id.jobLayout);
        imageSlider = root.findViewById(R.id.sliderLayout);

    }    //End of intFunction backet



}