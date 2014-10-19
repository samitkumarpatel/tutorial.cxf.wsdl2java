package wsdl.cxf.tutorial.serviceimplementation;

import javax.jws.WebService;

import wsdl.cxf.tutorial.generatedskliton.User;
import wsdl.cxf.tutorial.generatedskliton.UserNotFoundException;
import wsdl.cxf.tutorial.generatedskliton.UserServices;

@WebService(serviceName="UserServices",targetNamespace="http://tutorial.cxf.wsdl/v1",endpointInterface="wsdl.cxf.tutorial.v1.UserServices")
public class UserServiceImpl implements UserServices{

	@Override
	public User getUser(String parameters) throws UserNotFoundException {
		if("ABC001".equals(parameters)){
			User user=new User();
			user.setName("Samit Ku Patel");
			user.setUId("ABC001");
			user.setUserType("Normal");
			return user;
		}else{
			throw new UserNotFoundException("No any user available with uId :"+parameters);
		}
	}
	

}
