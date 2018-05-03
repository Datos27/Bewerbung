<?php 
	// Header
	$htmlTitle = 'Anmeldung';
	include_once ('inc.header.php');
	
	// Anmeldeformular anzeigen
	$success = false;
?>
										<table class="news_box" >
											<tr>
												<td class="table_headline" colspan="2">Willkommen</td>
											</tr>
											<tr>
												<td colspan="2">
<?php
	// Kontrollieren, ob das Formular abgeschickt wurde
	if (isset ($_POST['send']))
	{
		// Werte ermitteln
		$postName = escape ($_POST['username']);
		$postEmail = escape ($_POST['email']);
		$postPassword = escape ($_POST['passwort']);
		$postPassword2 = escape ($_POST['passwort2']);
		
		// Datenbankabfragen zur Kontrolle, ob die Felder bereits existieren
		$checkName = fetch ("SELECT COUNT(`id`) AS `check` FROM `user` WHERE `name` = '".$postName."' LIMIT 1");
		$checkEmail = fetch ("SELECT COUNT(`id`) AS `check` FROM `user` WHERE `email` = '".$postEmail."' LIMIT 1");
		
		// Ueberpruefen, ob der Name vorhanden ist
		if (strlen ($postName) < 1 || strlen ($postEmail) < 1 || strlen ($postPassword) < 1 || strlen ($postPassword2) < 1)
		{
			echo 'Es wurden nicht alle Felder ausgef&uuml;llt.';
		}
		else
		{
			if ($checkName->check > 0)
			{
				echo 'Fehler: Der gew&uuml;nschte Username <b>'.$postName.'</b> ist bereits vorhanden.';
			}
			// Ueberpruefen, ob der Name vorhanden ist
			else if ($checkEmail->check > 0)
			{
				echo 'Fehler: Die E-Mail Adresse wird bereits verwendet.';
			}
			// Ueberpruefen, ob die Passwoerter identisch sind
			else if ($postPassword !== $postPassword2)
			{
				echo 'Die Passw&ouml;rter sind <b>nicht</b> identisch!';
			}
			// Anmeldung erfolgreich
			else
			{
				// Textausgabe
				echo 'Ihre Anmeldung war erfolgreich!';
				
				// Werte eintragen
				insert ("INSERT INTO `user` (`name`, `email`,  `passwort`) VALUES ('".$postName."', '".$postEmail."', '".$postPassword."')");
				
				// Anmeldeformular ausblenden
				$success = true;
			}
		}
	}
	
	if ($success !== true)
	{
?>
													<form action="anmeldung.php" method="post">
														Dein Username:<br />
														<input type="text" size="24" maxlength="50" name="username" /><br>
														
														E-Mail Adresse:<br />
														<input type="text" size="24" maxlength="50" name="email" /><br>
														
														Dein Passwort:<br>
														<input type="password" size="24" maxlength="50" name="passwort"><br>
														
														Passwort wiederholen:<br />
														<input type="password" size="24" maxlength="50" name="passwort2"><br>
														
														<input type="submit" name="send" value="Abschicken">
													</form>
<?php
	}
?>
												</td>
											</tr>
										</table>
									</td>
							</tr>
<?php
	include_once ('inc.footer.php');
?>