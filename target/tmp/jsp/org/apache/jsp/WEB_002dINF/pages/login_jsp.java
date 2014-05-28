package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Core CSS - Include with every page -->\r\n");
      out.write("    <link href=\"/assets/admin/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/assets/admin/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- SB Admin CSS - Include with every page -->\r\n");
      out.write("    <link href=\"/assets/admin/css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("            <div class=\"login-panel panel panel-default\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\">Please Sign In</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <form role=\"form\" action=\"/j_spring_security_check\" method=\"POST\">\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Name\" name=\"j_username\" type=\"text\" autofocus>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Password\" name=\"j_password\" type=\"password\"\r\n");
      out.write("                                       value=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Login</button>\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Core Scripts - Include with every page -->\r\n");
      out.write("<script src=\"/assets/admin/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("<script src=\"/assets/admin/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/assets/admin/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- SB Admin Scripts - Include with every page -->\r\n");
      out.write("<script src=\"/assets/admin/js/sb-admin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
