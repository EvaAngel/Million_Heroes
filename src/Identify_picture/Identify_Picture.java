package Identify_picture;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Identify_Picture{

	public String identify_picture(File imgDir) throws TesseractException {
		ITesseract instance = new Tesseract();
		//根目录下不用管
		//instance.setDatapath("the absolute path of tessdata");
		// 选择语言库
		instance.setLanguage("chi_sim");
		// 图片路径
		//File imgDir = new File("test_chinese_10.png");
		long startTime = System.currentTimeMillis();
		String ocrResult = instance.doOCR(imgDir);
		//去除换行
		String str=ocrResult.replace("\n","");
		// 结果输出
		System.out.println("OCR Result:\n" + str + "\n程序耗时：" + (System.currentTimeMillis() - startTime) + "ms");
		return str;
	}
}