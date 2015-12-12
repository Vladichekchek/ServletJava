import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class ImageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("img/png");
        BufferedImage image = new BufferedImage(640, 120, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        Font font = new Font("Arial", Font.BOLD, 72);
        graphics.setFont(font);
        graphics.drawString("Hello World!!!", 100, 100);

        ImageIO.write(image, "png", resp.getOutputStream());
        resp.getOutputStream().close();



    }
}
