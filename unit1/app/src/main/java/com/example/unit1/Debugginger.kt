package com.example.unit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "Debugginger"

class Debugginger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debugginger)

        logging()
        division()
        
    }

    fun division(){
        val numerator = 60
        var denominator = 4
        repeat(4){
            //Log.d(TAG,"$denominator")
            Log.v(TAG, "${numerator/denominator}")
            denominator --
        }
    }

    fun logging(){
        //from less serious to error
        Log.v(TAG,"VERBOSE: more verbose than DEBUG logs")
        Log.d(TAG,"DEBUG: reporting technical info useful for debug")
        Log.i(TAG,"INFO: reporting technical info, such as an operation succeeding")
        Log.w(TAG,"WARN: potential serious errors")
        Log.e(TAG,"ERROR: serious error like an app crash")
    }
}