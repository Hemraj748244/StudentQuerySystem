<%-- 
    Document   : fileupload.jsp
    Created on : 22 Mar, 2017, 4:48:58 PM
    Author     : sameer
--%>

<%@page import="dbutil.DBConnect"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.output.*" %>

<%
   File file ;
   int maxFileSize = 5000 * 1024;
   int maxMemSize = 5000 * 1024;
   //String filePath = "c:/apache-tomcat/webapps/data/";
 String filePath ="C:/Users/sam sir/Documents/NetBeansProjects/StudentTeacherQandA/web/userimages/";
 
//C:\Users\Sam Sir\Documents\NetBeansProjects\StudentTeacherQandA

   String contentType = request.getContentType();
   if ((contentType.indexOf("multipart/form-data") >= 0)) {

      DiskFileItemFactory factory = new DiskFileItemFactory();
      factory.setSizeThreshold(maxMemSize);
      factory.setRepository(new File("c:\\temp"));
      ServletFileUpload upload = new ServletFileUpload(factory);
      upload.setSizeMax( maxFileSize );
      try{ 
         List fileItems = upload.parseRequest(request);
         Iterator i = fileItems.iterator();
         out.println("<html>");
         out.println("<body>");
         while ( i.hasNext () ) 
         {
            FileItem fi = (FileItem)i.next();
            if ( !fi.isFormField () )  {
                String fieldName = fi.getFieldName();
                String fileName = fi.getName();
                boolean isInMemory = fi.isInMemory();
                long sizeInBytes = fi.getSize();
               file = new File( filePath + 
            fileName.substring(fileName.lastIndexOf("\\")+1)) ;
                fi.write( file ) ;
                out.println("Uploaded Filename: " + filePath + fileName + "<br>");
                  out.println( fileName + "<br>");
                  out.println( file.getName() + "<br>");
                  String email = session.getAttribute("email").toString();
                  try
                  {
                      String sql = "update reg set uphoto='"+
                              file.getName()+"' where email='"+email+"'";
                      DBConnect x = new DBConnect();
                      x.queryExecuter(sql);
                      
                      response.sendRedirect("signout.jsp");
                  }
                  catch(Exception ex)
                  {
                      
                  }
                  
            }
         }
         out.println("</body>");
         out.println("</html>");
      }catch(Exception ex) {
         System.out.println(ex);
      }
   }else{
      out.println("<html>");
      out.println("<body>");
      out.println("<p>No file uploaded</p>"); 
      out.println("</body>");
      out.println("</html>");
   }
%>