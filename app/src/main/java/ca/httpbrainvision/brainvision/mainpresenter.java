package ca.httpbrainvision.brainvision;

import java.util.List;

import ca.httpbrainvision.brainvision.Models.dataset;
import ca.httpbrainvision.brainvision.retrofit.customAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jesse on 2016-10-03.
 */
public class mainpresenter {


    private custominterface main_if;

    public mainpresenter(custominterface main_if){


        this.main_if = main_if;
    }

    public void fetch_data(String url){
        Call<List<dataset>> call = customAdapter.get_publicAPI().load_more_discussion(url);
        call.enqueue(new Callback<List<dataset>>() {
            @Override
            public void onResponse(Call<List<dataset>> call, Response<List<dataset>> response) {
                if(response.isSuccessful()){
                    dataset data = response.body().get(0);
                    main_if.update_itemname(data.getItemName());
                    main_if.update_OriginalPrice(data.getOriginalPrice()+"");
                    main_if.update_DiscountPrice(data.getDiscountPrice()+"");
                    main_if.update_ExpiryDate(data.getExpiryDate());
                    main_if.update_Percentage(data.getPercentage());
                    main_if.update_Units_and_quantity(data.getUnits(),data.getQuantity());
                    main_if.update_Description(data.getDescription());
                    main_if.update_image(data.getImagePath()+data.getImageFileName());
                }
            }

            @Override
            public void onFailure(Call<List<dataset>> call, Throwable t) {
                main_if.showerror(t.toString());
            }
        });
    }




}
