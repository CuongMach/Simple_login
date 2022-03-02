<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<style type="text/css">
  .login {
    height:180px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<form method="post" action="/login">
  <div class="login">
    <h2>Login</h2>
    <input type="text" name="userName" size="30"  placeholder="userName" />
    <input type="passWord" name="passWord" size="30" placeholder="passWord" />
    <input type="submit" value="Sign in"/>
  </div>
</form>
</body>
</html>
