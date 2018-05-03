<?php
	session_start ();
	
	// Includes
	include_once ('inc.php');
	include_once ('inc.function.php');
	
	// HEAD-Angaben
	$htmlTitle = (isset ($htmlTitle)) ? $htmlTitle : 'Willkommen';
	$htmlCss[] = 'stylesheet.css';
?>
<!DOCTYPE html>
<html lang="de">
	<head>
		<title><?php echo $htmlTitle; ?></title>
		<meta charset="ISO-8859-1" />
		<meta name="description" content="" />
		<meta name="author" content="" />
		<meta name="keywords" content="" />
<?php 
	// CSS-Dateien einbauen
	foreach ($htmlCss as $key => $val)
	{
?>
	<link href="<?php echo $htmlCss[$key]; ?>" type="text/css" rel="stylesheet" />
	<link href="css/lightbox.css" rel="stylesheet" />
<?php
	}
?>

	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/lightbox.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="tweetie.js"></script>
		

	</head>
	<body>
		<table align ="center">
			<tr>
				<td>
					<div id="root_site">
						<div id="head_main_container">
							<div class="header_background"></div>
						</div>
						<div id="navi_main_container">
							<div class="navi_container"> 
								<ul id="navigation_main">
<?php
	$liArray = array (
		array (
			'titel' => 'Startseite',
			'adresse' => 'index.php'
		),
		array (
			'titel' => 'Kursplan',
			'adresse' => 'kursplan.php'
		),
		array (
			'titel' => 'Preise',
			'adresse' => 'preise.php'
		),
		array (
			'titel' => 'Galerie',
			'adresse' => 'galerie.php'
		),
		array (
			'titel' => 'Anmeldung',
			'adresse' => 'anmeldung.php',
			'sub' => array (
				array ('href' => 'login.php', 'text' => 'Login')
			)
		)
	);
	
	foreach ($liArray as $key => $val)
	{
?>
									<li class="block">
										<a href="<?php echo $liArray[$key]['adresse']; ?>"><?php echo $liArray[$key]['titel']; ?></a>
										<ul class="dropdown_navi">
<?php
		// Ueberpruefen, ob Unterlinks vorhanden sind
		if (isset ($liArray[$key]['sub']))
		{
			// Werte aufrufen
			foreach ($liArray[$key]['sub'] as $subKey => $subVal)
			{
?>
											<li><a href="<?php echo $liArray[$key]['sub'][$subKey]['href']; ?>"><?php echo $liArray[$key]['sub'][$subKey]['text']; ?></a></li>
<?php 
			}
		}
?>
										</ul>
									</li>
<?php
	}
?>
								</ul>
							</div>
						</div>	
						
						<div id="content_main_container">
							
							<div class="content_left_main"> 
							<table class="content_left_table" >
								<tr>
									<td>