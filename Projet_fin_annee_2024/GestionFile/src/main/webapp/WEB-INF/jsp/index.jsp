<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion de File d'Attente</title>
</head>
<body>
    <h1>Choisissez un service</h1>
    <form action="selectService" method="POST">
        <label for="service">Service:</label>
        <select name="service" id="service">
            <option value="Seneau">Seneau</option>
            <option value="Orange">Orange</option>
            <option value="Senelec">Senelec</option>
            <option value="Bank">Bank</option>
        </select>
        <button type="submit">Suivant</button>
    </form>
</body>
</html>
