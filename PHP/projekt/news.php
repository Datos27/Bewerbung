<?php 
	$htmlTitle = 'Kurze Neuigkeit verfassen';
	include_once ('inc.header.php');
	include_once ('inc.login.php');
?>
									<table class="news_box" >
										<tr>
											<td class="table_headline" colspan="2"><?php echo $htmlTitle; ?></td>
										</tr>
										<tr>
											<td colspan="2">
<?php
	// Kontrollieren, ob der Nutzer eingeloggt ist
	if (isset ($_SESSION['name']))
	{
		// Variabel fuer das Anzeigen des Formulars erzeugen
		$show = true;
		
		// Formular wurde abgeschickt
		if (isset ($_POST['send']))
		{
			// Variabeln erzeugen
			$postNews = escape ($_POST['news']);
			$postCode = escape ($_POST['code']);
			
			// Kontrolle, ob das Formular bereits abgeschickt wurde
			if (!isset ($_SESSION['code']) || $_SESSION['code'] !== $_POST['code'])
			{
				// Neuigkeit eintragen
				insert ("INSERT INTO `news` (`inhalt`, `datum`, `autor`) VALUES ('".$postNews."', ".time ().", ".$_SESSION['uid'].")");
				
				// Mehrfaches Abschicken unterbinden
				$_SESSION['code'] = $postCode;
				
				// Formular verbergen
				$show = false;
?>
												Deine Neuigkeit wurde soeben eingetragen!
<?php
			}
			else
			{
?>
												Fehler: die Neuigkeit wurde bereits abgeschickt!
<?php
			}
		}
		
		// Kontrolle, ob das Formular angezeigt werden soll
		if ($show)
		{
?>
												<form action="news.php" method="post">
													<input type="hidden" name="code" value="<?php echo time (); ?>" />
													Neuigkeit:<br />
													<textarea rows="7" cols="40" name="news"></textarea><br />
													<br />
													<input type="submit" name="send" value="Abschicken" />
												</form>
<?php
		}
?>
												<br />
												<br />
												&laquo; <a href="login.php">Zur&uuml;ck</a>
<?php
	}
	else
	{
?>
												Fehler: Du bist nicht eingeloggt!
<?php
	}
?>
											</td>
										</tr>
									</table>
								
								<br>
								</td>
							</tr>
<?php 
	include_once ('inc.footer.php');
?>