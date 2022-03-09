package com.tqpp.Controller;

import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tqpp.Model.Product;
import com.tqpp.Service.ProductService;



@Controller
public class ProductController {
	
@Autowired
	private ProductService pservice;
	


            
    @GetMapping("/view")
	public ModelAndView startpage()
	{
	List<Product> lst=pservice.getAllProducts();
		ModelAndView mv=new ModelAndView("view");
		mv.addObject("productlist",lst);
		return mv;
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id)
	{
		Product s1=pservice.getProductById(id);
		if(s1!=null)
			pservice.deleteProduct(s1);
		return "redirect:/view";
	}
	
	
	
	
	
	
	
	@GetMapping("/add")
	public String AddNewProduct()
	{
		return "add";
		
	}
	
	/*@GetMapping("/save")
	public String saveProduct(@ModelAttribute("product") Product s1,BindingResult results) throws Exception
	{
		
		if(results.hasErrors())
			throw new Exception(("Please enter valid price"));
		pservice.addProduct(s1);
			
		System.out.println("*************************************************************"+s1);
			
		//pservice.addProduct(s1);
		return "redirect:/view";
	}*/
	
	@GetMapping("/save")
	public String saveProduct(@ModelAttribute("product") Product s1) 
	{
		
		
			
		pservice.addProduct(s1);
			
		System.out.println("*************************************************************"+s1);
			
		//pservice.addProduct(s1);
		return "redirect:/view";
	}
	
	
	@GetMapping("/edit")
	public ModelAndView updateProduct(@RequestParam("id") int id) 
	{	
		Product s1=pservice.getProductById(id);
		ModelAndView mv=new ModelAndView("edit");
		mv.addObject("product", s1);
		return mv;
	}

	
	
	@GetMapping("/update")
	public String updateProductSave(@ModelAttribute("product") Product s1) 
	{	
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+s1);
		pservice.updateProduct(s1);
		return "forward:/view";
	}
	
	/*@GetMapping("/update")
	public String updateStudent(@ModelAttribute("pid") int pid,@ModelAttribute ("pname") String pname,@ModelAttribute("price") int price,@ModelAttribute("pdesc") int pdesc ) 
	{	
		
		Product ob =new Product(pid,pname,price,pdesc);
		pservice.updateProduct(ob);
		return "redirect:/view";
	}*/
	
	@ExceptionHandler(value=ConstraintViolationException.class)
	public String someexception(Exception e)
	{
		//System.out.println("errorrrrrrrrrrr"+e);
		return "error";
	}
	
	
	
	
}
