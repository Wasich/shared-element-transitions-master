package com.mikescamell.sharedelementtransitions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mikescamell.sharedelementtransitions.flash_fix.programmatic_activity.FlashFixProgrammaticActivityA;
import com.mikescamell.sharedelementtransitions.flash_fix.xml_activity.FlashFixXmlActivityA;
import com.mikescamell.sharedelementtransitions.glide_activity_to_activity.GlideActivityA;
import com.mikescamell.sharedelementtransitions.glide_fragment_to_fragment.GlideFragmentToFragmentActivity;
import com.mikescamell.sharedelementtransitions.picasso_activity_to_activity.PicassoActivityA;
import com.mikescamell.sharedelementtransitions.picasso_fragment_to_fragment.PicassoFragmentToFragmentActivity;
import com.mikescamell.sharedelementtransitions.recycler_view.recycler_view_to_fragment.RecyclerViewToFragmentActivity;
import com.mikescamell.sharedelementtransitions.recycler_view.recycler_view_to_viewpager.RecyclerViewToViewPagerActivity;
import com.mikescamell.sharedelementtransitions.simple_activity_to_activity.SimpleActivityA;
import com.mikescamell.sharedelementtransitions.simple_fragment_to_fragment.FragmentToFragmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button recyclerViewToFragmentBtn = (Button) findViewById(R.id.recycler_view_to_fragment_btn);
        recyclerViewToFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecyclerViewToFragmentActivity.class));
            }
        });


    }

    @Override
    public void onBackPressed() {
        getSupportFragmentManager().popBackStack();
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            super.onBackPressed();
        }
    }
}
