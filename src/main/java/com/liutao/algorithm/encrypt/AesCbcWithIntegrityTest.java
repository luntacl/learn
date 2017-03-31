package com.liutao.algorithm.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/**
 * Created by liutao on 2017/3/29.
 */
public class AesCbcWithIntegrityTest {
    public static void main(String[] args) throws GeneralSecurityException, UnsupportedEncodingException {
        AesCbcWithIntegrity.SecretKeys keys = AesCbcWithIntegrity.generateKey();

        // encrypt
        AesCbcWithIntegrity.CipherTextIvMac cipherTextIvMac = AesCbcWithIntegrity.encrypt("some test", keys);
        // store or send to server
        String ciphertextString = cipherTextIvMac.toString();

        // decrypt
        String plainText = AesCbcWithIntegrity.decryptString(cipherTextIvMac, keys);

    }
}
