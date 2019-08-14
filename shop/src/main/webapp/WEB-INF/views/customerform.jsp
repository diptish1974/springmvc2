<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <table>
      <form action="customeradd">
          <tr> 
                  <td>USERNAME</td>
                  <td><input type="text" name="firstname"/></td>
          </tr>
           <tr> 
                   <td>ADDRESS</td>
                   <td><textarea name="address" rows="5" cols="20"></textarea></td>
           <tr>
          </tr>
           <tr>
              <td colspan="2"><input type="submit" value="add customers"/></td>
           </tr>   
      </form>
     </table>      
</body>
</html>