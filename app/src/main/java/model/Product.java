package model;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.onlineclothingassignment.R;

public class Product extends AppCompatActivity {

    private int imageId;
    private String productname;
    private String productprice;
    private String productdescription;

    public Product(int imageId, String productname, String productprice, String productdescription) {
        this.imageId = imageId;
        this.productname = productname;
        this.productprice = productprice;
        this.productdescription = productdescription;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }
}
