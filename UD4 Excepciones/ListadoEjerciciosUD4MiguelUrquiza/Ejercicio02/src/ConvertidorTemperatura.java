public class ConvertidorTemperatura {

    public ConvertidorTemperatura() {
    }

    public double convertidor(double grados)throws RuntimeException{
        if(grados<-273){
            throw new  RuntimeException("No se pueden tener menos de -273 ºC");
        }
        return grados*1.8+32;
    }

}
