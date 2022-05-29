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
    Informations Stage
  </div>
  <div class="card-body">
  
  
  		<p>ID ETUDIANT : ${s.idEtudiant } </p>
  		
  		<p>DESCRIPTION : ${s.description } </p>
  		
  		
  		<p>DATE DEBUT : ${s.dateDebut } </p>
  		
  		<p>PERIODE : ${s.periode } </p>
  		
      <!-- Write your comments here 
      <div class="form-group">
       <label class="control-label">ID ETUDIANT  :</label>
       <input type="text" name="Id" class="form-control" value="${s.idEtudiant}"/>
         
       <label class="control-label">Description</label>
       <input type="text" name="Description" class="form-control" value="${s.description}"/>
      </div>
      
      <div class="control-label">
       <label class="control-label">Date Debut :</label>
       <input type="text" name="dateDebut" class="form-control" value="${s.dateDebut}"/>
      </div>
       </div>
       
       
		<div class="control-label">
       <label class="control-label">Date Debut :</label>
       <input type="text" name="periode" class="form-control" value="${s.periode}"/>
      </div>
       </div>
       -->
       
       <div align="center">
       <button id="myButton0" class="btn btn-success" >OK</button>
       <script type="text/javascript">
   		 document.getElementById("myButton0").onclick = function () {
       	 location.href = "index2.do";
  		  };
		</script>
	
       
       </div>
       
       
         
  </div>

</body>
</html>