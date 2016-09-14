package io.bloc.android.blocly;

import android.app.Application;

import io.bloc.android.blocly.api.DataSource;

/**
 * Created by Ben on 9/13/2016.
 */
public class BloclyApplication extends Application
{
    private static BloclyApplication sharedInstance;
    private DataSource dataSource;

    public static BloclyApplication getSharedInstance()
    {
        return sharedInstance;
    }

    public static DataSource getSharedDataSource()
    {
        return BloclyApplication.getSharedInstance().getDataSource();
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        sharedInstance = this;
        dataSource = new DataSource();
    }

    public DataSource getDataSource()
    {
        return dataSource;
    }

}
