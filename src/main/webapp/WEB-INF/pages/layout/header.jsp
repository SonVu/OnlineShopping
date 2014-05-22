<%--
  Created by IntelliJ IDEA.
  User: Imperius
  Date: 5/15/2014
  Time: 7:53 PM
  To change this template use File | Settings | File Templates.
--%>
<!-- Navbar
================================================== -->
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a id="logoM" href="/"><img src="/assets/img/logo.png" alt="Bootsshop"/></a>
            <a data-target="#sidebar" data-toggle="collapse" class="btn btn-navbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <div class="nav-collapse">
                <ul class="nav">
                    <li class=""><a href="/">Home </a></li>
                    <li class=""><a href="sf">Specials Offer</a></li>
                    <li class=""><a href="contact">Contact</a></li>
                </ul>
                <form action="#" class="navbar-search pull-left">
                    <input id="srchFld" type="text" placeholder="I'm looking for ..." class="search-query span5"/>
                </form>
                <ul class="nav pull-right">
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">Login <b class="caret"></b></a>

                        <div class="dropdown-menu">
                            <form class="form-horizontal loginFrm">
                                <div class="control-group">
                                    <input type="text" class="span2" id="inputEmail" placeholder="Email">
                                </div>
                                <div class="control-group">
                                    <input type="password" class="span2" id="inputPassword" placeholder="Password">
                                </div>
                                <div class="control-group">
                                    <label class="checkbox">
                                        <input type="checkbox"> Remember me
                                    </label>
                                    <button type="submit" class="btn btn-block">Sign in</button>
                                </div>
                            </form>
                        </div>
                    </li>
                </ul>
            </div>
            <!-- /.nav-collapse -->
        </div>
    </div>
    <!-- /navbar-inner -->
</div>
<!-- ======================================================================================================================== -->
<div id="mainBody" class="container">
    <header id="header">
        <div class="row">
            <div class="span12">
                <a href="/"><img src="/assets/img/logo.png" alt="Bootsshop"/></a>

                <div class="pull-right"><br/>
                    <a href="/sc"> <span class="btn btn-mini btn-warning"> <i class="icon-shopping-cart icon-white"></i> [ ${fn:length(cart)} ] </span>
                    </a>
                    <a href=/sc"><span class="btn btn-mini active">$155.00</span></a>
                    <span class="btn btn-mini">&pound;</span>
                    <span class="btn btn-mini">&euro;</span>
                </div>
            </div>
        </div>
        <div class="clr"></div>
    </header>
    <!-- ==================================================Header End====================================================================== -->