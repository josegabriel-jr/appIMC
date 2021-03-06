# AppIMC

Esta app es una calculadora de IMC (脥ndice de masa corporal) que nos permite conocer si la persona tiene sobrepeso o no, y para esto se deben ingresar 3 datos que son el nombre, peso y estatura.

## Comenzando 馃殌

_Estas instrucciones te permitir谩n obtener una copia del proyecto en funcionamiento en tu m谩quina local para prop贸sitos de desarrollo y pruebas._


### Pre-requisitos 馃搵

_Herramientas requeridas para la instalaci贸n y funcionamiento del software_
* [Android]- Mayor a v 10.0

### Instalaci贸n 馃敡

_1. La instalaci贸n del proyecto es muy f谩cil, simplemente debemos dirigirnos al enlace del drive desde nuestro dispositivo Android. [Click Aqu铆](https://drive.google.com/file/d/1X_BEgsKWhfVMhrGlA7y_CU_Y0UXKw_3g/view?usp=sharing)_

_2. Descargarmos el APK_

_3. La Play Protect nos dir谩 que no se reconoce al desarrollador de la App, pero le daremos a la opci贸n de instalar de todas formas._

_4. Y la aplicaci贸n ya estar铆a descargada desde nuestro dispositivo Android._

_5. Luego simplemente seleccionamos abrir y ya estamos en la aplicaci贸n._


_La imagen de como se ve la aplicaci贸n en funcionamiento est谩 [aqu铆](https://github.com/josegabriel-jr/appIMC/blob/main/Instalaci贸n.jpeg)_


## Arquitectura 馃敥 鈱笍

_Para el proyecto se ha seleccionado como arquitectura la MVC_

_La arquitectura MVC (Model-View-Controller) consiste en separar nuestra aplicaci贸n, a nivel general, en un conjunto de 3 responsabilidades:_

* Model: La capa de datos, responsable de manejar la conexi贸n con la base de datos o una API.
* View: Ser谩 nuestra interfaz, la visualizaci贸n de nuestro model. Tanto botones, campos de texto y m谩s.
* Controller: Tendr谩 la l贸gica de negocio, puede tener la l贸gica qu茅 realizar谩 un bot贸n al hacerle click, llevarnos a otro vista, actualizar, decirle al modelo que traiga datos o m谩s.

![Image text](https://github.com/josegabriel-jr/appIMC/blob/main/MVC.png)

_Ventajas del patr贸n de arquitectura MVC_
* Aumenta la capacidad de prueba del c贸digo y facilita la implementaci贸n de nuevas funciones, ya que respalda en gran medida la separaci贸n de preocupaciones.
* Las pruebas unitarias de Model and Controller son posibles ya que no extienden ni usan ninguna clase de Android.
* Las funcionalidades de la Vista se pueden verificar a trav茅s de pruebas de IU si la Vista respeta el principio de responsabilidad 煤nica (actualice el controlador y muestre los datos del modelo sin implementar la l贸gica del dominio)

_Desventajas del patr贸n de arquitectura MVC_
* Las capas de c贸digo dependen unas de otras incluso si MVC se aplica correctamente.
* No hay par谩metro para manejar la l贸gica de la interfaz de usuario, es decir, c贸mo mostrar los datos.


## Despliegue 馃摝

_Para la realizaci贸n del despliegue del apk se utiliz贸 las opciones que por defecto trae android studio la cual es: Generate Signed Bundle or APK, la cual nos permite generar apk de tipo firmada o sin firmar._


## Construido con 馃洜锔?

_Las herramientas que se utilizaron para la creaci贸n del proyecto son_

* [Kotlin](https://kotlinlang.org) - Lenguaje de Programaci贸n
* [Android Studio](https://developer.android.com/studio?hl=es-419) - Entorno de Desarrollo Integrado
* [XML](https://www.crehana.com/blog/desarrollo-web/que-es-xml/) - Lenguaje de Marcado Extensible


## Autores 馃鈥嶐煍?

* **Jos茅 Gabriel Jaimes** - *Trabajo Inicial* - [josegabriel-jr](https://github.com/josegabriel-jr) 馃
* **Andrea Carolina Villamil Ram铆rez** - *Documentaci贸n* - [Andrea](https://github.com/Andrea-lol) 馃懇

Tambi茅n puedes mirar la lista de todos los [contribuyentes](https://github.com/josegabriel-jr/appIMC/graphs/contributors) qu铆enes han participado en este proyecto. 



---

