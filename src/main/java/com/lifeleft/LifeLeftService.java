package com.lifeleft;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

@WebService(serviceName = "LifeLeft")
public class LifeLeftService {
    private static final Integer ESPERANCE_VIE_HOMMES = 75;
    private static final Integer ESPERANCE_VIE_FEMMES = 78;
    String homme = "homme";
    Integer evDeReference = 0;
    @WebMethod
    public String  anneeRestantesAVivre (String prenom, String sexe, Integer anneeNaissance) {

        if(sexe.equals(homme)) evDeReference = ESPERANCE_VIE_HOMMES;
        else evDeReference = ESPERANCE_VIE_FEMMES;
        Integer anneeRestantes = evDeReference -(Year.now().getValue() - anneeNaissance );
        return "Bonjour " + prenom + ", il vous reste " + anneeRestantes + " ans incha'Allah à vivre !";
    }
}
