package ca.httpbrainvision.brainvision;

/**
 * Created by Jesse on 2016-10-03.
 */
public interface custominterface {

    public void update_image(String url);
    public void update_itemname(String name);
    public void update_OriginalPrice(String OriginalPrice);
    public void update_DiscountPrice(String DiscountPrice);
    public void update_Percentage(String Percentage);
    public void update_Units_and_quantity(String Units,String quantity);
    public void update_ExpiryDate(String ExpiryDate);
    public void update_CountOfViews(String CountOfViews);
    public void update_Description(String Description);

    void showerror(String s);
}
