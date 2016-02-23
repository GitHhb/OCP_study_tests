package _4b_huiswerk_Klaas_multiple_sort;

import java.util.Date;

/**
 * Created by leandro on 23-2-2016.
 */
public class Kind {
    String name;
    Date geboorteDatum;
    int gewicht;
    String woonplaats;
    int IQ;
    double lengte;

    Kind(String name, Date geboorteDatum, int gewicht, String woonplaats, int IQ, double lengte){
        this.name = name;
        this.geboorteDatum = geboorteDatum;
        this.gewicht = gewicht;
        this.woonplaats = woonplaats;
        this.IQ = IQ;
        this.lengte = lengte;
    }
    @Override
    public String toString(){
        return "Dit kind heet: "+ name+ " en weegt: "+ gewicht;
    }

}
