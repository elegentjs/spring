package win.elegentjs.spring.util;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j
public class FileUtil {

    public static String inputStreamToString(InputStream inputStream) {

        if (inputStream == null) {
            return null;
        }

        try {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                String oneLine;
                while ((oneLine = br.readLine()) != null) {
                    sb.append(oneLine);
                }
                return sb.toString();
            }  finally {
                if (br != null) {
                    br.close();
                }
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

}
