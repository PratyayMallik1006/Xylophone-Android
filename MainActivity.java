package com.pratyay.xylophone;

import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);


        mCSoundId= mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId= mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId= mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId= mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId= mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId= mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId= mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

    }

    public void playC(View v){
        mSoundPool.play(mCSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playD(View v){
        mSoundPool.play(mDSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playE(View v){
        mSoundPool.play(mESoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playF(View v){
        mSoundPool.play(mFSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playG(View v){
        mSoundPool.play(mGSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playA(View v){
        mSoundPool.play(mASoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playB(View v){
        mSoundPool.play(mBSoundId,1.0f,1.0f,0,0,1.0f);

    }

}