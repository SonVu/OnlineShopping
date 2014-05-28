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
                            <p>Category</p>
                            <!--adding pull-right below, does not work-->
                            <span class="btn-group  btn-group-xs pull-right">
                                <a onclick="$('#form').submit();" class="btn btn-default btn-sm">Save</a>
                                <a href="/admin/category" class="btn btn-default btn-sm">Cancel</a>
                                <a href="/admin/category/delete/${category.id}" class="btn btn-default btn-sm">Delete</a>
                            </span>
                        </h4>
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <form:form commandName="category" cssClass="form-horizontal" id="form" modelAttribute="category">
                            <div class="form-group">
                                <label for="name" class="col-sm-2 control-label">*Category Name</label>
                                <div class="col-sm-10">
                                    <form:input path="name" cssClass="form-control" id="name" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="description" class="col-sm-2 control-label">Description</label>
                                <div class="col-sm-10">
                                    <form:input path="description" cssClass="form-control" id="description" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Parent Category</label>
                                <div class="col-sm-10">
                                    <form:select path="parentId" items="${listCategory}" cssClass="selectpicker">
                                    </form:select>
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
