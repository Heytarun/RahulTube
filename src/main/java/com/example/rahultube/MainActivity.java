package com.example.rahultube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView clip = findViewById(R.id.videoclip);
        clip.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.clip);
        MediaController mediaController  = new MediaController(this);
        clip.setMediaController(mediaController);
        mediaController.setAnchorView(clip);
        //To Start the Clip
        clip.start();
    }
}
