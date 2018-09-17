package com.ghostship.testapp;

import android.app.Application;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public final class App extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    AppCenter.start(this, "7ef49956-f2c6-4b5f-bed2-974cf7ce0147", Analytics.class, Crashes.class);
  }
}
