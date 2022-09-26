package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author odohd
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
                String firstNum = request.getParameter("first");
                String secondNum = request.getParameter("second");

                request.setAttribute("first", firstNum);
                request.setAttribute("second", secondNum);

               
              
        if (firstNum == null || firstNum.equals("") || 
                secondNum == null || secondNum.equals("")){
            request.setAttribute("result", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        
        try{
            int num1 = Integer.parseInt(firstNum);
            int num2 = Integer.parseInt(secondNum);
            int output;
            
            String btn = request.getParameter("btn");
            
            if(btn.equals("+")){
                output = num1 + num2;
                request.setAttribute("result", output);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
            }
            
            else if(btn.equals("-")){
                output = num1 - num2;
                request.setAttribute("result", output);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
            }
            
            else if(btn.equals("*")){
                output = num1 * num2;
                request.setAttribute("result", output);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
            }
            
            else if(btn.equals("%")){
                output = num1 % num2;
                request.setAttribute("result", output);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
            }
        } 
        
        catch (NumberFormatException e){
            request.setAttribute("result", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
       
    }

}
