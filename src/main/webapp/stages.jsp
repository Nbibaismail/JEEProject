<%@ page language ="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<html>


<head>
<title>Title</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@include file="header.jsp" %>
<div class="container">
<div class="card">


<div class="card-header">
Rechercher Stage
</div>

<!-- Search Bar -->
<div class ="card-body">
<form action="chercher2.do" method="get">
<label>ID Etudiant</label>
<input type ="number" name="motCle" value ="${model.id}" required>
<button type="submit" class="btn btn-primary">Chercher</button>
</form>

<div class="card-body"><button onclick="window.location.href = 'saisie2.do'" class ="btn btn-primary"><i class="bi bi-activity"></i> + Ajouter Stage </button></div>

<!-- Data Table -->
<table class="table table-striped">

<!-- Table Header -->
<tr>
<th>ID Stage</th> <th>ID Etudiant</th> <th>Description</th> <th>Date Debut</th> <th>Jours</th> <th>Supprimer</th> <th>MAJ</th>
</tr>
<!-- Table Iterator -->
<c:forEach  items="${model.ets}" var ="p">
<tr>

<td>${p.id}</td>
<td>${p.idEtudiant}</td>
<td>${p.description}</td>
<td>${p.dateDebut}</td>
<td>${p.periode} Jours</td>
<td><a href="editer2.do?id=${p.id }">Edit</a></td>
<td><a onclick="return confirm('Etes-vous sûr ?')" href="supprimer2.do?id=${p.id }">Supprimer</a></td>


<!-- Write your comments here 
<td><div align="center">
       <button id="myButton0" class="btn btn-danger" >Supprimer</button>
       <script type="text/javascript">
   		 document.getElementById("myButton0").onclick = function () {
   		 confirm("Confirmer la suppresion!");	
       	 location.href = "supprimer2.do?id=${p.id }";
  		  };
		</script>
		
       
       
       </div>
</td>
<td><div align="center">
       <button id="myButton0" class="btn btn-danger" >Supprimer</button>
       <script type="text/javascript">
   		 document.getElementById("myButton0").onclick = function () {
	
       	 location.href = "editer2.do?id=${p.id }";
  		  };
		</script>
		
       
       
       </div>
</td>
-->
       
</tr>









</c:forEach>

</table>




</div>


</div>
</div>
<%@include file="footer.jsp" %>


</body>

</html>