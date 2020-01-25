# Appium_Java_Automation
This project is a new implementation of automated process in App Android, So the tools used was Java-Maven- Appium-Junit-Cucumber-Android Driver


Requisitos previos:

1. Tener instalado Appium server de forma correcta.
2. Tener instalado Maven,SDK de android, Android SDK build tools.
3. Tener disponible un emulador de Android, sean emulador de visual studio para Android o instalar Android studio y utilizar un
emulador en el AVD manager

4 Debe contener todas las variables de entorno correctamente creadas 

ANDROID_HOME C:\android-sdk\
MAVEN_HOME C:\Maven\apache-maven-3.6.3
PATH C:\android-sdk\platform-tools.
     C:\android-sdk\tools
     %MAVEN_HOME%\bin
     
5 Para comprobar la instalación correcta del sdk de android puede validar abriendo una ventana cmd e ingresar adb devices
C:\Users\jesguerra>adb devices
List of devices attached
emulator-5554   device

6. Suba el servidor de appium por medio de una ventana cmd solamente con el suiente comando appium 
C:\Users\jesguerra>appium
[Appium] Welcome to Appium v1.16.0
[Appium] Appium REST http interface listener started on 0.0.0.0:4723

7. Utilicé como IDE de desarollo Intellij , abra el package Runner y encontrara la clase Runner (para ejecuar el test con cucumber runner). click derecho sobre la clase y
presione "run ". (Compruebe que todas las dependencias se encuentra correctamente descargadas para la ejecución, de la misma forma compruebe
de que la clase Runner este correctamente dirigida hacia el package donde se encuentra el archivo .feature). tambien debe validar no tener
problemas con el archivo de scenarios .feature, puede comprobar que los steps esten debidamente mapeados desde el feature.

8. Observe la ejecución en el servidor de appium.
