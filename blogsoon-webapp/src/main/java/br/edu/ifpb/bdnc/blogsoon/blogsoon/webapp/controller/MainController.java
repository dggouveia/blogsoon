package br.edu.ifpb.bdnc.blogsoon.blogsoon.webapp.controller;

import br.edu.ifpb.bdnc.blogsoon.blogsoon.webapp.Application;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.context.WebContext;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Controller
@RequestMapping("/")
public class MainController {

    /**
     * Este método renderiza a página index
     */
    @RequestMapping("/")
    public @ResponseBody
    void index(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        WebContext ctx
                = new WebContext(
                        request,
                        response,
                        request.getServletContext(),
                        request.getLocale()
                );
        Application.
                getTemplateEngine().process("index", ctx, response.getWriter());
    }
    
}
