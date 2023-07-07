// Example 1
String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

// Example 2 
String query = "SELECT * FROM users WHERE username = ? AND password = ?"; 
PreparedStatement statement = connection.prepareStatement(query); statement.setString(1, username); 
statement.setString(2, password); ResultSet resultSet = statement.executeQuery();

// Example 3
String query = "INSERT INTO users (username, password) VALUES ('" + username + "', '" + password + "')";
Statement statement = connection.createStatement();
statement.addBatch(query);
statement.executeBatch();

// Example 4 
String query = "INSERT INTO users (username, password) VALUES (?, ?)"; 
PreparedStatement statement = connection.prepareStatement(query); statement.setString(1, username); 
statement.setString(2, password); statement.addBatch(); statement.executeBatch();

// Example 5
String query = "SELECT * FROM users WHERE username LIKE '" + username + "%'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

// Example 6
String query = "UPDATE users SET password = '" + newPassword + "' WHERE username = '" + username + "'";
Statement statement = connection.createStatement();
int rowsAffected = statement.executeUpdate(query);

// Example 7
String query = "DELETE FROM users WHERE username = '" + username + "'";
Statement statement = connection.createStatement();
int rowsAffected = statement.executeUpdate(query);
