package project.example.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import project.example.dao.ProductDaoImpl;

@Controller
@RequestMapping("demo")
public class DemoController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "demo/index";
	}
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello(ModelMap modelMap) {
		modelMap.put("a", "Hello");
		modelMap.put("b", 123);
		return "demo/hello";
	}
	@RequestMapping(value = "productinfo", method = RequestMethod.GET)
	public String productInfo(ModelMap modelMap) {
		ProductDaoImpl productDao = new ProductDaoImpl();
		modelMap.put("product", productDao.find());
		return "demo/productinfo";
	}
	@RequestMapping(value = "productlist", method = RequestMethod.GET)
	public String productList(ModelMap modelMap) {
		ProductDaoImpl productDao = new ProductDaoImpl();
		modelMap.put("productlist", productDao.findAll());
		return "demo/productlist";
	}
}
