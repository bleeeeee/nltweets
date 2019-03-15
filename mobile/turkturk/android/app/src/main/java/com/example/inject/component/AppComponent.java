

package com.example.inject.component;

import javax.inject.Singleton;

import dagger.Component;
//import gdg.androidtitlan.dagger2_demo.CategoryApplication;
//import gdg.androidtitlan.dagger2_demo.category.model.Categories;
//import gdg.androidtitlan.dagger2_demo.di.module.AppModule;
//import gdg.androidtitlan.dagger2_demo.di.module.InteractorsModule;
import com.example.turkturk.TurkTurkApplication;
import com.example.inject.module.AppModule;
import com.example.inject.component.AppComponent;

//affects generated code
@Singleton @Component(modules = {
//    AppModule.class, InteractorsModule.class
        AppModule.class
}) public interface AppComponent {
  void inject(TurkTurkApplication turkApplication);

}
