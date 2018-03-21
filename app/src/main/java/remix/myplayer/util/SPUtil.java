package remix.myplayer.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by taeja on 16-1-15.
 */

/**
 * SharedPrefs工具类
 */
public class SPUtil {
    public static SPUtil mInstance;
    public SPUtil() {
        if(mInstance == null)
            mInstance = this;
    }

    public static boolean putStringSet(Context context, String name, String key, Set<String> set){
        if(set == null)
            return false;
        SharedPreferences.Editor editor = context.getSharedPreferences(name,Context.MODE_PRIVATE).edit();
        editor.remove(key);
        return editor.putStringSet(key,set).commit();
    }

    public static Set<String> getStringSet(Context context, String name, String key){
        return context.getSharedPreferences(name,Context.MODE_PRIVATE).getStringSet(key,new HashSet<>());
    }

    public static boolean putValue(Context context,String name,String key,int value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(name,Context.MODE_PRIVATE).edit();
        return editor.putInt(key,value).commit();
    }

    public static boolean putValue(Context context,String name,String key,String value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(name,Context.MODE_PRIVATE).edit();
        return editor.putString(key,value).commit();
    }

    public static boolean putValue(Context context,String name,String key,boolean value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(name,Context.MODE_PRIVATE).edit();

        return editor.putBoolean(key,value).commit();
    }

    public static boolean getValue(Context context,String name,String key,boolean dft) {
        return context.getSharedPreferences(name,Context.MODE_PRIVATE).getBoolean(key,dft);
    }

    public static int getValue(Context context,String name,String key,int dft) {
        return context.getSharedPreferences(name,Context.MODE_PRIVATE).getInt(key,dft);
    }

    public static String getValue(Context context,String name,String key,String dft) {
        return context.getSharedPreferences(name,Context.MODE_PRIVATE).getString(key,dft);
    }

    public static void deleteValue(Context context,String name,String key) {
        SharedPreferences.Editor editor = context.getSharedPreferences(name,Context.MODE_PRIVATE).edit();
        editor.remove(key).apply();
    }

    public static void deleteFile(Context context,String name) {
        SharedPreferences.Editor editor = context.getSharedPreferences(name,Context.MODE_PRIVATE).edit();
        editor.clear().apply();
    }

    public static class LYRIC_KEY{
        public static final String LYRIC_NAME = "Lyric";
        public static final int LYRIC_IGNORE = 1;
        public static final int LYRIC_NETEASE = 2;
        public static final int LYRIC_KUGOU = 3;
        public static final int LYRIC_MANUAL = 4;
    }


    public static class SETTING_KEY {
        public static final String SETTING_NAME = "Setting";
        //桌面歌词是否可移动
        public static final String FLOAT_LYRIC_LOCK = "float_lyric_lock";
        //桌面歌词字体大小
        public static final String FLOAT_TEXT_SIZE = "float_text_size";
        //桌面歌词y坐标
        public static final String FLOAT_Y = "float_y";
        //桌面歌词的字体颜色
        public static final String FLOAT_TEXT_COLOR = "float_text_color";
        //是否开启屏幕常亮
        public static final String SCREEN_ALWAYS_ON = "key_screen_always_on";
        //通知栏是否启用经典样式
        public static final String NOTIFY_STYLE_CLASSIC = "notify_classic";
        //是否自动下载专辑封面
        public static final String AUTO_DOWNLOAD_ALBUM_COVER = "auto_download_album_cover";
        //是否自动下载艺术家封面
        public static final String AUTO_DOWNLOAD_ARTIST_COVER = "auto_download_artist_cover";
        //曲库配置
        public static final String LIBRARY_CATEGORY = "library_category";
        //锁屏设置
        public static final String LOCKSCREEN = "lockScreen";
        //导航浪变色
        public static final String COLOR_NAVIGATION = "ColorNavigation";
        //摇一摇
        public static final String SHAKE = "shake";
        //优先搜索在线歌词
        public static final String ONLINE_LYRIC_FIRST = "online_lyric_first";
        //是否开启桌面歌词
        public static final String FLOAT_LYRIC = "float_lyric";
        //沉浸式状态栏
        public static final String IMMERSIVE_MODE = "immersive_mode";
        //退出时的歌曲id
        public static final String LAST_SONG_ID = "last_song_id";
        //下一首歌曲id
        public static final String NEXT_SONG_ID = "next_song_id";
        //播放模式
        public static final String PLAY_MODEL = "play_model";
    }

}
