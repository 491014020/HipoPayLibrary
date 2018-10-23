package com.transfer.hipopaylibrary;

import android.app.Activity;

import com.transfer.wcpaylibrary.util.PayUtil;


public class PayUtils {

    /**
     *
     * @param activity
     * @param partnerId 微信支付分配的商户号
     * @param prepayId  微信返回的支付交易会话ID
     * @param nonceStr  随机字符串，不长于32位
     * @param timeStamp 时间戳
     * @param packageValue  暂填写固定值Sign=WXPay
     * @param sign      签名
     */
    public static void wechatTerritoryPay(Activity activity, String partnerId, String prepayId, String nonceStr, String timeStamp, String packageValue, String sign) {
        PayUtil.wechatTerritoryPay(activity, partnerId, prepayId, nonceStr, timeStamp, packageValue, sign);
    }

    /**
     *
     * @param activity
     * @param prepay_string 签名，用来调起支付宝支付
     */
    public static void alipayTerritoryPay(Activity activity, String prepay_string){
        PayUtil.aliPayTerritoryPay(activity,prepay_string);
    }
}
