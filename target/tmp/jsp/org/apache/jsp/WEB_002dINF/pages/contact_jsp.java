package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/pages/layout/resouces.jsp");
    _jspx_dependants.add("/WEB-INF/pages/layout/header.jsp");
    _jspx_dependants.add("/WEB-INF/pages/layout/footer.jsp");
  }

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Online Shopping - SonVu</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<!-- Less styles\r\n");
      out.write("<link rel=\"stylesheet/less\" type=\"text/css\" href=\"less/bootsshop.less\">\r\n");
      out.write("<script src=\"less.js\" type=\"text/javascript\"></script>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!-- Le styles  -->\r\n");
      out.write("<link href=\"/assets/css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"/assets/css/bootstrap-responsive.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"/assets/css/docs.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("<link href=\"/assets/style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"/assets/js/google-code-prettify/prettify.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- Le fav and touch icons -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"/assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"/assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"/assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"/assets/ico/apple-touch-icon-57-precomposed.png\">");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!-- Navbar\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("    <div class=\"navbar-inner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a id=\"logoM\" href=\"/\"><img src=\"/assets/img/logo.png\" alt=\"Bootsshop\"/></a>\r\n");
      out.write("            <a data-target=\"#sidebar\" data-toggle=\"collapse\" class=\"btn btn-navbar\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"nav-collapse\">\r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li class=\"\"><a href=\"/\">Home </a></li>\r\n");
      out.write("                    <li class=\"\"><a href=\"sf\">Specials Offer</a></li>\r\n");
      out.write("                    <li class=\"\"><a href=\"contact\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <form action=\"#\" class=\"navbar-search pull-left\">\r\n");
      out.write("                    <input id=\"srchFld\" type=\"text\" placeholder=\"I'm looking for ...\" class=\"search-query span5\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("                <ul class=\"nav pull-right\">\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">Login <b class=\"caret\"></b></a>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"dropdown-menu\">\r\n");
      out.write("                            <form class=\"form-horizontal loginFrm\">\r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <input type=\"text\" class=\"span2\" id=\"inputEmail\" placeholder=\"Email\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <input type=\"password\" class=\"span2\" id=\"inputPassword\" placeholder=\"Password\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <label class=\"checkbox\">\r\n");
      out.write("                                        <input type=\"checkbox\"> Remember me\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-block\">Sign in</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.nav-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /navbar-inner -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ======================================================================================================================== -->\r\n");
      out.write("<div id=\"mainBody\" class=\"container\">\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"span12\">\r\n");
      out.write("                <a href=\"/\"><img src=\"/assets/img/logo.png\" alt=\"Bootsshop\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"pull-right\"><br/>\r\n");
      out.write("                    <a href=\"sc\"> <span class=\"btn btn-mini btn-warning\"> <i class=\"icon-shopping-cart icon-white\"></i> [ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(cart)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" ] </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"sc\"><span class=\"btn btn-mini active\">$155.00</span></a>\r\n");
      out.write("                    <span class=\"btn btn-mini\">&pound;</span>\r\n");
      out.write("                    <span class=\"btn btn-mini\">&euro;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- ==================================================Header End====================================================================== -->");
      out.write("\r\n");
      out.write("    <hr class=\"soften\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <h1>Visit us</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"soften\"/>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h4>Contact Details</h4>\r\n");
      out.write("\r\n");
      out.write("            <p> 18 Fresno,<br/> CA 93727, USA\r\n");
      out.write("                <br/><br/>\r\n");
      out.write("                info@bootsshop.com<br/>\r\n");
      out.write("                ï»¿Tel 123-456-6780<br/>\r\n");
      out.write("                Fax 123-456-5679<br/>\r\n");
      out.write("                web:bootsshop.com\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h4>Opening Hours</h4>\r\n");
      out.write("            <h5> Monday - Friday</h5>\r\n");
      out.write("\r\n");
      out.write("            <p>09:00am - 09:00pm<br/><br/></p>\r\n");
      out.write("            <h5>Saturday</h5>\r\n");
      out.write("\r\n");
      out.write("            <p>09:00am - 07:00pm<br/><br/></p>\r\n");
      out.write("            <h5>Sunday</h5>\r\n");
      out.write("\r\n");
      out.write("            <p>12:30pm - 06:00pm<br/><br/></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h4>Email Us</h4>\r\n");
      out.write("\r\n");
      out.write("            <form class=\"form-horizontal\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"text\" placeholder=\"name\" class=\"input-xlarge\"/>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"text\" placeholder=\"email\" class=\"input-xlarge\"/>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"text\" placeholder=\"subject\" class=\"input-xlarge\"/>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"control-group\">\r\n");
      out.write("                        <textarea rows=\"3\" id=\"textarea\" class=\"input-xlarge\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"btn btn-large\" type=\"submit\">Send Messages</button>\r\n");
      out.write("\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"span12\">\r\n");
      out.write("            <iframe width=\"1170\" height=\"250\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\"\r\n");
      out.write("                    src=\"https://maps.google.co.uk/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=18+California,+Fresno,+CA,+United+States&amp;aq=0&amp;oq=18+California+united+state&amp;sll=39.9589,-120.955336&amp;sspn=0.007114,0.016512&amp;ie=UTF8&amp;hq=&amp;hnear=18,+Fresno,+California+93727,+United+States&amp;t=m&amp;ll=36.732762,-119.695787&amp;spn=0.017197,0.100336&amp;z=14&amp;output=embed\"></iframe>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <small><a\r\n");
      out.write("                    href=\"https://maps.google.co.uk/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=18+California,+Fresno,+CA,+United+States&amp;aq=0&amp;oq=18+California+united+state&amp;sll=39.9589,-120.955336&amp;sspn=0.007114,0.016512&amp;ie=UTF8&amp;hq=&amp;hnear=18,+Fresno,+California+93727,+United+States&amp;t=m&amp;ll=36.732762,-119.695787&amp;spn=0.017197,0.100336&amp;z=14\"\r\n");
      out.write("                    style=\"color:#0000FF;text-align:left\">View Larger Map</a></small>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Footer ------------------------------------------------------ -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<hr class=\"soft\">\r\n");
      out.write("<div id=\"footerSection\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"span3\">\r\n");
      out.write("            <h5>ACCOUNT</h5>\r\n");
      out.write("            <a href=\"login.html\">YOUR ACCOUNT</a>\r\n");
      out.write("            <a href=\"login.html\">PERSONAL INFORMATION</a>\r\n");
      out.write("            <a href=\"login.html\">ADDRESSES</a>\r\n");
      out.write("            <a href=\"login.html\">DISCOUNT</a>\r\n");
      out.write("            <a href=\"login.html\">ORDER HISTORY</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3\">\r\n");
      out.write("            <h5>INFORMATION</h5>\r\n");
      out.write("            <a href=\"contact.jsp\">CONTACT</a>\r\n");
      out.write("            <a href=\"register.html\">REGISTRATION</a>\r\n");
      out.write("            <a href=\"legal_notice.html\">LEGAL NOTICE</a>\r\n");
      out.write("            <a href=\"tac.html\">TERMS AND CONDITIONS</a>\r\n");
      out.write("            <a href=\"faq.html\">FAQ</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3\">\r\n");
      out.write("            <h5>OUR OFFERS</h5>\r\n");
      out.write("            <a href=\"#\">NEW PRODUCTS</a>\r\n");
      out.write("            <a href=\"#\">TOP SELLERS</a>\r\n");
      out.write("            <a href=\"special_offer.jsp\">SPECIAL OFFERS</a>\r\n");
      out.write("            <a href=\"#\">MANUFACTURERS</a>\r\n");
      out.write("            <a href=\"#\">SUPPLIERS</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"socialMedia\" class=\"span3 pull-right\">\r\n");
      out.write("            <h5>SOCIAL MEDIA </h5>\r\n");
      out.write("            <a href=\"#\"><img width=\"60\" src=\"/assets/img/facebook.png\" title=\"facebook\"/></a>\r\n");
      out.write("            <a href=\"#\"><img width=\"60\" src=\"/assets/img/twitter.png\" title=\"twitter\"/></a>\r\n");
      out.write("            <a href=\"#\"><img width=\"60\" src=\"/assets/img/rss.png\" title=\"rss\"/></a>\r\n");
      out.write("            <a href=\"#\"><img width=\"60\" src=\"/assets/img/youtube.png\" title=\"youtube\"/></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"soft\">\r\n");
      out.write("    <p class=\"pull-right\">&copy; Boot'sshop</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- /container -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Le javascript\r\n");
      out.write("================================================== -->\r\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://platform.twitter.com/widgets.js\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"assets/js/google-code-prettify/prettify.js\"></script>\r\n");
      out.write("<script src=\"assets/js/application.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-transition.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-modal.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-alert.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-tab.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-popover.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-button.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-collapse.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-carousel.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap-affix.js\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.lightbox-0.5.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootsshoptgl.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('#gallery a').lightBox();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
