package MyProject.web.controller;

import MyProject.domain.SignIn;
import MyProject.service.SignInService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 5, 2012
 * Time: 2:43:03 PM
 * To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("deprecation")
public class SignInController extends SimpleFormController
{
    private SignInService signInService;
    public SignInController() {
    setCommandClass(SignIn.class);
    setCommandName("signIn");
    }

    public void setSignInService(SignInService signInService) {
    this.signInService = signInService;
    }
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
    SignIn signIn = (SignIn) command;
    signInService.add(signIn);
    return new ModelAndView("signInSuccess","signIn",signIn);
    }
}
