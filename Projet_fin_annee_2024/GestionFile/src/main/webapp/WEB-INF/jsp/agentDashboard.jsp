<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tableau de bord de l'Agent</title>
</head>
<body>
    <h1>Agent - Gestion des Tickets</h1>
    <p>Numéro actuel en cours: ${ticket.id}</p>
    <p>Position actuelle: ${ticket.position}</p>
    <button onclick="window.location.href='callNextTicket'">Client Suivant</button>
    <button onclick="window.location.href='callPreviousTicket'">Client Précédent</button>
</body>
</html>
