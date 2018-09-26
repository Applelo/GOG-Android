package com.gog.applelo.gog.interfaces;

import com.gog.applelo.gog.models.cdn.manifest.Manifest;
import com.gog.applelo.gog.models.cdn.repository.Repository;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CdnGogService {

    String API = "https://cdn.gog.com";

    /**
     * @param product_id
     * @param os
     * @param build_id
     * @return Call<Repository>
     */
    @GET(API + "/content-system/v1/manifests/{product_id}/{os}/{build_id}/repository.json")
    Call<Repository> getProductRepository(
            @Path("product_id") String product_id,
            @Path("os") String os,
            @Path("build_id") String build_id
    );

    /**
     * @param product_id
     * @param os
     * @param build_id
     * @param manifest_id
     * @return Call<Manifest>
     */
    @GET(API + "/content-system/v1/manifests/{product_id}/{os}/{build_id}/{manifest_id}.json")
    Call<Manifest> getProductManifest(
            @Path("product_id") String product_id,
            @Path("os") String os,
            @Path("build_id") String build_id,
            @Path("manifest_id") String manifest_id
    );

    //@GET(API + "/content-system/v1/depots/{product_id}/{os}/{depot_id}/{str_file}") //need to be verify
    //Call<> get

}
