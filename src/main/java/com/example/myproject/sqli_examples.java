PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
statement.setString(1, username);
statement.setString(2, password);
ResultSet resultSet = statement.executeQuery();

PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
statement.setString(1, userId);
ResultSet resultSet = statement.executeQuery();

PreparedStatement statement = connection.prepareStatement("UPDATE users SET email = ? WHERE username = ?");
statement.setString(1, newEmail);
statement.setString(2, username);
ResultSet resultSet = statement.executeQuery();
