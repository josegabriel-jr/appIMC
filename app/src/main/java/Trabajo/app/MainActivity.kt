package Trabajo.app
import Trabajo.app.controller.PersonaController
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun CalcularPeso(view: View) {
        var name:EditText = findViewById(R.id.txtNombre);
        var estatura:EditText = findViewById(R.id.txtAltura)
        var peso:EditText = findViewById(R.id.txtPeso)
        var cl = PersonaController()
        var response=  cl.CalcularImc(name.text.toString(),estatura.text.toString(),peso.text.toString())
        Toast.makeText(applicationContext, response, Toast.LENGTH_SHORT).show()
    }
}