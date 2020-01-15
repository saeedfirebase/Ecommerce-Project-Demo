package com.example.ecommerceprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerceprojectdemo.model.Product;
import com.example.ecommerceprojectdemo.utils.Constants;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView  titleText;

    Product product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

       if (getIntent() != null && getIntent().hasExtra(Constants.PRODUCT)){

           product = getIntent().getParcelableExtra(Constants.PRODUCT);
       }

        imageView = findViewById(R.id.image);
        titleText = findViewById(R.id.titleText);

        updateLayout();
    }

    private  void updateLayout(){
        if(product != null) {
            imageView.setImageResource(product.getImageRes());
            titleText.setText(product.getTitle());
        }

    }
}
