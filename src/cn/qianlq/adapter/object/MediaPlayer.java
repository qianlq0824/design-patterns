package cn.qianlq.adapter.object;


/**
 * 为媒体播放器和更高级的媒体播放器创建接口。
 */

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:13
 * email: qianliqing@hyperchain.com
 */

public interface MediaPlayer {

    /**
     *
     * @param audioType 音频类型
     * @param fileName  文件名
     */
    public void play(String audioType, String fileName);
}