<!Doctype html>
<head>
    <meta charset="UTF-8">
    <title>Drisle</title>

    <#assign cssFiles = uiHL.cssFiles(meta.page.name)>
    <#list cssFiles as css_file>
        <link rel="stylesheet" href="${css_file}"/>
    </#list>

    <link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>

    <#assign jsFiles = uiHL.jsFiles(meta.page.name)>
    <#list jsFiles as js_file>
        <script src="${js_file}" type="text/javascript"/></script>
    </#list>
</head>
<body>

<div class="drisle">

    <div class="drisle-header">
        <div class="logo font-small color-white">Drisle</div>
        <div class="actions">
            <a href="#" class="color-blue">Signup</a>
            <a href="#" class="color-white">Signin</a>
        </div>
    </div>


