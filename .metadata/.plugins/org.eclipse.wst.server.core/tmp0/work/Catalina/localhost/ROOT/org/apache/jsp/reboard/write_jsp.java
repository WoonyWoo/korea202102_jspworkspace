/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-06-30 00:01:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.reboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/reboard/inc/lib.jsp", Long.valueOf(1624898890000L));
    _jspx_dependants.put("/reboard/inc/footer.jsp", Long.valueOf(1624898890000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<style>\n");
      out.write("#box{border:1px solid #CCCCCC}\n");
      out.write("#writer,#title,#content{font-size:9pt;font-weight:bold;color:#7F7F7F;돋움}\n");
      out.write("input{\n");
      out.write("	font-size:9pt;\n");
      out.write("	border-left:1px solid #C3C3C3;\n");
      out.write("	border-top:1px solid #C3C3C3;\n");
      out.write("	border-right:1px solid #C3C3C3;\n");
      out.write("	border-bottom:1px solid #C3C3C3;\n");
      out.write("	color:#7F7F7F;돋움\n");
      out.write("}\n");
      out.write("#title input{width:250px;}\n");
      out.write("#content textarea{\n");
      out.write("width:503px;\n");
      out.write("border:0;\n");
      out.write("height:153;\n");
      out.write("background:url(\"/reboard/images/write_bg.gif\");\n");
      out.write("border:#C3C3C3 1px solid \n");
      out.write("}\n");
      out.write("#copyright{font-size:9pt;}\n");
      out.write("a{text-decoration:none}\n");
      out.write("img{border:0px}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function regist(){\n");
      out.write("	//동기방식으로 요청할 것임 \n");
      out.write("	$(\"form\").attr({\n");
      out.write("		\"action\":\"/reboard/regist\",\n");
      out.write("		\"method\":\"post\"\n");
      out.write("	});\n");
      out.write("	$(\"form\").submit();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form>\n");
      out.write("	<table id=\"box\" align=\"center\" width=\"603\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("	  <tr>\n");
      out.write("	    <td><img src=\"/reboard/images/ceil.gif\" width=\"603\" height=\"25\"></td>\n");
      out.write("	  </tr>\n");
      out.write("	  <tr>\n");
      out.write("	    <td height=\"2\" bgcolor=\"#6395FA\"><img src=\"/reboard/images/line_01.gif\"></td>\n");
      out.write("	  </tr>\n");
      out.write("	  <tr>\n");
      out.write("	    <td height=\"1\" bgcolor=\"#CCCCCC\"></td>\n");
      out.write("	  </tr>\n");
      out.write("		<tr>	\n");
      out.write("			<td id=\"list\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("	          <tr>\n");
      out.write("	            <td width=\"100\">&nbsp;</td>\n");
      out.write("	            <td>&nbsp;</td>\n");
      out.write("	          </tr>\n");
      out.write("	          <tr id=\"title\">\n");
      out.write("	            <td height=\"25\" align=\"center\">제목</td>\n");
      out.write("	            <td><input type=\"text\" name=\"title\"></td>\n");
      out.write("	          </tr>\n");
      out.write("	          <tr id=\"writer\">\n");
      out.write("	            <td height=\"25\" align=\"center\">작성자</td>\n");
      out.write("	            <td><input type=\"text\" name=\"writer\"></td>\n");
      out.write("	          </tr>\n");
      out.write("	          <tr id=\"content\">\n");
      out.write("	            <td align=\"center\">내용</td>\n");
      out.write("	            <td><textarea name=\"content\" style=\"\"></textarea></td>\n");
      out.write("	          </tr>\n");
      out.write("	          <tr>\n");
      out.write("	            <td>&nbsp;</td>\n");
      out.write("	            <td>&nbsp;</td>\n");
      out.write("	          </tr>\n");
      out.write("	        </table></td>\n");
      out.write("		</tr>\n");
      out.write("	  <tr>\n");
      out.write("	    <td height=\"30\" align=\"right\" style=\"padding-right:2px;\">\n");
      out.write("		<img src=\"/reboard/images/write_btin.gif\" width=\"61\" height=\"20\" onClick=\"regist()\"> \n");
      out.write("		<a href=\"list.jsp\"><img src=\"/reboard/images/list_btn.gif\" width=\"61\" height=\"20\"></a>	</td>\n");
      out.write("	  </tr>\n");
      out.write("	  <tr>\n");
      out.write("	    <td height=\"1\" bgcolor=\"#CCCCCC\"></td>\n");
      out.write("	  </tr>\n");
      out.write("	  ");
      out.write("\n");
      out.write("<tr>\n");
      out.write("  <td height=\"20\" colspan=\"5\" align=\"center\" id=\"copyright\">Copyright zino All Rights Reserved </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("	</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
