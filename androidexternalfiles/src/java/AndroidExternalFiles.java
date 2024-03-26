package com.defold.AndroidExternalFiles;

import android.content.Context;

public class AndroidExternalFiles
{

  public static String GetDirectory(Context context)
  {
    return context.getExternalFilesDir(null).toString();
  }
}
