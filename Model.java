// Model class includes the check winnner method
public class Model {
    public static int[][] state={{0,0,0},{0,0,0},{0,0,0}};
    public static int count=1;
    public static int win=0;

    public static void wincheck(int[][] a) {


        //horizontal win
        if ((a[0][0] == 1) && (a[0][1] == 1) && (a[0][2] == 1) && (win == 0)) {
            View.message = View.p1;
            View.post(View.message);
            win = 1;
        } else if ((a[0][0] == 2) && (a[0][1] == 2) && (a[0][2] == 2) && (win == 0)) {
            View.message = View.p2;
            View.post(View.message);
            win = 1;
        } else if ((a[1][0] == 1) && (a[1][1] == 1) && (a[1][2] == 1) && (win == 0)) {
            View.message = View.p1;
            View.post(View.message);

            win = 1;
        } else if ((a[1][0] == 2) && (a[1][1] == 2) && (a[1][2] == 2) && (win == 0)) {
            View.message = View.p2;
            View.post(View.message);
            win = 1;
        } else if ((a[2][0] == 1) && (a[2][1] == 1) && (a[2][2] == 1) && (win == 0)) {
            View.message = View.p1;
            View.post(View.message);
            win = 1;
        } else if ((a[2][0] == 2) && (a[2][1] == 2) && (a[2][2] == 2) && (win == 0)) {
            View.message =View.p2;
            View.post(View.message);
            win = 1;
        }


        //verticle win

        else if ((a[0][0] == 1) && (a[1][0] == 1) && (a[2][0] == 1) && (win == 0)) {
            View.message = View.p1;
            View.post(View.message);
            win = 1;
        } else if ((a[0][0] == 2) && (a[1][0] == 2) && (a[2][0] == 2) && (win == 0)) {
            View.message = View.p2;
            View.post(View.message);
            win = 1;
        } else if ((a[0][1] == 1) && (a[1][1] == 1) && (a[2][1] == 1) && (win == 0)) {
            View.message = View.p1;
            View.post(View.message);
            win = 1;
        } else if ((a[0][1] == 2) && (a[1][1] == 2) && (a[2][1] == 2) && (win == 0)) {
            View.message =View.p2;
            View.post(View.message);
            win = 1;
        } else if ((a[0][2] == 1) && (a[1][2] == 1) && (a[2][2] == 1) && (win == 0)) {
            View.message =View.p1;
            View.post(View.message);
            win = 1;
        } else if ((a[0][2] == 2) && (a[1][2] == 2) && (a[2][2] == 2) && (win == 0)) {
            View.message = View.p2;
            View.post(View.message);
            win = 1;
        }

        //diagonol win
        else if ((a[0][0] == 1) && (a[1][1] == 1) && (a[2][2] == 1) && (win == 0)) {
            View.message = View.p1;
            View.post(View.message);
            win = 1;
        } else if ((a[0][0] == 2) && (a[1][1] == 2) && (a[2][2] == 2) && (win == 0)) {
            View.message = View.p2;
            View.post(View.message);
            win = 1;
        } else if ((a[0][2] == 1) && (a[1][1] == 1) && (a[2][0] == 1) && (win == 0)) {
            View.message = View.p1;
            View.post(View.message);
            win = 1;
        } else if ((a[0][2] == 2) && (a[1][1] == 2) && (a[2][0] == 2) && (win == 0)) {
            View.message = View.p2;
            View.post(View.message);
            win = 1;
        }

        //Draw situation
        else if (count == 9) {
            View.message = "Draw";
            View.post(View.message);

        }


    }

}
