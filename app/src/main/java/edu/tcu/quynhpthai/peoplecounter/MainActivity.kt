package edu.tcu.quynhpthai.peoplecounter

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//toast variable then :   toastVar?.cancel()'
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var count=0;
        val countTextView=findViewById<TextView>(R.id.textview);
        val addButton=findViewById<TextView>(R.id.add_button);
        addButton.setOnClickListener{_ ->
            count++;
            countTextView.text=count.toString();
//            Toast.makeText(this,"TCU $count",Toast.LENGTH_SHORT).show();

        }
        val resetButton=findViewById<TextView>(R.id.reset_button);
        resetButton.setOnClickListener{_ ->
            Toast.makeText(this,"Counter before reset was $count", Toast.LENGTH_SHORT).show();

            count=0;
            countTextView.text=count.toString();

        }


    }
}