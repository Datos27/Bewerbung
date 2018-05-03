<?php 
	$htmlTitle = 'Log In';
	include_once ('inc.header.php');
	include_once ('inc.login.php');
?>
									<table class="news_box" >
										<tr>
											<td class="table_headline" colspan="2">Willkommen</td>
										</tr>
										<tr>
											<td colspan="2">
<?php
	if (!isset ($_SESSION['name']))
	{
?>
												Bitte log dich ein:<br/>
												<form action="login.php" method="post">
													Dein Username:<br>
													<input type="text" size="24" maxlength="50" name="user"/><br><br>
													Dein Passwort:<br>
													<input type="password" size="24" maxlength="50" name="password"/><br>
													<input type="submit" name="login" value="Einlogen"/>
												</form>
<?php
	}
	else
	{
?>
												Willkommen, <b><?php echo $_SESSION['name']; ?></b>!
												<br />
												<br />
<?php
		// Adminbereich
		if ($_SESSION['rank'] === 1)
		{
?>
												- <a href="news.php">Kurze Neuigkeit verfassen</a><br>
												<br>
												<br>
<?php
		}
?>
												<a href="logout.php">Ausloggen</a>
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