package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class album_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Album example for Bootstrap</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/album.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("      <div class=\"collapse bg-dark\" id=\"navbarHeader\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-8 col-md-7 py-4\">\n");
      out.write("                <h4 class=\"text-white\">&copy;2018</h4>\n");
      out.write("              <img src=\"img/logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 offset-md-1 py-4\">\n");
      out.write("              <h4 class=\"text-white\">Menu</h4>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li><a href=\"tablaFichas.html\" class=\"text-white\">Ingresar Fichas encontradas</a></li>\n");
      out.write("                <li><a href=\"album.html\" class=\"text-white\">Ver todas las fichas</a></li>\n");
      out.write("                <li><a href=\"index.html\" class=\"text-white\">Cerrar Sesión</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbar navbar-dark bg-dark box-shadow\">\n");
      out.write("        <div class=\"container d-flex justify-content-between\">\n");
      out.write("          <a href=\"#\" class=\"navbar-brand d-flex align-items-center\">\n");
      out.write("              <img src=\"img/logo.png\" width=\"20\" height=\"20\">\n");
      out.write("              \n");
      out.write("            <strong>Ver todas las fichas del album</strong>\n");
      out.write("          </a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarHeader\" aria-controls=\"navbarHeader\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main role=\"main\">\n");
      out.write("\n");
      out.write("      <section class=\"jumbotron text-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("         ------------------- aqui va la tabla ----------------\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer class=\"text-muted\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <p class=\"float-right\">\n");
      out.write("          <a href=\"#\">Volver al inicio</a>\n");
      out.write("        </p>\n");
      out.write("        <p>Todos los derechos reservados &copy; Panini 2018.</p>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- Nucleo Bootstrap en JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Se pone al final del documento para que la pagina cargue más rápido -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"js/vendor/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/vendor/holder.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
