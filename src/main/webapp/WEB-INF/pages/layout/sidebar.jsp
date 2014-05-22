<%--
  Created by IntelliJ IDEA.
  User: Imperius
  Date: 5/20/2014
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="sidebar" class="span3">
    <ul class="nav nav-list bs-docs-sidenav" style="display: block;">
        <c:forEach items="${category}" var="categoryItem" varStatus="status">
            <c:set var="id" value="${categoryItem.id}"/>
            <c:if test="${categoryItem.parentId == 0}">
                <li class="subMenu"><a style="text-transform: uppercase">${categoryItem.name}</a>
                    <ul>
                        <c:forEach items="${category}" var="innerCategory" varStatus="status">
                            <c:if test="${innerCategory.parentId == id}">
                                <li><a class="active" href="/category/${innerCategory.id}/1" style="text-transform: capitalize">${innerCategory.name} (${fn:length(innerCategory.products)})</a></li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </li>
            </c:if>
        </c:forEach>
        <li style="border:0"> &nbsp;</li>
        <li><a href="sc"><strong>${fn:length(cart)} Items in your cart <span class="badge badge-warning pull-right"
                                                                             style="line-height:18px;">$155.00</span></strong></a></li>
        <li style="border:0"> &nbsp;</li>
        <li>
            <div class="thumbnail">
                <img src="/assets/products/1.jpg" alt="">

                <div class="caption">
                    <h5>Product name</h5>

                    <p>
                        Lorem Ipsum is simply dummy text.
                    </p>
                    <h4><a class="btn" href="product_details.jsp">VIEW</a> <span class="pull-right">$222.00</span></h4>
                </div>
            </div>
        </li>
        <li style="border:0"> &nbsp;</li>
        <li class="last">
            <div class="thumbnail">
                <img src="/assets/products/2.jpg" alt="">

                <div class="caption">
                    <h5>Product name</h5>

                    <p>
                        Lorem Ipsum is simply dummy text.
                    </p>
                    <h4><a class="btn" href="product_details.jsp">VIEW</a> <span class="pull-right">$222.00</span></h4>
                </div>
            </div>
        </li>
    </ul>
</div>