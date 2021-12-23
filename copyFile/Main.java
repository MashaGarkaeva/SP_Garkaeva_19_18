package com.company.copyFile;

import java.io.*;

import static java.lang.System.nanoTime;

public class Main {
    public static void main(String[] args) throws IOException {
        File one = new File("C:\\Users\\мария\\CopyFile\\one.txt");
        File two = new File("C:\\Users\\мария\\CopyFile\\two.txt");

        long start = nanoTime();                                                    //|задаётся время
        copy(one, two);                                                             //|копируются файлы
        System.out.println("Time: " + (System.nanoTime()-start) + " наносекунд");   //|высчитывает и выводит время
    }

    private static void copy(File one, File two) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(one);
            out = new FileOutputStream(two);
            byte[] byt = new byte[1024];//задаётся количество байт
            int readByte;
            while ((readByte = in.read(byt)) > 0){
                out.write(byt, 0, readByte);
            }
        } finally {
            in.close();
            out.close();
        }
    }
}