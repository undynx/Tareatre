/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-10-12 20:50:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroError_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1694570871640L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1696981027739L));
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Error</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/styles/index.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"body\">\r\n");
      out.write("<!-- Incluye el encabezado desde header.jsp -->\r\n");
      out.write("	");
      out.write("<!-- @format -->\r\n");
      out.write("\r\n");
      out.write("<!-- Este caso de uso permite a un visitante del sitio iniciar sesión mediante\r\n");
      out.write("el ingreso de su nickname y contraseña. El Sistema verifica que los\r\n");
      out.write("datos sean válidos e inicia la sesión para el Profesor/Socio. En caso de\r\n");
      out.write("que no sean válidos, se mostrará una advertencia al Visitante para que\r\n");
      out.write("pueda reingresar sus datos o cancelar el inicio. -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<title>EntrenamosUy</title>\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/styles/index.css\" />\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<header>\r\n");
      out.write("			<nav\r\n");
      out.write("				class=\"navbar navbar-expand-lg bg-body-tertiary\"\r\n");
      out.write("				data-bs-theme=\"dark\"\r\n");
      out.write("			>\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<a class=\"navbar-brand\" href=\"index.jsp\">\r\n");
      out.write("						<img src=\"./assets/images/logo.png\" width=\"40\" alt=\"logo\" />\r\n");
      out.write("					</a>\r\n");
      out.write("					\r\n");
      out.write("					");
 String nickname = (String) session.getAttribute("nickname"); 
						if (nickname != null) { 
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<button\r\n");
      out.write("						class=\"navbar-toggler\"\r\n");
      out.write("						type=\"button\"\r\n");
      out.write("						data-bs-toggle=\"collapse\"\r\n");
      out.write("						data-bs-target=\"#navbarNav\"\r\n");
      out.write("						aria-controls=\"navbarNav\"\r\n");
      out.write("						aria-expanded=\"false\"\r\n");
      out.write("						aria-label=\"Toggle navigation\"\r\n");
      out.write("					>\r\n");
      out.write("						<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("					</button>\r\n");
      out.write("					<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("						<ul class=\"navbar-nav\">\r\n");
      out.write("							<li class=\"nav-item dropdown\">\r\n");
      out.write("								<a\r\n");
      out.write("									class=\"nav-link dropdown-toggle\"\r\n");
      out.write("									href=\"#\"\r\n");
      out.write("									id=\"clasesDropdown\"\r\n");
      out.write("									role=\"button\"\r\n");
      out.write("									data-bs-toggle=\"dropdown\"\r\n");
      out.write("									aria-haspopup=\"true\"\r\n");
      out.write("									aria-expanded=\"false\"\r\n");
      out.write("								>\r\n");
      out.write("									Clases\r\n");
      out.write("								</a>\r\n");
      out.write("								\r\n");
      out.write("									\r\n");
      out.write("								<div class=\"dropdown-menu\" aria-labelledby=\"clasesDropdown\">\r\n");
      out.write("								");
 String tipo = (String) session.getAttribute("tipo");
								
									if (tipo.equals("Profesor")) { 
      out.write("\r\n");
      out.write("									<a class=\"dropdown-item\" href=\"AltaDictadoClases.jsp\"\r\n");
      out.write("										>Alta Dictado de Clases\r\n");
      out.write("									</a>\r\n");
      out.write("									<a class=\"dropdown-item\" href=\"ConsultaDictadoClases.jsp\"\r\n");
      out.write("										>Consulta Dictado de Clases</a\r\n");
      out.write("									>\r\n");
      out.write("									<a class=\"dropdown-item\" href=\"RankingClases.jsp\"\r\n");
      out.write("										>Ranking de Clases\r\n");
      out.write("									</a>\r\n");
      out.write("									");
 } else { 
      out.write("\r\n");
      out.write("										<form \r\n");
      out.write("											action=\"ObtenerInstituciones\" \r\n");
      out.write("											method=\"post\"\r\n");
      out.write("										>\r\n");
      out.write("											<button type=\"submit\" class=\"dropdown-item\">\r\n");
      out.write("												Registro Dictado de Clases\r\n");
      out.write("											</button>\r\n");
      out.write("										</form>\r\n");
      out.write("										\r\n");
      out.write("										<a class=\"dropdown-item\" href=\"EliminarRegistroClase.jsp\"\r\n");
      out.write("										>Eliminar Registro de Clase</a\r\n");
      out.write("									>\r\n");
      out.write("									");
 } 
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"nav-item dropdown\">\r\n");
      out.write("								<a\r\n");
      out.write("									class=\"nav-link dropdown-toggle\"\r\n");
      out.write("									href=\"#\"\r\n");
      out.write("									id=\"actividadesDropdown\"\r\n");
      out.write("									role=\"button\"\r\n");
      out.write("									data-bs-toggle=\"dropdown\"\r\n");
      out.write("									aria-haspopup=\"true\"\r\n");
      out.write("									aria-expanded=\"false\"\r\n");
      out.write("								>\r\n");
      out.write("									Actividades\r\n");
      out.write("								</a>\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"dropdown-menu\"\r\n");
      out.write("									aria-labelledby=\"actividadesDropdown\"\r\n");
      out.write("								>\r\n");
      out.write("								<a class=\"dropdown-item\" href=\"ConsultaActividades.jsp\"\r\n");
      out.write("										>Consulta de Actividades\r\n");
      out.write("									</a>\r\n");
      out.write("								");
if (tipo.equals("Profesor")) { 
      out.write("\r\n");
      out.write("									<a class=\"dropdown-item\" href=\"RankingActividades.jsp\"\r\n");
      out.write("										>Ranking de Actividades\r\n");
      out.write("									</a>\r\n");
      out.write("								");
 } 
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"nav-item dropdown\">\r\n");
      out.write("								<a\r\n");
      out.write("									class=\"nav-link dropdown-toggle\"\r\n");
      out.write("									href=\"#\"\r\n");
      out.write("									id=\"usuariosDropdown\"\r\n");
      out.write("									role=\"button\"\r\n");
      out.write("									data-bs-toggle=\"dropdown\"\r\n");
      out.write("									aria-haspopup=\"true\"\r\n");
      out.write("									aria-expanded=\"false\"\r\n");
      out.write("								>\r\n");
      out.write("									Usuario\r\n");
      out.write("								</a>\r\n");
      out.write("								<div class=\"dropdown-menu\" aria-labelledby=\"usuariosDropdown\">\r\n");
      out.write("									<form \r\n");
      out.write("										action=\"ConsultaUsuario\" \r\n");
      out.write("										method=\"post\"\r\n");
      out.write("									>\r\n");
      out.write("										<button type=\"submit\" class=\"dropdown-item\">\r\n");
      out.write("											Consulta de Usuarios\r\n");
      out.write("										</button>\r\n");
      out.write("									</form>\r\n");
      out.write("									\r\n");
      out.write("									<form\r\n");
      out.write("										action=\"ObtenerUsuario\"\r\n");
      out.write("										method=\"post\"\r\n");
      out.write("									>\r\n");
      out.write("										<button type=\"submit\" class=\"dropdown-item\">\r\n");
      out.write("											Modificar Usuario\r\n");
      out.write("										</button>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							\r\n");
      out.write("							<li class=\"user-icon\">\r\n");
      out.write("								<form\r\n");
      out.write("									action=\"CierreSesion\"\r\n");
      out.write("									method=\"get\"\r\n");
      out.write("								>\r\n");
      out.write("									<button type=\"submit\" value=\"Cerrar sesión\" class=\"logout-btn\">\r\n");
      out.write("										<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-power logout-svg\" viewBox=\"0 0 16 16\">\r\n");
      out.write("										  <path d=\"M7.5 1v7h1V1h-1z\"/>\r\n");
      out.write("										  <path d=\"M3 8.812a4.999 4.999 0 0 1 2.578-4.375l-.485-.874A6 6 0 1 0 11 3.616l-.501.865A5 5 0 1 1 3 8.812z\"/>\r\n");
      out.write("										</svg>\r\n");
      out.write("									</button>\r\n");
      out.write("								</form>\r\n");
      out.write("							</li>\r\n");
      out.write("							\r\n");
      out.write("							");
 } else { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<li class=\"user-icon\">\r\n");
      out.write("								<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("									<li class=\"nav-item dropdown\">\r\n");
      out.write("										<a\r\n");
      out.write("											class=\"nav-link dropdown-toggle\"\r\n");
      out.write("											href=\"#\"\r\n");
      out.write("											id=\"navbarDropdown\"\r\n");
      out.write("											role=\"button\"\r\n");
      out.write("											data-bs-toggle=\"dropdown\"\r\n");
      out.write("											aria-haspopup=\"true\"\r\n");
      out.write("											aria-expanded=\"false\"\r\n");
      out.write("										>\r\n");
      out.write("											Iniciar Sesión\r\n");
      out.write("										</a>\r\n");
      out.write("										<div\r\n");
      out.write("											class=\"dropdown-menu navBar\"\r\n");
      out.write("											aria-labelledby=\"navbarDropdown\"\r\n");
      out.write("										>\r\n");
      out.write("											<form\r\n");
      out.write("												class=\"px-4 py-3\"\r\n");
      out.write("												action=\"InicioSesion\"\r\n");
      out.write("												method=\"post\"\r\n");
      out.write("											>\r\n");
      out.write("												<div class=\"mb-3\">\r\n");
      out.write("													<label class=\"form-label\">Nickname</label>\r\n");
      out.write("													<input\r\n");
      out.write("														type=\"text\"\r\n");
      out.write("														class=\"form-control\"\r\n");
      out.write("														id=\"unNickname\"\r\n");
      out.write("														name=\"unNickname\"\r\n");
      out.write("														placeholder=\"Tu nickname\"\r\n");
      out.write("													/>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"mb-3\">\r\n");
      out.write("													<label class=\"form-label\">Contraseña</label>\r\n");
      out.write("													<input\r\n");
      out.write("														type=\"text\"\r\n");
      out.write("														class=\"form-control\"\r\n");
      out.write("														id=\"unaPassword\"\r\n");
      out.write("														name=\"unaPassword\"\r\n");
      out.write("														placeholder=\"Contraseña\"\r\n");
      out.write("													/>\r\n");
      out.write("												</div>\r\n");
      out.write("												<input\r\n");
      out.write("													type=\"submit\"\r\n");
      out.write("													class=\"btn btn-primary\"\r\n");
      out.write("													value=\"Iniciar sesion\"\r\n");
      out.write("												/>\r\n");
      out.write("											</form>\r\n");
      out.write("										</div>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</li>\r\n");
      out.write("							");
 } 
      out.write("\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</header>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("	 <div class=\"container mt-5\">\r\n");
      out.write("	<h1>Ya existe un registro para el usuario ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nombreUsuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" en la clase ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nombreClase}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".</h1>\r\n");
      out.write("	</div>\r\n");
      out.write("<!-- Incluye el pie de página desde footer.jsp -->\r\n");
      out.write("	");
      out.write(" <footer class=\"footer\">\r\n");
      out.write("    <p>&copy; 2023 EntrenamosUy</p>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
