package com.elem.retail.api.util;

import com.elem.retail.api.ElemConstants;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public class Md5Utils {

    private static final int SIGNUM = 1;

    /**
     * hex值
     */
    private static final int HEX_FLAG = 16;

    /**
     * 签名的长度
     */
    private static final int SIGN_LENGTH = 32;

    /**
     * 填充值
     */
    private static final String FILL_CHAR = "0";

    /**
     * 32位md5加密
     *
     * @param input
     * @return
     */
    public static String get32Md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes(ElemConstants.DEFAULT_CHARSET));
            BigInteger number = new BigInteger(SIGNUM, messageDigest);
            String hashtext = number.toString(HEX_FLAG);
            while (hashtext.length() < SIGN_LENGTH) {
                hashtext = FILL_CHAR + hashtext;
            }

            return hashtext.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
