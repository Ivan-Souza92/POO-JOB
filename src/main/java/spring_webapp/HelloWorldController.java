package spring_webapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/hello")      
                                     //foi retirado o coment�rio inicial ,para deixar o c�digo mais limpo
public class HelloWorldController {

//	Rota: /hello/hello
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

//	Rota: /hello/processForm
	@RequestMapping("/processForm")
	public String processForm() {
		                                  //foi retirado o System.out.println. N�o era necess�rio.
	 return "showForm";
	}
	
	@RequestMapping("/processFormV2")
	public String upperCaseStudentName(HttpServletRequest request, Model model) {
		String studentName = request.getParameter("studentName").toUpperCase();
		request.getParameter("studentName");           //n�o � necess�rio o System.out.println, foi retirado ! 
		model.addAttribute("message", studentName);
		return "showForm";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(
			@RequestParam("studentName") String studentName, 
			Model model) {
		    studentName = studentName.toUpperCase();
		    model.addAttribute("message", "Hello " + studentName);
		                                                               //Foi retirado o System.out.println 
		    return "showForm";
	}
}
