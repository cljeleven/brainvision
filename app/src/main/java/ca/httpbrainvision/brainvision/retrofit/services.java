package ca.httpbrainvision.brainvision.retrofit;

import java.util.List;

import ca.httpbrainvision.brainvision.Models.dataset;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Jesse on 2016-10-03.
 */
public interface services {
    @GET
    Call<List<dataset>> load_more_discussion(@Url String nexturl);

}
