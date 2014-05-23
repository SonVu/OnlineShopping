<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="layout/resouces.jsp" %>
</head>
<body>
<%@include file="layout/header.jsp" %>
<div class="row">
    <%@ include file="layout/sidebar.jsp" %>
<div class="span9">
    <ul class="breadcrumb">
        <li><a href="/">Home</a> <span class="divider">/</span></li>
        <li class="active"> SHOPPING CART</li>
    </ul>
    <h3> SHOPPING CART [
        <small>${fn:length(cart)} Item(s)</small>
        ]<a href="category.jsp" class="btn btn-large pull-right"><i class="icon-arrow-left"></i> Continue Shopping </a>
    </h3>
    <hr class="soft"/>
    <table class="table table-bordered">
        <tbody>
        <tr>
            <th colspan="2"> I AM ALREADY REGISTERED</th>
        </tr>
        <tr>
            <td colspan="2">
                <form class="form-horizontal">
                    <div class="control-group">
                        <label class="span2 control-label" for="username">Username</label>

                        <div class="controls">
                            <input type="text" id="username" placeholder="Username">
                        </div>
                    </div>
                    </form>
</div>

<div class="control-group">
    <label class="span2 control-label" for="inputPassword">Password</label>

    <div class="controls">
        <input type="password" id="inputPassword" placeholder="Password"> <a href="forgetpass.html">Forgot your
        password?</a>
    </div>
</div>
<div class="control-group">
    <div class="controls">
        <button type="submit" class="btn">Sign in</button>
        <a href="register"> Register now !</a>
    </div>
</div>
</form>
</td>
</tr>
</tbody>
</table>

<table class="table table-bordered">
    <thead>
    <tr>
        <th></th>
        <th>Name</th>
        <th>Quantity/Update</th>
        <th>Price</th>
        <th>Discount</th>
        <th>Tax</th>
        <th>Total</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cart}" var="product">
    <tr>
        <td><img width="60" src="assets/products/4.jpg" alt=""/></td>
        <td>${product.name}</td>
        <td>
            <div class="input-append"><input class="span1" style="max-width:34px" placeholder="1"
                                             id="appendedInputButtons" size="16" type="text">
                <button class="btn" type="button"><i class="icon-minus"></i></button>
                <button class="btn" type="button"><i class="icon-plus"></i></button>
                <button class="btn btn-danger" type="button"><i class="icon-remove icon-white"></i></button>
            </div>
        </td>
        <td>$${product.price}</td>
        <td>${product.id}</td>
        <td>$15.00</td>
        <td>$110.00</td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="6" align="right">Total Price:</td>
        <td> $228.00</td>
    </tr>
    <tr>
        <td colspan="6" align="right">Total Discount:</td>
        <td> $50.00</td>
    </tr>
    <tr>
        <td colspan="6" align="right">Total Tax:</td>
        <td> $31.00</td>
    </tr>
    <tr>
        <td colspan="6" align="right"><strong>TOTAL ($228 - $50 + $31) =</strong></td>
        <td class="label label-important"><strong> $155.00 </strong></td>
    </tr>
    </tbody>
</table>


<table class="table table-bordered">
    <tbody>
    <tr>
        <td>
            <form class="form-inline">
                <label style="min-width:159px"><strong> VOUCHERS CODE:</strong> </label>
                <input type="text" class="input-medium" placeholder="CODE">
                <button type="submit" class="btn"> ADD</button>
            </form>
        </td>
    </tr>

    </tbody>
</table>

<table class="table table-bordered">
    <tbody>
    <tr>
        <th colspan="2">ESTIMATE YOUR SHIPPING</th>
    </tr>
    <tr>
        <td>
            <form class="form-horizontal">
                <div class="control-group">
                    <label class="span2 control-label" for="inputCountry">Country</label>

                    <div class="controls">
                        <input type="text" id="inputCountry" placeholder="Country">
                    </div>
                </div>
                <div class="control-group">
                    <label class="span2 control-label" for="inputPost">Post Code/ Zipcode</label>

                    <div class="controls">
                        <input type="text" id="inputPost" placeholder="Postcode">
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <button type="submit" class="btn">ESTIMATE</button>
                    </div>
                </div>
            </form>
        </td>
    </tr>
    </tbody>
</table>
<a href="category.jsp" class="btn btn-large"><i class="icon-arrow-left"></i> Continue Shopping </a>
<a href="login.jsp" class="btn btn-large pull-right">Next <i class="icon-arrow-right"></i></a>

</div>
</div>
<!-- Footer ------------------------------------------------------ -->
<%@ include file="layout/footer.jsp" %>
<!-- /container -->

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
<script src="assets/js/jquery.js"></script>
<script src="assets/js/google-code-prettify/prettify.js"></script>
<script src="assets/js/application.js"></script>
<script src="assets/js/bootstrap-transition.js"></script>
<script src="assets/js/bootstrap-modal.js"></script>
<script src="assets/js/bootstrap-scrollspy.js"></script>
<script src="assets/js/bootstrap-alert.js"></script>
<script src="assets/js/bootstrap-dropdown.js"></script>
<script src="assets/js/bootstrap-tab.js"></script>
<script src="assets/js/bootstrap-tooltip.js"></script>
<script src="assets/js/bootstrap-popover.js"></script>
<script src="assets/js/bootstrap-button.js"></script>
<script src="assets/js/bootstrap-collapse.js"></script>
<script src="assets/js/bootstrap-carousel.js"></script>
<script src="assets/js/bootstrap-typeahead.js"></script>
<script src="assets/js/bootstrap-affix.js"></script>
<script src="assets/js/jquery.lightbox-0.5.js"></script>
<script src="assets/js/bootsshoptgl.js"></script>
<script type="text/javascript">
    $(function () {
        $('#gallery a').lightBox();
    });
</script>
</body>
</html>