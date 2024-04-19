package com.example.mapboxtutorial;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set up Mapbox access token
        Mapbox.getInstance(this, "sk.eyJ1IjoiYWFxZGFzYmVzZTIzc2VlY3MiLCJhIjoiY2x2Nno4aWNiMDVqNTJranplMnFocjU2MCJ9.FQm_k83-GBRrZjwBSaG8Eg");

        setContentView(R.layout.activity_main);

        // Initialize map view
        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }
}
