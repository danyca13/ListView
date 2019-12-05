package dany.caro.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val opciones = arrayOf("Botones", "Imagenes", "WebView", "Switch")
        val adaptador = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1,
            opciones
        )

        miListView.adapter = adaptador


        miListView.setOnItemClickListener { adapterView, view, i, l ->


            var intent = Intent()
            when (i) {
                0 -> intent = Intent(this, BotonesActivity::class.java)
                1 -> intent = Intent(this, ActivityImagenes::class.java)
                2 -> intent = Intent(this, ActivityWebView::class.java)
                3 -> intent = Intent(this, ActivitySwitch::class.java)
            }
            startActivity(intent)
        }
    }
}