package Exp_2;

public class Q_4 {
    public static void main (String args[])
    {
        int d = Integer.parseInt (args[0]);;
        int m = Integer.parseInt (args[1]);;
        int y = Integer.parseInt (args[2]);;
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("The numbers of days from 1 January 1970 to "+d+"."+m+"."+y);

        int rd = 0;
        int rm = 0;
        int ry = 0;
        int lp = 0;
        for (int year = 1970; year <= y; year++) {
            if (year % 400 == 0)
                lp = lp + 1;
            else if (year % 100 == 0)
                lp = lp;
            else if (year % 4 == 0)
                lp = lp + 1;
            else {
                lp = lp;
            }
        }
        if (y >= 1970) {
            ry = (y - 1970) * 365;
            for(int i=0; i<(m-1); i++)
                rm = rm + monthDays[i];
            rd = d - 1;
            System.out.println (ry + rm + rd + lp);
        }
        else {
            System.out.println ("Invalid date");
        }
    }
}
