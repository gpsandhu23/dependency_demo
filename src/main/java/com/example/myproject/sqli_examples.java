// Example 1
String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

//Example 2
String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);
