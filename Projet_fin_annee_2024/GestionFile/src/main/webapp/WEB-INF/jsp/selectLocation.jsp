<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Choisir la Localisation</title>
</head>
<body>
    <h1>Choisissez la localisation</h1>
    <form action="getTicketInfo" method="POST">
        <label for="localisation">Localisation:</label>
        <select name="localisation" id="localisation">
            <!-- List of localisations will be dynamically populated here -->
            <option value="Dakar">Dakar</option>
            <option value="Touba">Touba</option>
        </select>
        <button type="submit">Obtenir le ticket</button>
    </form>
</body>
</html>
