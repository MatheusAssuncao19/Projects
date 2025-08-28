<html>
<body>
<h2>Create Car</h2>

<form action="/create-car" method="post">

    <label>Car Name</label>
    <input type="text" name="car-name" id="car-name">
    <label>Seu nome</label>
    <input type="text" name="seu-nome" id="seu-nome">

    <button type="submit">Register</button>

</form>

<% if (request.getAttribute("response") != null) { %>
    <pre><%= request.getAttribute("response") %></pre>
<% } %>

</body>
</html>
