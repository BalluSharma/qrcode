package org.example;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;
public class Generateqrcode {
    public static void main(String[] args) throws WriterException, IOException {
        String data = "https://www.youtube.com/channel/UClNdoBr-iGVwChLvCjdEXtg";
        String path = "E:\\Javamanagement\\ballu.jpg"; // Updated path to save in Replit's project directory

        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 500);

        MatrixToImageWriter.writeToPath(matrix, "PNG", Paths.get(path));

        System.out.println("QR Code successfully created at: " + path);
    }
}
