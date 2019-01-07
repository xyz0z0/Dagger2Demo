package xyz.xyz0z0.mydagger2application.di;

import android.app.Application;
import android.content.Context;
import dagger.Component;
import javax.inject.Singleton;
import xyz.xyz0z0.mydagger2application.AppDataManager;
import xyz.xyz0z0.mydagger2application.ApplicationContext;
import xyz.xyz0z0.mydagger2application.MyApp;
import xyz.xyz0z0.mydagger2application.PreferenceInfo;
import xyz.xyz0z0.mydagger2application.PreferencesHelper;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  void inject(MyApp app);

  @ApplicationContext
  Context context();

  Application application();

  AppDataManager getDataManager();

  PreferencesHelper getPreferenceHelper();


}
