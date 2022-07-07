public class BecaUniversitaria {
    // Atributos
int Tiempo ;
double Monto ;
double Interes ;
double diferencia;
// constructor
public BecaUniversitaria(int _Tiempo, double _Monto, double _Interes){
    Tiempo = _Tiempo;
    Monto = _Monto;
    Interes = _Interes;
}
public BecaUniversitaria(){
}
// Métodos
public double calcularInteresSimple( ){
double simple = Math.round(Monto*(Interes/100)*Tiempo);
return simple;
}
public double calcularInteresCompuesto( ){
double compuesto = Math.round(Monto * (((Math.pow((1+Interes/100) ,Tiempo))-1)));
return compuesto;
}
public String compararInversion (int pTiempo, double pMonto, double
pInteres){
String resultado;
Tiempo = pTiempo;
Monto = pMonto;
Interes = pInteres;
diferencia = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
resultado = "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
return resultado;
}
public String compararInversion ( ){
    String resultado;
    diferencia = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
    if (diferencia != 0) {
    resultado = "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
    }else {
        resultado = "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }
    return resultado;
}
}
