package com.example.hardwareee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MeowNavigation extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    RelativeLayout tool_layout, notification_layout, home_layout, order_layout, profile_layout, main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meow_navigation);

        tool_layout = findViewById(R.id.tool_layout);
        notification_layout = findViewById(R.id.notifcation_layout);
        home_layout = findViewById(R.id.home_layout);
        order_layout = findViewById(R.id.order_layout);
        profile_layout = findViewById(R.id.profile_layout);
        main_layout = findViewById(R.id.main_layout);

        tool_layout.setVisibility(View.GONE);
        notification_layout.setVisibility(View.GONE);
        home_layout.setVisibility(View.VISIBLE);
        order_layout.setVisibility(View.GONE);
        profile_layout.setVisibility(View.GONE);




        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.show(3, true); //This is for Default Layout

        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.baseline_build_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.baseline_notifications_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.baseline_shopping_navbar_cart_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.baseline_person_24));


        meownavigation();
        //main_layout.setBackgroundColor(Color.parseColor("#E8977D"));


    }// ==================On Create End ====================

    private void meownavigation(){

        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){
                    case 1:

                        tool_layout.setVisibility(View.VISIBLE);
                        notification_layout.setVisibility(View.GONE);
                        home_layout.setVisibility(View.GONE);
                        order_layout.setVisibility(View.GONE);
                        profile_layout.setVisibility(View.GONE);

                        main_layout.setBackgroundColor(Color.parseColor("#E8977D"));

                        break;

                    case 2:

                        tool_layout.setVisibility(View.GONE);
                        notification_layout.setVisibility(View.VISIBLE);
                        home_layout.setVisibility(View.GONE);
                        order_layout.setVisibility(View.GONE);
                        profile_layout.setVisibility(View.GONE);

                        main_layout.setBackgroundColor(Color.parseColor("#E1D676"));

                        break;

                    case 3:

                        tool_layout.setVisibility(View.GONE);
                        notification_layout.setVisibility(View.GONE);
                        home_layout.setVisibility(View.VISIBLE);
                        order_layout.setVisibility(View.GONE);
                        profile_layout.setVisibility(View.GONE);

                        main_layout.setBackgroundColor(Color.parseColor("#9AC695"));

                        break;

                    case 4:

                        tool_layout.setVisibility(View.GONE);
                        notification_layout.setVisibility(View.GONE);
                        home_layout.setVisibility(View.GONE);
                        order_layout.setVisibility(View.VISIBLE);
                        profile_layout.setVisibility(View.GONE);

                        main_layout.setBackgroundColor(Color.parseColor("#E64BBA"));

                        break;

                    case 5:

                        tool_layout.setVisibility(View.GONE);
                        notification_layout.setVisibility(View.GONE);
                        home_layout.setVisibility(View.VISIBLE);
                        order_layout.setVisibility(View.GONE);
                        profile_layout.setVisibility(View.VISIBLE);

                        main_layout.setBackgroundColor(Color.parseColor("#CC0041"));

                        break;

                }

                return null;
            }
        });
    }

}// ===================== Code End =========================