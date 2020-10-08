package com.leaf.statusbarutil;

import android.app.Application;

import com.leaf.statusbarutil.utils.AppUtils;

/**
 * date: today
 * desc: App
 * * #                                                   #
 * * #                       _oo0oo_                     #
 * * #                      o8888888o                    #
 * * #                      88" . "88                    #
 * * #                      (| -_- |)                    #
 * * #                      0\  =  /0                    #
 * * #                    ___/`---'\___                  #
 * * #                  .' \\|     |# '.                 #
 * * #                 / \\|||  :  |||# \                #
 * * #                / _||||| -:- |||||- \              #
 * * #               |   | \\\  -  #/ |   |              #
 * * #               | \_|  ''\---/''  |_/ |             #
 * * #               \  .-\__  '-'  ___/-. /             #
 * * #             ___'. .'  /--.--\  `. .'___           #
 * * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * * #                       `=---='                     #
 * * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * * #                                                   #
 * * #               Toan        Son                     #
 * * #                                                   #
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.init(this);
    }


}
