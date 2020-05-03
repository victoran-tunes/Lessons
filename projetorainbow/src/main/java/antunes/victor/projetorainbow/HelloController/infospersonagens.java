package antunes.victor.projetorainbow.HelloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import antunes.victor.projetorainbow.Model.Infos;

import java.util.ArrayList;

@RestController
public class infospersonagens {

    @GetMapping("/personagem")
    public Infos infospersonagens(){
        Infos informaçao = new Infos();
        informaçao.setName("Eliza Cohen (Ash)");
        informaçao.setArmor("1");
        informaçao.setSpeed("3");
        informaçao.setSkill("Breaching Round");
        return informaçao;
    }

    @GetMapping("/personagens")
public ArrayList<Infos> Infos (){
    Infos informaçao = new Infos();
    informaçao.setName("Sebastien Côté (Buck)");
    informaçao.setArmor("2");
    informaçao.setSpeed("2");
    informaçao.setSkill("Skeleton Key");

    Infos informaçao2 = new Infos();
    informaçao2.setName("Zofia Bosak (Zofia)");
    informaçao2.setArmor("2");
    informaçao2.setSpeed("2");
    informaçao2.setSkill("KS79 Lifeline");

    Infos informaçao3 = new Infos();
    informaçao3.setName("Taina Pereira (Caveira)");
    informaçao3.setArmor("1");
    informaçao3.setSpeed("3");
    informaçao3.setSkill("Silent Step");

    Infos informaçao4 = new Infos();
    informaçao4.setName("Meghan J. Castellano (Valkyrie)");
    informaçao4.setArmor("2");
    informaçao4.setSpeed("2");
    informaçao4.setSkill("Black Eye (Gyro Cam MK2)");

    ArrayList<Infos> register = new ArrayList<>();
    register.add(informaçao);
    register.add(informaçao2);
    register.add(informaçao3);
    register.add(informaçao4);

    return register;
    }
}

