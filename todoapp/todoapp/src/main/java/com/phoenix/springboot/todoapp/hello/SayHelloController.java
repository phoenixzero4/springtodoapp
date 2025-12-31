package com.phoenix.springboot.todoapp.hello;

import com.phoenix.springboot.todoapp.todo.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

    private final TodoService todoService;
	
	private String name = "phoenix";

    SayHelloController(TodoService todoService) {
        this.todoService = todoService;
    }
	
	@RequestMapping
	public String gotoIndex() {
		return "index";
	}
	
	@RequestMapping("string-builder")
	@ResponseBody
	public String indexHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Index Page with StringBuffer");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>Welcome to the Index Page with SB");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
		
	}
	
	@RequestMapping("say-hello-jsp")	
	public String sayHelloJsp(@RequestParam (value = "name", defaultValue="phoenix") String name, ModelMap model) {
	name = titleCase(name, model);
		
		
		return "sayHello";
	}
	
	
	@GetMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, what's going on today?";
	}
	
	@RequestMapping("template")
	public String templatePage() {
		return "template";
	}
	
	public static String titleCase(String string, ModelMap model) {
		char[] nameArray = string.toCharArray();
		
		String newName = "";
		for(int i = 0; i < nameArray.length; i++) {
			if(i == 0) {
				
				nameArray[0] = (char) (((int) nameArray[0] ) -32);
			}
			
			newName += nameArray[i] + "";
		}
		
		model.put("name", newName);
		String name = (String) model.get("name");
		return name;
	}
	
	
}
