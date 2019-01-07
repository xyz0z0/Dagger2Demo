package xyz.xyz0z0.mydagger2application;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PreferencesHelper  {

  private static final String PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE";
  private static final String PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID";
  private static final String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";
  private static final String PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL";
  private static final String PREF_KEY_CURRENT_USER_PROFILE_PIC_URL
      = "PREF_KEY_CURRENT_USER_PROFILE_PIC_URL";
  private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";

  private final SharedPreferences mPrefs;

  @Inject
  public PreferencesHelper(@ApplicationContext Context context,
                              @PreferenceInfo String prefFileName) {
    mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
  }


  public Long getCurrentUserId() {
    long userId = mPrefs.getLong(PREF_KEY_CURRENT_USER_ID, AppConstants.NULL_INDEX);
    return userId == AppConstants.NULL_INDEX ? null : userId;
  }


  public void setCurrentUserId(Long userId) {
    long id = userId == null ? AppConstants.NULL_INDEX : userId;
    mPrefs.edit().putLong(PREF_KEY_CURRENT_USER_ID, id).apply();
  }
}
