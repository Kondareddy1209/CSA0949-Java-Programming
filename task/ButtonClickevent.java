import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ButtonClickevent{
    public static void main(String[] args){
        JFrame frame = new JFrame("Counter");
        JButton button=new JButton("Click Me");
        JLabel label = new JLabel("Count:",SwingConstants.CENTER);
        int[] counter={0};
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                counter[0]++;
                label.setText("count: " +counter[0]);
            }
        });
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.add(label);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}

