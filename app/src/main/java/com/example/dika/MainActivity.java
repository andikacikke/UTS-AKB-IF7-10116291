package com.example.dika;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/** Created on 5/20/2019 by Andika IF7
 */

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablelayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        // menambah fragment

        adapter.AddFragment(new Profil(), "");
        adapter.AddFragment(new Contact(), "");
        adapter.AddFragment(new list(), "");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_person);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_assignment);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_person_add);


    }

    public void OpenIg(View view) {
        String url = "https://instagram.com/andikacikke?igshid=yb2tlmbf6vop";
        Intent bukaIg = new Intent(Intent.ACTION_VIEW);
        bukaIg.setData(Uri.parse(url));
        startActivity(bukaIg);
    }

    public void OpenFb(View view) {
        String url = "https://www.facebook.com/andi.z.jr";
        Intent bukaFb = new Intent(Intent.ACTION_VIEW);
        bukaFb.setData(Uri.parse(url));
        startActivity(bukaFb);
    }
    public void SendMa(View view) {
        String url = "mailto:andikadirgantara1@gmail.com";
        Intent SendMa = new Intent(Intent.ACTION_VIEW);
        SendMa.setData(Uri.parse(url));
        startActivity(SendMa);

    }
    public void Call(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:082291657642"));
        startActivity(intent);
    }
}