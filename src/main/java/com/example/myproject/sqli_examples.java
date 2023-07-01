// Example 1
String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

// Example 2
String query = "INSERT INTO users (username, password) VALUES ('" + username + "', '" + password + "')";
Statement statement = connection.createStatement();
statement.addBatch(query);
statement.executeBatch();

// Example 3
String userCheckQuery = "{call sp_getUserDetails(?)}";
CallableStatement cs = connection.prepareCall(userCheckQuery);
cs.setString(1, username);
ResultSet rs = cs.executeQuery();

// Example 4
String query = "SELECT * FROM users WHERE username LIKE '" + username + "%'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

// Example 5
String query = "UPDATE users SET password = '" + newPassword + "' WHERE username = '" + username + "'";
Statement statement = connection.createStatement();
int rowsAffected = statement.executeUpdate(query);

// Example 6
String query = "DELETE FROM users WHERE username = '" + username + "'";
Statement statement = connection.createStatement();
int rowsAffected = statement.executeUpdate(query);

// Example 7
String query = "INSERT INTO users(username, password) VALUES('" + username + "', '" + password + "')";
Statement statement = connection.createStatement();
int rowsAffected = statement.executeUpdate(query);
