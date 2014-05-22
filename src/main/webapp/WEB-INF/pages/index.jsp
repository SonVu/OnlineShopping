<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="layout/resouces.jsp" %>
</head>
<body>
<%@include file="layout/header.jsp" %>
<div id="myCarousel" class="carousel slide homCar">
    <div class="carousel-inner">
        <div class="item active">
            <img style="width:100%" src="assets/carousel/1.jpg" alt=""/>

            <div class="carousel-caption">
                <h4>Second Thumbnail label</h4>

                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at
                    eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            </div>
        </div>
        <div class="item">
            <img style="width:100%" src="assets/carousel/2.jpg" alt=""/>

            <div class="carousel-caption">
                <h4>Second Thumbnail label</h4>

                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at
                    eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            </div>
        </div>
        <div class="item">
            <img src="assets/carousel/3.jpg" alt=""/>

            <div class="carousel-caption">
                <h4>Second Thumbnail label</h4>

                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at
                    eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            </div>

        </div>
        <div class="item">
            <img src="assets/carousel/4.jpg" alt=""/>

            <div class="carousel-caption">
                <h4>Second Thumbnail label</h4>

                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at
                    eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            </div>

        </div>
        <div class="item">
            <img src="assets/carousel/5.jpg" alt=""/>

            <div class="carousel-caption">
                <h4>Second Thumbnail label</h4>

                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at
                    eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            </div>
        </div>
    </div>
    <!--<a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a> -->
    <a href="sf" id="spcialBtn" class="btn btn-large pull-right btn-success">Special Offer</a>
</div>

<div class="row">
    <%@ include file="layout/sidebar.jsp" %>
<div class="span9">
    <h3>New Products </h3>
    <div class="row-fluid">
        <div id="myCarousel1" class="carousel slide">
            <div class="carousel-inner">
                <div class="item active">
                    <ul class="thumbnails">
                        <c:forEach items="${topNew.content}" var="topNewItem" varStatus="status">
                            <c:if test="${status.count < 4}">
                                <li class="span3">
                                    <div class="thumbnail">
                                        <a href="#" class="tag" src="assets/products/new.png"></a>
                                        <a href="/product/${topNewItem.id}"><img src="assets/products/1.jpg" alt=""/></a>
                                        <div class="caption">
                                            <h5>${topNewItem.name}</h5>
                                            <p>
                                                    ${topNewItem.summary}
                                                <br/>
                                                <small>$${topNewItem.price}</small>
                                            </p>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
                <div class="item">
                    <ul class="thumbnails">
                        <c:forEach items="${topNew.content}" var="topNewItem" varStatus="status">
                            <c:if test="${status.count >= 4}">
                                <li class="span3">
                                    <div class="thumbnail">
                                        <a href="#" class="tag" src="assets/products/new.png"></a>
                                        <a href="/product/${topNewItem.id}"><img src="assets/products/1.jpg" alt=""/></a>
                                        <div class="caption">
                                            <h5>${topNewItem.name}</h5>
                                            <p>
                                                    ${topNewItem.summary}
                                                <br/>
                                                <small>$${topNewItem.price}</small>
                                            </p>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
                <div class="item">
                    <ul class="thumbnails">
                        <c:forEach items="${topNew.content}" var="topNewItem" varStatus="status">
                            <c:if test="${status.count >= 8}">
                                <li class="span3">
                                    <div class="thumbnail">
                                        <a href="#" class="tag" src="assets/products/new.png"></a>
                                        <a href="/product/${topNewItem.id}"><img src="assets/products/1.jpg" alt=""/></a>
                                        <div class="caption">
                                            <h5>${topNewItem.name}</h5>
                                            <p>
                                                    ${topNewItem.summary}
                                                <br/>
                                                <small>$${topNewItem.price}</small>
                                            </p>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel1" data-slide="prev">&lsaquo;</a>
            <a class="right carousel-control" href="#myCarousel1" data-slide="next">&rsaquo;</a>
        </div>
    </div>
    <h3>Feature Products </h3>
    <ul class="thumbnails">
        <c:forEach items="${topProduct.content}" var="topProductItem">
            <li class="span3">
                <div class="thumbnail">
                    <a href="/product/${topProductItem.id}"><img src="assets/products/9.jpg" alt=""/></a>
                    <div class="caption">
                        <h5>${topProductItem.name}</h5>
                            <p>
                                ${topProductItem.summary}
                                <br/>
                                <small>$${topProductItem.price}</small>
                            </p>
                    </div>
                </div>
            </li>
        </c:forEach>
    </ul>
</div>
</div>
<!-- Footer ------------------------------------------------------ -->
<%@ include file="layout/footer.jsp" %>
<!-- /container -->
</div>

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