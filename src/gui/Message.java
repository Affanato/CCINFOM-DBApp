import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Message extends JDialog {

    public Message(String title, String message, boolean isSuccess) {
        super((JFrame) null, title, true);  

        setLayout(new BorderLayout());
        setSize(300, 150);
        setLocationRelativeTo(null);  

        JPanel messagePanel = new JPanel();
        messagePanel.setBackground(isSuccess ? new Color(0x3ca3cb) : new Color(0xc80f2e));  
        messagePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel messageLabel = new JLabel(message, SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        messageLabel.setForeground(Color.WHITE);  
        messagePanel.add(messageLabel);

        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("Arial", Font.BOLD, 18)); 
        okButton.setBackground(new Color(255, 255, 255)); 
        okButton.setForeground(isSuccess ? new Color(0x3ca3cb) : new Color(0xc80f2e));  
        okButton.setFocusable(false);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });

        add(messagePanel, BorderLayout.CENTER);
        add(okButton, BorderLayout.SOUTH);
    }

    public static void success() {
        Message dialog = new Message("Success", "Request successfully processed.", true);
        dialog.setVisible(true);  
    }

    public static void failure() {
        Message dialog = new Message("Failure", "Failed to process request.", false);
        dialog.setVisible(true);  
    }
}
