package com.example;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 100);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        this.add(timeLabel);
        this.setVisible(true);

        setTime();
    }
    public void setTime(){
        while(true) {
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
