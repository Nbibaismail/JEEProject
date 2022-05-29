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
    Modifier Informations Stage
  </div>
  <div class="card-body">
      <form action="update2.do" method="post" >
      <div  class="form-group" hidden >
       <label class="control-label">ID Etudiant :</label>
       <input type="text" name="id" class="form-control" value="${s.id}" />
      </div>
      <div class="form-group">
    
       <p>ID : ${p.id}</p>
      </div>
      <div class="form-group">
       <label class="control-label">ID ETUDIANT:</label>
       <input type="number" name="idEtudiant" class="form-control" value="${s.idEtudiant}"/>
      </div>
      <div class="form-group">
       <label class="control-label">DESCRIPTION :</label>
       <input type="text" name="description" class="form-control" value="${s.description}"/>
      </div>
      <div class="form-group">
       <label class="control-label">DATE DEBUT :</label>
       <input type="date" name="dateDebut" class="form-control" value="${s.dateDebut}"/>
      </div>
      <div class="form-group">
       <label class="control-label">PERIODE :</label>
       <input type="number" name="periode" class="form-control" value="${s.periode}"/>
      </div>
      <div>
        <button type="submit" class="btn btn-primary">Modifier</button>
      </div>
      </form>     
  </div>
</div>
</div>
</body>
</html>