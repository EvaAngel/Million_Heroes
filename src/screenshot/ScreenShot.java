package screenshot;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.nio.cs.ext.GBK;

import java.io.*;

public class ScreenShot {
    /**
     * 功能：自动弹出截图工具并在截图完成后返回保存的图片
     *
     * @return 返回截图所得图片
     */
    public File screenShot() throws IOException {
        String str;
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("C:\\Windows\\System32\\SnippingTool.exe");
        InputStream fis=pr.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        OutputStreamWriter pw=new OutputStreamWriter(new FileOutputStream("d:\\test.PNG"),"GBK");
        while((str=br.readLine())!=null)
        {
            pw.write(str);
        }
        br.close();
        pw.close();
        return null;
    }

    /**
     * 第一个实在不好捕获，所以选择第二个手动捕获
     * @throws IOException
     */
    public void screenShotTwo() throws IOException
    {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("C:\\Windows\\System32\\SnippingTool.exe");
    }
    public static void main(String[] args) throws IOException {
        ScreenShot ss=new ScreenShot();
        ss.screenShotTwo();
    }
}
