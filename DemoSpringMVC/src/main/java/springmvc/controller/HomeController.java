package springmvc.controller;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model )
	{
		System.out.println("This is Home pege");
	 model.addAttribute("name", "Kunal Jaybhaye");
	 model.addAttribute("id", 22);
	 
	 
	 List<String> friend = new ArrayList<String>();
	 friend.add("Kunal");
	 friend.add("Ram");
	 friend.add("Sham");
	 
	 model.addAttribute("f", friend);
	 
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		//create model and view Object
		System.out.println("This is help controller");
		ModelAndView modelAndView= new ModelAndView();
		
		//set data
		modelAndView.addObject("name", "uattam Rapodar");
		modelAndView.addObject("rno", 112);
		
		
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer>list= new ArrayList();
		list.add(233);
		list.add(451);
		list.add(1236);
		list.add(9874);
		modelAndView.addObject("mark", list);
		
		
		//set view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	
}
// List<String> friend=(List<String>) request.getAttribute("f");
/*
<%         for(String s:friend){

%>

<h1>=s</h1>

<%} %>*/

//error1
/*
LocalDateTime time=(LocalDateTime)request.getAttribute("time");
<h1> your Date & Time is is: <%=time.toString()%>  </h1>
*/

/*<c:forEach var="item" items="${mark }">
<h1>${item}</h1>
</c:forEach>*/