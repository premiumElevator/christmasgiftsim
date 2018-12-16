import java.io.File;
import java.awt.Image;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;


public class ImageImporter
{
  private ArrayList<Image> images = new ArrayList<Image>();
  private FileReader file;
  private BufferedReader parser;
  private String path;
  private File pic;
  private BufferedImage img;
  public ImageImporter()
  {

    try{
       file = new FileReader("Paths.txt");
    }catch(IOException e)
    {
        System.out.println("there was an error1.");
    }

    try{
        parser = new BufferedReader(file);
        path = parser.readLine();
        while(path != null)
        {
           InputStream is = new BufferedInputStream(new FileInputStream(path.trim()));
           images.add(ImageIO.read(is));

           path = parser.readLine();
        }

    }catch(Exception e)
    {
        System.out.println("There was an error2.");
    }


  }
  public ArrayList getImages()
  {
      return images;
  }
}
