package com.example.kotlinjetpacktest.util

import android.text.TextUtils
import java.util.regex.Pattern

/**
 * Created by cyg on 2019-12-12.
 */
object UnicodeUtil {

    /*
     * unicode编码转中文
     */
    fun decodeUnicode(dataStr: String): String {
        var str = dataStr
        if (TextUtils.isEmpty(str)) {
            return ""
        }
        val pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))")
        val matcher = pattern.matcher(str)
        var ch: Char
        while (matcher.find()) {
            ch = Integer.parseInt(matcher.group(2)!!, 16).toChar()
            str = str.replace(matcher.group(1)!!, ch + "")
        }
        return str
    }
}
