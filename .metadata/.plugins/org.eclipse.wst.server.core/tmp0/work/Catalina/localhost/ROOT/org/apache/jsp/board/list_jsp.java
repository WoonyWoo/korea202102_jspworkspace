/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-06-29 01:18:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.koreait.site0622.model.board.dao.JdbcBoardDAO;
import com.koreait.site0622.model.board.dao.BoardDAO;
import com.koreait.site0622.model.domain.Board;
import com.koreait.site0622.model.board.dao.MybatisBoardDAO;
import java.util.List;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

BoardDAO boardDAO = new MybatisBoardDAO();
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.koreait.site0622.model.board.dao.JdbcBoardDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.koreait.site0622.model.domain.Board");
    _jspx_imports_classes.add("com.koreait.site0622.model.board.dao.BoardDAO");
    _jspx_imports_classes.add("com.koreait.site0622.model.board.dao.MybatisBoardDAO");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	List<Board> boardList = boardDAO.selectAll(); //??? ???????????? ????????????
	int totalRecord=boardList.size();//??? ????????? ???
	
	out.print(totalRecord);
	
	int pageSize=10;//??? ???????????? ????????? ???????????? ??????????????? ???????????? ??????, ??? ???????????? ????????? ????????? ???
	
	int totalPage=(int)Math.ceil((float)totalRecord/pageSize); //??? ????????? ???(????????? ????????? ???????????? ???????????? ????????? ????????? ??? ???)
	int blockSize=10;
	
	int currentPage=1;//?????? ?????????
	//???, ???????????? ????????? ????????? ????????? ?????? currentPage???????????? ?????? ??????????????? ??? ????????? ?????? ???????????? ??????!!
	if(request.getParameter("currentPage")!=null){
		currentPage=Integer.parseInt(request.getParameter("currentPage"));
	}
	int firstPage=currentPage- ((currentPage-1)%blockSize);
	int lastPage=firstPage+(blockSize-1);
	int curPos=(currentPage-1)*pageSize;//???????????? List??? ?????? index?????????
	int num=totalRecord - curPos;

      out.write('\r');
      out.write('\n');
      out.print("????????? ?????? ?????? ???????????? "+currentPage+"<br>" );
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  border-spacing: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border: 1px solid #ddd;\r\n");
      out.write("  position:relative;\r\n");
      out.write("}\r\n");
      out.write("th, td {\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("/*????????? ????????? ?????? ???????????? ???????????? ?????? */\r\n");
      out.write(".pageNum{\r\n");
      out.write("	font-weight:bold;\r\n");
      out.write("	font-size:20px;\r\n");
      out.write("	color:red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("	$(\"button\").click(function(){\r\n");
      out.write("		location.href=\"/board/regist.jsp\";\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2>????????? ??????</h2>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<th>No</th>\r\n");
      out.write("		<th>??????</th>\r\n");
      out.write("		<th>?????????</th>\r\n");
      out.write("		<th>?????????</th>\r\n");
      out.write("		<th>?????????</th>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");
for(int i=1;i<=pageSize;i++){ 
      out.write('\r');
      out.write('\n');
      out.write('	');
if(num<1)break; 
      out.write('\r');
      out.write('\n');
      out.write('	');
Board board = boardList.get(curPos++); 
      out.write("\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>");
      out.print(num-- );
      out.write("</td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<a href=\"/board/detail.jsp?board_id=");
      out.print(board.getBoard_id());
      out.write('"');
      out.write('>');
      out.print(board.getTitle() );
      out.write("</a>\r\n");
      out.write("		</td>\r\n");
      out.write("		<td>");
      out.print(board.getWriter() );
      out.write("</td>\r\n");
      out.write("		<td>");
      out.print(board.getRegdate() );
      out.write("</td>\r\n");
      out.write("		<td>");
      out.print(board.getHit() );
      out.write("</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");
}
      out.write("\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"5\" style=\"text-align:center\">\r\n");
      out.write("			<a href=\"/board/list.jsp?currentPage=");
      out.print(firstPage-1);
      out.write("\">???</a>\r\n");
      out.write("			");
for(int i=firstPage;i<=lastPage;i++){
      out.write("\r\n");
      out.write("				");
if(i>totalPage)break; //i??? ??? ??????????????? ???????????? ???????????? ????????? 
      out.write("\r\n");
      out.write("				<a href=\"/board/list.jsp?currentPage=");
      out.print(i);
      out.write('"');
      out.write(' ');
if(currentPage==i){
      out.write("class=\"pageNum\"");
}
      out.write("   >[");
      out.print(i);
      out.write("]</a>\r\n");
      out.write("			");
}
      out.write("\r\n");
      out.write("			<a href=\"/board/list.jsp?currentPage=");
      out.print(lastPage+1);
      out.write("\">???</a>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"5\"><button>?????????</button></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
