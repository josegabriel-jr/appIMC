# AppIMC

Esta app es una calculadora de IMC (Índice de masa corporal) que nos permite conocer si la persona tiene sobrepeso o no, y para esto se deben ingresar 3 datos que son el nombre, peso y estatura.

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._


### Pre-requisitos 📋

_Herramientas requeridas para la instalación y funcionamiento del software_
* [Android]- Mayor a v 10.0

### Instalación 🔧

_Una serie de ejemplos paso a paso que te dice lo que debes ejecutar para tener un entorno de desarrollo ejecutandose_

_Dí cómo será ese paso_

```
Da un ejemplo
```

_Y repite_

```
hasta finalizar
```


## Arquitectura 🔩 ⌨️

_Para el proyecto se ha seleccionado como arquitectura la MVC_

_La arquitectura MVC (Model-View-Controller) consiste en separar nuestra aplicación, a nivel general, en un conjunto de 3 responsabilidades:_

* Model: La capa de datos, responsable de manejar la conexión con la base de datos o una API.
* View: Será nuestra interfaz, la visualización de nuestro model. Tanto botones, campos de texto y más.
* Controller: Tendrá la lógica de negocio, puede tener la lógica qué realizará un botón al hacerle click, llevarnos a otro vista, actualizar, decirle al modelo que traiga datos o más.

<p align="center">
![Image text](https://github.com/josegabriel-jr/appIMC/blob/main/MVC.png)
</p>

_Ventajas del patrón de arquitectura MVC_
* Aumenta la capacidad de prueba del código y facilita la implementación de nuevas funciones, ya que respalda en gran medida la separación de preocupaciones.
* Las pruebas unitarias de Model and Controller son posibles ya que no extienden ni usan ninguna clase de Android.
* Las funcionalidades de la Vista se pueden verificar a través de pruebas de IU si la Vista respeta el principio de responsabilidad única (actualice el controlador y muestre los datos del modelo sin implementar la lógica del dominio)

_Desventajas del patrón de arquitectura MVC_
* Las capas de código dependen unas de otras incluso si MVC se aplica correctamente.
* No hay parámetro para manejar la lógica de la interfaz de usuario, es decir, cómo mostrar los datos.


## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_


## Construido con 🛠️

_Las herramientas que se utilizaron para la creación del proyecto son_

* [Kotlin](https://kotlinlang.org) - Lenguaje de Programación
* [Android Studio](https://developer.android.com/studio?hl=es-419) - Entorno de Desarrollo Integrado
* [XML](https://www.crehana.com/blog/desarrollo-web/que-es-xml/) - Lenguaje de Marcado Extensible


## Autores 🧑‍🔧

* **José Gabriel Jaimes** - *Trabajo Inicial* - [josegabriel-jr](https://github.com/josegabriel-jr) 🧑
* **Andrea Carolina Villamil Ramírez** - *Documentación* - [Andrea](https://github.com/Andrea-lol) 👩

También puedes mirar la lista de todos los [contribuyentes](https://github.com/josegabriel-jr/appIMC/graphs/contributors) quíenes han participado en este proyecto. 



---

