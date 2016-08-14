package services.IService;

import org.springframework.stereotype.Service;


@Service
public interface IGetProduct {

	
	String getProduct(String id);
	String getSale();
}
