/*6b. Build a servlet program to  create a cookie to get your name through text box and press submit
 *  button to display the message by greeting Welcome back your name ! ,you have visited this 
 *  page n times ( n = number of your visit ) and demonstrate the expiry of cookie also. 
*/
package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        // Read cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        int visitCount = 0;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    existingUser = c.getValue();
                }
                if (c.getName().equals("count")) {
                    visitCount = Integer.parseInt(c.getValue());
                }
            }
        }

        // If user submits name (first time login)
        if (userName != null && !userName.isEmpty()) {

            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(30); // expires in 30 seconds

            Cookie countCookie = new Cookie("count", "1");
            countCookie.setMaxAge(30);

            response.addCookie(userCookie);
            response.addCookie(countCookie);

            response.sendRedirect("CookieServlet");
            return;
        }

        // HTML output
        out.println("<html>");
        out.println("<head><title>Cookie Example</title></head>");
        out.println("<body>");

        if (existingUser != null) {
            visitCount++;

            Cookie countCookie = new Cookie("count", String.valueOf(visitCount));
            countCookie.setMaxAge(30);
            response.addCookie(countCookie);

            out.println("<h2 style='color:blue'>Welcome back, " + existingUser + "!</h2>");
            out.println("<h2 style='color:magenta'>You have visited this page " + visitCount + " times!</h2>");

            // Logout button
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");

        } else {
            out.println("<h2 style='color:red'>Welcome Guest! Please login first time</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Delete cookies (logout)
        Cookie userCookie = new Cookie("user", "");
        userCookie.setMaxAge(0);

        Cookie countCookie = new Cookie("count", "");
        countCookie.setMaxAge(0);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        response.sendRedirect("CookieServlet");
    }
}