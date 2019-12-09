package fr.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/7")
	@ResponseBody
	public String doctor7() {
		return "Sylvester McCoy";
	}

	@RequestMapping("/doctor/9")
	@ResponseBody
	public String doctor9() {
		return "Christopher Eccleston";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13() {
		return "Jodie Whittaker";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul><li><a href='/doctor/1'>First doctor</a></li>" +
				"<li><a href='/doctor/7'>Second doctor</a></li>" +
				"<li><a href='/doctor/9'>Third doctor</a></li>" +
				"<li><a href='/doctor/13'>Thirteenth doctor</a></li>";
	}
}
