package Trabajo.app.controller

import Trabajo.app.model.Persona

class PersonaController {
  fun CalcularImc(nombre:String,estatura:String, peso:String) : String {
      var persona = Persona(nombre, estatura.toDouble(),peso.toDouble());
      return persona.calcular();
  }




}