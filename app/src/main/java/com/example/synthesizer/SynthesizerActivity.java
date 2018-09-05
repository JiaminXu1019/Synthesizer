package com.example.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity implements View.OnClickListener{

    public static final float DEFAULT_VOLUME = 1.0f;
    public static final float DEFAULT_RATE= 1.0f;
    public static final int DEFAULT_PRIORITY = 1;
    public static final int WHOLE_NOTE = 1000;

    private Button buttonA;
    private Button buttonBB;
    private Button buttonB;
    private Button buttonC;
    private Button buttonCsharp;
    private Button buttonD;
    private Button buttonDsharp;
    private Button buttonE;
    private Button buttonF;
    private Button buttonFsharp;
    private Button buttonG;
    private Button buttonGsharp;
    private SoundPool soundPool;
    private Button buttonScale;
    private int noteA;
    private int noteB;
    private int noteBb;
    private int noteC;
    private int noteCsharp;
    private int noteD;
    private int noteDsharp;
    private int noteE;
    private int noteF;
    private int noteFsharp;
    private int noteG;
    private int noteGsharp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        wireWidgets();
        setListeners();
        initializeSoundPool();
    }

    private void initializeSoundPool() {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        noteA = soundPool.load(this, R.raw.scalea, 1);
        noteB = soundPool.load(this, R.raw.scaleb, 1);
        noteBb = soundPool.load(this, R.raw.scalebb, 1);
        noteC = soundPool.load(this, R.raw.scalec, 1);
        noteCsharp = soundPool.load(this, R.raw.scalecs, 1);
        noteD = soundPool.load(this, R.raw.scaled, 1);
        noteDsharp = soundPool.load(this, R.raw.scaleds, 1);
        noteE = soundPool.load(this, R.raw.scalee, 1);
        noteF = soundPool.load(this, R.raw.scalef, 1);
        noteFsharp = soundPool.load(this, R.raw.scalefs, 1);
        noteG = soundPool.load(this, R.raw.scaleg, 1);
        noteGsharp = soundPool.load(this, R.raw.scalegs, 1);
    }

    private void setListeners(){
        buttonA.setOnClickListener(this);
        buttonBB.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCsharp.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonDsharp.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonFsharp.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonGsharp.setOnClickListener(this);
        buttonScale.setOnClickListener(this);
    }

    private void wireWidgets() {
        buttonA = findViewById(R.id.button_synth_a);
        buttonBB = findViewById(R.id.button_synth_bb);
        buttonB = findViewById(R.id.button_synth_b);
        buttonC = findViewById(R.id.button_synth_c);
        buttonCsharp = findViewById(R.id.button_synth_cc);
        buttonD = findViewById(R.id.button_synth_d);
        buttonDsharp = findViewById(R.id.button_synth_dd);
        buttonE = findViewById(R.id.button_synth_e);
        buttonF = findViewById(R.id.button_synth_f);
        buttonFsharp = findViewById(R.id.button_synth_ff);
        buttonG = findViewById(R.id.button_synth_g);
        buttonGsharp = findViewById(R.id.button_synth_gg);
        buttonScale = findViewById(R.id.button_synth_scale);


        }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_synth_a:
                soundPool.play(noteA, 1.0f, 1.0f, 1, 0, 1.0f);
            break;
            case R.id.button_synth_bb:
                soundPool.play(noteBb, 1.0f, 1.0f, 1, 0, 1.0f);

                break;
            case R.id.button_synth_b:
                soundPool.play(noteB, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.button_synth_c:
                soundPool.play(noteC, 1.0f, 1.0f, 1, 0, 1.0f);

                break;
            case R.id.button_synth_cc:
                soundPool.play(noteCsharp, 1.0f, 1.0f, 1, 0, 1.0f);

                break;
            case R.id.button_synth_d:
                soundPool.play(noteD, 1.0f, 1.0f, 1, 0, 1.0f);

                break;
            case R.id.button_synth_dd:
                soundPool.play(noteDsharp, 1.0f, 1.0f, 1, 0, 1.0f);

                break;
            case R.id.button_synth_e:
                soundPool.play(noteE, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.button_synth_f:
                soundPool.play(noteF, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.button_synth_ff:
                soundPool.play(noteFsharp, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.button_synth_g:
                soundPool.play(noteG, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.button_synth_gg:
                soundPool.play(noteGsharp, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.button_synth_scale:
                playScale();
                break;

        }
}

    private void playScale() {

        playNote(noteA);
        delay(WHOLE_NOTE);
        playNote(noteBb);
        delay(WHOLE_NOTE);
        playNote(noteB);
        delay(WHOLE_NOTE);
        playNote(noteC);
        delay(WHOLE_NOTE);
        playNote(noteCsharp);
        delay(WHOLE_NOTE);
        playNote(noteD);
        delay(WHOLE_NOTE);
        playNote(noteDsharp);
        delay(WHOLE_NOTE);
        playNote(noteE);
        delay(WHOLE_NOTE);
        playNote(noteF);
        delay(WHOLE_NOTE);
        playNote(noteFsharp);
        delay(WHOLE_NOTE);
        playNote(noteG);
        delay(WHOLE_NOTE);
        playNote(noteGsharp);
    }

    private void delay(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    private void playNote(int note, int loop) {
        soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY, loop, DEFAULT_RATE);

    }

    private void playNote(int note){
        soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY, 0, DEFAULT_RATE);

    }
}
