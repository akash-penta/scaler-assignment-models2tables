Implemented the hibernate inheritance mapping.

Has four classes

### 1. User (Parent)
   1. id
   2. name
   3. email

### 2. Student (extends User)
   1. psp
   2. attendence
	
### 3. Mentor (extends User)
   1. avg_rating
	
### 4. TA (extends User)
   1. avg_rating
   
## Mapped Super Class

- No table for parent class
- One table for each childern (including parent attributes)

#### msc_student
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th><th>attendence</th><th>psp</th></tr>
<tr><td>1</td><td>akashpenta8@gmail.com</td><td>Akash</td><td>100</td><td>98.9</td></tr>
</table>
</body>
</html>

#### msc_mentor
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th><th>avg_rating</th></tr>
<tr><td>1</td><td>sarath_ch@gmail.com</td><td>Sarath CH</td><td>4.5</td></tr>
</table>
</body>
</html>

#### msc_ta
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th><th>avg_rating</th></tr>
<tr><td>1</td><td>hari_s@gmail.com</td><td>Hari S</td><td>4.4</td></tr>
</table>
</body>
</html>

## Single Table

- One gaint table for all class
- Other attributes which are not related to class, wii store Null
- <dtype> column will store the type of the row (class name/integer)

#### st_user
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>dtype</th><th>id</th><th>email</th><th>name</th><th>avg_rating</th><th>attendence</th><th>psp</th></tr>
<tr><td>0</td><td>1</td><td>akhil@gmail.com</td><td>Akhil</td><td>null</td><td>null</td><td>null</td></tr>
<tr><td>1</td><td>2</td><td>akashpenta8@gmail.com</td><td>Akash</td><td>null</td><td>100</td><td>98.9</td></tr>
<tr><td>3</td><td>3</td><td>sarath_ch@gmail.com</td><td>Sarath CH</td><td>4.5</td><td>null</td><td>null</td></tr>
<tr><td>2</td><td>4</td><td>hari_s@gmail.com</td><td>Hari S</td><td>4.4</td><td>null</td><td>null</td></tr>
</table>
</body>
</html>

##Table Per Class

- It is similar to Mapped Super Class, with addition there is a User table

#### tpc_user
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th></tr>
<tr><td>1</td><td>akhil@gmail.com</td><td>Akhil</td></tr>
</table>
</body>
</html>

#### tpc_student
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th><th>attendence</th><th>psp</th></tr>
<tr><td>2</td><td>akashpenta8@gmail.com</td><td>Akash</td><td>100</td><td>98.9</td></tr>
</table>
</body>
</html>

#### tpc_mentor
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th><th>avg_rating</th></tr>
<tr><td>3</td><td>sarath_ch@gmail.com</td><td>Sarath CH</td><td>4.5</td></tr>
</table>
</body>
</html>

#### tpc_ta
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th><th>avg_rating</th></tr>
<tr><td>4</td><td>hari_s@gmail.com</td><td>Hari S</td><td>4.4</td></tr>
</table>
</body>
</html>

## Joined 

- It is similar to Table Per Class
- All of the attributes of parent are only present in Parent table only
- Table of childern will have his own attributes along with user ID

#### j_user
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>id</th><th>email</th><th>name</th></tr>
<tr><td>1</td><td>akhil@gmail.com</td><td>Akhil</td></tr>
<tr><td>2</td><td>akashpenta8@gmail.com</td><td>Akash</td></tr>
<tr><td>3</td><td>sarath_ch@gmail.com</td><td>Sarath CH</td></tr>
<tr><td>4</td><td>hari_s@gmail.com</td><td>Hari S</td></tr>
</table>
</body>
</html>

#### j_student
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>attendence</th><th>psp</th><th>id</th></tr>
<tr><td>100</td><td>98.9</td><td>2</td></tr>
</table>
</body>
</html>

#### j_mentor
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>avg_rating</th><th>id</th></tr>
<tr><td>4.5</td><td>3</td></tr>
</table>
</body>
</html>

#### j_ta
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
<table border="1" style="border-collapse:collapse">
<tr><th>avg_rating</th><th>id</th></tr>
<tr><td>4.4</td><td>4</td></tr>
</table>
</body>
</html>
