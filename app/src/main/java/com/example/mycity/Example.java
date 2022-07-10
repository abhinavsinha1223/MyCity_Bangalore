package com.example.mycity;

import com.google.gson.annotations.SerializedName;

public class Example {
    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @SerializedName("main")
    Main main;

}
