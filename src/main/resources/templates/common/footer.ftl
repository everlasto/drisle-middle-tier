
<div class="drisle-footer">
    <div class="de-row">

        <div class="de-col de-col-1-2 color-white">
            <div class="font-big">Drisle.com @2015</div>
            <div class="font-small">Icons made by <a href="http://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a> from <a href="http://www.flaticon.com" title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0">CC BY 3.0</a></div>
            <div class="font-small">Stock images courtesy <a href="http://www.freeimages.com/">FreeImages.com</a></div>
        </div>

        <div class="de-col de-col-1-4">
            <ul>
                <li class="color-blue">ABOUT US</li>
                <li><a href="https://www.youtube.com/watch?v=NF-aXn4sn1w">About Us</a></li>
                <li><a href="https://www.youtube.com/watch?v=NF-aXn4sn1w">Team</a></li>
                <li><a href="#">Careers</a></li>
                <li><a href="https://www.youtube.com/watch?v=NF-aXn4sn1w">Contact Us</a></li>
            </ul>
        </div>

        <div class="de-col de-col-1-4">
            <ul>
                <li class="color-blue">SPREAD THE WORD</li>
                <li>
                    <#--<span class="de-icon icon-fb"></span> -->
                    <a href="#">facebook</a>
                </li>
                <li>
                    <#--<span class="de-icon icon-tw"></span> -->
                    <a href="#">twitter</a>
                </li>
            </ul>
        </div>

    </div>
</div>

<script type="text/javascript">
$( document ).ready( function(){
    var model = ${modelJSON};
    $.each(DRE, function(k, v){
        v.init(model);
    });
});
</script>

</div>
</body>
</html>