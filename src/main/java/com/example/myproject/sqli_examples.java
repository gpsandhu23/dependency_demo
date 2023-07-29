PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
preparedStatement.setString(1, username);
preparedStatement.setString(2, password);
ResultSet resultSet = preparedStatement.executeQuery();

if (userHasPermissionToDelete(userId)) {
    PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
    preparedStatement.setString(1, userId);
    ResultSet resultSet = preparedStatement.executeQuery();
} else {
    throw new SecurityException("User does not have permission to delete this user.");
}

PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET email = ? WHERE username = ?");
preparedStatement.setString(1, newEmail);
preparedStatement.setString(2, username);
ResultSet resultSet = preparedStatement.executeQuery();
