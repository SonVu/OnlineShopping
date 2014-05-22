package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shopping_005fcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/pages/layout/resouces.jsp");
    _jspx_dependants.add("/WEB-INF/pages/layout/header.jsp");
    _jspx_dependants.add("/WEB-INF/pages/layout/sidebar.jsp");
    _jspx_dependants.add("/WEB-INF/pages/layout/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("                    <a href=\"/sc\"> <span class=\"btn btn-mini btn-warning\"> <i class=\"icon-shopping-cart icon-white\"></i> [ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(cart)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" ] </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=/sc\"><span class=\"btn btn-mini active\">$155.00</span></a>\r\n");
      out.write("                    <span class=\"btn btn-mini\">&pound;</span>\r\n");
      out.write("                    <span class=\"btn btn-mini\">&euro;</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- ==================================================Header End====================================================================== -->");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"sidebar\" class=\"span3\">\r\n");
      out.write("    <ul class=\"nav nav-list bs-docs-sidenav\" style=\"display: block;\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <li style=\"border:0\"> &nbsp;</li>\r\n");
      out.write("        <li><a href=\"sc\"><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(cart)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" Items in your cart <span class=\"badge badge-warning pull-right\"\r\n");
      out.write("                                                                             style=\"line-height:18px;\">$155.00</span></strong></a></li>\r\n");
      out.write("        <li style=\"border:0\"> &nbsp;</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <img src=\"/assets/products/1.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Product name</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn\" href=\"product_details.jsp\">VIEW</a> <span class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li style=\"border:0\"> &nbsp;</li>\r\n");
      out.write("        <li class=\"last\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <img src=\"/assets/products/2.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Product name</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn\" href=\"product_details.jsp\">VIEW</a> <span class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("<div class=\"span9\">\r\n");
      out.write("    <ul class=\"breadcrumb\">\r\n");
      out.write("        <li><a href=\"/\">Home</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("        <li class=\"active\"> SHOPPING CART</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <h3> SHOPPING CART [\r\n");
      out.write("        <small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(cart)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" Item(s)</small>\r\n");
      out.write("        ]<a href=\"category.jsp\" class=\"btn btn-large pull-right\"><i class=\"icon-arrow-left\"></i> Continue Shopping </a>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("    <table class=\"table table-bordered\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th colspan=\"2\"> I AM ALREADY REGISTERED</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"2\">\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <div class=\"control-group\">\r\n");
      out.write("                        <label class=\"span2 control-label\" for=\"username\">Username</label>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"controls\">\r\n");
      out.write("                            <input type=\"text\" id=\"username\" placeholder=\"Username\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"control-group\">\r\n");
      out.write("    <label class=\"span2 control-label\" for=\"inputPassword\">Password</label>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("        <input type=\"password\" id=\"inputPassword\" placeholder=\"Password\"> <a href=\"forgetpass.html\">Forgot your\r\n");
      out.write("        password?</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"control-group\">\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn\">Sign in</button>\r\n");
      out.write("        <a href=\"register\"> Register now !</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th></th>\r\n");
      out.write("        <th>Name</th>\r\n");
      out.write("        <th>Quantity/Update</th>\r\n");
      out.write("        <th>Price</th>\r\n");
      out.write("        <th>Discount</th>\r\n");
      out.write("        <th>Tax</th>\r\n");
      out.write("        <th>Total</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"6\" align=\"right\">Total Price:</td>\r\n");
      out.write("        <td> $228.00</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"6\" align=\"right\">Total Discount:</td>\r\n");
      out.write("        <td> $50.00</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"6\" align=\"right\">Total Tax:</td>\r\n");
      out.write("        <td> $31.00</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"6\" align=\"right\"><strong>TOTAL ($228 - $50 + $31) =</strong></td>\r\n");
      out.write("        <td class=\"label label-important\"><strong> $155.00 </strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("    <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("            <form class=\"form-inline\">\r\n");
      out.write("                <label style=\"min-width:159px\"><strong> VOUCHERS CODE:</strong> </label>\r\n");
      out.write("                <input type=\"text\" class=\"input-medium\" placeholder=\"CODE\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn\"> ADD</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("    <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th colspan=\"2\">ESTIMATE YOUR SHIPPING</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("            <form class=\"form-horizontal\">\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"span2 control-label\" for=\"inputCountry\">Country</label>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input type=\"text\" id=\"inputCountry\" placeholder=\"Country\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"span2 control-label\" for=\"inputPost\">Post Code/ Zipcode</label>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input type=\"text\" id=\"inputPost\" placeholder=\"Postcode\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn\">ESTIMATE</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<a href=\"category.jsp\" class=\"btn btn-large\"><i class=\"icon-arrow-left\"></i> Continue Shopping </a>\r\n");
      out.write("<a href=\"login.html\" class=\"btn btn-large pull-right\">Next <i class=\"icon-arrow-right\"></i></a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Footer ------------------------------------------------------ -->\r\n");
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
      out.write("<!-- /container -->\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("categoryItem");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("id");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryItem.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryItem.parentId == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <li class=\"subMenu\"><a style=\"text-transform: uppercase\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryItem.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                    <ul>\r\n");
        out.write("                        ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                    </ul>\r\n");
        out.write("                </li>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("innerCategory");
    _jspx_th_c_forEach_1.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${innerCategory.parentId == id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li><a class=\"active\" href=\"/category/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${innerCategory.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/1\" style=\"text-transform: capitalize\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${innerCategory.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(innerCategory.products)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write(")</a></li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("product");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("        <td><img width=\"60\" src=\"assets/products/4.jpg\" alt=\"\"/></td>\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("        <td>\r\n");
          out.write("            <div class=\"input-append\"><input class=\"span1\" style=\"max-width:34px\" placeholder=\"1\"\r\n");
          out.write("                                             id=\"appendedInputButtons\" size=\"16\" type=\"text\">\r\n");
          out.write("                <button class=\"btn\" type=\"button\"><i class=\"icon-minus\"></i></button>\r\n");
          out.write("                <button class=\"btn\" type=\"button\"><i class=\"icon-plus\"></i></button>\r\n");
          out.write("                <button class=\"btn btn-danger\" type=\"button\"><i class=\"icon-remove icon-white\"></i></button>\r\n");
          out.write("            </div>\r\n");
          out.write("        </td>\r\n");
          out.write("        <td>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("        <td>$15.00</td>\r\n");
          out.write("        <td>$110.00</td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
