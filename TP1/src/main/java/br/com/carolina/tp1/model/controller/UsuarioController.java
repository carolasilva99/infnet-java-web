package br.com.carolina.tp1.model.controller;

import br.com.carolina.tp1.model.domain.Usuario;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final List<Usuario> usuarios;

    public UsuarioController() {
        super();
        usuarios = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("home.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Usuario usuario =
                new Usuario(req.getParameter("nome"), req.getParameter("email"), req.getParameter("senha"));

        usuarios.add(usuario);

        System.out.println(usuario.getEmail());

        PrintWriter out = resp.getWriter();

        out.println(
                "<!DOCTYPE html>\r\n" +
                "<html>\r\n" +
                    "<head>\r\n" +
                        "<meta charset=\"ISO-8859-1\">\r\n" +
                        "<title>TP1 - Confirma!!!</title>\r\n" +
                        "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" +
                    "</head>\r\n" +
                    "<body>	\r\n" +
                        "<div class=\"container\">\r\n" +
                            "<a href='usuario'>Voltar</a>\r\n" +
                            "<h2 >O usuário "+ usuario.getNome() +" foi cadastrado com sucesso com o email " +
                                usuario.getEmail() + "!!!</h2>\r\n" +
                            "<h3 >Quantidade de usuários existentes: "+ usuarios.size() +"!!!</h3>\r\n" +
                        "</div>\r\n" +
                    "</body>\r\n" +
                "</html>"
        );
    }
}
