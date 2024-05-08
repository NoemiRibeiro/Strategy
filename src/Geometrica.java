import static java.lang.Math.sqrt;

public class Geometrica implements ICalcMedia{

    @Override
     public double CalculaMedia(double P1, double P2) {
        return sqrt(P1*P2);
    }

    @Override
     public String Situacao(double Media) {
        if (Media > 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
