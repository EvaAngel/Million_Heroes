package client;

import Identify_picture.Identify_Picture;
import brower_baidu.Brower_To_Baidu;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Client {
    public static void main(String[] args) throws TesseractException {
        Identify_Picture ip=new Identify_Picture();
        File imgDir=new File("test_chinese_10.png");
        String result=ip.identify_picture(imgDir);
        System.out.print(result);
        Brower_To_Baidu btb=new Brower_To_Baidu();
        btb.openBaiduAndPush(result);
    }
}
