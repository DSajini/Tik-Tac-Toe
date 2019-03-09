import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Controller class includes the actionperformed on button click
public class Controller implements ActionListener {

    public final View newView;

    public Controller(View newView) {
        this.newView = newView;
    }

    public  void actionPerformed(ActionEvent e){
        //On each button click,setText on button,update state array,runs wincheck method and switch the player using count.

        if((e.getSource()==View.b1)&&(Model.count%2==1)&&(Model.state[0][0]==0)&&(Model.win==0)){
            View.b1.setText("1");
            Model.state[0][0] = 1;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b1)&&(Model.count%2==0)&&(Model.state[0][0]==0)&&(Model.win==0)){
            View.b1.setText("2");
            Model.state[0][0] = 2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b2)&&(Model.count%2==1)&&(Model.state[0][1]==0)&&(Model.win==0)) {
            View.b2.setText("1");
            Model.state[0][1] = 1;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b2)&&(Model.count%2==0)&&(Model.state[0][1]==0)&&(Model.win==0)){
            View.b2.setText("2");
            Model.state[0][1] = 2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b3)&&(Model.count%2==1)&&(Model.state[0][2]==0)){
            View.b3.setText("1");
            Model.state[0][2]=1;
            Model.wincheck( Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b3)&&(Model.count%2==0)&&(Model.state[0][2]==0)&&(Model.win==0)){
            View.b3.setText("2");
            Model.state[0][2]=2;
            Model.wincheck( Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b4)&&( Model.count%2==1)&&( Model.state[1][0]==0)&&( Model.win==0)){
            View.b4.setText("1");
            Model.state[1][0]=1;
            Model.wincheck( Model.state);
            Model.wincheck( Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b4)&&(Model.count%2==0)&&(Model.state[1][0]==0)&&(Model.win==0)){
            View.b4.setText("2");
            Model.state[1][0]=2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b5)&&(Model.count%2==1)&&(Model.state[1][1]==0)&&(Model.win==0)){
            View.b5.setText("1");
            Model.state[1][1]=1;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b5)&&(Model.count%2==0)&&(Model.state[1][1]==0)&&(Model.win==0)){
            View.b5.setText("2");
            Model.state[1][1]=2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b6)&&(Model.count%2==1)&&(Model.state[1][2]==0)&&(Model.win==0)){
            View.b6.setText("1");
            Model.state[1][2]=1;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b6)&&(Model.count%2==0)&&(Model.state[1][2]==0)&&(Model.win==0)){
            View.b6.setText("2");
            Model.state[1][2]=2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b7)&&(Model.count%2==1)&&(Model.state[2][0]==0)&&(Model.win==0)){
            View.b7.setText("1");
            Model.state[2][0]=1;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b7)&&(Model.count%2==0)&&(Model.state[2][0]==0)&&(Model.win==0)){
            View.b7.setText("2");
            Model.state[2][0]=2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b8)&&(Model.count%2==1)&&(Model.state[2][1]==0)&&(Model.win==0)){
            View.b8.setText("1");
            Model.state[2][1]=1;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b8)&&(Model.count%2==0)&&(Model.state[2][1]==0)&&(Model.win==0)){
            View.b8.setText("2");
            Model.state[2][1]=2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b9)&&(Model.count%2==1)&&(Model.state[2][2]==0)&&(Model.win==0)){
            View.b9.setText("1");
            Model.state[2][2]=1;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if((e.getSource()==View.b9)&&(Model.count%2==0)&&(Model.state[2][2]==0)&&(Model.win==0)){
            View.b9.setText("2");
            Model.state[2][2]=2;
            Model.wincheck(Model.state);
            Model.count++;
        }
        else if(Model.win==1){
            View.post(View.message);
        }



    }

}
