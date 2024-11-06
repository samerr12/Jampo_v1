package pm.jampo_v1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Dialga()
    }

    fun Dialga() {

        try {
            var mRunnable = Runnable {
                startActivity(Intent(this, Act_Login::class.java));
                finish();
            }

            var mHandler = Handler()
            mHandler.postDelayed(mRunnable, 4000)

        }
        catch (e: Exception) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }

    }
}