package jp.techacademy.umiya.fukuyama.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        try {
            when(v.id){
                R.id.button1 -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    val value = editText1.text.toString().toDouble() + editText2.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                    startActivity(intent)
                }
                R.id.button2 -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    val value = editText1.text.toString().toDouble() - editText2.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                    startActivity(intent)
                }
                R.id.button3 -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    val value = editText1.text.toString().toDouble() * editText2.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                    startActivity(intent)
                }
                R.id.button4 -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    val value = editText1.text.toString().toDouble() / editText2.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                    startActivity(intent)
                }
            }
        } catch (e: Exception) {
            Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }
}
