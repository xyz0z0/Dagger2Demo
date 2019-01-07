package xyz.xyz0z0.mydagger2application.di;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import xyz.xyz0z0.mydagger2application.AppDataManager;
import xyz.xyz0z0.mydagger2application.ApplicationContext;
import xyz.xyz0z0.mydagger2application.PreferenceInfo;
import xyz.xyz0z0.mydagger2application.PreferencesHelper;

@Module
public class ApplicationModule {

  private final Application mApplication;


  public ApplicationModule(Application application) {
    this.mApplication = application;
  }


  @Provides
  @ApplicationContext
  Context provideContext() {
    return mApplication;
  }


  @Provides
  Application provideApplication() {
    return mApplication;
  }


  @Provides
  @PreferenceInfo
  String providePreferenceName() {
    return "mindorks_pref";
  }




  //
  // @Provides
  // @Singleton PreferencesHelper providePreferencesHelper(@ApplicationContext Context context,
  //                                                       @PreferenceInfo String prefFileName) {
  //   return new PreferencesHelper(context,prefFileName);
  // }

  // @Provides
  // @Singleton
  // AppDataManager provideDataManager(AppDataManager manager) {
  //   return manager;
  // }

}
