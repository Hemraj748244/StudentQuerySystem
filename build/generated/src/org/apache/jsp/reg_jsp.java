package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>New Registration!</h1>\n");
      out.write("        <hr>\n");
      out.write("        <p></p>\n");
      out.write("        \n");
      out.write("        <form action=\"./LoginCheck\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td><input type=\"email\" \n");
      out.write("                               name=\"email\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" \n");
      out.write("                               name=\"pass\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td>Confirm Password</td>\n");
      out.write("                    <td><input type=\"password\" \n");
      out.write("                               name=\"cpass\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"uname\" \n");
      out.write("                               required /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td>Mobile</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mobile\" \n");
      out.write("                               required /></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>User Type</td>\n");
      out.write("                    <td> <select name=\"utype\">\n");
      out.write("                            <option>Student</option>\n");
      out.write("                            <option>Faculty</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Branch/Department</td>\n");
      out.write("                    <td> <select name=\"depart\">\n");
      out.write("                            <option>CSE</option>\n");
      out.write("                            <option>MECH</option>\n");
      out.write("                            <option>EC</option>\n");
      out.write("                            <option>Civil</option>\n");
      out.write("                            <option>IT</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"Submit\" value=\"Submit\" \n");
      out.write("                               name=\"b1\"  /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
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
