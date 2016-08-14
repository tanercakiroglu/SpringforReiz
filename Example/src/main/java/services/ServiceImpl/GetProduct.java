package services.ServiceImpl;

import org.springframework.stereotype.Service;

import aspects.Loggable;
import services.IService.IGetProduct;


@Service
public class GetProduct implements IGetProduct {

	@Override
	@Loggable(message="getProduct")
	public String getProduct(String id) {
		
		return "IPhone";
	}

	@Loggable(message="getSale")
	@Override
	public String getSale() {
		
		return "10 Unit" ;
	}

}
