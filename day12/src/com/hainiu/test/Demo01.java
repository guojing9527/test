package com.hainiu.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        try ( FileInputStream fis = new FileInputStream("C:\\Users\\86151\\Desktop\\mn .jpg");
              FileOutputStream fos = new FileOutputStream("day12\\mn.jpg");){
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer))!= -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
