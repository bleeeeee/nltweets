
package com.example.inject.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
//import gdg.androidtitlan.dagger2_demo.CategoryApplication;
import com.example.turkturk.TurkTurkApplication;

import javax.inject.Singleton;

@Module public class AppModule {

  private TurkTurkApplication turkApplication;

  public AppModule(TurkTurkApplication turkApplication) {
    this.turkApplication = turkApplication;
  }

  @Provides @Singleton public Application provideApplication() {
    return turkApplication;
  }
}
