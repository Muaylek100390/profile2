package fahsai.ruts.ac.th.introduce;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Profile extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mediaPlayer=MediaPlayer.create(this,R.raw.righthere);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }


}

