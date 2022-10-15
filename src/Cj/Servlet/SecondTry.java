package Cj.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/param")
public class SecondTry extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String age = req.getParameter("age");
        String name = req.getParameter("name");

        System.out.println(age+"--->"+name);

        String[] hobbies = req.getParameterValues("hobbies");

        String str =" ";

        for(String s: hobbies){
            str+=s+",";

        }
        System.out.println(str);
        req.setAttribute("name",name);
        req.getRequestDispatcher("Welcome.jsp").forward(req,resp);

    }
}
