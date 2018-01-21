package brower_baidu;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URI;
import java.net.URL;

public class Brower_To_Baidu {
    public void openBaiduAndPush(String str)
    {
        if(Desktop.isDesktopSupported()){
            try
            {
                URI url =new URI("https://www.baidu.com/s?wd="+"江南四大才子");
                Desktop desktop=Desktop.getDesktop();
                desktop.browse(url);
            }catch (URISyntaxException e)
            {
                e.printStackTrace();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        //将str加入默认浏览器搜索引擎中
    }
}
