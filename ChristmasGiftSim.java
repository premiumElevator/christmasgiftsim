import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.SwingConstants;




public class ChristmasGiftSim extends JFrame
{
   private ImageImporter pictures = new ImageImporter();
   private ArrayList<BufferedImage> gifts = pictures.getImages();

   private ChristmasGiftSim(int r)
   {
      super("Christmas Gift Simulator");
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);



      ImageImporter pictures = new ImageImporter();
      JLabel displayGift = new JLabel("");
      ImageIcon imageToDisplay = null;

      int randomGift = r;

      if(randomGift <= 50)
         imageToDisplay = new ImageIcon(gifts.get(0));
      else if(randomGift > 50)
        imageToDisplay = new ImageIcon(gifts.get(1));
      // else if(randomGift>60 && randomGift <=70)
        // imageToDisplay = new ImageIcon(gifts.get(2));
      // else if(randomGift>70 && randomGift <=80)
        // imageToDisplay = new ImageIcon(gifts.get(3));

      displayGift.setIcon(imageToDisplay);
      displayGift.setHorizontalAlignment(SwingConstants.CENTER);
      add(displayGift, SwingConstants.CENTER);


   }

   public static void main(String[] args)
   {
       Random randomizer = new Random();
       int r = randomizer.nextInt(100);
       ChristmasGiftSim simulator = new ChristmasGiftSim(r);
       long start = System.currentTimeMillis();
       long end = start + 10*1000;

       while(System.currentTimeMillis() < end)
       {
           //simulator.pack();
           simulator.setSize(1024, 768);
           simulator.setLocationRelativeTo(null);
           simulator.setVisible(true);
          
       }

       simulator.dispose();

    }

}
