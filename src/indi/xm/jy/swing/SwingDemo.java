package indi.xm.jy.swing;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

/**
 * @ProjectName: visiable_algo
 * @Package: indi.xm.jy.swing
 * @ClassName: SwingDemo
 * @Author: albert.fang
 * @Description: swing
 * @Date: 2021/11/25 18:52
 */
public class SwingDemo {

    public static void main(String[] args) {
        JFrame welcom_to_jframe = new JFrame("welcom to jframe");
        // 让 jframe 可视化，程序不会退出
        welcom_to_jframe.setVisible(true);
        // 设置 jframe 窗口的默认大小
        welcom_to_jframe.setSize(500,500);
        // 设置jframe窗口，默认是允许resize的，现在设置成不允许resize
        welcom_to_jframe.setResizable(false);
        // 点击jframe右上角的“x”之后，关闭窗口，并且停止程序，正常退出程序
        welcom_to_jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
