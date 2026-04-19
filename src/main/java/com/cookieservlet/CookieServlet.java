/*8a. Build a servlet program to  create a cookie to get your name through text box and press submit
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
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 🔹 Get username from request (after submit)
        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60); // ✅ 60 sec = 1 minute
            response.addCookie(userCookie);

            // create count cookie first time
            Cookie countCookie = new Cookie("count", "1");
            countCookie.setMaxAge(60);
            response.addCookie(countCookie);
        }

        // 🔹 Read cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        int count = 0;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                }
                if (cookie.getName().equals("count")) {
                    count = Integer.parseInt(cookie.getValue());
                }
            }
        }

        out.println("<html>");
        out.println("<head><title>Cookie Example</title></head>");
        out.println("<body style='text-align:center;'>");

        if (existingUser != null) {

            count++; // increment

            // update count cookie
            Cookie countCookie = new Cookie("count", String.valueOf(count));
            countCookie.setMaxAge(60);
            response.addCookie(countCookie);

            out.println("<font color=blue><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color=magenta><h2>You have visited this page " + count + " times!</h2></font>");
            out.println("<p>(Cookie expires in 60 seconds)</p>");

            // Logout button
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        }

        else {
            out.println("<h2 style='color:red;'>Welcome Guest! you have been logged out or kindly login first time</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 🔹 Logout → delete cookies
        Cookie userCookie = new Cookie("user", "");
        userCookie.setMaxAge(0);

        Cookie countCookie = new Cookie("count", "");
        countCookie.setMaxAge(0);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        response.sendRedirect("CookieServlet");
    }
}