package client;

import Identify_picture.Identify_Picture;
import brower_baidu.Brower_To_Baidu;
import net.sourceforge.tess4j.TesseractException;
import screenshot.ScreenShot;

import java.io.File;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws TesseractException, IOException {
            ScreenShot ss = new ScreenShot();
            ss.screenShotTwo();
            Identify_Picture ip = new Identify_Picture();
            File imgDir = imgDir = new File("d:\\捕获.PNG");
            while (!imgDir.exists()) {
                imgDir = new File("d:\\捕获.PNG");
            }
            String result = ip.identify_picture(imgDir);
            System.out.print(result);
            Brower_To_Baidu btb = new Brower_To_Baidu();
            btb.openBaiduAndPush(result);
            imgDir.delete();
    }
}
