package xyz.xyz0z0.mydagger2application;

import android.app.Application;
import android.util.Log;
import javax.inject.Inject;
import xyz.xyz0z0.mydagger2application.di.ApplicationComponent;
import xyz.xyz0z0.mydagger2application.di.ApplicationModule;
import xyz.xyz0z0.mydagger2application.di.DaggerApplicationComponent;

public class MyApp extends Application {

  @Inject
  AppDataManager manager;

  @Inject
  PreferencesHelper helper;

  private ApplicationComponent applicationComponent;


  @Override public void onCreate() {
    super.onCreate();

    applicationComponent = DaggerApplicationComponent
        .builder()
        .applicationModule(new ApplicationModule(this))
        .build();
    applicationComponent.inject(this);
    if (manager == null) {

      Log.d("cxg", "null");
    } else {
      Log.d("cxg", "" + manager.toString());

    }

    helper.setCurrentUserId(1231231L);
    Log.d("cxg", " " + helper.getCurrentUserId());

  }
}
