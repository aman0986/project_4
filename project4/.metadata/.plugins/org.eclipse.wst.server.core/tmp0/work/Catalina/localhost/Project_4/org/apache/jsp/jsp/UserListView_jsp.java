/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2024-06-07 06:31:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import in.co.pro4.model.RoleModel;
import in.co.pro4.utility.HTMLUtility;
import java.util.Iterator;
import java.util.List;
import in.co.pro4.utility.DataUtility;
import in.co.pro4.utility.ServletUtility;
import in.co.pro4.controller.UserListCtl;
import in.co.pro4.bean.RoleBean;
import in.co.pro4.controller.LoginCtl;
import in.co.pro4.controller.ORSView;
import in.co.pro4.bean.UserBean;

public final class UserListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1717684584083L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1717684583779L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.pro4.controller.ORSView");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.pro4.bean.UserBean");
    _jspx_imports_classes.add("in.co.pro4.controller.UserListCtl");
    _jspx_imports_classes.add("in.co.pro4.utility.DataUtility");
    _jspx_imports_classes.add("in.co.pro4.utility.ServletUtility");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("in.co.pro4.model.RoleModel");
    _jspx_imports_classes.add("in.co.pro4.bean.RoleBean");
    _jspx_imports_classes.add("in.co.pro4.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.pro4.utility.HTMLUtility");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\n");
      out.write("	href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/Raysicon.png\" sizes=\"16*16\" />\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>User List</title>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/Checkbox11.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("<script>\n");
      out.write("	$(function() {\n");
      out.write("		$(\"#update\").datepicker({\n");
      out.write("			changeMonth : true,\n");
      out.write("			changeYear : true,\n");
      out.write("			yearRange : '1995:2010',\n");
      out.write("		//  mindefaultDate : \"01-01-1962\"\n");
      out.write("		});\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      in.co.pro4.bean.UserBean bean = null;
      bean = (in.co.pro4.bean.UserBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.pro4.bean.UserBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/Raysicon.png\" sizes=\"16*16\" />\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Header</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");

		UserBean userBean = (UserBean) session.getAttribute("user");
		boolean userLoggedIn = userBean != null;
		String welcomeMsg = "Hi, ";
		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userBean.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\n");
      out.write("\n");
      out.write("	<table style=\"font-size: 18px\">\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td width=\"90%\">\n");
      out.write("			<a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</a> | \n");
      out.write("			");

				if (userLoggedIn) {
			
      out.write(" \n");
      out.write("			<a href=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</a>\n");
      out.write("			");

				} else {
			
      out.write("\n");
      out.write("			 <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</a>\n");
      out.write("		    ");

 				}
 			
      out.write("\n");
      out.write(" 			</td>\n");
      out.write("			<td rowspan=\"2\">\n");
      out.write("				<h1 align=\"right\">\n");
      out.write("					<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/RaysLogo.png\" width=\"240\" height=\"90\">\n");
      out.write("				</h1>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td>\n");
      out.write("				<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		");

			if (userLoggedIn) {
		
      out.write("\n");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td colspan=\"2\">\n");
      out.write("				<font> \n");
      out.write("					<a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet Merit List</a> | \n");
      out.write("					\n");
      out.write("					");

					if (userBean.getRoleId() == RoleBean.ADMIN) {
					
      out.write(" \n");
      out.write("					<a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add Time Table</a> | \n");
      out.write("					<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> | \n");
      out.write("					\n");
      out.write("					<a target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</a> \n");
      out.write("					");

 						}
 					
      out.write(" \n");
      out.write(" 					");

 					if (userBean.getRoleId() == RoleBean.STUDENT) {
 					
      out.write(" \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> |\n");
      out.write(" 					");

 						}
 					
      out.write(" \n");
      out.write(" 					");

 					if (userBean.getRoleId() == RoleBean.KIOSK) {
 					
      out.write(" \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</b></a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> |\n");
      out.write(" 					");

 						}
 					
      out.write("\n");
      out.write(" 					");

 					if (userBean.getRoleId() == RoleBean.FACULTY) {
 					
      out.write(" \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add Time Table</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> |\n");
      out.write(" 					");

 						}
 					
      out.write(" \n");
      out.write(" 					");

 					if (userBean.getRoleId() == RoleBean.COLLEGE_SCHOOL) {
 					
      out.write(" \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> | \n");
      out.write(" 					<a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | \n");
      out.write(" 					");

 						}
 					
      out.write("\n");
      out.write("				</font>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("	</table>\n");
      out.write("	<hr>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("	<form action=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("		<center>\n");
      out.write("\n");
      out.write("			<div align=\"center\">\n");
      out.write("				<h1>User List</h1>\n");
      out.write("				<h3>\n");
      out.write("					<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\n");
      out.write("					<font color=\"green\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\n");
      out.write("				</h3>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			");

				List rlist = (List) request.getAttribute("RoleList");

				List ulist = (List) request.getAttribute("LoginId");

				int next = DataUtility.getInt(request.getAttribute("nextlist").toString());
			
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("			");

				int pageNo = ServletUtility.getPageNo(request);
				int pageSize = ServletUtility.getPageSize(request);
				int index = ((pageNo - 1) * pageSize) + 1;

				List list = ServletUtility.getList(request);
				Iterator<UserBean> it = list.iterator();

				if (list.size() != 0) {
			
      out.write("\n");
      out.write("			<table width=\"100%\" align=\"center\">\n");
      out.write("				<tr>\n");
      out.write("					<th></th>\n");
      out.write("					<td align=\"center\"><label>FirstName : </label> <input\n");
      out.write("						type=\"text\" name=\"firstName\" style=\"width: 231px;\"\n");
      out.write("						placeholder=\"Enter First Name\"\n");
      out.write("					 	value=\"");
      out.print(ServletUtility.getParameter("firstName", request));
      out.write("\">   \n");
      out.write("						&emsp;\n");
      out.write("						\n");
      out.write("						\n");
      out.write("				\n");
      out.write("				");
      out.write(" \n");
      out.write("                          \n");
      out.write("\n");
      out.write("\n");
      out.write("					");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("					<label>Login Id : </label>\n");
      out.write("					<input type=\"text\" name=\"loginid\" style=\"width: 231px;\"\n");
      out.write("						placeholder=\"Enter Login-Id\"\n");
      out.write("						value=\"");
      out.print(ServletUtility.getParameter("loginid", request));
      out.write("\">\n");
      out.write("					&emsp;\n");
      out.write("\n");
      out.write("					<label>Role : </label>\n");
      out.write("					");
      out.print(HTMLUtility.getList("roleid", String.valueOf(bean.getRoleId()), rlist));
      out.write("\n");
      out.write("					&nbsp;&nbsp;\n");
      out.write("					<input type=\"submit\" name=\"operation\"\n");
      out.write("						value=\"");
      out.print(UserListCtl.OP_SEARCH);
      out.write("\"> &nbsp;\n");
      out.write("					<input type=\"submit\" name=\"operation\"\n");
      out.write("						value=\"");
      out.print(UserListCtl.OP_RESET);
      out.write("\">\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("			<br>\n");
      out.write("\n");
      out.write("			<table border=\"1\" width=\"100%\" align=\"center\" cellpadding=6px\n");
      out.write("				cellspacing=\".2\">\n");
      out.write("				<tr style=\"background: read\">\n");
      out.write("					<th><input type=\"checkbox\" id=\"select_all\" name=\"select\">Select\n");
      out.write("						All</th>\n");
      out.write("					<th>S.No.</th>\n");
      out.write("					<th>FirstName</th>\n");
      out.write("					<th>LastName</th>\n");
      out.write("					<th>LoginId</th>\n");
      out.write("					<th>Gender</th>\n");
      out.write("					<th>Date Of Birth</th>\n");
      out.write("					<th>RoleName</th>\n");
      out.write("					<th>Mobile No</th>\n");
      out.write("					<th>Edit</th>\n");
      out.write("				</tr>\n");
      out.write("\n");
      out.write("				");

					while (it.hasNext()) {
							bean = it.next();
							RoleModel model = new RoleModel();
							
							 RoleBean rolebean = model.findByPK(bean.getRoleId());
				
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("				<tr align=\"center\">\n");
      out.write("				\n");
      out.write("					<td><input type=\"checkbox\" class=\"checkbox\" name=\"ids\"\n");
      out.write("						value=\"");
      out.print(bean.getId());
      out.write("\"\n");
      out.write("						");
if (userBean.getId() == bean.getId() || bean.getRoleId() == RoleBean.ADMIN) {
      out.write("\n");
      out.write("						");
      out.print("disabled");
      out.write(' ');
}
      out.write(">\n");
      out.write("						</td>\n");
      out.write("					<td>");
      out.print(index++);
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bean.getFirstName());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bean.getLastName());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bean.getLogIn());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bean.getGender());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bean.getDob());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(rolebean.getName());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bean.getMobileNo());
      out.write("</td>\n");
      out.write("					<td><a href=\"UserCtl?id=");
      out.print(bean.getId());
      out.write("\"         \n");
      out.write("						");
if (userBean.getId() == bean.getId() || bean.getRoleId() == RoleBean.ADMIN) {
      out.write("\n");
      out.write("						onclick=\"return false;\" ");
}
      out.write(">Edit</a></td>\n");
      out.write("				</tr>\n");
      out.write("				");

					}
				
      out.write("\n");
      out.write("			</table>\n");
      out.write("\n");
      out.write("			<table width=\"100%\">\n");
      out.write("				<tr>\n");
      out.write("					<th></th>\n");
      out.write("					");

						if (pageNo == 1) {
					
      out.write("\n");
      out.write("					<td><input type=\"submit\" name=\"operation\" disabled=\"disabled\"\n");
      out.write("						value=\"");
      out.print(UserListCtl.OP_PREVIOUS);
      out.write("\"></td>\n");
      out.write("					");

						} else {
					
      out.write("\n");
      out.write("					<td><input type=\"submit\" name=\"operation\"\n");
      out.write("						value=\"");
      out.print(UserListCtl.OP_PREVIOUS);
      out.write("\"></td>\n");
      out.write("					");

						}
					
      out.write("\n");
      out.write("\n");
      out.write("					<td><input type=\"submit\" name=\"operation\"\n");
      out.write("						value=\"");
      out.print(UserListCtl.OP_DELETE);
      out.write("\"></td>\n");
      out.write("					<td><input type=\"submit\" name=\"operation\"\n");
      out.write("						value=\"");
      out.print(UserListCtl.OP_NEW);
      out.write("\"></td>\n");
      out.write("					<td align=\"right\"><input type=\"submit\" name=\"operation\"\n");
      out.write("						value=\"");
      out.print(UserListCtl.OP_NEXT);
      out.write("\"\n");
      out.write("						");
      out.print((list.size() < pageSize || next == 0) ? "disabled" : "");
      out.write(">\n");
      out.write("					</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("			");

				}
				if (list.size() == 0) {
			
      out.write("\n");
      out.write("			<td align=\"center\"><input type=\"submit\" name=\"operation\"\n");
      out.write("				value=\"");
      out.print(UserListCtl.OP_BACK);
      out.write("\"></td>\n");
      out.write("			");

				}
			
      out.write("\n");
      out.write("\n");
      out.write("			<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo);
      out.write("\"> <input\n");
      out.write("				type=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\n");
      out.write("	</form>\n");
      out.write("	</br>\n");
      out.write("	</br>\n");
      out.write("	</br>\n");
      out.write("	</br>\n");
      out.write("\n");
      out.write("	</center>\n");
      out.write("\n");
      out.write("	");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Footer</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write(".footer {\n");
      out.write("	position: fixed;\n");
      out.write("	left: 0;\n");
      out.write("	width: 100%;\n");
      out.write("	bottom: 0;\n");
      out.write("	background-color: white;\n");
      out.write("	color: black;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("	<div class=\"footer\">\n");
      out.write("		<hr>\n");
      out.write("		<h3>&copy; Copyrights RAYS Technologies</h3>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
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