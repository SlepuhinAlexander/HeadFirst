package headfirst.chapter18.listings.l3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class KathyServlet extends HttpServlet {
    public KathyServlet() {
    }

    public static void main(String[] args) {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        String title = "Phrase-O-Matic has generated the following phrase.";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>");
        out.println("Phrase-O-Matic");
        out.println("</title></head><body>");
        out.println("<h1>" + title + "</h1>");
        out.println("<p>" + PhraseOMatic.makePhrase() + "</p>");
        out.println("<p><a href=\"KathyServlet\">Make another phrase</a></p>");
        out.println("</body></html>");
        out.close();
    }
}
