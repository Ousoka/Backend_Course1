<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tableau de bord de l'Admin</title>
</head>
<body>
    <h1>Admin - Gestion des Files</h1>
    <h2>Liste des files en cours</h2>
    <ul>
        <!-- Loop through the active queues -->
        <c:forEach var="queue" items="${queues}">
            <li>Service: ${queue.service}, Localisation: ${queue.localisation}, Ticket en cours: ${queue.currentTicket}</li>
        </c:forEach>
    </ul>
</body>
</html>
