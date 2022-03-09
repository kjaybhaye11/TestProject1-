package com.tqpp.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tqpp.Model.Order;
import com.tqpp.Model.OrderDetails;
import com.tqpp.Model.Product;
import com.tqpp.Model.User;
import com.tqpp.Service.OrderServices;
import com.tqpp.Service.ProductService;
import com.tqpp.Service.UserService;
import com.tqpp.item.Item;
import com.tqpp.item.StockNotAvailableException;


@Controller
public class LoginController {

	@Autowired
	private UserService uservices;
	
	@Autowired
	private ProductService prodservice;
	
	@Autowired
	private OrderServices orderservices;
	
	@GetMapping("/")
	public String startpage()
	{
		
		
		return "index";
	}

	@GetMapping("/signin")
	public String login()
	{
		return "signin";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@PostMapping("/addsignup")
	public String login(User user) {
	
		uservices.addUser(user);
		return "redirect:/signin";
	}
	

	
	/*@GetMapping("/validateuser")
	  public String ValidateUser(@ModelAttribute User user, HttpServletRequest req,Model m) {

		System.out.println();
			String usernm = user.getUserName();
			String pass = user.getPassword();
			
			User u1 =uservices.getUserByNameAndPassword(usernm, pass);
			if (u1 == null) 
			{
				m.addAttribute("status", "Invalid username and password");
				return "forward:/signin";
			} 
			else {
				HttpSession session = req.getSession();
				String role=u1.getRole().getRoleType();
				ArrayList<Item>cartlist=new ArrayList<Item>();
				session.setAttribute("cartlist", cartlist);
				session.setAttribute("userrole", role);
				session.setAttribute("username", u1.getUserName());	
				session.setAttribute("userid", u1.getUserId());	
				session.setAttribute("total", 0.0);
				
				
				if(role.equalsIgnoreCase("admin"))
					return "redirect:/view";
				else
					return "redirect:/viewproduct";
				}
			}*/
	
	
	
	@GetMapping("/validateuser")
	public String ValidateUser(@ModelAttribute User user, HttpServletRequest req, Model m) {

		System.out.println();
		String usernm = user.getUserName();
		String pass = user.getPassword();
		System.out.println("============================================="+usernm);
		System.out.println("============================================="+pass);
		
		List<User> u1 =uservices.getUserByName(usernm);
		if (u1 == null || u1.size()==0) 
		{
			m.addAttribute("status", "Invalid username and password");
			return "forward:/signin";
		} 
		else
		{
			User ur=null;
			for(User uu:u1)
			{
				if(BCrypt.checkpw(pass, uu.getPassword()))
				{
					ur=uu;
					break;
					
				}
				
			}
			if(ur==null)
			{
				req.setAttribute("status", "Invalid Password");
				return "forward:/signin";
			}
				
			HttpSession session = req.getSession();
		//	String role = ((User) u1).getRole().getRoleType();
			ArrayList<Item> cartlist = new ArrayList<Item>();
			session.setAttribute("cartlist", cartlist);
	    //  session.setAttribute("userrole", role);
			session.setAttribute("username", ur.getUserName());
			session.setAttribute("userid", ur.getUserId());
			session.setAttribute("total", 0.0);

			if (ur.getRole().getRoleType().equalsIgnoreCase("admin"))
              {
				return "redirect:/view";
              }
			else
				return "redirect:/viewproduct";

		}

	}
	
	
	
	
	@GetMapping("/viewproduct")
	public ModelAndView viewProducts() 
	{
		List<Product> lst = prodservice.getAllProducts();
		System.out.println("(((((((((((((((("+lst);
		ModelAndView mv = new ModelAndView("viewuser");
		mv.addObject("productlist", lst);
		return mv;

	}
	
	
	/*@GetMapping("/cart")
	 public String addCard(HttpServletRequest request)
	 {
		 HttpSession session=request.getSession(false);
		 System.out.println("IIIIIin cart"+session);
		// ArrayList<Item>al=(ArrayList<Item>) session.getAttribute("cartlist");
		 if(session==null)
			 return "redirect:/signin";
		 else {
			 int Pid=Integer.parseInt(request.getParameter("id"));
	       Product p= prodservice.getProductById(Pid);
	       
	        Double total=(Double) session.getAttribute("total");
	        ArrayList<Item>al=(ArrayList<Item>) session.getAttribute("cartlist");
	      al.add(new Item(p.getPid(),p.getPname(),p.getPrice(),1));
	       
	       total=total+p.getPrice()*1;
	       session.setAttribute("cartlist", al);
	       
	       session.setAttribute("total", total);
	       
	    		  return "forward:/viewproduct";
             }
	}*/
	
	@GetMapping("/cart")
	public String addCard(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		ArrayList<Item> list = (ArrayList<Item>) session.getAttribute("cartlist");
		if (session == null)
			return "redirect:/signin";
		else {
			int Pid = Integer.parseInt(request.getParameter("id"));
			Double total = (Double) session.getAttribute("total");

			Product p = prodservice.getProductById(Pid);
			
           int qun = Integer.parseInt(request.getParameter("quan"));
			total=total+p.getPrice()*qun;
			boolean isPresent =false;
			for(Item i: list)
			{
				if(i.getItemid()==p.getPid())
				{
					int q=i.getQuantity();
					i.setQuantity(q+qun);
					isPresent =true;
				}
			}
			
			if(!isPresent)
			{
				
		   list.add(new Item(p.getPid(),p.getPname(),p.getPrice(),qun));
			
			}
	//		int total =(pr.getPrice())*qun;
			
			session.setAttribute("itemlist", list);
			session.setAttribute("total", total);
			
			return "forward:/viewproduct";
			
			
		}
	
	}
	
	
    
    @GetMapping("/viewcart")
	 public String showCard(HttpServletRequest request,Model m)
	 {
		 HttpSession session=request.getSession(false);
		 if(session==null)
			m.addAttribute("status","Empty cart");
		 else {
	     ArrayList<Item>al=(ArrayList<Item>) session.getAttribute("cartlist");    
	       m.addAttribute("cartlist",al);	
	       m.addAttribute("total", session.getAttribute("total"));
             }
		 return "viewcart";
	}
	
	
	
	
	
    
  /*  @GetMapping("/placeorder")
    public String placeorder(HttpServletRequest request)
    {
    	HttpSession httpsession=request.getSession(false);
    	ArrayList<Item> cart=(ArrayList<Item>) httpsession.getAttribute("cartlist");
    	List<Product>plist= prodservice.getAllProducts();
    	
    	 
    	 
     	int uid=(int)httpsession.getAttribute("userid");
     	User u=uservices.getUserById(uid);
     	
     	Order or=new Order();
    	or.setOrderDate(LocalDate.now());
     	or.setUser(u);
     	or.setOrder_status("Placed");
     	System.out.println("########"+u);
     	
     	 List<OrderDetails> or_details= or.getOrderdetails();
     	
    	for(Product p:plist)
    	{
    	   for(Item item:cart)
    	  {
    		if(item.getItemid()==p.getPid())
    		{
    			or_details.add(new OrderDetails(or, p, item.getQuantity()));
    		}
    	  }
    	}
    	orderservices.addOrder(or);
    	
    	return"finalview";
    }*/
	
    
    @GetMapping("/placeorder")
	public String placeorder(HttpServletRequest req)  throws StockNotAvailableException {
	//
		HttpSession httpsession = req.getSession(false);

		ArrayList<Item> cart = (ArrayList<Item>) httpsession.getAttribute("cartlist");
		List<Product> plist = prodservice.getAllProducts();

		int uid = (int) httpsession.getAttribute("userid");
		User u = uservices.getUserById(uid);

		Order or = new Order();
		or.setOrder_status("Placed");
		or.setOrderDate(LocalDate.now());
		or.setUser(u);
		List<OrderDetails> or_details = or.getOrderdetails();

		for (Product p : plist) {
			for (Item item : cart) {
				if (item.getItemid() == p.getPid()) {
	
				//	productservice.manageStock(p.getProductId(),item.getQuantity();		
				//	or_details.add(new OrderDetails(or, p, item.getQuantity()));
					if((p.getStockinhand()-item.getQuantity())<0)
						{
							throw new StockNotAvailableException();
						}
						else
						{
							
						prodservice.manageStock(p.getPid(),item.getQuantity());
						
						or_details.add(new OrderDetails(or, p, item.getQuantity()));
					
						}	
				}
			}

		}

		orderservices.addOrder(or);

		return "finalview";
	}
    
    
    
    @ExceptionHandler(value=StockNotAvailableException.class)
	public String stockException(Exception e)
	{
		return "stockk";
	}
    
    
    
       @GetMapping("/logout")
	public String logout(HttpServletRequest req)
	{
		HttpSession sess = req.getSession();
		
		if(sess!=null)
		{
			sess.invalidate();
		}
		
		return "index";
	}
    
  
	
	}
