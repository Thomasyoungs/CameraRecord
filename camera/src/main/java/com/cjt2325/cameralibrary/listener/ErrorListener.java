package com.cjt2325.cameralibrary.listener;

/**
 * =====================================
 * 作    者: 陈嘉桐
 * 版    本：1.1.4
 * 创建日期：2017/6/5
 * 描    述：
 * =====================================
 */
public interface ErrorListener {
    void onError(String message);
    void AudioPermissionError();
}
