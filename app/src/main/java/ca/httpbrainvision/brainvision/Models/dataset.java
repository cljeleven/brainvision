package ca.httpbrainvision.brainvision.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class dataset {

    @SerializedName("DealId")
    @Expose
    private String dealId;
    @SerializedName("RetailerId")
    @Expose
    private String retailerId;
    @SerializedName("LocationId")
    @Expose
    private String locationId;
    @SerializedName("CatCode")
    @Expose
    private String catCode;
    @SerializedName("ItemName")
    @Expose
    private String itemName;
    @SerializedName("OriginalPrice")
    @Expose
    private double originalPrice;
    @SerializedName("DiscountPrice")
    @Expose
    private double discountPrice;
    @SerializedName("Percentage")
    @Expose
    private String percentage;
    @SerializedName("Units")
    @Expose
    private String units;
    @SerializedName("Quantity")
    @Expose
    private String quantity;
    @SerializedName("ImagePath")
    @Expose
    private String imagePath;
    @SerializedName("ImageFileName")
    @Expose
    private String imageFileName;
    @SerializedName("EffectiveDate")
    @Expose
    private Object effectiveDate;
    @SerializedName("ExpiryDate")
    @Expose
    private String expiryDate;
    @SerializedName("Active")
    @Expose
    private String active;
    @SerializedName("CountOfViews")
    @Expose
    private String countOfViews;
    @SerializedName("Description")
    @Expose
    private String description;

    /**
     *
     * @return
     * The dealId
     */
    public String getDealId() {
        return dealId;
    }

    /**
     *
     * @param dealId
     * The DealId
     */
    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    /**
     *
     * @return
     * The retailerId
     */
    public String getRetailerId() {
        return retailerId;
    }

    /**
     *
     * @param retailerId
     * The RetailerId
     */
    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    /**
     *
     * @return
     * The locationId
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     *
     * @param locationId
     * The LocationId
     */
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /**
     *
     * @return
     * The catCode
     */
    public String getCatCode() {
        return catCode;
    }

    /**
     *
     * @param catCode
     * The CatCode
     */
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    /**
     *
     * @return
     * The itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     *
     * @param itemName
     * The ItemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     *
     * @return
     * The originalPrice
     */
    public double getOriginalPrice() {
        return originalPrice;
    }

    /**
     *
     * @param originalPrice
     * The OriginalPrice
     */
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     *
     * @return
     * The discountPrice
     */
    public double getDiscountPrice() {
        return discountPrice;
    }

    /**
     *
     * @param discountPrice
     * The DiscountPrice
     */
    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     *
     * @return
     * The percentage
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     *
     * @param percentage
     * The Percentage
     */
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    /**
     *
     * @return
     * The units
     */
    public String getUnits() {
        return units;
    }

    /**
     *
     * @param units
     * The Units
     */
    public void setUnits(String units) {
        this.units = units;
    }

    /**
     *
     * @return
     * The quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     * The Quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return
     * The imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     *
     * @param imagePath
     * The ImagePath
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     *
     * @return
     * The imageFileName
     */
    public String getImageFileName() {
        return imageFileName;
    }

    /**
     *
     * @param imageFileName
     * The ImageFileName
     */
    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    /**
     *
     * @return
     * The effectiveDate
     */
    public Object getEffectiveDate() {
        return effectiveDate;
    }

    /**
     *
     * @param effectiveDate
     * The EffectiveDate
     */
    public void setEffectiveDate(Object effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     *
     * @return
     * The expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     *
     * @param expiryDate
     * The ExpiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     *
     * @return
     * The active
     */
    public String getActive() {
        return active;
    }

    /**
     *
     * @param active
     * The Active
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     *
     * @return
     * The countOfViews
     */
    public String getCountOfViews() {
        return countOfViews;
    }

    /**
     *
     * @param countOfViews
     * The CountOfViews
     */
    public void setCountOfViews(String countOfViews) {
        this.countOfViews = countOfViews;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

}