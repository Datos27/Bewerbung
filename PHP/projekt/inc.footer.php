						</table>
						</div>
						
						
						<div class="content_right_main"> 
						<table class="content_right_table" cellpadding="0" cellspacing="0">
							<tr>
								<td class="table_headline">Short News</td>
							</tr>
							
							<tr>
								<td>
<?php
	// Letzte Kurzneuigkeit abfangen
	$query = mysql_query ('SELECT * FROM `news` ORDER BY `id` DESC LIMIT 1');
	while ($rows = mysql_fetch_object ($query))
	{
		echo nl2br (htmlentities (utf8_encode ($rows->inhalt), ENT_QUOTES)).'<br /><br />';
		echo '<i>Geschrieben am '.date ('d.m.Y', $rows->datum).', '.date ('G:i', $rows->datum).' Uhr';
	}
?>
								<br />
								<br />
								</td>
							</tr>
							<tr>
								<td class="table_headline">Twitter Journal</td>
							</tr>
							<tr>
								<td>
									<div class="tweet"></div>
								</td>
							</tr>
						</table>
						</div>
						
					</div>
					<div id="footer_main_container">
						<div id="footer_container">
							<table class="footer_table_setup" align="left" border="0" >
								<tr>
									<td align="left"><a href="#">Impressum</a></td>
									<td align="left"><a href="#">Anfahrt</a></td>
									<td align="left"><a href="#">Jobs</a></td>
									<td rowspan="4"><img src="images/logoz.png"/></td>
								
								</tr>
								
								<tr>
									<td align="left"><a href="#">Datenschutz</a></td>
									<td align="left"><a href="#">FAQ</a></td>
									<td align="left"><a href="#">Partner</a></td>
								</tr>
										<tr>
									<td align="left"><a href="#">bxxx</a></td>
									<td align="left"><a href="#">cxxx</a></td>
									<td align="left"><a href="#">cxxx</a></td>
								</tr>
								
								<tr>
									<td align="left"><a href="#">bxxx</a></td>
									<td align="left"><a href="#">cxxx</a></td>
									<td align="left"><a href="#">cxxx</a></td>
								</tr>
							
							</table>
						</div>
					</div>
				</div>
			</td>
		</tr>
	</table>
<script type="text/javascript">
		$('.tweet').twittie ({
            username: 'Yoga_Journal',
            dateFormat: '%b. %d, %Y',
            template: '{{tweet}} <div class="date">{{date}}</div>',
            count: 1
        });
</script>
</body>
</html>