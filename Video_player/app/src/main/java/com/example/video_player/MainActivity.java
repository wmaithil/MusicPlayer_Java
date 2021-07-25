package com.example.video_player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video1= findViewById(R.id.horses);
        video1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.Wildlife);
        MediaController mediaController=new MediaController(this);
        video1.setMediaController(mediaController);
        mediaController.setAnchorView(video1);
        video1.start();
    }
}