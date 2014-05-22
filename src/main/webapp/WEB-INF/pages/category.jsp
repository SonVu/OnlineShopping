<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="layout/resouces.jsp" %>
    <%@ taglib tagdir="/WEB-INF/tags/util" prefix="util" %>
    <c:url var="firstUrl" value="/category/${id}/${1}"/>
    <c:url var="lastUrl" value="/category/${id}/${products.totalPages}"/>
    <c:url var="prevUrl" value="/category/${id}/${currentIndex - 1}"/>
    <c:url var="nextUrl" value="/category/${id}/${currentIndex + 1}"/>
</head>
<body>
<%@include file="layout/header.jsp" %>
<div class="row">
    <%@ include file="layout/sidebar.jsp" %>
    <div class="span9">
        <ul class="breadcrumb">
            <li><a href="index.html">Home</a> <span class="divider">/</span></li>
            <li class="active">Products Name</li>
        </ul>
        <h3> Products Name
            <small class="pull-right"> 40 products are available</small>
        </h3>
        <hr class="soft"/>
        <form class="form-horizontal span6">
            <div class="control-group">
                <label class="control-label alignL">Sort By </label>
                <select>
                    <option>Priduct name A - Z</option>
                    <option>Priduct name Z - A</option>
                    <option>Priduct Stoke</option>
                    <option>Price Lowest first</option>
                </select>
            </div>
        </form>

        <div id="myTab" class="pull-right">
            <a href="#listView" data-toggle="tab"><span class="btn btn-large"><i class="icon-list"></i></span></a>
            <a href="#blockView" data-toggle="tab"><span class="btn btn-large active"><i
                    class="icon-th-large icon-white"></i></span></a>
        </div>
        <br class="clr"/>
        <div class="tab-content">
            <div class="tab-pane" id="listView">
                <c:forEach items="${products.content}" var="productItem">
                    <div class="row">
                        <div id="productView" class="span2">
                            <a href="/product/${productItem.id}"><img src="/assets/products/3.jpg" alt=""/></a>
                        </div>
                        <div class="span4">
                            <hr class="soft"/>
                            <h5>${productItem.name}</h5>
                            <p>
                                    ${productItem.summary}
                            </p>
                            <br class="clr"/>
                        </div>
                        <div class="span3 alignR">
                            <form class="form-horizontal qtyFrm">
                                <h3> $140.00</h3>
                                <label class="checkbox">
                                    <input type="checkbox">Add product to compare
                                </label><br/>
                                <a href="/product/${productItem.id}" class="btn btn-large"><i
                                        class=" icon-shopping-cart"></i> Add to cart</a>
                            </form>
                        </div>
                    </div>
                    <hr class="soft"/>
                </c:forEach>
            </div>
            <div class="tab-pane  active" id="blockView">
                <ul class="thumbnails">
                    <c:forEach items="${products.content}" var="productItem">
                        <li class="span3">
                            <div class="thumbnail">
                                <a href="/product/${productItem.id}"><img src="/assets/products/9.jpg" alt=""/></a>
                                <div class="caption">
                                    <h5>${productItem.name}</h5>
                                    <p>
                                            ${productItem.summary}
                                        <br/>
                                                <small>$${productItem.price}</small>
                                    </p>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
                <hr class="soft"/>
            </div>
        </div>

        <a href="compair.html" class="btn btn-large pull-right">Compair Product</a>

        <div>
            <ul class="pagination">
                <c:choose>
                    <c:when test="${currentIndex == 1}">
                        <li class="disabled"><a href="#">&lt;&lt;</a></li>
                        <li class="disabled"><a href="#">&lt;</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="${firstUrl}">&lt;&lt;</a></li>
                        <li><a href="${prevUrl}">&lt;</a></li>
                    </c:otherwise>
                </c:choose>
                <c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
                    <c:url var="pageUrl" value="/category/${id}/${i}" />
                    <c:choose>
                        <c:when test="${i == currentIndex}">
                            <li class="active"><a href="${pageUrl}"><c:out value="${i}" /></a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="${pageUrl}"><c:out value="${i}" /></a></li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                <c:choose>
                    <c:when test="${currentIndex == products.totalPages}">
                        <li class="disabled"><a href="#">&gt;</a></li>
                        <li class="disabled"><a href="#">&gt;&gt;</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="${nextUrl}">&gt;</a></li>
                        <li><a href="${lastUrl}">&gt;&gt;</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
        <br class="clr"/>
    </div>
</div>
<!-- Footer ------------------------------------------------------ -->
<%@ include file="layout/footer.jsp" %>
</div>
<!-- /container -->

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
<script src="/assets/js/jquery.js"></script>
<script src="/assets/js/google-code-prettify/prettify.js"></script>
<script src="/assets/js/application.js"></script>
<script src="/assets/js/bootstrap-transition.js"></script>
<script src="/assets/js/bootstrap-modal.js"></script>
<script src="/assets/js/bootstrap-scrollspy.js"></script>
<script src="/assets/js/bootstrap-alert.js"></script>
<script src="/assets/js/bootstrap-dropdown.js"></script>
<script src="/assets/js/bootstrap-tab.js"></script>
<script src="/assets/js/bootstrap-tooltip.js"></script>
<script src="/assets/js/bootstrap-popover.js"></script>
<script src="/assets/js/bootstrap-button.js"></script>
<script src="/assets/js/bootstrap-collapse.js"></script>
<script src="/assets/js/bootstrap-carousel.js"></script>
<script src="/assets/js/bootstrap-typeahead.js"></script>
<script src="/assets/js/bootstrap-affix.js"></script>
<script src="/assets/js/jquery.lightbox-0.5.js"></script>
<script src="/assets/js/bootsshoptgl.js"></script>
<script type="text/javascript">
    $(function () {
        $('#gallery a').lightBox();
    });
</script>
</body>
</html>