PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
pstmt.setString(1, username);
pstmt.setString(2, password);
ResultSet resultSet = pstmt.executeQuery();

PreparedStatement pstmt = connection.prepareStatement("DELETE FROM users WHERE id = ?");
pstmt.setString(1, userId);
ResultSet resultSet = pstmt.executeQuery();

PreparedStatement pstmt = connection.prepareStatement("UPDATE users SET email = ? WHERE username = ?");
pstmt.setString(1, newEmail);
pstmt.setString(2, username);
ResultSet resultSet = pstmt.executeQuery();
