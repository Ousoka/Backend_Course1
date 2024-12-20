<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Information de votre ticket</title>
</head>
<body>
    <h1>Votre ticket</h1>
    <p>Numéro de ticket: ${ticket.id}</p>
    <p>Position dans la file: ${ticket.position}</p>
    <p>Nombre de personnes devant vous: ${ticket.numPeopleAhead}</p>
    <p>Le ticket en cours de traitement: ${ticket.inProgressTicket}</p>
</body>
</html>
