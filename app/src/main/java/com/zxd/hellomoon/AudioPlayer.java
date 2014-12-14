package com.zxd.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.Calendar;

/**
 * Created by zxd on 2014/12/14.
 */
public class AudioPlayer {
    private MediaPlayer mPlayer;
    public void stop(){
        if(mPlayer != null){
            mPlayer.release();
            mPlayer = null;
        }
    }
    public void play(Context c){
        stop();
        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mPlayer.start();
    }
}
