
<div class="drisle-footer">

</div>

<script type="text/javascript">
    var DRM = {};
    window.onload = function(){
        var model = ${modelJSON};
        $.each(DRM, function(k, v){
           DRM[k].init(model);
        });
    }
</script>

</div>
</body>
</html>