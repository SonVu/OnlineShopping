package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class special_005foffer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<div class=\"row\">\r\n");
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
      out.write("<ul class=\"breadcrumb\">\r\n");
      out.write("    <li><a href=\"index.html\">Home</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("    <li class=\"active\">Special offers</li>\r\n");
      out.write("</ul>\r\n");
      out.write("<h3> 20% Discount Special offer\r\n");
      out.write("    <small class=\"pull-right\"> 40 products are available</small>\r\n");
      out.write("</h3>\r\n");
      out.write("<hr class=\"soft\"/>\r\n");
      out.write("<form class=\"form-horizontal span6\">\r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("        <label class=\"control-label alignL\">Sort By </label>\r\n");
      out.write("        <select>\r\n");
      out.write("            <option>Priduct name A - Z</option>\r\n");
      out.write("            <option>Priduct name Z - A</option>\r\n");
      out.write("            <option>Priduct Stoke</option>\r\n");
      out.write("            <option>Price Lowest first</option>\r\n");
      out.write("        </select>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"myTab\" class=\"pull-right\">\r\n");
      out.write("    <a href=\"#listView\" data-toggle=\"tab\"><span class=\"btn btn-large\"><i class=\"icon-list\"></i></span></a>\r\n");
      out.write("    <a href=\"#blockView\" data-toggle=\"tab\"><span class=\"btn btn-large active\"><i\r\n");
      out.write("            class=\"icon-th-large icon-white\"></i></span></a>\r\n");
      out.write("</div>\r\n");
      out.write("<br class=\"clr\"/>\r\n");
      out.write("\r\n");
      out.write("<div class=\"tab-content\">\r\n");
      out.write("<div class=\"tab-pane\" id=\"listView\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div id=\"productView\" class=\"span2\">\r\n");
      out.write("            <img src=\"assets/products/4.jpg\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h3>New | Available</h3>\r\n");
      out.write("            <hr class=\"soft\"/>\r\n");
      out.write("            <h5>Product Name </h5>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the\r\n");
      out.write("                industry's standard dummy text ever since the 1500s ...\r\n");
      out.write("            </p>\r\n");
      out.write("            <a class=\"btn btn-small pull-right\" href=\"product_details.jsp\">View Details</a>\r\n");
      out.write("            <br class=\"clr\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3 alignR\">\r\n");
      out.write("            <form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("                <h3> $222.00</h3>\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\"> Adds product to compair\r\n");
      out.write("                </label><br/>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\"><i class=\" icon-shopping-cart\"></i> Add to cart</a>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\">VIEW</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div id=\"productView\" class=\"span2\">\r\n");
      out.write("            <img src=\"assets/products/4.jpg\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h3>New | Available</h3>\r\n");
      out.write("            <hr class=\"soft\"/>\r\n");
      out.write("            <h5>Product Name </h5>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the\r\n");
      out.write("                industry's standard dummy text ever since the 1500s ...\r\n");
      out.write("            </p>\r\n");
      out.write("            <a class=\"btn btn-small pull-right\" href=\"product_details.jsp\">View Details</a>\r\n");
      out.write("            <br class=\"clr\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3 alignR\">\r\n");
      out.write("            <form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("                <h3> $222.00</h3>\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\"> Adds product to compair\r\n");
      out.write("                </label><br/>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\"><i class=\" icon-shopping-cart\"></i> Add to cart</a>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\">VIEW</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div id=\"productView\" class=\"span2\">\r\n");
      out.write("            <img src=\"assets/products/4.jpg\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h3>New | Available</h3>\r\n");
      out.write("            <hr class=\"soft\"/>\r\n");
      out.write("            <h5>Product Name </h5>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the\r\n");
      out.write("                industry's standard dummy text ever since the 1500s ...\r\n");
      out.write("            </p>\r\n");
      out.write("            <a class=\"btn btn-small pull-right\" href=\"product_details.jsp\">View Details</a>\r\n");
      out.write("            <br class=\"clr\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3 alignR\">\r\n");
      out.write("            <form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("                <h3> $222.00</h3>\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\"> Adds product to compair\r\n");
      out.write("                </label><br/>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\"><i class=\" icon-shopping-cart\"></i> Add to cart</a>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\">VIEW</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div id=\"productView\" class=\"span2\">\r\n");
      out.write("            <img src=\"assets/products/4.jpg\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h3>New | Available</h3>\r\n");
      out.write("            <hr class=\"soft\"/>\r\n");
      out.write("            <h5>Product Name </h5>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the\r\n");
      out.write("                industry's standard dummy text ever since the 1500s ...\r\n");
      out.write("            </p>\r\n");
      out.write("            <a class=\"btn btn-small pull-right\" href=\"product_details.jsp\">View Details</a>\r\n");
      out.write("            <br class=\"clr\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3 alignR\">\r\n");
      out.write("            <form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("                <h3> $222.00</h3>\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\"> Adds product to compair\r\n");
      out.write("                </label><br/>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\"><i class=\" icon-shopping-cart\"></i> Add to cart</a>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\">VIEW</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div id=\"productView\" class=\"span2\">\r\n");
      out.write("            <img src=\"assets/products/4.jpg\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h3>New | Available</h3>\r\n");
      out.write("            <hr class=\"soft\"/>\r\n");
      out.write("            <h5>Product Name </h5>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the\r\n");
      out.write("                industry's standard dummy text ever since the 1500s ...\r\n");
      out.write("            </p>\r\n");
      out.write("            <a class=\"btn btn-small pull-right\" href=\"product_details.jsp\">View Details</a>\r\n");
      out.write("            <br class=\"clr\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3 alignR\">\r\n");
      out.write("            <form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("                <h3> $222.00</h3>\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\"> Adds product to compair\r\n");
      out.write("                </label><br/>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\"><i class=\" icon-shopping-cart\"></i> Add to cart</a>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\">VIEW</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div id=\"productView\" class=\"span2\">\r\n");
      out.write("            <img src=\"assets/products/4.jpg\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("            <h3>New | Available</h3>\r\n");
      out.write("            <hr class=\"soft\"/>\r\n");
      out.write("            <h5>Product Name </h5>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("\r\n");
      out.write("                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the\r\n");
      out.write("                industry's standard dummy text ever since the 1500s ...\r\n");
      out.write("            </p>\r\n");
      out.write("            <a class=\"btn btn-small pull-right\" href=\"product_details.jsp\">View Details</a>\r\n");
      out.write("            <br class=\"clr\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span3 alignR\">\r\n");
      out.write("            <form class=\"form-horizontal qtyFrm\">\r\n");
      out.write("                <h3> $222.00</h3>\r\n");
      out.write("                <label class=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\"> Adds product to compair\r\n");
      out.write("                </label><br/>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\"><i class=\" icon-shopping-cart\"></i> Add to cart</a>\r\n");
      out.write("                <a href=\"product_details.jsp\" class=\"btn btn-large\">VIEW</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"tab-pane  active\" id=\"blockView\">\r\n");
      out.write("    <ul class=\"thumbnails\">\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"span3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"product_details.jsp\"><img src=\"assets/products/4.jpg\" alt=\"\"/></a>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h5>Manicure &amp; Pedicure</h5>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem Ipsum is simply dummy text.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4><a class=\"btn btn-large\" href=\"product_details.jsp\">VIEW</a> <span\r\n");
      out.write("                            class=\"pull-right\">$222.00</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <hr class=\"soft\"/>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"compair.html\" class=\"btn btn-large pull-right\">Compair Product</a>\r\n");
      out.write("\r\n");
      out.write("<div class=\"pagination\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"#\">&lsaquo;</a></li>\r\n");
      out.write("        <li><a href=\"#\">1</a></li>\r\n");
      out.write("        <li><a href=\"#\">2</a></li>\r\n");
      out.write("        <li><a href=\"#\">3</a></li>\r\n");
      out.write("        <li><a href=\"#\">4</a></li>\r\n");
      out.write("        <li><a href=\"#\">...</a></li>\r\n");
      out.write("        <li><a href=\"#\">&rsaquo;</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<br class=\"clr\"/>\r\n");
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
}
