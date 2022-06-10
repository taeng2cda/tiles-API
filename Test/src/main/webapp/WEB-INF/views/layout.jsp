<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<div id="page">
	<header id="siteTop">
		<tiles:insertAttribute name="siteTop" />
	</header>
	
	
	<div id="content">
		<tiles:insertAttribute name="content" />
	</div>
	
	
	<footer id="siteBottom">
		<tiles:insertAttribute name="siteBottom" />
	</footer>
</div>

</body>
<style>
    *{margin: 0px; padding: 0px;}
    ul{list-style: none;}
    a{text-decoration: none;}
    header{
        width: 100%;
        height: 95px;
        background-color: black;
        position: relative;
    }
    #logo{
        position: absolute;
        top: 30px; left: 30px;
        color: dodgerblue;
    }
    #top_menu{
        position: absolute;
        top: 20px; right: 10px;
        color: white;
        padding-right: 5px;
    }
    #top_menu a{color: white;}
    nav{
        position: absolute;
        bottom: 10px;
        left: 220px; font-size: 16px;
    }
    nav li{
        display: inline;
        margin-left: 30px;
    }
    nav li a{
        color: white;
    }
    nav ul{
        padding-left: 100px;
    }
    footer{
        width: 100%;
        height: 90px;
        margin-top: 20px;
        text-align: center;
        background-color: black;
        color: white;
        
	    position: absolute;  
	    bottom: 0;
	    left: 0;
    }
    #content{
        width: 100%;
    }
</style>
</html>