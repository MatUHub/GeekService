package MatUHub.geekservice

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class ToastService: Service() {
    companion object{
        const val TEXT_EXTRA_KEY = "text_extra_key"

        fun getLaunchIntent(context: Context, message: String): Intent{
            val serviceIntent = Intent(context, ToastService::class.java)
            serviceIntent.putExtra(TEXT_EXTRA_KEY, message)
            return serviceIntent
        }
    }
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        val message = intent.extras?.getString(TEXT_EXTRA_KEY) ?: "EMPTY"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }
}