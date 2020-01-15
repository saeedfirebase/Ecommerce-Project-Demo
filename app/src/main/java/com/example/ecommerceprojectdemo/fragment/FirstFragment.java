package com.example.ecommerceprojectdemo.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ecommerceprojectdemo.DetailsActivity;
import com.example.ecommerceprojectdemo.MainActivity;
import com.example.ecommerceprojectdemo.R;
import com.example.ecommerceprojectdemo.adapter.ProductAdapter;
import com.example.ecommerceprojectdemo.model.Product;
import com.example.ecommerceprojectdemo.utils.Constants;
import com.example.ecommerceprojectdemo.utils.DataGenerator;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    RecyclerView recyclerView;

    public FirstFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        recyclerView = view.findViewById(R.id.recycleViewId);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();


    }

    private void init() {
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        final List<Product> productList = DataGenerator.getProducts();
        ProductAdapter adapter = new ProductAdapter(getActivity(), productList);
        recyclerView.setAdapter(adapter);


      //Listener Added
        adapter.setAdapterListener(new ProductAdapter.AdapterListener() {
            @Override
            public void onItemClick(int position) {
                Product product = productList.get(position);
                //Toast.makeText(getActivity(), "Clicked "+product.getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra(Constants.PRODUCT,product);
                startActivity(intent);
            }
        });
      // Listener Added end
    }

}
