<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="layout/resouces.jsp"%>
</head>
<body>
    <%@ include file="layout/header.jsp"%>
    <hr class="soften">
    <div>
        <h1>Visit us</h1>
    </div>
    <hr class="soften"/>
    <div class="row">
        <div class="span4">
            <h4>Contact Details</h4>

            <p> 18 Fresno,<br/> CA 93727, USA
                <br/><br/>
                info@bootsshop.com<br/>
                ﻿Tel 123-456-6780<br/>
                Fax 123-456-5679<br/>
                web:bootsshop.com
            </p>
        </div>

        <div class="span4">
            <h4>Opening Hours</h4>
            <h5> Monday - Friday</h5>

            <p>09:00am - 09:00pm<br/><br/></p>
            <h5>Saturday</h5>

            <p>09:00am - 07:00pm<br/><br/></p>
            <h5>Sunday</h5>

            <p>12:30pm - 06:00pm<br/><br/></p>
        </div>
        <div class="span4">
            <h4>Email Us</h4>

            <form class="form-horizontal">
                <fieldset>
                    <div class="control-group">

                        <input type="text" placeholder="name" class="input-xlarge"/>

                    </div>
                    <div class="control-group">

                        <input type="text" placeholder="email" class="input-xlarge"/>

                    </div>
                    <div class="control-group">

                        <input type="text" placeholder="subject" class="input-xlarge"/>

                    </div>
                    <div class="control-group">
                        <textarea rows="3" id="textarea" class="input-xlarge"></textarea>

                    </div>

                    <button class="btn btn-large" type="submit">Send Messages</button>

                </fieldset>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="span12">
            <iframe width="1170" height="250" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"
                    src="https://maps.google.co.uk/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=18+California,+Fresno,+CA,+United+States&amp;aq=0&amp;oq=18+California+united+state&amp;sll=39.9589,-120.955336&amp;sspn=0.007114,0.016512&amp;ie=UTF8&amp;hq=&amp;hnear=18,+Fresno,+California+93727,+United+States&amp;t=m&amp;ll=36.732762,-119.695787&amp;spn=0.017197,0.100336&amp;z=14&amp;output=embed"></iframe>
            <br/>
            <small><a
                    href="https://maps.google.co.uk/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=18+California,+Fresno,+CA,+United+States&amp;aq=0&amp;oq=18+California+united+state&amp;sll=39.9589,-120.955336&amp;sspn=0.007114,0.016512&amp;ie=UTF8&amp;hq=&amp;hnear=18,+Fresno,+California+93727,+United+States&amp;t=m&amp;ll=36.732762,-119.695787&amp;spn=0.017197,0.100336&amp;z=14"
                    style="color:#0000FF;text-align:left">View Larger Map</a></small>
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