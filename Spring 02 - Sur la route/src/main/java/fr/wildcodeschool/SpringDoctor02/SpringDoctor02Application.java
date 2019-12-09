package fr.wildcodeschool.SpringDoctor02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class SpringDoctor02Application {

	public static void main(String[] args) {
        SpringApplication.run(SpringDoctor02Application.class, args);
    }

    @RequestMapping("/doctor/{doctorId}")
    @ResponseBody
    public String doctor1(@PathVariable int doctorId) {
	    String[] doctors = {"Christopher Eccleston", "David Tennant", "Matt Smith", "Peter Capaldi", "Jodie Whittaker"};
        if (doctorId >= 9 && doctorId <= 13) {
            return "Docteur n°" + doctorId + " : " + doctors[doctorId - 9];
        }
        if (doctorId >= 1 && doctorId <= 8) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Try another id !");
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This Doctor may have never existed...");
        }
    }

}
