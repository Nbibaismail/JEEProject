<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="header.jsp" %>
<p></p>
<div class="container">
<div class="card">
  <div class="card-header">
    Etudiant 
  </div>
  <div class="card-body">
  
  		<p>Nom : ${etudiant.nom } </p>
  		
  		<p>Prenom : ${etudiant.prenom } </p>
  		
  		
  		<p>Prenom : ${etudiant.departement } </p>
  		
  		<p>Etat Dossier : Etat Dossier </p>
      
      
      
       
       <div align="center">
       <button id="myButton0" class="btn btn-success" >OK</button>
       <script type="text/javascript">
   		 document.getElementById("myButton0").onclick = function () {
       	 location.href = "index.do";
  		  };
		</script>
		
       
       
       </div>
       
       
         
  </div>
</div>
</body>
</html>