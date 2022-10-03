<%-- 
    Document   : reg
    Created on : 23 Apr, 2017, 10:58:16 AM
    Author     : sameer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>New Registration!</h1>
        <hr>
        <p></p>
        
        <form action="./LoginCheck">
            <table>
                <tr>
                    <td>Email</td>
                    <td><input type="email" 
                               name="email" required /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" 
                               name="pass" required /></td>
                </tr>
                
                 <tr>
                    <td>Confirm Password</td>
                    <td><input type="password" 
                               name="cpass" required /></td>
                </tr>
                 <tr>
                    <td>Name</td>
                    <td><input type="text" name="uname" 
                               required /></td>
                </tr>
                
                 <tr>
                    <td>Mobile</td>
                    <td><input type="text" name="mobile" 
                               required /></td>
                </tr>
                 <tr>
                    <td>User Type</td>
                    <td> <select name="utype">
                            <option>Student</option>
                            <option>Faculty</option>
                        </select></td>
                </tr>
                
                <tr>
                    <td>Branch/Department</td>
                    <td> <select name="depart">
                            <option>CSE</option>
                            <option>MECH</option>
                            <option>EC</option>
                            <option>Civil</option>
                            <option>IT</option>
                        </select></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="Submit" value="Submit" 
                               name="b1"  /></td>
                </tr>
            </table>
        </form>
        
        
    </body>
</html>
