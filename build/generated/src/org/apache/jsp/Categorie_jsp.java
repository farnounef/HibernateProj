package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.projet.services.CategorieService;
import ma.projet.entities.Categorie;

public final class Categorie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Categorie Page</title>\n");
      out.write("    <!-- Inclure Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <!-- Inclure Bootstrap JavaScript (jQuery requis) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("    <style>\n");
      out.write("        /* Personnalisation du style pour remplir 90% de l'écran */\n");
      out.write("        .custom-container {\n");
      out.write("            width: 90%;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        legend{\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 50px;\n");
      out.write("            margin: 60px;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("            \n");
      out.write("            font-size: 20px;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            fieldset {\n");
      out.write("            border: 3px solid #ddd;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .modal-content h5.modal-title {\n");
      out.write("        font-size: 30px;/* Ajustez la taille de la police du titre de la modale */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .modal-content .modal-body {\n");
      out.write("        font-size:26px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .modal-content .modal-footer button {\n");
      out.write("        font-size: 26px;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("         \n");
      out.write("           \n");
      out.write("            \n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function validateForm() {\n");
      out.write("                var code = document.getElementsByName(\"code\")[0].value;\n");
      out.write("                var libelle = document.getElementsByName(\"libelle\")[0].value;\n");
      out.write("                var id = document.getElementsByName(\"id\")[0].value;\n");
      out.write("                var valider = document.getElementsByName(\"valider\")[0].value;\n");
      out.write("\n");
      out.write("                // Vérifier si les champs Code et Libelle sont vides\n");
      out.write("                if (code.trim() === '' && libelle.trim() === '') {\n");
      out.write("                    alert(\"Les champs Code et Libelle ne peuvent pas être vides.\");\n");
      out.write("                    return false; // Empêcher la soumission du formulaire\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Vérifier la valeur du bouton \"valider\"\n");
      out.write("                if (valider === \"Modifier\") {\n");
      out.write("                    // Si le bouton est \"Modifier\", rediriger avec l'ID\n");
      out.write("                    console.log(id);\n");
      out.write("                    window.location.href = \"CategorieController?op=update&id=\" + id + \"&code=\" + code + \"&libelle=\" + libelle;;\n");
      out.write("                    return false; // Empêcher la soumission du formulaire\n");
      out.write("                } else if (valider === \"Ajouter\") {\n");
      out.write("                    // Si le bouton est \"Ajouter\", permettre la soumission du formulaire\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Si aucune des conditions précédentes n'est satisfaite, par défaut, empêcher la soumission du formulaire\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            \n");
      out.write("            function updateCategory(id, code, libelle) {\n");
      out.write("                // Pre-fill the code and libelle fields with the category data\n");
      out.write("                document.getElementsByName(\"code\")[0].value = code;\n");
      out.write("                document.getElementsByName(\"libelle\")[0].value = libelle;\n");
      out.write("                document.getElementsByName(\"id\")[0].value = id;\n");
      out.write("                document.getElementsByName(\"valider\")[0].value = \"Modifier\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <aside id=\"sidebar-multi-level-sidebar\" class=\"fixed top-0 left-0 z-40 w-96 h-screen transition-transform -translate-x-full sm:translate-x-0 bg-black\" aria-label=\"Sidebar\">\n");
      out.write("            <div class=\"h-full px-6 py-8 overflow-y-auto bg-black dark:bg-gray-800\">\n");
      out.write("                <ul class=\"space-y-6 font-semibold\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Produit.jsp\" class=\"flex items-center p-6 text-3xl text-white rounded-lg hover:bg-gray-100 dark:hover:bg-gray-700 group\">\n");
      out.write("                            <svg class=\"w-12 h-12 text-white transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\" viewBox=\"0 0 22 21\">\n");
      out.write("                            <path d=\"M16.975 11H10V4.025a1 1 0 0 0-1.066-.998 8.5 8.5 0 1 0 9.039 9.039.999.999 0 0 0-1-1.066h.002Z\" fill=\"white\" />\n");
      out.write("                            <path d=\"M15 12a1 1 0 0 0 .962-.726l2-7A1 1 0 0 0 17 3H3.77L3.175.745A1 1 0 0 0 2.208 0H1a1 1 0 0 0 0 2h.438l.6 2.255v.019l2 7 .746 2.986A3 3 0 1 0 9 17a2.966 2.966 0 0 0-.184-1h2.368c-.118.32-.18.659-.184 1a3 3 0 1 0 3-3H6.78l-.5-2H15Z\" fill=\"white\" />\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"ml-8\">Produits</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Commande.jsp\" class=\"flex items-center p-6 text-3xl text-white rounded-lg hover:bg-gray-100 dark:hover:bg-gray-700 group\">\n");
      out.write("                            <svg class=\"w-12 h-12 text-white transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\" viewBox=\"0 0 20 18\">\n");
      out.write("                            <path d=\"M14 2a3.963 3.963 0 0 0-1.4.267 6.439 6.439 0 0 1-1.331 6.638A4 4 0 1 0 14 2Z\" fill=\"white\" />\n");
      out.write("                            <path d=\"M10 4a4 4 0 1 1-8 0 4 4 0 0 1 8 0Z\" fill=\"white\" />\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"ml-8\">Commandes</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Categorie.jsp\" class=\"flex items-center p-6 text-3xl text-white rounded-lg hover:bg-gray-100 dark:hover:bg-gray-700 group\">\n");
      out.write("                            <svg class=\"w-12 h-12 text-white transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\" viewBox=\"0 0 18 20\">\n");
      out.write("                            <path d=\"M17 5.923A1 1 0 0 0 16 5h-3V4a4 4 0 1 0-8 0v1H2a1 1 0 0 0-1 .923L.086 17.846A2 2 0 0 0 2.08 20h13.84a2 2 0 0 0 1.994-2.153L17 5.923Z\" fill=\"white\" />\n");
      out.write("                            <path d=\"M10 9a1 1 0 1 0 0-2 1 1 0 0 0 0 2Z\" fill=\"white\" />\n");
      out.write("                            <path d=\"M10 4a2 2 0 1 0 0 4 2 2 0 0 0 0-4Z\" fill=\"white\" />\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"ml-8\">Categories</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Personne.jsp\" class=\"flex items-center p-6 text-3xl text-white rounded-lg hover:bg-gray-100 dark:hover:bg-gray-700 group\">\n");
      out.write("                            <svg class=\"w-12 h-12 text-white transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 18 16\">\n");
      out.write("                            <path stroke=\"white\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M14 2a3.963 3.963 0 0 0-1.4.267 6.439 6.439 0 0 1-1.331 6.638A4 4 0 1 0 14 2Zm1 9h-1.264A6.957 6.957 0 0 1 15 15v2a2.97 2.97 0 0 1-.184 1H19a1 1 0 0 0 1-1v-1a5.006 5.006 0 0 0-5-5ZM6.5 9a4.5 4.5 0 1 0 0-9 4.5 4.5 0 0 0 0 9ZM8 10H5a5.006 5.006 0 0 0-5 5v2a1 1 0 0 0 1 1h11a1 1 0 0 0 1-1v-2a5.006 5.006 0 0 0-5-5Z\" />\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"ml-8\">Personnes</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"login.js\" class=\"flex items-center p-6 text-3xl text-white rounded-lg hover:bg-gray-100 dark:hover:bg-gray-700 group\">\n");
      out.write("                            <svg class=\"w-12 h-12 text-white transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 18 16\">\n");
      out.write("                            <path stroke=\"white\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M1 8h11m0 0L8 4m4 4-4 4m4-11h3a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2h-3\" />\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"ml-8\">Se déconnecté</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Modal de confirmation de suppression -->\n");
      out.write("<div class=\"modal fade\" id=\"confirmDeleteModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"confirmDeleteModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header bg-danger text-white\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"confirmDeleteModalLabel\">Confirmation de la suppression</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                Êtes-vous sûr de vouloir supprimer ce produit ?\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded\" id=\"confirmDeleteBtn\">Confirmer la suppression</button>\n");
      out.write("                <button type=\"button\" class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded\" data-dismiss=\"modal\">Annuler</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("       <div class=\"container mt-4 p-5\" style=\"margin-top: 80px; margin-left: 400px;\">\n");
      out.write("        <form action=\"CategorieController\" onsubmit=\"return validateForm()\" id=\"categorieForm\">\n");
      out.write("            <fieldset class=\"p-3\">\n");
      out.write("                <legend class=\"mb-4\">Gestion des catégories</legend>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                <label style=\"font-size:30px\" for=\"code\" class=\"col-sm-2 col-form-label text-center\">Code:</label>\n");
      out.write("                <div class=\"col-sm-6 mx-auto\">\n");
      out.write("                    <input style=\"font-size:30px\" type=\"text\" class=\"form-control\" name=\"code\" id=\"code\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <input  type=\"text\" name=\"id\" value=\"\" hidden/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <label style=\"font-size:30px\" for=\"libelle\" class=\"col-sm-2 col-form-label text-center\">Libelle:</label>\n");
      out.write("                <div class=\"col-sm-6 mx-auto\">\n");
      out.write("                    <input style=\"font-size:30px\" type=\"text\" class=\"form-control\" name=\"libelle\" id=\"libelle\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                   <input style=\"font-size:30px\" type=\"submit\" class=\"btn btn-primary btn-lg bg-blue-500 text-white\" value=\"Ajouter\" name=\"valider\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                     \n");
      out.write("                </div>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <fieldset class=\"mt-4\">\n");
      out.write("            <legend>Liste des catégories</legend>\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"font-size:30px\">Code</th>\n");
      out.write("                        <th style=\"font-size:30px\">Libelle</th>\n");
      out.write("                        <th style=\"font-size:30px\">Supprimer</th>\n");
      out.write("                        <th style=\"font-size:30px\">Modifier</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        CategorieService cs = new CategorieService();
                        for (Categorie c : cs.findAll()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"font-size:30px\">");
      out.print( c.getCode());
      out.write("</td>\n");
      out.write("                        <td style=\"font-size:30px\">");
      out.print( c.getLibelle());
      out.write("</td>\n");
      out.write("                        <td style=\"font-size:30px\">\n");
      out.write("   <button style=\"font-size:30px\" type=\"button\" class=\"btn btn-danger bg-red-500 text-white\" data-toggle=\"modal\" data-target=\"#confirmDeleteModal\" data-id=\"");
      out.print(c.getId());
      out.write("\" data-libelle=\"");
      out.print(c.getLibelle());
      out.write("\">Supprimer</button>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td><button style=\"font-size:30px\" type=\"button\" class=\"btn btn-primary bg-blue-500 text-white\" onclick=\"updateCategory(");
      out.print(c.getId());
      out.write(", '");
      out.print(c.getCode());
      out.write("', '");
      out.print(c.getLibelle());
      out.write("')\">Modifier</button>\n");
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("    </div>\n");
      out.write("                <script>\n");
      out.write("    // Gestionnaire d'événements lorsque le bouton de suppression est cliqué\n");
      out.write("    $('button[data-toggle=\"modal\"][data-target=\"#confirmDeleteModal\"]').on('click', function () {\n");
      out.write("        // Récupérer l'ID et le libellé de la catégorie à supprimer à partir des attributs data-\n");
      out.write("        var categoryId = $(this).data('id');\n");
      out.write("        var categoryLibelle = $(this).data('libelle');\n");
      out.write("\n");
      out.write("        // Mettre à jour le texte de la modal avec le libellé de la catégorie\n");
      out.write("        $('#confirmDeleteModal .modal-body').text('Êtes-vous sûr de vouloir supprimer la catégorie \"' + categoryLibelle + '\" ?');\n");
      out.write("\n");
      out.write("        // Configurer le bouton \"Confirmer la suppression\" dans la modal pour rediriger vers la suppression réelle\n");
      out.write("        $('#confirmDeleteBtn').on('click', function () {\n");
      out.write("            window.location.href = \"CategorieController?op=delete&id=\" + categoryId;\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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