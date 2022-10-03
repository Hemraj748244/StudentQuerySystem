package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbutil.DBConnect;
import java.sql.*;

public final class adminstudentlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String email=""; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\"\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminheader.jsp", out, false);
      out.write("\n");
      out.write("        <h3>Welcome Admin!</h3>\n");
      out.write("     \n");
      out.write("        <p>View All Student\n");
      out.write("           \n");
      out.write("            ");
      out.write("   \n");
      out.write("         <hr>\n");
      out.write("         <form >\n");
      out.write("         <table>\n");
      out.write("             <tr>\n");
      out.write("                 <td>Email</td>\n");
      out.write("                 <td>Name</td>\n");
      out.write("                 <td>Mobile</td>\n");
      out.write("                 <td>Department/Branch</td>\n");
      out.write("                 <td>Controls</td>\n");
      out.write("             </tr>\n");
      out.write("         ");

         
             DBConnect x = new DBConnect();
             ResultSet rs = x.queryReturner(
                     "Select email,name,mobile,department from reg where logintype='Student'");
             while(rs.next())
         {
      out.write("\n");
      out.write("           <tr>\n");
      out.write("               ");
 email = rs.getString(1); 
      out.write("\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               <td>");
      out.print( email );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("               \n");
      out.write("                 <td>");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                 <td>");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("                \n");
      out.write("             </tr>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         ");
}
         
         
      out.write("\n");
      out.write("         </table>\n");
      out.write("         </form>\n");
      out.write("         ");

             if(request.getParameter("b1")!=null)
             {
                 out.println(request.getParameter("email"));
             }
             
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
