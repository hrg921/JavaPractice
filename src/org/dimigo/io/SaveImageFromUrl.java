/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by hangeonho on 15. 10. 23..
 */
public class SaveImageFromUrl {

    public static void main(String[] args) {

        String imageUrl = "http://file2.instiz.net/data/file/20150104/5/0/2/502d99bb518276c316ed57f4ea5e3993.jpg";
        try {
            URL url = new URL(imageUrl);

            try(InputStream is = url.openStream();
                OutputStream os = new FileOutputStream("/Users/hangeonho/IdeaProjects/JavaLesson/JavaPractice/files/park.png")) {

                // 파일에 write 하기

                int result;
                byte[] buf = new byte[100];

                while((result = is.read(buf)) != -1) {
                    os.write(buf, 0, result);
                }

                System.out.println("파일 생성 완료");

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
