package com.example.service184

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook
        btn_fb.setOnClickListener({val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/prana.septia.98"))
        startActivity(i)
        })
        //button instagram
        btn_ig.setOnClickListener({val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pranaseptia7/"))
            startActivity(i)
        })
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.perfect)
        //button pemutar mp3
       btn_play.setOnClickListener{
           MediaPlayer?.start()
       }
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        btn_stop.setOnClickListener{
            MediaPlayer?.start()
           MediaPlayer?.seekTo(0)
        }
    }
}
