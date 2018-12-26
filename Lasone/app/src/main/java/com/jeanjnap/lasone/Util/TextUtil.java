package com.jeanjnap.lasone.Util;

import android.content.Context;
import android.graphics.Paint;
import android.widget.TextView;

public class TextUtil {
    Context context;

    public TextUtil(Context context) {
        this.context = context;
    }

    public void setUnderlineText(TextView textView) {
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}
