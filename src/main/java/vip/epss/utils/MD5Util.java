package vip.epss.utils;

import org.springframework.util.DigestUtils;


public class MD5Util {
    //加点作料盐，用于混交md5
    private static final String slat = "&%java6***&&%%$$#@";

    /**
     * 生成md5
     *
     * @param
     * @return
     */
    public static String getMD5(String str) {
        String base = str + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}
