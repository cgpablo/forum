<form action='<spring:url value="/loginAction"/>' method="post">
	<table>
		<tr>
			<td>Username</td>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td><button type="submit">Login</button></td>
		</tr>
	</table>
</form>