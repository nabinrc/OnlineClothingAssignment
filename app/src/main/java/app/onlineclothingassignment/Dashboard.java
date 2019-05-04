package app.onlineclothingassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import adapter.ProductAdapter;
import de.hdodenhof.circleimageview.CircleImageView;
import model.Product;




public class Dashboard extends AppCompatActivity {
    private RecyclerView recyclerView;
    Button btnAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.recyclerView);
        btnAddItem = findViewById(R.id.btnAddItem);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(R.drawable.shirt, "shirt", "Rs 100", "white color very comfort"));
        productList.add(new Product(R.drawable.shoe, "shoe", "Rs 500", "nike shoe"));
        productList.add(new Product(R.drawable.jacket, "jacket", "Rs 1000", "very productive and good"));


        ProductAdapter productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Dashboard.this,AddItemActivity.class);
                startActivity(intent);
            }
        });
    }
}
