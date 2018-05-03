<?php 
	// Dateien einbinden
	include_once ('inc.php');
	include_once ('inc.function.php');
	
	// Ueberpruefen, ob das Formular ausgefuellt wurde UND ob eine Session noch NICHT vorhanden ist
	if (!isset ($_SESSION['name']) && isset ($_POST ['login']))
	{
		// POST-Werte umlagern
		$postUser = escape ($_POST['user']);
		$postPassword = escape ($_POST['password']);
		
		// Datenbankabfrage
		$check = fetch ("SELECT COUNT(`id`) AS `countrow`, `rang`, `name`, `id` FROM `user` WHERE `name` = '".$postUser."' && `passwort` = '".$postPassword."' LIMIT 1");
		
		// Ueberpruefen, ob Werte uebereinstimmen
		if ($check->countrow > 0)
		{
			// Neue Session erzeugen, damit der Nutzer eingeloggt bleibt
			$_SESSION['name'] = $check->name;
			$_SESSION['rank'] = intval ($check->rang);
			$_SESSION['uid'] = intval ($check->id);
		}
	}
?>