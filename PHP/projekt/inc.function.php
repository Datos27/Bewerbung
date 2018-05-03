<?php
	// Kurzschreibweise von mysql_real_escape_string ();
	function escape ($string)
	{
		return mysql_real_escape_string ($string);
	}

	// Kurzschreibweise von mysql_fetch_object ();
	function fetch ($query)
	{
		return mysql_fetch_object (mysql_query ($query));
	}

	// Kurzschreibweise von mysql_unbuffered_query ();
	function insert ($query)
	{
		return mysql_unbuffered_query ($query);
	}
?>