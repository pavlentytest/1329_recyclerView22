package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String image_names[] = {
            "Clouds",
            "Sun",
            "Partial clouds",
            "Snow",
            "Sleet",
            "Mist",
            "Clear",
            "Rain",
            "Rain thunder",
            "Fog"
    };

    private final String image_urls[] = {
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/angry_clouds.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/day_clear.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_half_moon_partial_cloud.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_half_moon_snow.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/sleet.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/mist.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_full_moon_clear.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/night_half_moon_rain.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/rain_thunder.png",
            "https://www.dovora.com/resources/weather-icons/showcase/modern_showcase/fog.png"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        RecyclerView rView = findViewById(R.id.recyclerView);
        rView.setHasFixedSize(true); // ??? check
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rView.setLayoutManager(layoutManager);
        // вызов адаптера
        rView.setAdapter(new DataAdapter(prepareDate()));
    }

    private ArrayList<Image> prepareDate() {
        ArrayList<Image> imageArrayList = new ArrayList<>();
        for(int i=0;i<image_names.length;i++) {
            imageArrayList.add(new Image(image_names[i],image_urls[i]));
        }
        return imageArrayList;
    }
}
