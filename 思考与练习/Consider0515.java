package 思考与练习;


/**
 * 05/15思考
 * Android View工作原理。https://github.com/xfhy/Android-Notes/blob/master/Blogs/Android/%E7%B3%BB%E7%BB%9F%E6%BA%90%E7%A0%81%E8%A7%A3%E6%9E%90/%E6%AD%BB%E7%A3%95Android_View%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E4%BD%A0%E9%9C%80%E8%A6%81%E7%9F%A5%E9%81%93%E7%9A%84%E4%B8%80%E5%88%87.md
 *
 *
 * 思考与练习：
 *     1.View绘制流程？
 *
 *     2.View Window ViewRootImp之间的关系？
 *       每个Activity对应一个PhoneWindow,window与decorView相关联。设置布局的时候使用WindowManager addView,每调用一次addView便创建一个ViewRootImpl,也就是创建一颗view树。
 *
 *     3.控件的宽高和哪些因素有关系？
 *
 *     4.Android的wrap_content是如何计算的?
 *
 *     5.为什么你的自定义View wrap_content不起作用?
 *
 *     6.说下Measurepec这个类
 *
 *     7.invalidate()和postInvalidate()和requestlayout的使用与区别
 *
 *     8.自定义View执行invalidate()方法,为什么有时候不会回调onDraw()
 *
 *     9.如何获取 View 宽高?
 *
 *     10.一个view的宽和高是由什么决定！
 *
 *     11.getWidth() （ getHeight()）与 getMeasuredWidth() （getMeasuredHeight()）获取的宽 （高）有什么区别？
 *
 *     12.Android消息机制原理——为什么不能在子线程更新UI?
 *
 *     13.如何自定义View？
 *
 *     14.自定义View为什么有3个构造函数
 *
 *     15.自定义view效率高于xml定义吗？说明理由
 *
 *     16.自定义view的生命周期如何？
 *
 *     17.如何优化自定义View？
 *
 *     18.veiw状态的保持
 *
 *      作者：鹏城十八少
 *      链接：https://www.jianshu.com/p/55cc8b268bcb
 *
 */
public class Consider0515 {
}
