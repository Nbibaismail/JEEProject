<%@ page language ="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Title</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@include file="header.jsp" %>
<p></p>
<div class="container">
<div class="card">
  <div class="card-header">
    Ajouter Stage
  </div>
  <div class="card-body">
      <form action="save2.do" method="post">
      <div class="form-group">
       <label class="control-label">Id Etudiant :</label>
       <input type="text" name="idEtudiant" class="form-control"/>
      </div>
      <div class="form-group">
       <label class="control-label">Description Stage</label>
       <input type="text" name="description" class="form-control"/>
      </div>
      <div class="form-group">
       <label class="control-label">Date Debut</label>
       <input type="date" name="dateDebut" class="form-control"/>
      </div>
      <div class="form-group">
       <label class="control-label">Durée</label>
       <input type="text" name="periode" class="form-control"/>
      </div>
      <div>
        <button type="submit" class="btn btn-primary">Ajouter</button>
      </div>
      </form>     
     
  </div>
</div>
</div>
</body>
</html>