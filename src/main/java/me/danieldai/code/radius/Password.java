package me.danieldai.code.radius;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.ArrayUtils;

public class Password {
    /*
    Generate SSHA-Password in Java, got the same result as described in https://www.packtpub.com/books/content/storing-passwords-using-freeradius-authentication
     */
    public static void main(String[] args) {
        String currPass = "passme";
        String salt = "salt";
        String hashPass = Base64.encodeBase64String(ArrayUtils.addAll(
                DigestUtils.sha1(currPass.concat(salt)),
                salt.getBytes()));

        System.out.println(hashPass);
    }
}
