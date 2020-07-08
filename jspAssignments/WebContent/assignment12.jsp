<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
       <font color=red>
          <%! int i,n;
               String s1;
          %>
          <%   s1= request.getParameter("num");
               n=s1.length();
               i=0;
               do
               {
                    char ch=s1.charAt(i);
                    switch(ch)
                    {
                         case '0': out.println("Zero  ");
                              break;
                         case '1': out.println("One  ");
                              break;
                         case '2': out.println("Two  ");
                              break;
                         case '3': out.println("Three  ");
                              break;
                         case '4': out.println("Four ");
                              break;
                         case '5': out.println("Five  ");
                              break;
                         case '6': out.println("Six  ");
                              break;
                         case '7': out.println("Seven  ");
                              break;
                         case '8': out.println("Eight  ");
                              break;
                         case '9': out.println("Nine  ");
                              break;
                    }
                    i++;
               }
               while(i<n);
          %>
       </font>
   </body>
</html>