<!DOCTYPE html>
<html>
<head>
    <%@ include file="../layout/admin/resource.jsp" %>
</head>
<body>
<div id="wrapper">
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
        <%@ include file="../layout/admin/header.jsp" %>
        <%@ include file="../layout/admin/navbar.jsp" %>
    </nav>
    <div id="page-wrapper">
        <br/>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <p>Products</p>
                            <!--adding pull-right below, does not work-->
                            <span class="btn-group  btn-group-xs pull-right">
                                <a onclick="$('#form').submit();" class="btn btn-default btn-sm">Save</a>
                                <a href="/admin/product" class="btn btn-default btn-sm">Cancel</a>
                                <a href="/admin/product/delete/${product.id}" class="btn btn-default btn-sm">Delete</a>
                            </span>
                        </h4>
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <form:form commandName="product" cssClass="form-horizontal" id="form" modelAttribute="product">
                            <div class="form-group">
                                <label for="name" class="col-sm-2 control-label">*Product Name</label>
                                <div class="col-sm-10">
                                    <form:input path="name" cssClass="form-control" id="name" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="price" class="col-sm-2 control-label">Price</label>
                                <div class="col-sm-10">
                                    <form:input path="price" cssClass="form-control" id="price" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="quantity" class="col-sm-2 control-label">Quantity</label>
                                <div class="col-sm-10">
                                    <form:input path="quantity" cssClass="form-control" id="quantity" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="summary" class="col-sm-2 control-label">Summary</label>
                                <div class="col-sm-10">
                                    <form:input path="summary" cssClass="form-control" id="summary" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="tags" class="col-sm-2 control-label">Tags</label>
                                <div class="col-sm-10">
                                    <form:input path="tags" cssClass="form-control" id="tags" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Category</label>
                                <div class="col-sm-10">
                                    <form:select path="productCategory" items="${listCategory}" cssClass="selectpicker">
                                    </form:select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="createdDate" class="col-sm-2 control-label">Created Date</label>
                                <div class="col-sm-10">
                                    <form:input path="createdDate" cssClass="form-control" id="createdDate" type="date"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <form:hidden path="hits" cssClass="form-control" id="hits" value="0"/>
                                </div>
                            </div>
                        </form:form>
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
    </div>
</div>
<%@ include file="../layout/admin/footer.jsp"%>
<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>

</body>

</html>
