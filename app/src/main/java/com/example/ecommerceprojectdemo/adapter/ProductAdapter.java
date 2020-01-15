package com.example.ecommerceprojectdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceprojectdemo.R;
import com.example.ecommerceprojectdemo.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {
        Context context;
        List<Product> productList;
        int layoutResource = R.layout.row_product_item;
        AdapterListener listener;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.titleText);
        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layoutResource,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Product product = productList.get(position);
        holder.image.setImageResource(product.getImageRes());
        holder.title.setText(product.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null){
                    listener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public void setAdapterListener(AdapterListener l){
        this.listener =l;
    }

  public interface AdapterListener{
        void onItemClick(int position);
    }

}
