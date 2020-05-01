package victor.antunes.hospital.control;

import ch.qos.logback.core.net.server.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import victor.antunes.hospital.model.Doctors;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class Hellocontrol {

    @GetMapping("/hospital")
    public String getMensagem (){
        return "Hello";
    }


    @GetMapping("/doctors")
    public Doctors getDoctors (){

        Doctors doctors = new Doctors();

        doctors.setTeam1("João e Gabriel");
        doctors.setTeam2("Pedro e Fábio");
        doctors.setTeam3("Gabriela e Marcos");
        return doctors;
    }
    @GetMapping("/schedules")
    public ArrayList<Doctors> getRegister(){

        Doctors doctors = new Doctors();

        doctors.setTeam1("1AM to 9AM");
        doctors.setTeam2("10AM to 5PM");
        doctors.setTeam3("6PM to 12PM");

        ArrayList<Doctors> register = new ArrayList<>();
        register.add(doctors);
        register.add(doctors);
        return register;
    }
}

