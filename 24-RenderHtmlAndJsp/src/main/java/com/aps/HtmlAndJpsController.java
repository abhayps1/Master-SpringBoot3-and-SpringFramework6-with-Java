package com.aps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HtmlAndJpsController {

	@RequestMapping("say-hello")
	@ResponseBody // this is important else it will not consider return statement as string but as
					// an html page name and it will keep on trying so we see fallback error
	public String sayHello() {
		return "hello welcome to the show";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first HTML page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML body");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}

	// "say-hello-jsp" --> sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp

	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
