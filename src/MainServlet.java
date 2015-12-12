import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Path path = Paths.get("C:\\Users\\Kingv_000\\IdeaProjects\\JavaServletsMA\\src","index.html");
        List<String> strings = Files.readAllLines(path, Charset.defaultCharset());
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        for (int i = 0; i < strings.size(); i++) {
            printWriter.print(strings.get(i));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


    }

}
