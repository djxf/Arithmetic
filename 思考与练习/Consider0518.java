package 思考与练习;


/**
 * 思考0518
 * Handler 相关
 * https://github.com/xfhy/Android-Notes/blob/master/Blogs/Android/系统源码解析/Handler机制你需要知道的一切.md
 *
 *  问题1： Handler, Looper, MessageQueue, 线程对应关系？
 *      一个线程只能有一个Looper,由ThreadLocal保证。
 *      一个Looper只能有一个MessageQueue。
 *      一个Looper可以对应多个Handler。
 *
 *
 *
 *
 */
public class Consider0518 {
}
