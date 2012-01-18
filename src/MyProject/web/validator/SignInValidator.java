package MyProject.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import MyProject.domain.SignIn;

/**
 * Created by IntelliJ IDEA.
 * User: Sudeepta
 * Date: 1/6/12
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignInValidator implements Validator
{
//    @Override
    public boolean supports(Class<?> clazz) {
        return SignIn.class.isAssignableFrom(clazz);
    }
//    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
    }
}