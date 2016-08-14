package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import services.IService.IGetProduct;
import Dao.ReturnType;
import Dao.Search;

@Controller
public class HomeController {

	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	//private final static Logger logger = LoggerFactory.getLogger(LogInterceptor.class);
	
	@Autowired
	private IGetProduct producutService;
	
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		String product = producutService.getProduct("taner");
		model.addAttribute("message", product);
		model.addAttribute("counter", ++counter);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;

	}

	@RequestMapping(value = "/ajaxCall", method = RequestMethod.POST)
    public  @ResponseBody ReturnType  getSearchUserProfiles(@RequestBody Search search) {
		
		String sale = producutService.getSale();
		sale += "  " + search.getName() +" " + search.getLastName() + " ";
		ReturnType response = new ReturnType("ok", null);
		response.setReturnData(sale);
		return response;
	}
}
