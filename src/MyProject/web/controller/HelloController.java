package MyProject.web.controller;

/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Dec 29, 2011
 * Time: 4:28:28 PM
 * To change this template use File | Settings | File Templates.
 */
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HelloController implements Controller
{
    //protected final Log logger = LogFactory.getLog(getClass());
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // logger.info("Returning hello view");
    return new ModelAndView("hello");
    }
}