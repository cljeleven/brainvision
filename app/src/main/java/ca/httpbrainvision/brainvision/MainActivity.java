package ca.httpbrainvision.brainvision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements custominterface {
    ImageView image;
    TextView itemname;
    TextView OriginalPrice;
    TextView DiscountPrice;
    TextView Percentage;
    TextView Units_and_quantity;
    TextView ExpiryDate;
    TextView CountOfViews;
    TextView Description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView)findViewById(R.id.main_image);
        itemname =(TextView)findViewById(R.id.main_item_name);
        OriginalPrice = (TextView)findViewById(R.id.main_item_OriginalPrice);
        DiscountPrice = (TextView)findViewById(R.id.main_item_DiscountPrice);
        Percentage = (TextView)findViewById(R.id.main_item_Percentage);;
        Units_and_quantity = (TextView)findViewById(R.id.main_item_Units_and_quantity);;
        ExpiryDate = (TextView)findViewById(R.id.main_item_ExpiryDate);;
        CountOfViews = (TextView)findViewById(R.id.main_item_CountOfViews);;
        Description = (TextView)findViewById(R.id.main_item_Description);;


        mainpresenter mp = new mainpresenter(this);
        mp.fetch_data("http://www.wincoredata.com/php/get_dealinfo.php?did=6&count=0");
    }


    @Override
    public void update_image(String url) {
        Picasso.with(this).load(url).into(image);
    }

    @Override
    public void update_itemname(String name) {
        itemname.setText(name);
    }

    @Override
    public void update_OriginalPrice(String OriginalPrice) {
        this.OriginalPrice.setText("before: $"+ OriginalPrice);
    }

    @Override
    public void update_DiscountPrice(String DiscountPrice) {
        this.DiscountPrice.setText("now: $"+DiscountPrice);
    }

    @Override
    public void update_Percentage(String Percentage) {
        this.Percentage.setText(Percentage+"% Off");
    }

    @Override
    public void update_Units_and_quantity(String Units,String quantity) {
        this.Units_and_quantity.setText(quantity+" "+Units);
    }

    @Override
    public void update_ExpiryDate(String ExpiryDate) {
        this.ExpiryDate.setText("ExpiryDate "+ExpiryDate);
    }

    @Override
    public void update_CountOfViews(String CountOfViews) {
        this.CountOfViews.setText(CountOfViews + " people viewed");
    }

    @Override
    public void update_Description(String Description) {
        this.Description.setText(Description);
    }

    @Override
    public void showerror(String s) {
        Toast.makeText(MainActivity.this, "error "+s, Toast.LENGTH_SHORT).show();
    }
}
