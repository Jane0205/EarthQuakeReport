package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by 재은 on 2017-03-07.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(double magnitude,String location,long TimeInMilliseconds,String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
    public String getUrl(){
        return mUrl;
    }
}
