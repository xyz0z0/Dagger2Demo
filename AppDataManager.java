/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package xyz.xyz0z0.mydagger2application;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by janisharali on 27/01/17.
 */

@Singleton
public class AppDataManager {

  private static final String TAG = "AppDataManager";

  private final Context mContext;
  private final PreferencesHelper mPreferencesHelper;


  @Inject
  public AppDataManager(@ApplicationContext Context context,
                        PreferencesHelper preferencesHelper) {
    mContext = context;
    mPreferencesHelper = preferencesHelper;
  }


  public Long getCurrentUserId() {
    return mPreferencesHelper.getCurrentUserId();
  }


  public void setCurrentUserId(Long userId) {
    mPreferencesHelper.setCurrentUserId(userId);
  }

}
