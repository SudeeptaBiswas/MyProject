package MyProject.web.controller;

import MyProject.domain.User;
import MyProject.service.SignUpService;
import MyProject.service.SignUpServiceImpl;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 8, 2012
 * Time: 3:02:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignUpController extends SimpleFormController
{
    private SignUpService signUpService;
    private SignUpServiceImpl signUpServiceImpl;

//    @Override
	public SignUpController()	{
		setCommandClass(User.class);
		setCommandName("signUp");
	}

	public void setSignUpService(SignUpService signUpService) {
		this.signUpService = signUpService;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		User user = (User) command;
		//userService.add(user);
        User viewUser=signUpService.getUserByUserEmail(user.getEmail());
        if(viewUser==null) {
            signUpService.setUser(user);
            return new ModelAndView("signUpSuccess", "user", user);
        }

        else
		return new ModelAndView("failed");
	}
}
