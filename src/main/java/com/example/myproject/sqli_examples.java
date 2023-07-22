String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

String query = "DELETE FROM users WHERE id = '" + userId + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

String query = "UPDATE users SET email = '" + newEmail + "' WHERE username = '" + username + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);
