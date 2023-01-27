package com.seeksolution.autoimagesilders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.seeksolution.autoimagesilders.Adatpers.SliderMainAdapter;
import com.seeksolution.autoimagesilders.Models.SliderModel;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.animation.type.SlideAnimation;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SliderView sliderView;
    private ArrayList<SliderModel> arrayList;
    private String[] urls = {

            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/457/30457-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/1327/441327-v",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/1248/1431248-v-af62a54a6d8d",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/1158/1451158-v-60ae0c6f2c82",
            "https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/372/1420372-v-c4dc9b7e307f",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderView = (SliderView) findViewById(R.id.imageSlider);

        arrayList = new ArrayList<>();
        for (int  i=0; i<urls.length; i++){
            arrayList.add(new SliderModel(urls[i]));
        }
        SliderMainAdapter adapter=new SliderMainAdapter(getApplicationContext(),arrayList);
        sliderView.setSliderAdapter(adapter);
        sliderView.dataSetChanged();


        sliderView.setIndicatorAnimation(IndicatorAnimationType.SLIDE);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycle(true);
    }
}