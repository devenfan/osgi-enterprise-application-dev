<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>用户登录</title>

<link href="css/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/signin.css" rel="stylesheet">
</head>
<body>
<div class="signin">
	<div class="signin-head"><img src="images/head_120.png" alt="" class="img-circle"></div>
	<form class="form-signin" role="form" action="Login.do" method="post">
		<input type="text" name="username" class="form-control" placeholder="用户名" required autofocus />
		<input type="password" name="password" class="form-control" placeholder="密码" required />
		<button class="btn btn-lg btn-warning btn-block" type="submit">登录</button>
		<label class="checkbox">
			<input type="checkbox" value="remember-me"> 记住我
		</label>
	</form>
</div>
</body>
</html>