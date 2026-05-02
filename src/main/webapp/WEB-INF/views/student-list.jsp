<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Student List</h2>

<a href="/add">Add Student</a><br><br>

<c:forEach var="s" items="${students}">
    <p>
        ${s.name} - ${s.email}
        <a href="edit/${s.id}">Edit</a>
    </p>
</c:forEach>