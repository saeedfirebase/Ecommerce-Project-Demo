package com.example.ecommerceprojectdemo;

import android.os.Bundle;

import com.example.ecommerceprojectdemo.adapter.ProductAdapter;
import com.example.ecommerceprojectdemo.fragment.SectionPagerAdapter;
import com.example.ecommerceprojectdemo.model.Product;
import com.example.ecommerceprojectdemo.utils.DataGenerator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {
 // RecyclerView recyclerView;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        //recyclerView.findViewById(R.id.recycleViewId);

      tabLayout = findViewById(R.id.tabLayout);
       viewPager = findViewById(R.id.viewpager);

        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
//        recyclerView.setLayoutManager(layoutManager);
//
//        List<Product> productList = DataGenerator.getProducts();
//        ProductAdapter adapter1 = new ProductAdapter(this,productList);
//        recyclerView.setAdapter(adapter1);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

}
