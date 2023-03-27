package fondamentaux.correction_tps.jeudi_19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Tp2_TauxEmails {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>(Arrays.asList("christian.lisangola@gmail.com", "jean.paul@gmail.com", "alain@gmail.com", "lydie@yahoo.fr", "josephine.lajoie@yahoo.com", "luise@hotmail.fr", "philemon.turion@gmail.com", "jules.cesar@hotmail.fr"));

        HashMap<String,Float> emailsMap=new HashMap<>();
        emailsMap.put("gmail",0.0F);
        emailsMap.put("yahoo",0.0F);
        emailsMap.put("hotmail",0.0F);
        float total=0.0F;
        for(String email:emails){
            total +=1;
            if(email.contains("gmail")){
                emailsMap.replace("gmail",
                        emailsMap.get("gmail")+1.0F);
            }else if(email.contains("yahoo")){
                emailsMap.replace("yahoo",
                        emailsMap.get("yahoo")+1.0F);
            }
            else if(email.contains("hotmail")){
                emailsMap.replace("hotmail",
                        emailsMap.get("hotmail")+1.0F);
            }
        }
        System.out.println(emailsMap);

        for(String domaine:emailsMap.keySet()){
            System.out.printf("%s => %s\n",domaine,(100*(emailsMap.get(domaine))/total)+"%");
        }
    }
}
