package MyProject.web.controller;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 1, 2012
 * Time: 5:27:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActionController implements Controller
{

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        // logger.info("Returning hello view");
    return new ModelAndView("construction");
    }
}
