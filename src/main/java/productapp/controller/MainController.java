package productapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import productapp.dao.ProductDao;
import productapp.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String mainHandler(Model m) {
		List<Product> products = productDao.getProducts();
		m.addAttribute("products",products);
		return "/index";
	}
	
	@RequestMapping("/add-product")
	public String addProductHandler(Model m) {
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}
	
	@RequestMapping("/handle-product")
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/");
		return redirectview;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request) {
		
		this.productDao.deleteProduct(productId);
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/");
		return redirectview;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,Model model) {
		Product product =productDao.getProduct(productId);
		model.addAttribute("product",product);
		return "update_form";
	}
}
