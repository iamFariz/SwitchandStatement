import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchStatement {
    private static JFrame myFrameWindow;

    public static void main(String[] args) {
        myFrameWindow = new JFrame("Bilangan Genap dan Bilangan Ganjil");
        myFrameWindow.setSize(400,400);
        myFrameWindow.setResizable(false);

        Label myLabelValue = new Label();
        myLabelValue.setBounds(50,40,200,30);
        myLabelValue.setText("Input Value:");

        Label myLabelResult = new Label();
        myLabelResult.setBounds(50,100,300,30);

        TextField myValue = new TextField();
        myValue.setBounds(50,69,200,30);

        Button myButtonCheck = new Button();
        myButtonCheck.setLabel("Check");
        myButtonCheck.setBounds(225,69,100,30);

        Button myCloseBtn = new Button();
        myCloseBtn.setLabel("Close");
        myCloseBtn.setBounds(225,300,100,30);

        myButtonCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int myCheckingNumber = 0;
                byte status;
                String statusBilangan = null;
                String myCheckString;

                myCheckString = myValue.getText();
                if (myCheckString.trim().isEmpty()){
                    return;
                }else{
                    myCheckingNumber = Integer.parseInt(myValue.getText());
                }

                int myStatus = myCheckingNumber % 2;

                if(myStatus == 0){
                    status = 1;
                }else{
                    status = 0;
                }
                switch (status){
                    case 1 :
                        statusBilangan = "Bilangan Genap";
                        myLabelResult.setForeground(Color.BLUE);
                        break;
                    case 0 :
                        statusBilangan = "Bilangan Ganjil";
                        myLabelResult.setForeground(Color.RED);
                        break;
                    default:
                        statusBilangan = "Silakan Input Value";

                }
                myLabelResult.setText("Bilangan Tersebut adalah " + statusBilangan);

            }
        });

        myCloseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrameWindow.dispose();
            }
        });

        myFrameWindow.add(myValue);
        myFrameWindow.add(myLabelValue);
        myFrameWindow.add(myButtonCheck);
        myFrameWindow.add(myLabelResult);
        myFrameWindow.add(myCloseBtn);

        myFrameWindow.setLayout(null);
        myFrameWindow.setVisible(true);
        myFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
