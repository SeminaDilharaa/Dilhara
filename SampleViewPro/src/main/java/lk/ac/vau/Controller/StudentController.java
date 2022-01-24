package lk.ac.vau.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/hello/{msg}")
	public String Hello(@PathVariable("msg")String msg,Model model) {
		
		List<String>Degrees=new ArrayList<String>();
		Degrees.add("IT");
		Degrees.add("CSC");
		Degrees.add("ENS");
		Map<String, String>faculties=new HashMap<String,String>();
		
		faculties.put("FAS", "Faculty of Applied Science");
		faculties.put("FBS", "Faculty of Business Studeies");
		
		model.addAttribute("message",msg);
		model.addAttribute("degrees",Degrees);
		
		return "Index";
	}
	
	

}
