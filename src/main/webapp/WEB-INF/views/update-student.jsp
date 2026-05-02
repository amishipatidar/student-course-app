<h2>Update Student</h2>

<form action="/save" method="post">
    <input type="hidden" name="id" value="${student.id}"/>

    Name: <input type="text" name="name" value="${student.name}"/><br><br>
    Email: <input type="text" name="email" value="${student.email}"/><br><br>

    <button type="submit">Update</button>
</form>