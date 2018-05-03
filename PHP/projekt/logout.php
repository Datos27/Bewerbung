<?php 
	$htmlTitle = 'Log Out';
	include_once ('inc.header.php');
?>
									<table class="news_box" >
										<tr>
											<td class="table_headline" colspan="2">Log Out</td>
										</tr>
										<tr>
											<td colspan="2">
<?php 
	// Ueberpruefen, ob eingeloggt
	if (isset ($_SESSION['name']))
	{
		// SESSION loeschen
		unset ($_SESSION['name']);
?>
												Du wurdest erfolgreich ausgeloggt.
<?php
	}
	else
	{
?>
												Es ist ein Fehler passiert.
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