<!DOCTYPE html>
<html>
<head>
    <%@ include file="layout/admin/resource.jsp" %>
</head>
<body>
<div id="wrapper">
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
        <%@ include file="layout/admin/header.jsp" %>
        <%@ include file="layout/admin/navbar.jsp" %>
    </nav>
    <div id="page-wrapper">
        <br/>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Latest 10 Orders
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>Order ID</th>
                                    <th>Customer</th>
                                    <th>Status</th>
                                    <th>Date Added</th>
                                    <th>Total</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${topOrder.content}" var="orderItem">
                                    <tr title="/admin/order/${orderItem.id}" class="">
                                        <td>${orderItem.id}</td>
                                        <td>${orderItem.user.username}</td>
                                        <td>${orderItem.status}</td>
                                        <td>${orderItem.orderedDate}</td>
                                        <td>1000$</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">Overview</div>
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-borderless">
                                <tbody>
                                    <tr>
                                        <td>Total Orders:</td>
                                        <td class="text-right">123</td>
                                    </tr>
                                    <tr>
                                        <td>No. of Customers:</td>
                                        <td class="text-right">123</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">Statistics</div>
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-borderless">
                                <tbody>
                                <tr>
                                    <td>Total Orders:</td>
                                    <td class="text-right">123</td>
                                </tr>
                                <tr>
                                    <td>No. of Customers:</td>
                                    <td class="text-right">123</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="layout/admin/footer.jsp"%>
<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>

</body>

</html>
