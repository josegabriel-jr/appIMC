package Trabajo.app.model

class Persona(var nombre: String, var estatura: Double, var peso: Double ) {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', estatura=$estatura, peso=$peso)"
    }


    fun calcular (): String {
        //Indice de masa corporal
        var imc = peso / (estatura *estatura)
        var info=""
        when(imc){
           in 0.0..18.5 ->{
               info = "$nombre su peso es inferior al normal"
           }in 18.5..24.9 ->{
               info = "$nombre su peso es normal"
           }in 25.0..29.9 ->{
               info = "$nombre su peso es superior al normal"
           }in 30.0..200.00->{
               info ="$nombre sufres de obesidad"
           }
        }
        return info
    }
}