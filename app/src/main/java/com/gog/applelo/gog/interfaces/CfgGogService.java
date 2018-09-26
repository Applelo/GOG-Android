package com.gog.applelo.gog.interfaces;

import retrofit2.Call;
import com.gog.applelo.gog.models.cfg.desktop_galaxy_client.Config;
import com.gog.applelo.gog.models.cfg.desktop_galaxy_project.Files;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CfgGogService {

    String API = "https://cfg.gog.com";


    /**
     * Config for the Galaxy desktop client
     * @return Call<Config>
     */
    @GET(API + "/desktop-galaxy-client/config.json")
    Call<Config> getGalaxyClientConfig();


    /**
     * Returns the file list for the Galaxy Updater
     * @param project Name of the application, possible values: desktop-galaxy-client, desktop-galaxy-commservice, desktop-galaxy-overlay, desktop-galaxy-peer, desktop-galaxy-updater.
     * @param os Target OS, possible values: files-windows, files-osx
     * @return Call<Files>
     */
    @GET(API + "/{project}/4/master/{os}.json")
    Call<Files> getGalaxyProjectFiles(
        @Path("project") String project,
        @Path("os") String os
    );


}
