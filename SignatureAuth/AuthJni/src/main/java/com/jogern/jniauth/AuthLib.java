package com.jogern.jniauth;

import android.content.Context;

/**
 * Create on 2019/1/26.
 * @author jogern
 */
public class AuthLib {

      // Used to load the 'native-lib' library on application startup.
      static {
            System.loadLibrary("Auth");
      }

      public static native void initSignature(Context context);

      public static native String md5(String text,boolean toUpperCase);

      public static native String encrypt(String text);

      public static native String decrypt(String text);

}
