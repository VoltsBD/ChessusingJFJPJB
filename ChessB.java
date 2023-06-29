import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.String;



public class ChessB implements ActionListener, MouseListener {

    public static int ObjID;
    public static int ObjPosX;
    public static int ObjPosY;
    public static int ObjConvID;
    public static String Namae;
    static JFrame board;
    static Container f;
    static JPanel A0;
    static JPanel A1;
    static JPanel A2;
    static JPanel A3;
    static JPanel A4;
    static JPanel A5;
    static JPanel A6;
    static JPanel A7;
    static JPanel B0;
    static JPanel B1;
    static JPanel B2;
    static JPanel B3;
    static JPanel B4;
    static JPanel B5;
    static JPanel B6;
    static JPanel B7;
    static JPanel C0;
    static JPanel C1;
    static JPanel C2;
    static JPanel C3;
    static JPanel C4;
    static JPanel C5;
    static JPanel C6;
    static JPanel C7;
    static JPanel D0;
    static JPanel D1;
    static JPanel D2;
    static JPanel D3;
    static JPanel D4;
    static JPanel D5;
    static JPanel D6;
    static JPanel D7;
    static JPanel E0;
    static JPanel E1;
    static JPanel E2;
    static JPanel E3;
    static JPanel E4;
    static JPanel E5;
    static JPanel E6;
    static JPanel E7;
    static JPanel F0;
    static JPanel F1;
    static JPanel F2;
    static JPanel F3;
    static JPanel F4;
    static JPanel F5;
    static JPanel F6;
    static JPanel F7;
    static JPanel G0;
    static JPanel G1;
    static JPanel G2;
    static JPanel G3;
    static JPanel G4;
    static JPanel G5;
    static JPanel G6;
    static JPanel G7;
    static JPanel H0;
    static JPanel H1;
    static JPanel H2;
    static JPanel H3;
    static JPanel H4;
    static JPanel H5;
    static JPanel H6;
    static JPanel H7;

    public static int xpos;
    public static int ypos;


    static int[][] space;
    static final int exs=100;
    static final int why=100;


    public static JButton PW1;
    public static JButton PW2;
    public static JButton PW3;
    public static JButton PW4;
    public static JButton PW5;
    public static JButton PW6;
    public static JButton PW7;
    public static JButton PW8;

    public static JButton PB1;
    public static JButton PB2;
    public static JButton PB3;
    public static JButton PB4;
    public static JButton PB5;
    public static JButton PB6;
    public static JButton PB7;
    public static JButton PB8;

    public static JButton BW1;
    public static JButton BW2;
    public static JButton KNW1;
    public static JButton KNW2;
    public static JButton RW1;
    public static JButton RW2;
    public static JButton KINGW;
    public static JButton QUEENW;

    public static JButton BB1;
    public static JButton BB2;
    public static JButton KNB1;
    public static JButton KNB2;
    public static JButton RB1;
    public static JButton RB2;
    public static JButton KINGB;
    public static JButton QUEENB;

    public static boolean piecelift;
    public static int movingpiece;
    public static boolean piecedrop;
    public static int droppiece;
    public static int spacex;
    public static int spacey;




    public static double result;


    // Solves java.lang.NoClassDefFoundError
    ChessB (){

        Namae = new String();
        
        space = new int[9][9];

        board = new JFrame("ChessBoard Alternative");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(1500, 1500);
        board.setVisible(true);

        f = new Container();
        f.setBounds(0, 0, 900, 900);
        f.setVisible(true);

        ChessBSetup();
        showboard();
        ChessPieceLoad();


        PW1.addMouseListener(this);
        PW2.addMouseListener(this);
        PW3.addMouseListener(this);
        PW4.addMouseListener(this);
        PW5.addMouseListener(this);
        PW6.addMouseListener(this);
        PW7.addMouseListener(this);
        PW8.addMouseListener(this);

        PB1.addMouseListener(this);
        PB2.addMouseListener(this);
        PB3.addMouseListener(this);
        PB4.addMouseListener(this);
        PB5.addMouseListener(this);
        PB6.addMouseListener(this);
        PB7.addMouseListener(this);
        PB8.addMouseListener(this);

        RW1.addMouseListener(this);
        KNW1.addMouseListener(this);
        BW1.addMouseListener(this);
        QUEENW.addMouseListener(this);
        KINGW.addMouseListener(this);
        BW2.addMouseListener(this);
        KNW2.addMouseListener(this);
        RW2.addMouseListener(this);

        RB1.addMouseListener(this);
        KNB1.addMouseListener(this);
        BB1.addMouseListener(this);
        QUEENB.addMouseListener(this);
        KINGB.addMouseListener(this);
        BB2.addMouseListener(this);
        KNB2.addMouseListener(this);
        RB2.addMouseListener(this);


        A0.addMouseListener(this);
        A1.addMouseListener(this);
        A2.addMouseListener(this);
        A3.addMouseListener(this);
        A4.addMouseListener(this);
        A5.addMouseListener(this);
        A6.addMouseListener(this);
        A7.addMouseListener(this);

        B0.addMouseListener(this);
        B1.addMouseListener(this);
        B2.addMouseListener(this);
        B3.addMouseListener(this);
        B4.addMouseListener(this);
        B5.addMouseListener(this);
        B6.addMouseListener(this);
        B7.addMouseListener(this);

        C0.addMouseListener(this);
        C1.addMouseListener(this);
        C2.addMouseListener(this);
        C3.addMouseListener(this);
        C4.addMouseListener(this);
        C5.addMouseListener(this);
        C6.addMouseListener(this);
        C7.addMouseListener(this);

        D0.addMouseListener(this);
        D1.addMouseListener(this);
        D2.addMouseListener(this);
        D3.addMouseListener(this);
        D4.addMouseListener(this);
        D5.addMouseListener(this);
        D6.addMouseListener(this);
        D7.addMouseListener(this);

        E0.addMouseListener(this);
        E1.addMouseListener(this);
        E2.addMouseListener(this);
        E3.addMouseListener(this);
        E4.addMouseListener(this);
        E5.addMouseListener(this);
        E6.addMouseListener(this);
        E7.addMouseListener(this);

        F0.addMouseListener(this);
        F1.addMouseListener(this);
        F2.addMouseListener(this);
        F3.addMouseListener(this);
        F4.addMouseListener(this);
        F5.addMouseListener(this);
        F6.addMouseListener(this);
        F7.addMouseListener(this);

        G0.addMouseListener(this);
        G1.addMouseListener(this);
        G2.addMouseListener(this);
        G3.addMouseListener(this);
        G4.addMouseListener(this);
        G5.addMouseListener(this);
        G6.addMouseListener(this);
        G7.addMouseListener(this);

        H0.addMouseListener(this);
        H1.addMouseListener(this);
        H2.addMouseListener(this);
        H3.addMouseListener(this);
        H4.addMouseListener(this);
        H5.addMouseListener(this);
        H6.addMouseListener(this);
        H7.addMouseListener(this);
    }


    public static void ChessBSetup() {
        board.add(f);
        int type;
        PW1 = new JButton("1111");
        PW1.setBounds(0, 0, 60, 60);
        PW1.setVisible(true);
        space[1][1]=11;
        PW2 = new JButton("1212");
        PW2.setBounds(0, 0, 60, 60);
        PW2.setVisible(true);
        space[1][2]=12;
        PW3 = new JButton("1313");
        PW3.setBounds(0, 0, 60, 60);
        PW3.setVisible(true);
        space[1][3]=13;
        PW4 = new JButton("1414");
        PW4.setBounds(0, 0, 60, 60);
        PW4.setVisible(true);
        space[1][4]=14;
        PW5 = new JButton("1515");
        PW5.setBounds(0, 0, 60, 60);
        PW5.setVisible(true);
        space[1][5]=15;
        PW6 = new JButton("1616");
        PW6.setBounds(0, 0, 60, 60);
        PW6.setVisible(true);
        space[1][6]=16;
        PW7 = new JButton("1717");
        PW7.setBounds(0, 0, 60, 60);
        PW7.setVisible(true);
        space[1][7]=17;
        PW8 = new JButton("1818");
        PW8.setBounds(0, 0, 60, 60);
        PW8.setVisible(true);
        space[1][8]=18;

        PB1 = new JButton("2161");
        PB1.setBounds(0, 0, 60, 60);
        PB1.setVisible(true);
        space[6][1]=21;
        PB2 = new JButton("2262");
        PB2.setBounds(0, 0, 60, 60);
        PB2.setVisible(true);
        space[6][2]=22;
        PB3 = new JButton("2363");
        PB3.setBounds(0, 0, 60, 60);
        PB3.setVisible(true);
        space[6][3]=23;
        PB4 = new JButton("2464");
        PB4.setBounds(0, 0, 60, 60);
        PB4.setVisible(true);
        space[6][4]=24;
        PB5 = new JButton("2565");
        PB5.setBounds(0, 0, 60, 60);
        PB5.setVisible(true);
        space[6][5]=25;
        PB6 = new JButton("2666");
        PB6.setBounds(0, 0, 60, 60);
        PB6.setVisible(true);
        space[6][6]=26;
        PB7 = new JButton("2767");
        PB7.setBounds(0, 0, 60, 60);
        PB7.setVisible(true);
        space[6][7]=27;
        PB8 = new JButton("2868");
        PB8.setBounds(0, 0, 60, 60);
        PB8.setVisible(true);
        space[6][8]=28;

        BW1 = new JButton("3303");
        BW1.setBounds(0, 0, 60, 60);
        BW1.setVisible(true);
        space[0][3]=33;
        BW2 = new JButton("3606");
        BW2.setBounds(0, 0, 60, 60);
        BW2.setVisible(true);
        space[0][6]=36;
        KNW1 = new JButton("3202");
        KNW1.setBounds(0, 0, 60, 60);
        KNW1.setVisible(true);
        space[0][2]=32;
        KNW2 = new JButton("3707");
        KNW2.setBounds(0, 0, 60, 60);
        KNW2.setVisible(true);
        space[0][7]=37;
        RW1 = new JButton("3101");
        RW1.setBounds(0, 0, 60, 60);
        RW1.setVisible(true);
        space[0][1]=31;
        RW2 = new JButton("3808");
        RW2.setBounds(0, 0, 60, 60);
        RW2.setVisible(true);
        space[0][8]=38;
        KINGW = new JButton("3505");
        KINGW.setBounds(0, 0, 60, 60);
        KINGW.setVisible(true);
        space[0][5]=35;
        QUEENW = new JButton("3404");
        QUEENW.setBounds(0, 0, 60, 60);
        QUEENW.setVisible(true);
        space[0][4]=34;

        BB1 = new JButton("4373");
        BB1.setBounds(0, 0, 60, 60);
        BB1.setVisible(true);
        space[7][3]=43;
        BB2 = new JButton("4676");
        BB2.setBounds(0, 0, 60, 60);
        BB2.setVisible(true);
        space[7][6]=46;
        KNB1 = new JButton("4272");
        KNB1.setBounds(0, 0, 60, 60);
        KNB1.setVisible(true);
        space[7][2]=42;
        KNB2 = new JButton("4777");
        KNB2.setBounds(0, 0, 60, 60);
        KNB2.setVisible(true);
        space[7][7]=47;
        RB1 = new JButton("4171");
        RB1.setBounds(0, 0, 60, 60);
        RB1.setVisible(true);
        space[7][1]=41;
        RB2 = new JButton("4878");
        RB2.setBounds(0, 0, 60, 60);
        RB2.setVisible(true);
        space[7][8]=48;
        KINGB = new JButton("4575");
        KINGB.setBounds(0, 0, 60, 60);
        KINGB.setVisible(true);
        space[7][5]=45;
        QUEENB = new JButton("4474");
        QUEENB.setBounds(0, 0, 60, 60);
        QUEENB.setVisible(true);
        space[7][4]=44;

        showspace();

        A0 = new JPanel();
        A1 = new JPanel();
        A2 = new JPanel();
        A3 = new JPanel();
        A4 = new JPanel();
        A5 = new JPanel();
        A6 = new JPanel();
        A7 = new JPanel();


        B0 = new JPanel();
        B1 = new JPanel();
        B2 = new JPanel();
        B3 = new JPanel();
        B4 = new JPanel();
        B5 = new JPanel();
        B6 = new JPanel();
        B7 = new JPanel();


        C0 = new JPanel();
        C1 = new JPanel();
        C2 = new JPanel();
        C3 = new JPanel();
        C4 = new JPanel();
        C5 = new JPanel();
        C6 = new JPanel();
        C7 = new JPanel();


        D0 = new JPanel();
        D1 = new JPanel();
        D2 = new JPanel();
        D3 = new JPanel();
        D4 = new JPanel();
        D5 = new JPanel();
        D6 = new JPanel();
        D7 = new JPanel();


        E0 = new JPanel();
        E1 = new JPanel();
        E2 = new JPanel();
        E3 = new JPanel();
        E4 = new JPanel();
        E5 = new JPanel();
        E6 = new JPanel();
        E7 = new JPanel();


        F0 = new JPanel();
        F1 = new JPanel();
        F2 = new JPanel();
        F3 = new JPanel();
        F4 = new JPanel();
        F5 = new JPanel();
        F6 = new JPanel();
        F7 = new JPanel();


        G0 = new JPanel();
        G1 = new JPanel();
        G2 = new JPanel();
        G3 = new JPanel();
        G4 = new JPanel();
        G5 = new JPanel();
        G6 = new JPanel();
        G7 = new JPanel();


        H0 = new JPanel();
        H1 = new JPanel();
        H2 = new JPanel();
        H3 = new JPanel();
        H4 = new JPanel();
        H5 = new JPanel();
        H6 = new JPanel();
        H7 = new JPanel();


        int x = 0;
        int y = 0;

        A0.setBounds(x, y, exs, why);
        A1.setBounds(x + exs, y, exs, why);
        A2.setBounds(x + 2 * exs, y, exs, why);
        A3.setBounds(x + 3 * exs, y, exs, why);
        A4.setBounds(x + 4 * exs, y, exs, why);
        A5.setBounds(x + 5 * exs, y, exs, why);
        A6.setBounds(x + 6 * exs, y, exs, why);
        A7.setBounds(x + 7 * exs, y, exs, why);

        x = 0;
        y = why;
        B0.setBounds(x, y, exs, why);
        B1.setBounds(x + exs, y, exs, why);
        B2.setBounds(x + 2 * exs, y, exs, why);
        B3.setBounds(x + 3 * exs, y, exs, why);
        B4.setBounds(x + 4 * exs, y, exs, why);
        B5.setBounds(x + 5 * exs, y, exs, why);
        B6.setBounds(x + 6 * exs, y, exs, why);
        B7.setBounds(x + 7 * exs, y, exs, why);

        x = 0;
        y = 2 * why;
        C0.setBounds(x, y, exs, why);
        C1.setBounds(x + exs, y, exs, why);
        C2.setBounds(x + 2 * exs, y, exs, why);
        C3.setBounds(x + 3 * exs, y, exs, why);
        C4.setBounds(x + 4 * exs, y, exs, why);
        C5.setBounds(x + 5 * exs, y, exs, why);
        C6.setBounds(x + 6 * exs, y, exs, why);
        C7.setBounds(x + 7 * exs, y, exs, why);

        x = 0;
        y = 3 * why;
        D0.setBounds(x, y, exs, why);
        D1.setBounds(x + exs, y, exs, why);
        D2.setBounds(x + 2 * exs, y, exs, why);
        D3.setBounds(x + 3 * exs, y, exs, why);
        D4.setBounds(x + 4 * exs, y, exs, why);
        D5.setBounds(x + 5 * exs, y, exs, why);
        D6.setBounds(x + 6 * exs, y, exs, why);
        D7.setBounds(x + 7 * exs, y, exs, why);

        x = 0;
        y = 4 * why;

        E0.setBounds(x, y, exs, why);
        E1.setBounds(x + exs, y, exs, why);
        E2.setBounds(x + 2 * exs, y, exs, why);
        E3.setBounds(x + 3 * exs, y, exs, why);
        E4.setBounds(x + 4 * exs, y, exs, why);
        E5.setBounds(x + 5 * exs, y, exs, why);
        E6.setBounds(x + 6 * exs, y, exs, why);
        E7.setBounds(x + 7 * exs, y, exs, why);

        x = 0;
        y = 5 * why;
        F0.setBounds(x, y, exs, why);
        F1.setBounds(x + exs, y, exs, why);
        F2.setBounds(x + 2 * exs, y, exs, why);
        F3.setBounds(x + 3 * exs, y, exs, why);
        F4.setBounds(x + 4 * exs, y, exs, why);
        F5.setBounds(x + 5 * exs, y, exs, why);
        F6.setBounds(x + 6 * exs, y, exs, why);
        F7.setBounds(x + 7 * exs, y, exs, why);

        x = 0;
        y = 6 * why;
        G0.setBounds(x, y, exs, why);
        G1.setBounds(x + exs, y, exs, why);
        G2.setBounds(x + 2 * exs, y, exs, why);
        G3.setBounds(x + 3 * exs, y, exs, why);
        G4.setBounds(x + 4 * exs, y, exs, why);
        G5.setBounds(x + 5 * exs, y, exs, why);
        G6.setBounds(x + 6 * exs, y, exs, why);
        G7.setBounds(x + 7 * exs, y, exs, why);

        x = 0;
        y = 7 * why;
        H0.setBounds(x, y, exs, why);
        H1.setBounds(x + exs, y, exs, why);
        H2.setBounds(x + 2 * exs, y, exs, why);
        H3.setBounds(x + 3 * exs, y, exs, why);
        H4.setBounds(x + 4 * exs, y, exs, why);
        H5.setBounds(x + 5 * exs, y, exs, why);
        H6.setBounds(x + 6 * exs, y, exs, why);
        H7.setBounds(x + 7 * exs, y, exs, why);

        A0.setBackground(Color.RED);
        A1.setBackground(Color.BLACK);
        A2.setBackground(Color.RED);
        A3.setBackground(Color.BLACK);
        A4.setBackground(Color.RED);
        A5.setBackground(Color.BLACK);
        A6.setBackground(Color.RED);
        A7.setBackground(Color.BLACK);

        B0.setBackground(Color.BLACK);
        B1.setBackground(Color.RED);
        B2.setBackground(Color.BLACK);
        B3.setBackground(Color.RED);
        B4.setBackground(Color.BLACK);
        B5.setBackground(Color.RED);
        B6.setBackground(Color.BLACK);
        B7.setBackground(Color.RED);

        C0.setBackground(Color.RED);
        C1.setBackground(Color.BLACK);
        C2.setBackground(Color.RED);
        C3.setBackground(Color.BLACK);
        C4.setBackground(Color.RED);
        C5.setBackground(Color.BLACK);
        C6.setBackground(Color.RED);
        C7.setBackground(Color.BLACK);

        D0.setBackground(Color.BLACK);
        D1.setBackground(Color.RED);
        D2.setBackground(Color.BLACK);
        D3.setBackground(Color.RED);
        D4.setBackground(Color.BLACK);
        D5.setBackground(Color.RED);
        D6.setBackground(Color.BLACK);
        D7.setBackground(Color.RED);

        E0.setBackground(Color.RED);
        E1.setBackground(Color.BLACK);
        E2.setBackground(Color.RED);
        E3.setBackground(Color.BLACK);
        E4.setBackground(Color.RED);
        E5.setBackground(Color.BLACK);
        E6.setBackground(Color.RED);
        E7.setBackground(Color.BLACK);

        F0.setBackground(Color.BLACK);
        F1.setBackground(Color.RED);
        F2.setBackground(Color.BLACK);
        F3.setBackground(Color.RED);
        F4.setBackground(Color.BLACK);
        F5.setBackground(Color.RED);
        F6.setBackground(Color.BLACK);
        F7.setBackground(Color.RED);

        G0.setBackground(Color.RED);
        G1.setBackground(Color.BLACK);
        G2.setBackground(Color.RED);
        G3.setBackground(Color.BLACK);
        G4.setBackground(Color.RED);
        G5.setBackground(Color.BLACK);
        G6.setBackground(Color.RED);
        G7.setBackground(Color.BLACK);

        H0.setBackground(Color.BLACK);
        H1.setBackground(Color.RED);
        H2.setBackground(Color.BLACK);
        H3.setBackground(Color.RED);
        H4.setBackground(Color.BLACK);
        H5.setBackground(Color.RED);
        H6.setBackground(Color.BLACK);
        H7.setBackground(Color.RED);

        A0.setVisible(true);
        A1.setVisible(true);
        A2.setVisible(true);
        A3.setVisible(true);
        A4.setVisible(true);
        A5.setVisible(true);
        A6.setVisible(true);
        A7.setVisible(true);

        B0.setVisible(true);
        B1.setVisible(true);
        B2.setVisible(true);
        B3.setVisible(true);
        B4.setVisible(true);
        B5.setVisible(true);
        B6.setVisible(true);
        B7.setVisible(true);

        C0.setVisible(true);
        C1.setVisible(true);
        C2.setVisible(true);
        C3.setVisible(true);
        C4.setVisible(true);
        C5.setVisible(true);
        C6.setVisible(true);
        C7.setVisible(true);

        D0.setVisible(true);
        D1.setVisible(true);
        D2.setVisible(true);
        D3.setVisible(true);
        D4.setVisible(true);
        D5.setVisible(true);
        D6.setVisible(true);
        D7.setVisible(true);

        E0.setVisible(true);
        E1.setVisible(true);
        E2.setVisible(true);
        E3.setVisible(true);
        E4.setVisible(true);
        E5.setVisible(true);
        E6.setVisible(true);
        E7.setVisible(true);

        F0.setVisible(true);
        F1.setVisible(true);
        F2.setVisible(true);
        F3.setVisible(true);
        F4.setVisible(true);
        F5.setVisible(true);
        F6.setVisible(true);
        F7.setVisible(true);

        G0.setVisible(true);
        G1.setVisible(true);
        G2.setVisible(true);
        G3.setVisible(true);
        G4.setVisible(true);
        G5.setVisible(true);
        G6.setVisible(true);
        G7.setVisible(true);

        H0.setVisible(true);
        H1.setVisible(true);
        H2.setVisible(true);
        H3.setVisible(true);
        H4.setVisible(true);
        H5.setVisible(true);
        H6.setVisible(true);
        H7.setVisible(true);

    }

    public static void showspace(){
        int n,i;
        for(n=0; n<8; n++) {
            for(i=1; i<9; i++) {
                System.out.print("|"+ space[n][i]);
            }
            System.out.println("");
        }
    }

    public static void clearTilePosition(int xs, int ys){
        space[xs][ys] = 0;        
    }

    public static int getTilePosContents(int xs, int ys){
        return space[xs][ys];
    }
    
    public static void setTilePosValue(int xs, int ys, int objnum){
        space[xs][ys] = objnum;
    }

    public static void removePiece(int xs, int ys, int objnum){
        if (xs==0 & ys==1) {
            if(objnum==11) { A0.remove(PW1);  }
            if(objnum==12) { A0.remove(PW2);  }
            if(objnum==13) { A0.remove(PW3);  }
            if(objnum==14) { A0.remove(PW4);  }
            if(objnum==15) { A0.remove(PW5);  }
            if(objnum==16) { A0.remove(PW6);  }
            if(objnum==17) { A0.remove(PW7);  }
            if(objnum==18) { A0.remove(PW8);  }
            if(objnum==21) { A0.remove(PB1);  }
            if(objnum==22) { A0.remove(PB2);  }
            if(objnum==23) { A0.remove(PB3);  }
            if(objnum==24) { A0.remove(PB4);  }
            if(objnum==25) { A0.remove(PB5);  }
            if(objnum==26) { A0.remove(PB6);  }
            if(objnum==27) { A0.remove(PB7);  }
            if(objnum==28) { A0.remove(PB8);  }

            if(objnum==31) { A0.remove(RW1);  }
            if(objnum==32) { A0.remove(KNW1);  }
            if(objnum==33) { A0.remove(BW1);  }
            if(objnum==34) { A0.remove(QUEENW);  }
            if(objnum==35) { A0.remove(KINGW);  }
            if(objnum==36) { A0.remove(BW2);  }
            if(objnum==37) { A0.remove(KNW2);  }
            if(objnum==38) { A0.remove(RW2);  }

            if(objnum==41) { A0.remove(RB1);  }
            if(objnum==42) { A0.remove(KNB1);  }
            if(objnum==43) { A0.remove(BB1);  }
            if(objnum==44) { A0.remove(QUEENB);  }
            if(objnum==45) { A0.remove(KINGB);  }
            if(objnum==46) { A0.remove(BB2);  }
            if(objnum==47) { A0.remove(KNB2);  }
            if(objnum==48) { A0.remove(RB2);  }
        }
        if (xs==0 & ys==2) {
            if(objnum==11) { A1.remove(PW1);  }
            if(objnum==12) { A1.remove(PW2);  }
            if(objnum==13) { A1.remove(PW3);  }
            if(objnum==14) { A1.remove(PW4);  }
            if(objnum==15) { A1.remove(PW5);  }
            if(objnum==16) { A1.remove(PW6);  }
            if(objnum==17) { A1.remove(PW7);  }
            if(objnum==18) { A1.remove(PW8);  }
            if(objnum==21) { A1.remove(PB1);  }
            if(objnum==22) { A1.remove(PB2);  }
            if(objnum==23) { A1.remove(PB3);  }
            if(objnum==24) { A1.remove(PB4);  }
            if(objnum==25) { A1.remove(PB5);  }
            if(objnum==26) { A1.remove(PB6);  }
            if(objnum==27) { A1.remove(PB7);  }
            if(objnum==28) { A1.remove(PB8);  }
            if(objnum==31) { A1.remove(RW1);  }
            if(objnum==32) { A1.remove(KNW1);  }
            if(objnum==33) { A1.remove(BW1);  }
            if(objnum==34) { A1.remove(QUEENW);  }
            if(objnum==35) { A1.remove(KINGW);  }
            if(objnum==36) { A1.remove(BW2);  }
            if(objnum==37) { A1.remove(KNW2);  }
            if(objnum==38) { A1.remove(RW2);  }
            if(objnum==41) { A1.remove(RB1);  }
            if(objnum==42) { A1.remove(KNB1);  }
            if(objnum==43) { A1.remove(BB1);  }
            if(objnum==44) { A1.remove(QUEENB);  }
            if(objnum==45) { A1.remove(KINGB);  }
            if(objnum==46) { A1.remove(BB2);  }
            if(objnum==47) { A1.remove(KNB2);  }
            if(objnum==48) { A1.remove(RB2);  }
        }
        if (xs==0 & ys==3) {
            if(objnum==11) { A2.remove(PW1);  }
            if(objnum==12) { A2.remove(PW2);  }
            if(objnum==13) { A2.remove(PW3);  }
            if(objnum==14) { A2.remove(PW4);  }
            if(objnum==15) { A2.remove(PW5);  }
            if(objnum==16) { A2.remove(PW6);  }
            if(objnum==17) { A2.remove(PW7);  }
            if(objnum==18) { A2.remove(PW8);  }
            if(objnum==21) { A2.remove(PB1);  }
            if(objnum==22) { A2.remove(PB2);  }
            if(objnum==23) { A2.remove(PB3);  }
            if(objnum==24) { A2.remove(PB4);  }
            if(objnum==25) { A2.remove(PB5);  }
            if(objnum==26) { A2.remove(PB6);  }
            if(objnum==27) { A2.remove(PB7);  }
            if(objnum==28) { A2.remove(PB8);  }
            if(objnum==31) { A2.remove(RW1);  }
            if(objnum==32) { A2.remove(KNW1);  }
            if(objnum==33) { A2.remove(BW1);  }
            if(objnum==34) { A2.remove(QUEENW);  }
            if(objnum==35) { A2.remove(KINGW);  }
            if(objnum==36) { A2.remove(BW2);  }
            if(objnum==37) { A2.remove(KNW2);  }
            if(objnum==38) { A2.remove(RW2);  }
            if(objnum==41) { A2.remove(RB1);  }
            if(objnum==42) { A2.remove(KNB1);  }
            if(objnum==43) { A2.remove(BB1);  }
            if(objnum==44) { A2.remove(QUEENB);  }
            if(objnum==45) { A2.remove(KINGB);  }
            if(objnum==46) { A2.remove(BB2);  }
            if(objnum==47) { A2.remove(KNB2);  }
            if(objnum==48) { A2.remove(RB2);  } }
        if (xs==0 & ys==4) {
            if(objnum==11) { A3.remove(PW1);  }
            if(objnum==12) { A3.remove(PW2);  }
            if(objnum==13) { A3.remove(PW3);  }
            if(objnum==14) { A3.remove(PW4);  }
            if(objnum==15) { A3.remove(PW5);  }
            if(objnum==16) { A3.remove(PW6);  }
            if(objnum==17) { A3.remove(PW7);  }
            if(objnum==18) { A3.remove(PW8);  }
            if(objnum==21) { A3.remove(PB1);  }
            if(objnum==22) { A3.remove(PB2);  }
            if(objnum==23) { A3.remove(PB3);  }
            if(objnum==24) { A3.remove(PB4);  }
            if(objnum==25) { A3.remove(PB5);  }
            if(objnum==26) { A3.remove(PB6);  }
            if(objnum==27) { A3.remove(PB7);  }
            if(objnum==28) { A3.remove(PB8);  }
            if(objnum==31) { A3.remove(RW1);  }
            if(objnum==32) { A3.remove(KNW1);  }
            if(objnum==33) { A3.remove(BW1);  }
            if(objnum==34) { A3.remove(QUEENW);  }
            if(objnum==35) { A3.remove(KINGW);  }
            if(objnum==36) { A3.remove(BW2);  }
            if(objnum==37) { A3.remove(KNW2);  }
            if(objnum==38) { A3.remove(RW2);  }
            if(objnum==41) { A3.remove(RB1);  }
            if(objnum==42) { A3.remove(KNB1);  }
            if(objnum==43) { A3.remove(BB1);  }
            if(objnum==44) { A3.remove(QUEENB);  }
            if(objnum==45) { A3.remove(KINGB);  }
            if(objnum==46) { A3.remove(BB2);  }
            if(objnum==47) { A3.remove(KNB2);  }
            if(objnum==48) { A3.remove(RB2);  }
        }
        if (xs==0 & ys==5) {
            if(objnum==11) { A4.remove(PW1);  }
            if(objnum==12) { A4.remove(PW2);  }
            if(objnum==13) { A4.remove(PW3);  }
            if(objnum==14) { A4.remove(PW4);  }
            if(objnum==15) { A4.remove(PW5);  }
            if(objnum==16) { A4.remove(PW6);  }
            if(objnum==17) { A4.remove(PW7);  }
            if(objnum==18) { A4.remove(PW8);  }
            if(objnum==21) { A4.remove(PB1);  }
            if(objnum==22) { A4.remove(PB2);  }
            if(objnum==23) { A4.remove(PB3);  }
            if(objnum==24) { A4.remove(PB4);  }
            if(objnum==25) { A4.remove(PB5);  }
            if(objnum==26) { A4.remove(PB6);  }
            if(objnum==27) { A4.remove(PB7);  }
            if(objnum==28) { A4.remove(PB8);  }
            if(objnum==31) { A4.remove(RW1);  }
            if(objnum==32) { A4.remove(KNW1);  }
            if(objnum==33) { A4.remove(BW1);  }
            if(objnum==34) { A4.remove(QUEENW);  }
            if(objnum==35) { A4.remove(KINGW);  }
            if(objnum==36) { A4.remove(BW2);  }
            if(objnum==37) { A4.remove(KNW2);  }
            if(objnum==38) { A4.remove(RW2);  }
            if(objnum==41) { A4.remove(RB1);  }
            if(objnum==42) { A4.remove(KNB1);  }
            if(objnum==43) { A4.remove(BB1);  }
            if(objnum==44) { A4.remove(QUEENB);  }
            if(objnum==45) { A4.remove(KINGB);  }
            if(objnum==46) { A4.remove(BB2);  }
            if(objnum==47) { A4.remove(KNB2);  }
            if(objnum==48) { A4.remove(RB2);  }
        }
        if (xs==0 & ys==6) {
            if(objnum==11) { A5.remove(PW1);  }
            if(objnum==12) { A5.remove(PW2);  }
            if(objnum==13) { A5.remove(PW3);  }
            if(objnum==14) { A5.remove(PW4);  }
            if(objnum==15) { A5.remove(PW5);  }
            if(objnum==16) { A5.remove(PW6);  }
            if(objnum==17) { A5.remove(PW7);  }
            if(objnum==18) { A5.remove(PW8);  }
            if(objnum==21) { A5.remove(PB1);  }
            if(objnum==22) { A5.remove(PB2);  }
            if(objnum==23) { A5.remove(PB3);  }
            if(objnum==24) { A5.remove(PB4);  }
            if(objnum==25) { A5.remove(PB5);  }
            if(objnum==26) { A5.remove(PB6);  }
            if(objnum==27) { A5.remove(PB7);  }
            if(objnum==28) { A5.remove(PB8);  }
            if(objnum==31) { A5.remove(RW1);  }
            if(objnum==32) { A5.remove(KNW1);  }
            if(objnum==33) { A5.remove(BW1);  }
            if(objnum==34) { A5.remove(QUEENW);  }
            if(objnum==35) { A5.remove(KINGW);  }
            if(objnum==36) { A5.remove(BW2);  }
            if(objnum==37) { A5.remove(KNW2);  }
            if(objnum==38) { A5.remove(RW2);  }
            if(objnum==41) { A5.remove(RB1);  }
            if(objnum==42) { A5.remove(KNB1);  }
            if(objnum==43) { A5.remove(BB1);  }
            if(objnum==44) { A5.remove(QUEENB);  }
            if(objnum==45) { A5.remove(KINGB);  }
            if(objnum==46) { A5.remove(BB2);  }
            if(objnum==47) { A5.remove(KNB2);  }
            if(objnum==48) { A5.remove(RB2);  }}
        if (xs==0 & ys==7) {
            if(objnum==11) { A6.remove(PW1);  }
            if(objnum==12) { A6.remove(PW2);  }
            if(objnum==13) { A6.remove(PW3);  }
            if(objnum==14) { A6.remove(PW4);  }
            if(objnum==15) { A6.remove(PW5);  }
            if(objnum==16) { A6.remove(PW6);  }
            if(objnum==17) { A6.remove(PW7);  }
            if(objnum==18) { A6.remove(PW8);  }
            if(objnum==21) { A6.remove(PB1);  }
            if(objnum==22) { A6.remove(PB2);  }
            if(objnum==23) { A6.remove(PB3);  }
            if(objnum==24) { A6.remove(PB4);  }
            if(objnum==25) { A6.remove(PB5);  }
            if(objnum==26) { A6.remove(PB6);  }
            if(objnum==27) { A6.remove(PB7);  }
            if(objnum==28) { A6.remove(PB8);  }
            if(objnum==31) { A6.remove(RW1);  }
            if(objnum==32) { A6.remove(KNW1);  }
            if(objnum==33) { A6.remove(BW1);  }
            if(objnum==34) { A6.remove(QUEENW);  }
            if(objnum==35) { A6.remove(KINGW);  }
            if(objnum==36) { A6.remove(BW2);  }
            if(objnum==37) { A6.remove(KNW2);  }
            if(objnum==38) { A6.remove(RW2);  }
            if(objnum==41) { A6.remove(RB1);  }
            if(objnum==42) { A6.remove(KNB1);  }
            if(objnum==43) { A6.remove(BB1);  }
            if(objnum==44) { A6.remove(QUEENB);  }
            if(objnum==45) { A6.remove(KINGB);  }
            if(objnum==46) { A6.remove(BB2);  }
            if(objnum==47) { A6.remove(KNB2);  }
            if(objnum==48) { A6.remove(RB2);  }
        }
        if (xs==0 & ys==8) {
            if(objnum==11) { A7.remove(PW1);  }
            if(objnum==12) { A7.remove(PW2);  }
            if(objnum==13) { A7.remove(PW3);  }
            if(objnum==14) { A7.remove(PW4);  }
            if(objnum==15) { A7.remove(PW5);  }
            if(objnum==16) { A7.remove(PW6);  }
            if(objnum==17) { A7.remove(PW7);  }
            if(objnum==18) { A7.remove(PW8);  }
            if(objnum==21) { A7.remove(PB1);  }
            if(objnum==22) { A7.remove(PB2);  }
            if(objnum==23) { A7.remove(PB3);  }
            if(objnum==24) { A7.remove(PB4);  }
            if(objnum==25) { A7.remove(PB5);  }
            if(objnum==26) { A7.remove(PB6);  }
            if(objnum==27) { A7.remove(PB7);  }
            if(objnum==28) { A7.remove(PB8);  }
            if(objnum==31) { A7.remove(RW1);  }
            if(objnum==32) { A7.remove(KNW1);  }
            if(objnum==33) { A7.remove(BW1);  }
            if(objnum==34) { A7.remove(QUEENW);  }
            if(objnum==35) { A7.remove(KINGW);  }
            if(objnum==36) { A7.remove(BW2);  }
            if(objnum==37) { A7.remove(KNW2);  }
            if(objnum==38) { A7.remove(RW2);  }
            if(objnum==41) { A7.remove(RB1);  }
            if(objnum==42) { A7.remove(KNB1);  }
            if(objnum==43) { A7.remove(BB1);  }
            if(objnum==44) { A7.remove(QUEENB);  }
            if(objnum==45) { A7.remove(KINGB);  }
            if(objnum==46) { A7.remove(BB2);  }
            if(objnum==47) { A7.remove(KNB2);  }
            if(objnum==48) { A7.remove(RB2);  }
        }
        if (xs==1 & ys==1) {
            if(objnum==11) { B0.remove(PW1);  }
            if(objnum==12) { B0.remove(PW2);  }
            if(objnum==13) { B0.remove(PW3);  }
            if(objnum==14) { B0.remove(PW4);  }
            if(objnum==15) { B0.remove(PW5);  }
            if(objnum==16) { B0.remove(PW6);  }
            if(objnum==17) { B0.remove(PW7);  }
            if(objnum==18) { B0.remove(PW8);  }
            if(objnum==21) { B0.remove(PB1);  }
            if(objnum==22) { B0.remove(PB2);  }
            if(objnum==23) { B0.remove(PB3);  }
            if(objnum==24) { B0.remove(PB4);  }
            if(objnum==25) { B0.remove(PB5);  }
            if(objnum==26) { B0.remove(PB6);  }
            if(objnum==27) { B0.remove(PB7);  }
            if(objnum==28) { B0.remove(PB8);  }
            if(objnum==31) { B0.remove(RW1);  }
            if(objnum==32) { B0.remove(KNW1);  }
            if(objnum==33) { B0.remove(BW1);  }
            if(objnum==34) { B0.remove(QUEENW);  }
            if(objnum==35) { B0.remove(KINGW);  }
            if(objnum==36) { B0.remove(BW2);  }
            if(objnum==37) { B0.remove(KNW2);  }
            if(objnum==38) { B0.remove(RW2);  }
            if(objnum==41) { B0.remove(RB1);  }
            if(objnum==42) { B0.remove(KNB1);  }
            if(objnum==43) { B0.remove(BB1);  }
            if(objnum==44) { B0.remove(QUEENB);  }
            if(objnum==45) { B0.remove(KINGB);  }
            if(objnum==46) { B0.remove(BB2);  }
            if(objnum==47) { B0.remove(KNB2);  }
            if(objnum==48) { B0.remove(RB2);  }
        }
        if (xs==1 & ys==2) {
            if(objnum==11) { B1.remove(PW1);  }
            if(objnum==12) { B1.remove(PW2);  }
            if(objnum==13) { B1.remove(PW3);  }
            if(objnum==14) { B1.remove(PW4);  }
            if(objnum==15) { B1.remove(PW5);  }
            if(objnum==16) { B1.remove(PW6);  }
            if(objnum==17) { B1.remove(PW7);  }
            if(objnum==18) { B1.remove(PW8);  }
            if(objnum==21) { B1.remove(PB1);  }
            if(objnum==22) { B1.remove(PB2);  }
            if(objnum==23) { B1.remove(PB3);  }
            if(objnum==24) { B1.remove(PB4);  }
            if(objnum==25) { B1.remove(PB5);  }
            if(objnum==26) { B1.remove(PB6);  }
            if(objnum==27) { B1.remove(PB7);  }
            if(objnum==28) { B1.remove(PB8);  }
            if(objnum==31) { B1.remove(RW1);  }
            if(objnum==32) { B1.remove(KNW1);  }
            if(objnum==33) { B1.remove(BW1);  }
            if(objnum==34) { B1.remove(QUEENW);  }
            if(objnum==35) { B1.remove(KINGW);  }
            if(objnum==36) { B1.remove(BW2);  }
            if(objnum==37) { B1.remove(KNW2);  }
            if(objnum==38) { B1.remove(RW2);  }
            if(objnum==41) { B1.remove(RB1);  }
            if(objnum==42) { B1.remove(KNB1);  }
            if(objnum==43) { B1.remove(BB1);  }
            if(objnum==44) { B1.remove(QUEENB);  }
            if(objnum==45) { B1.remove(KINGB);  }
            if(objnum==46) { B1.remove(BB2);  }
            if(objnum==47) { B1.remove(KNB2);  }
            if(objnum==48) { B1.remove(RB2);  }
        }
        if (xs==1 & ys==3) {
            if(objnum==11) { B2.remove(PW1);  }
            if(objnum==12) { B2.remove(PW2);  }
            if(objnum==13) { B2.remove(PW3);  }
            if(objnum==14) { B2.remove(PW4);  }
            if(objnum==15) { B2.remove(PW5);  }
            if(objnum==16) { B2.remove(PW6);  }
            if(objnum==17) { B2.remove(PW7);  }
            if(objnum==18) { B2.remove(PW8);  }
            if(objnum==21) { B2.remove(PB1);  }
            if(objnum==22) { B2.remove(PB2);  }
            if(objnum==23) { B2.remove(PB3);  }
            if(objnum==24) { B2.remove(PB4);  }
            if(objnum==25) { B2.remove(PB5);  }
            if(objnum==26) { B2.remove(PB6);  }
            if(objnum==27) { B2.remove(PB7);  }
            if(objnum==28) { B2.remove(PB8);  }
            if(objnum==31) { B2.remove(RW1);  }
            if(objnum==32) { B2.remove(KNW1);  }
            if(objnum==33) { B2.remove(BW1);  }
            if(objnum==34) { B2.remove(QUEENW);  }
            if(objnum==35) { B2.remove(KINGW);  }
            if(objnum==36) { B2.remove(BW2);  }
            if(objnum==37) { B2.remove(KNW2);  }
            if(objnum==38) { B2.remove(RW2);  }
            if(objnum==41) { B2.remove(RB1);  }
            if(objnum==42) { B2.remove(KNB1);  }
            if(objnum==43) { B2.remove(BB1);  }
            if(objnum==44) { B2.remove(QUEENB);  }
            if(objnum==45) { B2.remove(KINGB);  }
            if(objnum==46) { B2.remove(BB2);  }
            if(objnum==47) { B2.remove(KNB2);  }
            if(objnum==48) { B2.remove(RB2);  }
        }
        if (xs==1 & ys==4) {
            if(objnum==11) { B3.remove(PW1);  }
            if(objnum==12) { B3.remove(PW2);  }
            if(objnum==13) { B3.remove(PW3);  }
            if(objnum==14) { B3.remove(PW4);  }
            if(objnum==15) { B3.remove(PW5);  }
            if(objnum==16) { B3.remove(PW6);  }
            if(objnum==17) { B3.remove(PW7);  }
            if(objnum==18) { B3.remove(PW8);  }
            if(objnum==21) { B3.remove(PB1);  }
            if(objnum==22) { B3.remove(PB2);  }
            if(objnum==23) { B3.remove(PB3);  }
            if(objnum==24) { B3.remove(PB4);  }
            if(objnum==25) { B3.remove(PB5);  }
            if(objnum==26) { B3.remove(PB6);  }
            if(objnum==27) { B3.remove(PB7);  }
            if(objnum==28) { B3.remove(PB8);  }
            if(objnum==31) { B3.remove(RW1);  }
            if(objnum==32) { B3.remove(KNW1);  }
            if(objnum==33) { B3.remove(BW1);  }
            if(objnum==34) { B3.remove(QUEENW);  }
            if(objnum==35) { B3.remove(KINGW);  }
            if(objnum==36) { B3.remove(BW2);  }
            if(objnum==37) { B3.remove(KNW2);  }
            if(objnum==38) { B3.remove(RW2);  }
            if(objnum==41) { B3.remove(RB1);  }
            if(objnum==42) { B3.remove(KNB1);  }
            if(objnum==43) { B3.remove(BB1);  }
            if(objnum==44) { B3.remove(QUEENB);  }
            if(objnum==45) { B3.remove(KINGB);  }
            if(objnum==46) { B3.remove(BB2);  }
            if(objnum==47) { B3.remove(KNB2);  }
            if(objnum==48) { B3.remove(RB2);  } }
        if (xs==1 & ys==5) {
            if(objnum==11) { B4.remove(PW1);  }
            if(objnum==12) { B4.remove(PW2);  }
            if(objnum==13) { B4.remove(PW3);  }
            if(objnum==14) { B4.remove(PW4);  }
            if(objnum==15) { B4.remove(PW5);  }
            if(objnum==16) { B4.remove(PW6);  }
            if(objnum==17) { B4.remove(PW7);  }
            if(objnum==18) { B4.remove(PW8);  }
            if(objnum==21) { B4.remove(PB1);  }
            if(objnum==22) { B4.remove(PB2);  }
            if(objnum==23) { B4.remove(PB3);  }
            if(objnum==24) { B4.remove(PB4);  }
            if(objnum==25) { B4.remove(PB5);  }
            if(objnum==26) { B4.remove(PB6);  }
            if(objnum==27) { B4.remove(PB7);  }
            if(objnum==28) { B4.remove(PB8);  }
            if(objnum==31) { B4.remove(RW1);  }
            if(objnum==32) { B4.remove(KNW1);  }
            if(objnum==33) { B4.remove(BW1);  }
            if(objnum==34) { B4.remove(QUEENW);  }
            if(objnum==35) { B4.remove(KINGW);  }
            if(objnum==36) { B4.remove(BW2);  }
            if(objnum==37) { B4.remove(KNW2);  }
            if(objnum==38) { B4.remove(RW2);  }
            if(objnum==41) { B4.remove(RB1);  }
            if(objnum==42) { B4.remove(KNB1);  }
            if(objnum==43) { B4.remove(BB1);  }
            if(objnum==44) { B4.remove(QUEENB);  }
            if(objnum==45) { B4.remove(KINGB);  }
            if(objnum==46) { B4.remove(BB2);  }
            if(objnum==47) { B4.remove(KNB2);  }
            if(objnum==48) { B4.remove(RB2);  }
        }
        if (xs==1 & ys==6) {
            if(objnum==11) { B5.remove(PW1);  }
            if(objnum==12) { B5.remove(PW2);  }
            if(objnum==13) { B5.remove(PW3);  }
            if(objnum==14) { B5.remove(PW4);  }
            if(objnum==15) { B5.remove(PW5);  }
            if(objnum==16) { B5.remove(PW6);  }
            if(objnum==17) { B5.remove(PW7);  }
            if(objnum==18) { B5.remove(PW8);  }
            if(objnum==21) { B5.remove(PB1);  }
            if(objnum==22) { B5.remove(PB2);  }
            if(objnum==23) { B5.remove(PB3);  }
            if(objnum==24) { B5.remove(PB4);  }
            if(objnum==25) { B5.remove(PB5);  }
            if(objnum==26) { B5.remove(PB6);  }
            if(objnum==27) { B5.remove(PB7);  }
            if(objnum==28) { B5.remove(PB8);  }
            if(objnum==31) { B5.remove(RW1);  }
            if(objnum==32) { B5.remove(KNW1);  }
            if(objnum==33) { B5.remove(BW1);  }
            if(objnum==34) { B5.remove(QUEENW);  }
            if(objnum==35) { B5.remove(KINGW);  }
            if(objnum==36) { B5.remove(BW2);  }
            if(objnum==37) { B5.remove(KNW2);  }
            if(objnum==38) { B5.remove(RW2);  }
            if(objnum==41) { B5.remove(RB1);  }
            if(objnum==42) { B5.remove(KNB1);  }
            if(objnum==43) { B5.remove(BB1);  }
            if(objnum==44) { B5.remove(QUEENB);  }
            if(objnum==45) { B5.remove(KINGB);  }
            if(objnum==46) { B5.remove(BB2);  }
            if(objnum==47) { B5.remove(KNB2);  }
            if(objnum==48) { B5.remove(RB2);  } }
        if (xs==1 & ys==7) {
            if(objnum==11) { B6.remove(PW1);  }
            if(objnum==12) { B6.remove(PW2);  }
            if(objnum==13) { B6.remove(PW3);  }
            if(objnum==14) { B6.remove(PW4);  }
            if(objnum==15) { B6.remove(PW5);  }
            if(objnum==16) { B6.remove(PW6);  }
            if(objnum==17) { B6.remove(PW7);  }
            if(objnum==18) { B6.remove(PW8);  }
            if(objnum==21) { B6.remove(PB1);  }
            if(objnum==22) { B6.remove(PB2);  }
            if(objnum==23) { B6.remove(PB3);  }
            if(objnum==24) { B6.remove(PB4);  }
            if(objnum==25) { B6.remove(PB5);  }
            if(objnum==26) { B6.remove(PB6);  }
            if(objnum==27) { B6.remove(PB7);  }
            if(objnum==28) { B6.remove(PB8);  }
            if(objnum==31) { B6.remove(RW1);  }
            if(objnum==32) { B6.remove(KNW1);  }
            if(objnum==33) { B6.remove(BW1);  }
            if(objnum==34) { B6.remove(QUEENW);  }
            if(objnum==35) { B6.remove(KINGW);  }
            if(objnum==36) { B6.remove(BW2);  }
            if(objnum==37) { B6.remove(KNW2);  }
            if(objnum==38) { B6.remove(RW2);  }
            if(objnum==41) { B6.remove(RB1);  }
            if(objnum==42) { B6.remove(KNB1);  }
            if(objnum==43) { B6.remove(BB1);  }
            if(objnum==44) { B6.remove(QUEENB);  }
            if(objnum==45) { B6.remove(KINGB);  }
            if(objnum==46) { B6.remove(BB2);  }
            if(objnum==47) { B6.remove(KNB2);  }
            if(objnum==48) { B6.remove(RB2);  }
        }
        if (xs==1 & ys==8) {
            if(objnum==11) { B7.remove(PW1);  }
            if(objnum==12) { B7.remove(PW2);  }
            if(objnum==13) { B7.remove(PW3);  }
            if(objnum==14) { B7.remove(PW4);  }
            if(objnum==15) { B7.remove(PW5);  }
            if(objnum==16) { B7.remove(PW6);  }
            if(objnum==17) { B7.remove(PW7);  }
            if(objnum==18) { B7.remove(PW8);  }
            if(objnum==21) { B7.remove(PB1);  }
            if(objnum==22) { B7.remove(PB2);  }
            if(objnum==23) { B7.remove(PB3);  }
            if(objnum==24) { B7.remove(PB4);  }
            if(objnum==25) { B7.remove(PB5);  }
            if(objnum==26) { B7.remove(PB6);  }
            if(objnum==27) { B7.remove(PB7);  }
            if(objnum==28) { B7.remove(PB8);  }
            if(objnum==31) { B7.remove(RW1);  }
            if(objnum==32) { B7.remove(KNW1);  }
            if(objnum==33) { B7.remove(BW1);  }
            if(objnum==34) { B7.remove(QUEENW);  }
            if(objnum==35) { B7.remove(KINGW);  }
            if(objnum==36) { B7.remove(BW2);  }
            if(objnum==37) { B7.remove(KNW2);  }
            if(objnum==38) { B7.remove(RW2);  }
            if(objnum==41) { B7.remove(RB1);  }
            if(objnum==42) { B7.remove(KNB1);  }
            if(objnum==43) { B7.remove(BB1);  }
            if(objnum==44) { B7.remove(QUEENB);  }
            if(objnum==45) { B7.remove(KINGB);  }
            if(objnum==46) { B7.remove(BB2);  }
            if(objnum==47) { B7.remove(KNB2);  }
            if(objnum==48) { B7.remove(RB2);  }
        }
        if (xs==2 & ys==1) {
            if(objnum==11) { C0.remove(PW1);  }
            if(objnum==12) { C0.remove(PW2);  }
            if(objnum==13) { C0.remove(PW3);  }
            if(objnum==14) { C0.remove(PW4);  }
            if(objnum==15) { C0.remove(PW5);  }
            if(objnum==16) { C0.remove(PW6);  }
            if(objnum==17) { C0.remove(PW7);  }
            if(objnum==18) { C0.remove(PW8);  }
            if(objnum==21) { C0.remove(PB1);  }
            if(objnum==22) { C0.remove(PB2);  }
            if(objnum==23) { C0.remove(PB3);  }
            if(objnum==24) { C0.remove(PB4);  }
            if(objnum==25) { C0.remove(PB5);  }
            if(objnum==26) { C0.remove(PB6);  }
            if(objnum==27) { C0.remove(PB7);  }
            if(objnum==28) { C0.remove(PB8);  }
            if(objnum==31) { C0.remove(RW1);  }
            if(objnum==32) { C0.remove(KNW1);  }
            if(objnum==33) { C0.remove(BW1);  }
            if(objnum==34) { C0.remove(QUEENW);  }
            if(objnum==35) { C0.remove(KINGW);  }
            if(objnum==36) { C0.remove(BW2);  }
            if(objnum==37) { C0.remove(KNW2);  }
            if(objnum==38) { C0.remove(RW2);  }
            if(objnum==41) { C0.remove(RB1);  }
            if(objnum==42) { C0.remove(KNB1);  }
            if(objnum==43) { C0.remove(BB1);  }
            if(objnum==44) { C0.remove(QUEENB);  }
            if(objnum==45) { C0.remove(KINGB);  }
            if(objnum==46) { C0.remove(BB2);  }
            if(objnum==47) { C0.remove(KNB2);  }
            if(objnum==48) { C0.remove(RB2);  } }
        if (xs==2 & ys==2) {
            if(objnum==11) { C1.remove(PW1);  }
            if(objnum==12) { C1.remove(PW2);  }
            if(objnum==13) { C1.remove(PW3);  }
            if(objnum==14) { C1.remove(PW4);  }
            if(objnum==15) { C1.remove(PW5);  }
            if(objnum==16) { C1.remove(PW6);  }
            if(objnum==17) { C1.remove(PW7);  }
            if(objnum==18) { C1.remove(PW8);  }
            if(objnum==21) { C1.remove(PB1);  }
            if(objnum==22) { C1.remove(PB2);  }
            if(objnum==23) { C1.remove(PB3);  }
            if(objnum==24) { C1.remove(PB4);  }
            if(objnum==25) { C1.remove(PB5);  }
            if(objnum==26) { C1.remove(PB6);  }
            if(objnum==27) { C1.remove(PB7);  }
            if(objnum==28) { C1.remove(PB8);  }
            if(objnum==31) { C1.remove(RW1);  }
            if(objnum==32) { C1.remove(KNW1);  }
            if(objnum==33) { C1.remove(BW1);  }
            if(objnum==34) { C1.remove(QUEENW);  }
            if(objnum==35) { C1.remove(KINGW);  }
            if(objnum==36) { C1.remove(BW2);  }
            if(objnum==37) { C1.remove(KNW2);  }
            if(objnum==38) { C1.remove(RW2);  }
            if(objnum==41) { C1.remove(RB1);  }
            if(objnum==42) { C1.remove(KNB1);  }
            if(objnum==43) { C1.remove(BB1);  }
            if(objnum==44) { C1.remove(QUEENB);  }
            if(objnum==45) { C1.remove(KINGB);  }
            if(objnum==46) { C1.remove(BB2);  }
            if(objnum==47) { C1.remove(KNB2);  }
            if(objnum==48) { C1.remove(RB2);  } }
        if (xs==2 & ys==3) {
            if(objnum==11) { C2.remove(PW1);  }
            if(objnum==12) { C2.remove(PW2);  }
            if(objnum==13) { C2.remove(PW3);  }
            if(objnum==14) { C2.remove(PW4);  }
            if(objnum==15) { C2.remove(PW5);  }
            if(objnum==16) { C2.remove(PW6);  }
            if(objnum==17) { C2.remove(PW7);  }
            if(objnum==18) { C2.remove(PW8);  }
            if(objnum==21) { C2.remove(PB1);  }
            if(objnum==22) { C2.remove(PB2);  }
            if(objnum==23) { C2.remove(PB3);  }
            if(objnum==24) { C2.remove(PB4);  }
            if(objnum==25) { C2.remove(PB5);  }
            if(objnum==26) { C2.remove(PB6);  }
            if(objnum==27) { C2.remove(PB7);  }
            if(objnum==28) { C2.remove(PB8);  }
            if(objnum==31) { C2.remove(RW1);  }
            if(objnum==32) { C2.remove(KNW1);  }
            if(objnum==33) { C2.remove(BW1);  }
            if(objnum==34) { C2.remove(QUEENW);  }
            if(objnum==35) { C2.remove(KINGW);  }
            if(objnum==36) { C2.remove(BW2);  }
            if(objnum==37) { C2.remove(KNW2);  }
            if(objnum==38) { C2.remove(RW2);  }
            if(objnum==41) { C2.remove(RB1);  }
            if(objnum==42) { C2.remove(KNB1);  }
            if(objnum==43) { C2.remove(BB1);  }
            if(objnum==44) { C2.remove(QUEENB);  }
            if(objnum==45) { C2.remove(KINGB);  }
            if(objnum==46) { C2.remove(BB2);  }
            if(objnum==47) { C2.remove(KNB2);  }
            if(objnum==48) { C2.remove(RB2);  } }
        if (xs==2 & ys==4) {
            if(objnum==11) { C3.remove(PW1);  }
            if(objnum==12) { C3.remove(PW2);  }
            if(objnum==13) { C3.remove(PW3);  }
            if(objnum==14) { C3.remove(PW4);  }
            if(objnum==15) { C3.remove(PW5);  }
            if(objnum==16) { C3.remove(PW6);  }
            if(objnum==17) { C3.remove(PW7);  }
            if(objnum==18) { C3.remove(PW8);  }
            if(objnum==21) { C3.remove(PB1);  }
            if(objnum==22) { C3.remove(PB2);  }
            if(objnum==23) { C3.remove(PB3);  }
            if(objnum==24) { C3.remove(PB4);  }
            if(objnum==25) { C3.remove(PB5);  }
            if(objnum==26) { C3.remove(PB6);  }
            if(objnum==27) { C3.remove(PB7);  }
            if(objnum==28) { C3.remove(PB8);  }
            if(objnum==31) { C3.remove(RW1);  }
            if(objnum==32) { C3.remove(KNW1);  }
            if(objnum==33) { C3.remove(BW1);  }
            if(objnum==34) { C3.remove(QUEENW);  }
            if(objnum==35) { C3.remove(KINGW);  }
            if(objnum==36) { C3.remove(BW2);  }
            if(objnum==37) { C3.remove(KNW2);  }
            if(objnum==38) { C3.remove(RW2);  }
            if(objnum==41) { C3.remove(RB1);  }
            if(objnum==42) { C3.remove(KNB1);  }
            if(objnum==43) { C3.remove(BB1);  }
            if(objnum==44) { C3.remove(QUEENB);  }
            if(objnum==45) { C3.remove(KINGB);  }
            if(objnum==46) { C3.remove(BB2);  }
            if(objnum==47) { C3.remove(KNB2);  }
            if(objnum==48) { C3.remove(RB2);  } }
        if (xs==2 & ys==5) {
            if(objnum==11) { C4.remove(PW1);  }
            if(objnum==12) { C4.remove(PW2);  }
            if(objnum==13) { C4.remove(PW3);  }
            if(objnum==14) { C4.remove(PW4);  }
            if(objnum==15) { C4.remove(PW5);  }
            if(objnum==16) { C4.remove(PW6);  }
            if(objnum==17) { C4.remove(PW7);  }
            if(objnum==18) { C4.remove(PW8);  }
            if(objnum==21) { C4.remove(PB1);  }
            if(objnum==22) { C4.remove(PB2);  }
            if(objnum==23) { C4.remove(PB3);  }
            if(objnum==24) { C4.remove(PB4);  }
            if(objnum==25) { C4.remove(PB5);  }
            if(objnum==26) { C4.remove(PB6);  }
            if(objnum==27) { C4.remove(PB7);  }
            if(objnum==28) { C4.remove(PB8);  }
            if(objnum==31) { C4.remove(RW1);  }
            if(objnum==32) { C4.remove(KNW1);  }
            if(objnum==33) { C4.remove(BW1);  }
            if(objnum==34) { C4.remove(QUEENW);  }
            if(objnum==35) { C4.remove(KINGW);  }
            if(objnum==36) { C4.remove(BW2);  }
            if(objnum==37) { C4.remove(KNW2);  }
            if(objnum==38) { C4.remove(RW2);  }
            if(objnum==41) { C4.remove(RB1);  }
            if(objnum==42) { C4.remove(KNB1);  }
            if(objnum==43) { C4.remove(BB1);  }
            if(objnum==44) { C4.remove(QUEENB);  }
            if(objnum==45) { C4.remove(KINGB);  }
            if(objnum==46) { C4.remove(BB2);  }
            if(objnum==47) { C4.remove(KNB2);  }
            if(objnum==48) { C4.remove(RB2);  } }
        if (xs==2 & ys==6) {
            if(objnum==11) { C5.remove(PW1);  }
            if(objnum==12) { C5.remove(PW2);  }
            if(objnum==13) { C5.remove(PW3);  }
            if(objnum==14) { C5.remove(PW4);  }
            if(objnum==15) { C5.remove(PW5);  }
            if(objnum==16) { C5.remove(PW6);  }
            if(objnum==17) { C5.remove(PW7);  }
            if(objnum==18) { C5.remove(PW8);  }
            if(objnum==21) { C5.remove(PB1);  }
            if(objnum==22) { C5.remove(PB2);  }
            if(objnum==23) { C5.remove(PB3);  }
            if(objnum==24) { C5.remove(PB4);  }
            if(objnum==25) { C5.remove(PB5);  }
            if(objnum==26) { C5.remove(PB6);  }
            if(objnum==27) { C5.remove(PB7);  }
            if(objnum==28) { C5.remove(PB8);  }
            if(objnum==31) { C5.remove(RW1);  }
            if(objnum==32) { C5.remove(KNW1);  }
            if(objnum==33) { C5.remove(BW1);  }
            if(objnum==34) { C5.remove(QUEENW);  }
            if(objnum==35) { C5.remove(KINGW);  }
            if(objnum==36) { C5.remove(BW2);  }
            if(objnum==37) { C5.remove(KNW2);  }
            if(objnum==38) { C5.remove(RW2);  }
            if(objnum==41) { C5.remove(RB1);  }
            if(objnum==42) { C5.remove(KNB1);  }
            if(objnum==43) { C5.remove(BB1);  }
            if(objnum==44) { C5.remove(QUEENB);  }
            if(objnum==45) { C5.remove(KINGB);  }
            if(objnum==46) { C5.remove(BB2);  }
            if(objnum==47) { C5.remove(KNB2);  }
            if(objnum==48) { C5.remove(RB2);  } }
        if (xs==2 & ys==7) {
            if(objnum==11) { C6.remove(PW1);  }
            if(objnum==12) { C6.remove(PW2);  }
            if(objnum==13) { C6.remove(PW3);  }
            if(objnum==14) { C6.remove(PW4);  }
            if(objnum==15) { C6.remove(PW5);  }
            if(objnum==16) { C6.remove(PW6);  }
            if(objnum==17) { C6.remove(PW7);  }
            if(objnum==18) { C6.remove(PW8);  }
            if(objnum==21) { C6.remove(PB1);  }
            if(objnum==22) { C6.remove(PB2);  }
            if(objnum==23) { C6.remove(PB3);  }
            if(objnum==24) { C6.remove(PB4);  }
            if(objnum==25) { C6.remove(PB5);  }
            if(objnum==26) { C6.remove(PB6);  }
            if(objnum==27) { C6.remove(PB7);  }
            if(objnum==28) { C6.remove(PB8);  }
            if(objnum==31) { C6.remove(RW1);  }
            if(objnum==32) { C6.remove(KNW1);  }
            if(objnum==33) { C6.remove(BW1);  }
            if(objnum==34) { C6.remove(QUEENW);  }
            if(objnum==35) { C6.remove(KINGW);  }
            if(objnum==36) { C6.remove(BW2);  }
            if(objnum==37) { C6.remove(KNW2);  }
            if(objnum==38) { C6.remove(RW2);  }
            if(objnum==41) { C6.remove(RB1);  }
            if(objnum==42) { C6.remove(KNB1);  }
            if(objnum==43) { C6.remove(BB1);  }
            if(objnum==44) { C6.remove(QUEENB);  }
            if(objnum==45) { C6.remove(KINGB);  }
            if(objnum==46) { C6.remove(BB2);  }
            if(objnum==47) { C6.remove(KNB2);  }
            if(objnum==48) { C6.remove(RB2);  } }
        if (xs==2 & ys==8) {
            if(objnum==11) { C7.remove(PW1);  }
            if(objnum==12) { C7.remove(PW2);  }
            if(objnum==13) { C7.remove(PW3);  }
            if(objnum==14) { C7.remove(PW4);  }
            if(objnum==15) { C7.remove(PW5);  }
            if(objnum==16) { C7.remove(PW6);  }
            if(objnum==17) { C7.remove(PW7);  }
            if(objnum==18) { C7.remove(PW8);  }
            if(objnum==21) { C7.remove(PB1);  }
            if(objnum==22) { C7.remove(PB2);  }
            if(objnum==23) { C7.remove(PB3);  }
            if(objnum==24) { C7.remove(PB4);  }
            if(objnum==25) { C7.remove(PB5);  }
            if(objnum==26) { C7.remove(PB6);  }
            if(objnum==27) { C7.remove(PB7);  }
            if(objnum==28) { C7.remove(PB8);  }
            if(objnum==31) { C7.remove(RW1);  }
            if(objnum==32) { C7.remove(KNW1);  }
            if(objnum==33) { C7.remove(BW1);  }
            if(objnum==34) { C7.remove(QUEENW);  }
            if(objnum==35) { C7.remove(KINGW);  }
            if(objnum==36) { C7.remove(BW2);  }
            if(objnum==37) { C7.remove(KNW2);  }
            if(objnum==38) { C7.remove(RW2);  }
            if(objnum==41) { C7.remove(RB1);  }
            if(objnum==42) { C7.remove(KNB1);  }
            if(objnum==43) { C7.remove(BB1);  }
            if(objnum==44) { C7.remove(QUEENB);  }
            if(objnum==45) { C7.remove(KINGB);  }
            if(objnum==46) { C7.remove(BB2);  }
            if(objnum==47) { C7.remove(KNB2);  }
            if(objnum==48) { C7.remove(RB2);  } }
        if (xs==3 & ys==1) {
            if(objnum==11) { D0.remove(PW1);  }
            if(objnum==12) { D0.remove(PW2);  }
            if(objnum==13) { D0.remove(PW3);  }
            if(objnum==14) { D0.remove(PW4);  }
            if(objnum==15) { D0.remove(PW5);  }
            if(objnum==16) { D0.remove(PW6);  }
            if(objnum==17) { D0.remove(PW7);  }
            if(objnum==18) { D0.remove(PW8);  }
            if(objnum==21) { D0.remove(PB1);  }
            if(objnum==22) { D0.remove(PB2);  }
            if(objnum==23) { D0.remove(PB3);  }
            if(objnum==24) { D0.remove(PB4);  }
            if(objnum==25) { D0.remove(PB5);  }
            if(objnum==26) { D0.remove(PB6);  }
            if(objnum==27) { D0.remove(PB7);  }
            if(objnum==28) { D0.remove(PB8);  }
            if(objnum==31) { D0.remove(RW1);  }
            if(objnum==32) { D0.remove(KNW1);  }
            if(objnum==33) { D0.remove(BW1);  }
            if(objnum==34) { D0.remove(QUEENW);  }
            if(objnum==35) { D0.remove(KINGW);  }
            if(objnum==36) { D0.remove(BW2);  }
            if(objnum==37) { D0.remove(KNW2);  }
            if(objnum==38) { D0.remove(RW2);  }
            if(objnum==41) { D0.remove(RB1);  }
            if(objnum==42) { D0.remove(KNB1);  }
            if(objnum==43) { D0.remove(BB1);  }
            if(objnum==44) { D0.remove(QUEENB);  }
            if(objnum==45) { D0.remove(KINGB);  }
            if(objnum==46) { D0.remove(BB2);  }
            if(objnum==47) { D0.remove(KNB2);  }
            if(objnum==48) { D0.remove(RB2);  } }
        if (xs==3 & ys==2) {
            if(objnum==11) { D1.remove(PW1);  }
            if(objnum==12) { D1.remove(PW2);  }
            if(objnum==13) { D1.remove(PW3);  }
            if(objnum==14) { D1.remove(PW4);  }
            if(objnum==15) { D1.remove(PW5);  }
            if(objnum==16) { D1.remove(PW6);  }
            if(objnum==17) { D1.remove(PW7);  }
            if(objnum==18) { D1.remove(PW8);  }
            if(objnum==21) { D1.remove(PB1);  }
            if(objnum==22) { D1.remove(PB2);  }
            if(objnum==23) { D1.remove(PB3);  }
            if(objnum==24) { D1.remove(PB4);  }
            if(objnum==25) { D1.remove(PB5);  }
            if(objnum==26) { D1.remove(PB6);  }
            if(objnum==27) { D1.remove(PB7);  }
            if(objnum==28) { D1.remove(PB8);  }
            if(objnum==31) { D1.remove(RW1);  }
            if(objnum==32) { D1.remove(KNW1);  }
            if(objnum==33) { D1.remove(BW1);  }
            if(objnum==34) { D1.remove(QUEENW);  }
            if(objnum==35) { D1.remove(KINGW);  }
            if(objnum==36) { D1.remove(BW2);  }
            if(objnum==37) { D1.remove(KNW2);  }
            if(objnum==38) { D1.remove(RW2);  }
            if(objnum==41) { D1.remove(RB1);  }
            if(objnum==42) { D1.remove(KNB1);  }
            if(objnum==43) { D1.remove(BB1);  }
            if(objnum==44) { D1.remove(QUEENB);  }
            if(objnum==45) { D1.remove(KINGB);  }
            if(objnum==46) { D1.remove(BB2);  }
            if(objnum==47) { D1.remove(KNB2);  }
            if(objnum==48) { D1.remove(RB2);  } }
        if (xs==3 & ys==3) {
            if(objnum==11) { D2.remove(PW1);  }
            if(objnum==12) { D2.remove(PW2);  }
            if(objnum==13) { D2.remove(PW3);  }
            if(objnum==14) { D2.remove(PW4);  }
            if(objnum==15) { D2.remove(PW5);  }
            if(objnum==16) { D2.remove(PW6);  }
            if(objnum==17) { D2.remove(PW7);  }
            if(objnum==18) { D2.remove(PW8);  }
            if(objnum==21) { D2.remove(PB1);  }
            if(objnum==22) { D2.remove(PB2);  }
            if(objnum==23) { D2.remove(PB3);  }
            if(objnum==24) { D2.remove(PB4);  }
            if(objnum==25) { D2.remove(PB5);  }
            if(objnum==26) { D2.remove(PB6);  }
            if(objnum==27) { D2.remove(PB7);  }
            if(objnum==28) { D2.remove(PB8);  }
            if(objnum==31) { D2.remove(RW1);  }
            if(objnum==32) { D2.remove(KNW1);  }
            if(objnum==33) { D2.remove(BW1);  }
            if(objnum==34) { D2.remove(QUEENW);  }
            if(objnum==35) { D2.remove(KINGW);  }
            if(objnum==36) { D2.remove(BW2);  }
            if(objnum==37) { D2.remove(KNW2);  }
            if(objnum==38) { D2.remove(RW2);  }
            if(objnum==41) { D2.remove(RB1);  }
            if(objnum==42) { D2.remove(KNB1);  }
            if(objnum==43) { D2.remove(BB1);  }
            if(objnum==44) { D2.remove(QUEENB);  }
            if(objnum==45) { D2.remove(KINGB);  }
            if(objnum==46) { D2.remove(BB2);  }
            if(objnum==47) { D2.remove(KNB2);  }
            if(objnum==48) { D2.remove(RB2);  } }
        if (xs==3 & ys==4) {
            if(objnum==11) { D3.remove(PW1);  }
            if(objnum==12) { D3.remove(PW2);  }
            if(objnum==13) { D3.remove(PW3);  }
            if(objnum==14) { D3.remove(PW4);  }
            if(objnum==15) { D3.remove(PW5);  }
            if(objnum==16) { D3.remove(PW6);  }
            if(objnum==17) { D3.remove(PW7);  }
            if(objnum==18) { D3.remove(PW8);  }
            if(objnum==21) { D3.remove(PB1);  }
            if(objnum==22) { D3.remove(PB2);  }
            if(objnum==23) { D3.remove(PB3);  }
            if(objnum==24) { D3.remove(PB4);  }
            if(objnum==25) { D3.remove(PB5);  }
            if(objnum==26) { D3.remove(PB6);  }
            if(objnum==27) { D3.remove(PB7);  }
            if(objnum==28) { D3.remove(PB8);  }
            if(objnum==31) { D3.remove(RW1);  }
            if(objnum==32) { D3.remove(KNW1);  }
            if(objnum==33) { D3.remove(BW1);  }
            if(objnum==34) { D3.remove(QUEENW);  }
            if(objnum==35) { D3.remove(KINGW);  }
            if(objnum==36) { D3.remove(BW2);  }
            if(objnum==37) { D3.remove(KNW2);  }
            if(objnum==38) { D3.remove(RW2);  }
            if(objnum==41) { D3.remove(RB1);  }
            if(objnum==42) { D3.remove(KNB1);  }
            if(objnum==43) { D3.remove(BB1);  }
            if(objnum==44) { D3.remove(QUEENB);  }
            if(objnum==45) { D3.remove(KINGB);  }
            if(objnum==46) { D3.remove(BB2);  }
            if(objnum==47) { D3.remove(KNB2);  }
            if(objnum==48) { D3.remove(RB2);  } }
        if (xs==3 & ys==5) {
            if(objnum==11) { D4.remove(PW1);  }
            if(objnum==12) { D4.remove(PW2);  }
            if(objnum==13) { D4.remove(PW3);  }
            if(objnum==14) { D4.remove(PW4);  }
            if(objnum==15) { D4.remove(PW5);  }
            if(objnum==16) { D4.remove(PW6);  }
            if(objnum==17) { D4.remove(PW7);  }
            if(objnum==18) { D4.remove(PW8);  }
            if(objnum==21) { D4.remove(PB1);  }
            if(objnum==22) { D4.remove(PB2);  }
            if(objnum==23) { D4.remove(PB3);  }
            if(objnum==24) { D4.remove(PB4);  }
            if(objnum==25) { D4.remove(PB5);  }
            if(objnum==26) { D4.remove(PB6);  }
            if(objnum==27) { D4.remove(PB7);  }
            if(objnum==28) { D4.remove(PB8);  }
            if(objnum==31) { D4.remove(RW1);  }
            if(objnum==32) { D4.remove(KNW1);  }
            if(objnum==33) { D4.remove(BW1);  }
            if(objnum==34) { D4.remove(QUEENW);  }
            if(objnum==35) { D4.remove(KINGW);  }
            if(objnum==36) { D4.remove(BW2);  }
            if(objnum==37) { D4.remove(KNW2);  }
            if(objnum==38) { D4.remove(RW2);  }
            if(objnum==41) { D4.remove(RB1);  }
            if(objnum==42) { D4.remove(KNB1);  }
            if(objnum==43) { D4.remove(BB1);  }
            if(objnum==44) { D4.remove(QUEENB);  }
            if(objnum==45) { D4.remove(KINGB);  }
            if(objnum==46) { D4.remove(BB2);  }
            if(objnum==47) { D4.remove(KNB2);  }
            if(objnum==48) { D4.remove(RB2);  }  }
        if (xs==3 & ys==6) {
            if(objnum==11) { D5.remove(PW1);  }
            if(objnum==12) { D5.remove(PW2);  }
            if(objnum==13) { D5.remove(PW3);  }
            if(objnum==14) { D5.remove(PW4);  }
            if(objnum==15) { D5.remove(PW5);  }
            if(objnum==16) { D5.remove(PW6);  }
            if(objnum==17) { D5.remove(PW7);  }
            if(objnum==18) { D5.remove(PW8);  }
            if(objnum==21) { D5.remove(PB1);  }
            if(objnum==22) { D5.remove(PB2);  }
            if(objnum==23) { D5.remove(PB3);  }
            if(objnum==24) { D5.remove(PB4);  }
            if(objnum==25) { D5.remove(PB5);  }
            if(objnum==26) { D5.remove(PB6);  }
            if(objnum==27) { D5.remove(PB7);  }
            if(objnum==28) { D5.remove(PB8);  }
            if(objnum==31) { D5.remove(RW1);  }
            if(objnum==32) { D5.remove(KNW1);  }
            if(objnum==33) { D5.remove(BW1);  }
            if(objnum==34) { D5.remove(QUEENW);  }
            if(objnum==35) { D5.remove(KINGW);  }
            if(objnum==36) { D5.remove(BW2);  }
            if(objnum==37) { D5.remove(KNW2);  }
            if(objnum==38) { D5.remove(RW2);  }
            if(objnum==41) { D5.remove(RB1);  }
            if(objnum==42) { D5.remove(KNB1);  }
            if(objnum==43) { D5.remove(BB1);  }
            if(objnum==44) { D5.remove(QUEENB);  }
            if(objnum==45) { D5.remove(KINGB);  }
            if(objnum==46) { D5.remove(BB2);  }
            if(objnum==47) { D5.remove(KNB2);  }
            if(objnum==48) { D5.remove(RB2);  } }
        if (xs==3 & ys==7) {
            if(objnum==11) { D6.remove(PW1);  }
            if(objnum==12) { D6.remove(PW2);  }
            if(objnum==13) { D6.remove(PW3);  }
            if(objnum==14) { D6.remove(PW4);  }
            if(objnum==15) { D6.remove(PW5);  }
            if(objnum==16) { D6.remove(PW6);  }
            if(objnum==17) { D6.remove(PW7);  }
            if(objnum==18) { D6.remove(PW8);  }
            if(objnum==21) { D6.remove(PB1);  }
            if(objnum==22) { D6.remove(PB2);  }
            if(objnum==23) { D6.remove(PB3);  }
            if(objnum==24) { D6.remove(PB4);  }
            if(objnum==25) { D6.remove(PB5);  }
            if(objnum==26) { D6.remove(PB6);  }
            if(objnum==27) { D6.remove(PB7);  }
            if(objnum==28) { D6.remove(PB8);  }
            if(objnum==31) { D6.remove(RW1);  }
            if(objnum==32) { D6.remove(KNW1);  }
            if(objnum==33) { D6.remove(BW1);  }
            if(objnum==34) { D6.remove(QUEENW);  }
            if(objnum==35) { D6.remove(KINGW);  }
            if(objnum==36) { D6.remove(BW2);  }
            if(objnum==37) { D6.remove(KNW2);  }
            if(objnum==38) { D6.remove(RW2);  }
            if(objnum==41) { D6.remove(RB1);  }
            if(objnum==42) { D6.remove(KNB1);  }
            if(objnum==43) { D6.remove(BB1);  }
            if(objnum==44) { D6.remove(QUEENB);  }
            if(objnum==45) { D6.remove(KINGB);  }
            if(objnum==46) { D6.remove(BB2);  }
            if(objnum==47) { D6.remove(KNB2);  }
            if(objnum==48) { D6.remove(RB2);  } }
        if (xs==3 & ys==8) {
            if(objnum==11) { D7.remove(PW1);  }
            if(objnum==12) { D7.remove(PW2);  }
            if(objnum==13) { D7.remove(PW3);  }
            if(objnum==14) { D7.remove(PW4);  }
            if(objnum==15) { D7.remove(PW5);  }
            if(objnum==16) { D7.remove(PW6);  }
            if(objnum==17) { D7.remove(PW7);  }
            if(objnum==18) { D7.remove(PW8);  }
            if(objnum==21) { D7.remove(PB1);  }
            if(objnum==22) { D7.remove(PB2);  }
            if(objnum==23) { D7.remove(PB3);  }
            if(objnum==24) { D7.remove(PB4);  }
            if(objnum==25) { D7.remove(PB5);  }
            if(objnum==26) { D7.remove(PB6);  }
            if(objnum==27) { D7.remove(PB7);  }
            if(objnum==28) { D7.remove(PB8);  }
            if(objnum==31) { D7.remove(RW1);  }
            if(objnum==32) { D7.remove(KNW1);  }
            if(objnum==33) { D7.remove(BW1);  }
            if(objnum==34) { D7.remove(QUEENW);  }
            if(objnum==35) { D7.remove(KINGW);  }
            if(objnum==36) { D7.remove(BW2);  }
            if(objnum==37) { D7.remove(KNW2);  }
            if(objnum==38) { D7.remove(RW2);  }
            if(objnum==41) { D7.remove(RB1);  }
            if(objnum==42) { D7.remove(KNB1);  }
            if(objnum==43) { D7.remove(BB1);  }
            if(objnum==44) { D7.remove(QUEENB);  }
            if(objnum==45) { D7.remove(KINGB);  }
            if(objnum==46) { D7.remove(BB2);  }
            if(objnum==47) { D7.remove(KNB2);  }
            if(objnum==48) { D7.remove(RB2);  } }
        if (xs==4 & ys==1) {
            if(objnum==11) { E0.remove(PW1);  }
            if(objnum==12) { E0.remove(PW2);  }
            if(objnum==13) { E0.remove(PW3);  }
            if(objnum==14) { E0.remove(PW4);  }
            if(objnum==15) { E0.remove(PW5);  }
            if(objnum==16) { E0.remove(PW6);  }
            if(objnum==17) { E0.remove(PW7);  }
            if(objnum==18) { E0.remove(PW8);  }
            if(objnum==21) { E0.remove(PB1);  }
            if(objnum==22) { E0.remove(PB2);  }
            if(objnum==23) { E0.remove(PB3);  }
            if(objnum==24) { E0.remove(PB4);  }
            if(objnum==25) { E0.remove(PB5);  }
            if(objnum==26) { E0.remove(PB6);  }
            if(objnum==27) { E0.remove(PB7);  }
            if(objnum==28) { E0.remove(PB8);  }
            if(objnum==31) { E0.remove(RW1);  }
            if(objnum==32) { E0.remove(KNW1);  }
            if(objnum==33) { E0.remove(BW1);  }
            if(objnum==34) { E0.remove(QUEENW);  }
            if(objnum==35) { E0.remove(KINGW);  }
            if(objnum==36) { E0.remove(BW2);  }
            if(objnum==37) { E0.remove(KNW2);  }
            if(objnum==38) { E0.remove(RW2);  }
            if(objnum==41) { E0.remove(RB1);  }
            if(objnum==42) { E0.remove(KNB1);  }
            if(objnum==43) { E0.remove(BB1);  }
            if(objnum==44) { E0.remove(QUEENB);  }
            if(objnum==45) { E0.remove(KINGB);  }
            if(objnum==46) { E0.remove(BB2);  }
            if(objnum==47) { E0.remove(KNB2);  }
            if(objnum==48) { E0.remove(RB2);  } }
        if (xs==4 & ys==2) {
            if(objnum==11) { E1.remove(PW1);  }
            if(objnum==12) { E1.remove(PW2);  }
            if(objnum==13) { E1.remove(PW3);  }
            if(objnum==14) { E1.remove(PW4);  }
            if(objnum==15) { E1.remove(PW5);  }
            if(objnum==16) { E1.remove(PW6);  }
            if(objnum==17) { E1.remove(PW7);  }
            if(objnum==18) { E1.remove(PW8);  }
            if(objnum==21) { E1.remove(PB1);  }
            if(objnum==22) { E1.remove(PB2);  }
            if(objnum==23) { E1.remove(PB3);  }
            if(objnum==24) { E1.remove(PB4);  }
            if(objnum==25) { E1.remove(PB5);  }
            if(objnum==26) { E1.remove(PB6);  }
            if(objnum==27) { E1.remove(PB7);  }
            if(objnum==28) { E1.remove(PB8);  }
            if(objnum==31) { E1.remove(RW1);  }
            if(objnum==32) { E1.remove(KNW1);  }
            if(objnum==33) { E1.remove(BW1);  }
            if(objnum==34) { E1.remove(QUEENW);  }
            if(objnum==35) { E1.remove(KINGW);  }
            if(objnum==36) { E1.remove(BW2);  }
            if(objnum==37) { E1.remove(KNW2);  }
            if(objnum==38) { E1.remove(RW2);  }
            if(objnum==41) { E1.remove(RB1);  }
            if(objnum==42) { E1.remove(KNB1);  }
            if(objnum==43) { E1.remove(BB1);  }
            if(objnum==44) { E1.remove(QUEENB);  }
            if(objnum==45) { E1.remove(KINGB);  }
            if(objnum==46) { E1.remove(BB2);  }
            if(objnum==47) { E1.remove(KNB2);  }
            if(objnum==48) { E1.remove(RB2);  } }
        if (xs==4 & ys==3) {
            if(objnum==11) { E2.remove(PW1);  }
            if(objnum==12) { E2.remove(PW2);  }
            if(objnum==13) { E2.remove(PW3);  }
            if(objnum==14) { E2.remove(PW4);  }
            if(objnum==15) { E2.remove(PW5);  }
            if(objnum==16) { E2.remove(PW6);  }
            if(objnum==17) { E2.remove(PW7);  }
            if(objnum==18) { E2.remove(PW8);  }
            if(objnum==21) { E2.remove(PB1);  }
            if(objnum==22) { E2.remove(PB2);  }
            if(objnum==23) { E2.remove(PB3);  }
            if(objnum==24) { E2.remove(PB4);  }
            if(objnum==25) { E2.remove(PB5);  }
            if(objnum==26) { E2.remove(PB6);  }
            if(objnum==27) { E2.remove(PB7);  }
            if(objnum==28) { E2.remove(PB8);  }
            if(objnum==31) { E2.remove(RW1);  }
            if(objnum==32) { E2.remove(KNW1);  }
            if(objnum==33) { E2.remove(BW1);  }
            if(objnum==34) { E2.remove(QUEENW);  }
            if(objnum==35) { E2.remove(KINGW);  }
            if(objnum==36) { E2.remove(BW2);  }
            if(objnum==37) { E2.remove(KNW2);  }
            if(objnum==38) { E2.remove(RW2);  }
            if(objnum==41) { E2.remove(RB1);  }
            if(objnum==42) { E2.remove(KNB1);  }
            if(objnum==43) { E2.remove(BB1);  }
            if(objnum==44) { E2.remove(QUEENB);  }
            if(objnum==45) { E2.remove(KINGB);  }
            if(objnum==46) { E2.remove(BB2);  }
            if(objnum==47) { E2.remove(KNB2);  }
            if(objnum==48) { E2.remove(RB2);  } }
        if (xs==4 & ys==4) {
            if(objnum==11) { E3.remove(PW1);  }
            if(objnum==12) { E3.remove(PW2);  }
            if(objnum==13) { E3.remove(PW3);  }
            if(objnum==14) { E3.remove(PW4);  }
            if(objnum==15) { E3.remove(PW5);  }
            if(objnum==16) { E3.remove(PW6);  }
            if(objnum==17) { E3.remove(PW7);  }
            if(objnum==18) { E3.remove(PW8);  }
            if(objnum==21) { E3.remove(PB1);  }
            if(objnum==22) { E3.remove(PB2);  }
            if(objnum==23) { E3.remove(PB3);  }
            if(objnum==24) { E3.remove(PB4);  }
            if(objnum==25) { E3.remove(PB5);  }
            if(objnum==26) { E3.remove(PB6);  }
            if(objnum==27) { E3.remove(PB7);  }
            if(objnum==28) { E3.remove(PB8);  }
            if(objnum==31) { E3.remove(RW1);  }
            if(objnum==32) { E3.remove(KNW1);  }
            if(objnum==33) { E3.remove(BW1);  }
            if(objnum==34) { E3.remove(QUEENW);  }
            if(objnum==35) { E3.remove(KINGW);  }
            if(objnum==36) { E3.remove(BW2);  }
            if(objnum==37) { E3.remove(KNW2);  }
            if(objnum==38) { E3.remove(RW2);  }
            if(objnum==41) { E3.remove(RB1);  }
            if(objnum==42) { E3.remove(KNB1);  }
            if(objnum==43) { E3.remove(BB1);  }
            if(objnum==44) { E3.remove(QUEENB);  }
            if(objnum==45) { E3.remove(KINGB);  }
            if(objnum==46) { E3.remove(BB2);  }
            if(objnum==47) { E3.remove(KNB2);  }
            if(objnum==48) { E3.remove(RB2);  } }
        if (xs==4 & ys==5) {
            if(objnum==11) { E4.remove(PW1);  }
            if(objnum==12) { E4.remove(PW2);  }
            if(objnum==13) { E4.remove(PW3);  }
            if(objnum==14) { E4.remove(PW4);  }
            if(objnum==15) { E4.remove(PW5);  }
            if(objnum==16) { E4.remove(PW6);  }
            if(objnum==17) { E4.remove(PW7);  }
            if(objnum==18) { E4.remove(PW8);  }
            if(objnum==21) { E4.remove(PB1);  }
            if(objnum==22) { E4.remove(PB2);  }
            if(objnum==23) { E4.remove(PB3);  }
            if(objnum==24) { E4.remove(PB4);  }
            if(objnum==25) { E4.remove(PB5);  }
            if(objnum==26) { E4.remove(PB6);  }
            if(objnum==27) { E4.remove(PB7);  }
            if(objnum==28) { E4.remove(PB8);  }
            if(objnum==31) { E4.remove(RW1);  }
            if(objnum==32) { E4.remove(KNW1);  }
            if(objnum==33) { E4.remove(BW1);  }
            if(objnum==34) { E4.remove(QUEENW);  }
            if(objnum==35) { E4.remove(KINGW);  }
            if(objnum==36) { E4.remove(BW2);  }
            if(objnum==37) { E4.remove(KNW2);  }
            if(objnum==38) { E4.remove(RW2);  }
            if(objnum==41) { E4.remove(RB1);  }
            if(objnum==42) { E4.remove(KNB1);  }
            if(objnum==43) { E4.remove(BB1);  }
            if(objnum==44) { E4.remove(QUEENB);  }
            if(objnum==45) { E4.remove(KINGB);  }
            if(objnum==46) { E4.remove(BB2);  }
            if(objnum==47) { E4.remove(KNB2);  }
            if(objnum==48) { E4.remove(RB2);  } }
        if (xs==4 & ys==6) {
            if(objnum==11) { E5.remove(PW1);  }
            if(objnum==12) { E5.remove(PW2);  }
            if(objnum==13) { E5.remove(PW3);  }
            if(objnum==14) { E5.remove(PW4);  }
            if(objnum==15) { E5.remove(PW5);  }
            if(objnum==16) { E5.remove(PW6);  }
            if(objnum==17) { E5.remove(PW7);  }
            if(objnum==18) { E5.remove(PW8);  }
            if(objnum==21) { E5.remove(PB1);  }
            if(objnum==22) { E5.remove(PB2);  }
            if(objnum==23) { E5.remove(PB3);  }
            if(objnum==24) { E5.remove(PB4);  }
            if(objnum==25) { E5.remove(PB5);  }
            if(objnum==26) { E5.remove(PB6);  }
            if(objnum==27) { E5.remove(PB7);  }
            if(objnum==28) { E5.remove(PB8);  }
            if(objnum==31) { E5.remove(RW1);  }
            if(objnum==32) { E5.remove(KNW1);  }
            if(objnum==33) { E5.remove(BW1);  }
            if(objnum==34) { E5.remove(QUEENW);  }
            if(objnum==35) { E5.remove(KINGW);  }
            if(objnum==36) { E5.remove(BW2);  }
            if(objnum==37) { E5.remove(KNW2);  }
            if(objnum==38) { E5.remove(RW2);  }
            if(objnum==41) { E5.remove(RB1);  }
            if(objnum==42) { E5.remove(KNB1);  }
            if(objnum==43) { E5.remove(BB1);  }
            if(objnum==44) { E5.remove(QUEENB);  }
            if(objnum==45) { E5.remove(KINGB);  }
            if(objnum==46) { E5.remove(BB2);  }
            if(objnum==47) { E5.remove(KNB2);  }
            if(objnum==48) { E5.remove(RB2);  } }
        if (xs==4 & ys==7) {
            if(objnum==11) { E6.remove(PW1);  }
            if(objnum==12) { E6.remove(PW2);  }
            if(objnum==13) { E6.remove(PW3);  }
            if(objnum==14) { E6.remove(PW4);  }
            if(objnum==15) { E6.remove(PW5);  }
            if(objnum==16) { E6.remove(PW6);  }
            if(objnum==17) { E6.remove(PW7);  }
            if(objnum==18) { E6.remove(PW8);  }
            if(objnum==21) { E6.remove(PB1);  }
            if(objnum==22) { E6.remove(PB2);  }
            if(objnum==23) { E6.remove(PB3);  }
            if(objnum==24) { E6.remove(PB4);  }
            if(objnum==25) { E6.remove(PB5);  }
            if(objnum==26) { E6.remove(PB6);  }
            if(objnum==27) { E6.remove(PB7);  }
            if(objnum==28) { E6.remove(PB8);  }
            if(objnum==31) { E6.remove(RW1);  }
            if(objnum==32) { E6.remove(KNW1);  }
            if(objnum==33) { E6.remove(BW1);  }
            if(objnum==34) { E6.remove(QUEENW);  }
            if(objnum==35) { E6.remove(KINGW);  }
            if(objnum==36) { E6.remove(BW2);  }
            if(objnum==37) { E6.remove(KNW2);  }
            if(objnum==38) { E6.remove(RW2);  }
            if(objnum==41) { E6.remove(RB1);  }
            if(objnum==42) { E6.remove(KNB1);  }
            if(objnum==43) { E6.remove(BB1);  }
            if(objnum==44) { E6.remove(QUEENB);  }
            if(objnum==45) { E6.remove(KINGB);  }
            if(objnum==46) { E6.remove(BB2);  }
            if(objnum==47) { E6.remove(KNB2);  }
            if(objnum==48) { E6.remove(RB2);  }  }
        if (xs==4 & ys==8) {
            if(objnum==11) { E7.remove(PW1);  }
            if(objnum==12) { E7.remove(PW2);  }
            if(objnum==13) { E7.remove(PW3);  }
            if(objnum==14) { E7.remove(PW4);  }
            if(objnum==15) { E7.remove(PW5);  }
            if(objnum==16) { E7.remove(PW6);  }
            if(objnum==17) { E7.remove(PW7);  }
            if(objnum==18) { E7.remove(PW8);  }
            if(objnum==21) { E7.remove(PB1);  }
            if(objnum==22) { E7.remove(PB2);  }
            if(objnum==23) { E7.remove(PB3);  }
            if(objnum==24) { E7.remove(PB4);  }
            if(objnum==25) { E7.remove(PB5);  }
            if(objnum==26) { E7.remove(PB6);  }
            if(objnum==27) { E7.remove(PB7);  }
            if(objnum==28) { E7.remove(PB8);  }
            if(objnum==31) { E7.remove(RW1);  }
            if(objnum==32) { E7.remove(KNW1);  }
            if(objnum==33) { E7.remove(BW1);  }
            if(objnum==34) { E7.remove(QUEENW);  }
            if(objnum==35) { E7.remove(KINGW);  }
            if(objnum==36) { E7.remove(BW2);  }
            if(objnum==37) { E7.remove(KNW2);  }
            if(objnum==38) { E7.remove(RW2);  }
            if(objnum==41) { E7.remove(RB1);  }
            if(objnum==42) { E7.remove(KNB1);  }
            if(objnum==43) { E7.remove(BB1);  }
            if(objnum==44) { E7.remove(QUEENB);  }
            if(objnum==45) { E7.remove(KINGB);  }
            if(objnum==46) { E7.remove(BB2);  }
            if(objnum==47) { E7.remove(KNB2);  }
            if(objnum==48) { E7.remove(RB2);  } }
        if (xs==5 & ys==1) {
            if(objnum==11) { F0.remove(PW1);  }
            if(objnum==12) { F0.remove(PW2);  }
            if(objnum==13) { F0.remove(PW3);  }
            if(objnum==14) { F0.remove(PW4);  }
            if(objnum==15) { F0.remove(PW5);  }
            if(objnum==16) { F0.remove(PW6);  }
            if(objnum==17) { F0.remove(PW7);  }
            if(objnum==18) { F0.remove(PW8);  }
            if(objnum==21) { F0.remove(PB1);  }
            if(objnum==22) { F0.remove(PB2);  }
            if(objnum==23) { F0.remove(PB3);  }
            if(objnum==24) { F0.remove(PB4);  }
            if(objnum==25) { F0.remove(PB5);  }
            if(objnum==26) { F0.remove(PB6);  }
            if(objnum==27) { F0.remove(PB7);  }
            if(objnum==28) { F0.remove(PB8);  }
            if(objnum==31) { F0.remove(RW1);  }
            if(objnum==32) { F0.remove(KNW1);  }
            if(objnum==33) { F0.remove(BW1);  }
            if(objnum==34) { F0.remove(QUEENW);  }
            if(objnum==35) { F0.remove(KINGW);  }
            if(objnum==36) { F0.remove(BW2);  }
            if(objnum==37) { F0.remove(KNW2);  }
            if(objnum==38) { F0.remove(RW2);  }
            if(objnum==41) { F0.remove(RB1);  }
            if(objnum==42) { F0.remove(KNB1);  }
            if(objnum==43) { F0.remove(BB1);  }
            if(objnum==44) { F0.remove(QUEENB);  }
            if(objnum==45) { F0.remove(KINGB);  }
            if(objnum==46) { F0.remove(BB2);  }
            if(objnum==47) { F0.remove(KNB2);  }
            if(objnum==48) { F0.remove(RB2);  } }
        if (xs==5 & ys==2) {
            if(objnum==11) { F1.remove(PW1);  }
            if(objnum==12) { F1.remove(PW2);  }
            if(objnum==13) { F1.remove(PW3);  }
            if(objnum==14) { F1.remove(PW4);  }
            if(objnum==15) { F1.remove(PW5);  }
            if(objnum==16) { F1.remove(PW6);  }
            if(objnum==17) { F1.remove(PW7);  }
            if(objnum==18) { F1.remove(PW8);  }
            if(objnum==21) { F1.remove(PB1);  }
            if(objnum==22) { F1.remove(PB2);  }
            if(objnum==23) { F1.remove(PB3);  }
            if(objnum==24) { F1.remove(PB4);  }
            if(objnum==25) { F1.remove(PB5);  }
            if(objnum==26) { F1.remove(PB6);  }
            if(objnum==27) { F1.remove(PB7);  }
            if(objnum==28) { F1.remove(PB8);  }
            if(objnum==31) { F1.remove(RW1);  }
            if(objnum==32) { F1.remove(KNW1);  }
            if(objnum==33) { F1.remove(BW1);  }
            if(objnum==34) { F1.remove(QUEENW);  }
            if(objnum==35) { F1.remove(KINGW);  }
            if(objnum==36) { F1.remove(BW2);  }
            if(objnum==37) { F1.remove(KNW2);  }
            if(objnum==38) { F1.remove(RW2);  }
            if(objnum==41) { F1.remove(RB1);  }
            if(objnum==42) { F1.remove(KNB1);  }
            if(objnum==43) { F1.remove(BB1);  }
            if(objnum==44) { F1.remove(QUEENB);  }
            if(objnum==45) { F1.remove(KINGB);  }
            if(objnum==46) { F1.remove(BB2);  }
            if(objnum==47) { F1.remove(KNB2);  }
            if(objnum==48) { F1.remove(RB2);  } }
        if (xs==5 & ys==3) {
            if(objnum==11) { F2.remove(PW1);  }
            if(objnum==12) { F2.remove(PW2);  }
            if(objnum==13) { F2.remove(PW3);  }
            if(objnum==14) { F2.remove(PW4);  }
            if(objnum==15) { F2.remove(PW5);  }
            if(objnum==16) { F2.remove(PW6);  }
            if(objnum==17) { F2.remove(PW7);  }
            if(objnum==18) { F2.remove(PW8);  }
            if(objnum==21) { F2.remove(PB1);  }
            if(objnum==22) { F2.remove(PB2);  }
            if(objnum==23) { F2.remove(PB3);  }
            if(objnum==24) { F2.remove(PB4);  }
            if(objnum==25) { F2.remove(PB5);  }
            if(objnum==26) { F2.remove(PB6);  }
            if(objnum==27) { F2.remove(PB7);  }
            if(objnum==28) { F2.remove(PB8);  }
            if(objnum==31) { F2.remove(RW1);  }
            if(objnum==32) { F2.remove(KNW1);  }
            if(objnum==33) { F2.remove(BW1);  }
            if(objnum==34) { F2.remove(QUEENW);  }
            if(objnum==35) { F2.remove(KINGW);  }
            if(objnum==36) { F2.remove(BW2);  }
            if(objnum==37) { F2.remove(KNW2);  }
            if(objnum==38) { F2.remove(RW2);  }
            if(objnum==41) { F2.remove(RB1);  }
            if(objnum==42) { F2.remove(KNB1);  }
            if(objnum==43) { F2.remove(BB1);  }
            if(objnum==44) { F2.remove(QUEENB);  }
            if(objnum==45) { F2.remove(KINGB);  }
            if(objnum==46) { F2.remove(BB2);  }
            if(objnum==47) { F2.remove(KNB2);  }
            if(objnum==48) { F2.remove(RB2);  } }
        if (xs==5 & ys==4) {
            if(objnum==11) { F3.remove(PW1);  }
            if(objnum==12) { F3.remove(PW2);  }
            if(objnum==13) { F3.remove(PW3);  }
            if(objnum==14) { F3.remove(PW4);  }
            if(objnum==15) { F3.remove(PW5);  }
            if(objnum==16) { F3.remove(PW6);  }
            if(objnum==17) { F3.remove(PW7);  }
            if(objnum==18) { F3.remove(PW8);  }
            if(objnum==21) { F3.remove(PB1);  }
            if(objnum==22) { F3.remove(PB2);  }
            if(objnum==23) { F3.remove(PB3);  }
            if(objnum==24) { F3.remove(PB4);  }
            if(objnum==25) { F3.remove(PB5);  }
            if(objnum==26) { F3.remove(PB6);  }
            if(objnum==27) { F3.remove(PB7);  }
            if(objnum==28) { F3.remove(PB8);  }
            if(objnum==31) { F3.remove(RW1);  }
            if(objnum==32) { F3.remove(KNW1);  }
            if(objnum==33) { F3.remove(BW1);  }
            if(objnum==34) { F3.remove(QUEENW);  }
            if(objnum==35) { F3.remove(KINGW);  }
            if(objnum==36) { F3.remove(BW2);  }
            if(objnum==37) { F3.remove(KNW2);  }
            if(objnum==38) { F3.remove(RW2);  }
            if(objnum==41) { F3.remove(RB1);  }
            if(objnum==42) { F3.remove(KNB1);  }
            if(objnum==43) { F3.remove(BB1);  }
            if(objnum==44) { F3.remove(QUEENB);  }
            if(objnum==45) { F3.remove(KINGB);  }
            if(objnum==46) { F3.remove(BB2);  }
            if(objnum==47) { F3.remove(KNB2);  }
            if(objnum==48) { F3.remove(RB2);  }
        }
        if (xs==5 & ys==5) {
            if(objnum==11) { F4.remove(PW1);  }
            if(objnum==12) { F4.remove(PW2);  }
            if(objnum==13) { F4.remove(PW3);  }
            if(objnum==14) { F4.remove(PW4);  }
            if(objnum==15) { F4.remove(PW5);  }
            if(objnum==16) { F4.remove(PW6);  }
            if(objnum==17) { F4.remove(PW7);  }
            if(objnum==18) { F4.remove(PW8);  }
            if(objnum==21) { F4.remove(PB1);  }
            if(objnum==22) { F4.remove(PB2);  }
            if(objnum==23) { F4.remove(PB3);  }
            if(objnum==24) { F4.remove(PB4);  }
            if(objnum==25) { F4.remove(PB5);  }
            if(objnum==26) { F4.remove(PB6);  }
            if(objnum==27) { F4.remove(PB7);  }
            if(objnum==28) { F4.remove(PB8);  }
            if(objnum==31) { F4.remove(RW1);  }
            if(objnum==32) { F4.remove(KNW1);  }
            if(objnum==33) { F4.remove(BW1);  }
            if(objnum==34) { F4.remove(QUEENW);  }
            if(objnum==35) { F4.remove(KINGW);  }
            if(objnum==36) { F4.remove(BW2);  }
            if(objnum==37) { F4.remove(KNW2);  }
            if(objnum==38) { F4.remove(RW2);  }
            if(objnum==41) { F4.remove(RB1);  }
            if(objnum==42) { F4.remove(KNB1);  }
            if(objnum==43) { F4.remove(BB1);  }
            if(objnum==44) { F4.remove(QUEENB);  }
            if(objnum==45) { F4.remove(KINGB);  }
            if(objnum==46) { F4.remove(BB2);  }
            if(objnum==47) { F4.remove(KNB2);  }
            if(objnum==48) { F4.remove(RB2);  }
        }
        if (xs==5 & ys==6) {
            if(objnum==11) { F5.remove(PW1);  }
            if(objnum==12) { F5.remove(PW2);  }
            if(objnum==13) { F5.remove(PW3);  }
            if(objnum==14) { F5.remove(PW4);  }
            if(objnum==15) { F5.remove(PW5);  }
            if(objnum==16) { F5.remove(PW6);  }
            if(objnum==17) { F5.remove(PW7);  }
            if(objnum==18) { F5.remove(PW8);  }
            if(objnum==21) { F5.remove(PB1);  }
            if(objnum==22) { F5.remove(PB2);  }
            if(objnum==23) { F5.remove(PB3);  }
            if(objnum==24) { F5.remove(PB4);  }
            if(objnum==25) { F5.remove(PB5);  }
            if(objnum==26) { F5.remove(PB6);  }
            if(objnum==27) { F5.remove(PB7);  }
            if(objnum==28) { F5.remove(PB8);  }
            if(objnum==31) { F5.remove(RW1);  }
            if(objnum==32) { F5.remove(KNW1);  }
            if(objnum==33) { F5.remove(BW1);  }
            if(objnum==34) { F5.remove(QUEENW);  }
            if(objnum==35) { F5.remove(KINGW);  }
            if(objnum==36) { F5.remove(BW2);  }
            if(objnum==37) { F5.remove(KNW2);  }
            if(objnum==38) { F5.remove(RW2);  }
            if(objnum==41) { F5.remove(RB1);  }
            if(objnum==42) { F5.remove(KNB1);  }
            if(objnum==43) { F5.remove(BB1);  }
            if(objnum==44) { F5.remove(QUEENB);  }
            if(objnum==45) { F5.remove(KINGB);  }
            if(objnum==46) { F5.remove(BB2);  }
            if(objnum==47) { F5.remove(KNB2);  }
            if(objnum==48) { F5.remove(RB2);  }
        }
        if (xs==5 & ys==7) {
            if(objnum==11) { F6.remove(PW1);  }
            if(objnum==12) { F6.remove(PW2);  }
            if(objnum==13) { F6.remove(PW3);  }
            if(objnum==14) { F6.remove(PW4);  }
            if(objnum==15) { F6.remove(PW5);  }
            if(objnum==16) { F6.remove(PW6);  }
            if(objnum==17) { F6.remove(PW7);  }
            if(objnum==18) { F6.remove(PW8);  }
            if(objnum==21) { F6.remove(PB1);  }
            if(objnum==22) { F6.remove(PB2);  }
            if(objnum==23) { F6.remove(PB3);  }
            if(objnum==24) { F6.remove(PB4);  }
            if(objnum==25) { F6.remove(PB5);  }
            if(objnum==26) { F6.remove(PB6);  }
            if(objnum==27) { F6.remove(PB7);  }
            if(objnum==28) { F6.remove(PB8);  }
            if(objnum==31) { F6.remove(RW1);  }
            if(objnum==32) { F6.remove(KNW1);  }
            if(objnum==33) { F6.remove(BW1);  }
            if(objnum==34) { F6.remove(QUEENW);  }
            if(objnum==35) { F6.remove(KINGW);  }
            if(objnum==36) { F6.remove(BW2);  }
            if(objnum==37) { F6.remove(KNW2);  }
            if(objnum==38) { F6.remove(RW2);  }
            if(objnum==41) { F6.remove(RB1);  }
            if(objnum==42) { F6.remove(KNB1);  }
            if(objnum==43) { F6.remove(BB1);  }
            if(objnum==44) { F6.remove(QUEENB);  }
            if(objnum==45) { F6.remove(KINGB);  }
            if(objnum==46) { F6.remove(BB2);  }
            if(objnum==47) { F6.remove(KNB2);  }
            if(objnum==48) { F6.remove(RB2);  }
        }
        if (xs==5 & ys==8) {
            if(objnum==11) { F7.remove(PW1);  }
            if(objnum==12) { F7.remove(PW2);  }
            if(objnum==13) { F7.remove(PW3);  }
            if(objnum==14) { F7.remove(PW4);  }
            if(objnum==15) { F7.remove(PW5);  }
            if(objnum==16) { F7.remove(PW6);  }
            if(objnum==17) { F7.remove(PW7);  }
            if(objnum==18) { F7.remove(PW8);  }
            if(objnum==21) { F7.remove(PB1);  }
            if(objnum==22) { F7.remove(PB2);  }
            if(objnum==23) { F7.remove(PB3);  }
            if(objnum==24) { F7.remove(PB4);  }
            if(objnum==25) { F7.remove(PB5);  }
            if(objnum==26) { F7.remove(PB6);  }
            if(objnum==27) { F7.remove(PB7);  }
            if(objnum==28) { F7.remove(PB8);  }
            if(objnum==31) { F7.remove(RW1);  }
            if(objnum==32) { F7.remove(KNW1);  }
            if(objnum==33) { F7.remove(BW1);  }
            if(objnum==34) { F7.remove(QUEENW);  }
            if(objnum==35) { F7.remove(KINGW);  }
            if(objnum==36) { F7.remove(BW2);  }
            if(objnum==37) { F7.remove(KNW2);  }
            if(objnum==38) { F7.remove(RW2);  }
            if(objnum==41) { F7.remove(RB1);  }
            if(objnum==42) { F7.remove(KNB1);  }
            if(objnum==43) { F7.remove(BB1);  }
            if(objnum==44) { F7.remove(QUEENB);  }
            if(objnum==45) { F7.remove(KINGB);  }
            if(objnum==46) { F7.remove(BB2);  }
            if(objnum==47) { F7.remove(KNB2);  }
            if(objnum==48) { F7.remove(RB2);  }  }
        if (xs==6 & ys==1) {
            if(objnum==11) { G0.remove(PW1);  }
            if(objnum==12) { G0.remove(PW2);  }
            if(objnum==13) { G0.remove(PW3);  }
            if(objnum==14) { G0.remove(PW4);  }
            if(objnum==15) { G0.remove(PW5);  }
            if(objnum==16) { G0.remove(PW6);  }
            if(objnum==17) { G0.remove(PW7);  }
            if(objnum==18) { G0.remove(PW8);  }
            if(objnum==21) { G0.remove(PB1);  }
            if(objnum==22) { G0.remove(PB2);  }
            if(objnum==23) { G0.remove(PB3);  }
            if(objnum==24) { G0.remove(PB4);  }
            if(objnum==25) { G0.remove(PB5);  }
            if(objnum==26) { G0.remove(PB6);  }
            if(objnum==27) { G0.remove(PB7);  }
            if(objnum==28) { G0.remove(PB8);  }
            if(objnum==31) { G0.remove(RW1);  }
            if(objnum==32) { G0.remove(KNW1);  }
            if(objnum==33) { G0.remove(BW1);  }
            if(objnum==34) { G0.remove(QUEENW);  }
            if(objnum==35) { G0.remove(KINGW);  }
            if(objnum==36) { G0.remove(BW2);  }
            if(objnum==37) { G0.remove(KNW2);  }
            if(objnum==38) { G0.remove(RW2);  }
            if(objnum==41) { G0.remove(RB1);  }
            if(objnum==42) { G0.remove(KNB1);  }
            if(objnum==43) { G0.remove(BB1);  }
            if(objnum==44) { G0.remove(QUEENB);  }
            if(objnum==45) { G0.remove(KINGB);  }
            if(objnum==46) { G0.remove(BB2);  }
            if(objnum==47) { G0.remove(KNB2);  }
            if(objnum==48) { G0.remove(RB2);  }  }
        if (xs==6 & ys==2) {
            if(objnum==11) { G1.remove(PW1);  }
            if(objnum==12) { G1.remove(PW2);  }
            if(objnum==13) { G1.remove(PW3);  }
            if(objnum==14) { G1.remove(PW4);  }
            if(objnum==15) { G1.remove(PW5);  }
            if(objnum==16) { G1.remove(PW6);  }
            if(objnum==17) { G1.remove(PW7);  }
            if(objnum==18) { G1.remove(PW8);  }
            if(objnum==21) { G1.remove(PB1);  }
            if(objnum==22) { G1.remove(PB2);  }
            if(objnum==23) { G1.remove(PB3);  }
            if(objnum==24) { G1.remove(PB4);  }
            if(objnum==25) { G1.remove(PB5);  }
            if(objnum==26) { G1.remove(PB6);  }
            if(objnum==27) { G1.remove(PB7);  }
            if(objnum==28) { G1.remove(PB8);  }
            if(objnum==31) { G1.remove(RW1);  }
            if(objnum==32) { G1.remove(KNW1);  }
            if(objnum==33) { G1.remove(BW1);  }
            if(objnum==34) { G1.remove(QUEENW);  }
            if(objnum==35) { G1.remove(KINGW);  }
            if(objnum==36) { G1.remove(BW2);  }
            if(objnum==37) { G1.remove(KNW2);  }
            if(objnum==38) { G1.remove(RW2);  }
            if(objnum==41) { G1.remove(RB1);  }
            if(objnum==42) { G1.remove(KNB1);  }
            if(objnum==43) { G1.remove(BB1);  }
            if(objnum==44) { G1.remove(QUEENB);  }
            if(objnum==45) { G1.remove(KINGB);  }
            if(objnum==46) { G1.remove(BB2);  }
            if(objnum==47) { G1.remove(KNB2);  }
            if(objnum==48) { G1.remove(RB2);  }  }
        if (xs==6 & ys==3) {
            if(objnum==11) { G2.remove(PW1);  }
            if(objnum==12) { G2.remove(PW2);  }
            if(objnum==13) { G2.remove(PW3);  }
            if(objnum==14) { G2.remove(PW4);  }
            if(objnum==15) { G2.remove(PW5);  }
            if(objnum==16) { G2.remove(PW6);  }
            if(objnum==17) { G2.remove(PW7);  }
            if(objnum==18) { G2.remove(PW8);  }
            if(objnum==21) { G2.remove(PB1);  }
            if(objnum==22) { G2.remove(PB2);  }
            if(objnum==23) { G2.remove(PB3);  }
            if(objnum==24) { G2.remove(PB4);  }
            if(objnum==25) { G2.remove(PB5);  }
            if(objnum==26) { G2.remove(PB6);  }
            if(objnum==27) { G2.remove(PB7);  }
            if(objnum==28) { G2.remove(PB8);  }
            if(objnum==31) { G2.remove(RW1);  }
            if(objnum==32) { G2.remove(KNW1);  }
            if(objnum==33) { G2.remove(BW1);  }
            if(objnum==34) { G2.remove(QUEENW);  }
            if(objnum==35) { G2.remove(KINGW);  }
            if(objnum==36) { G2.remove(BW2);  }
            if(objnum==37) { G2.remove(KNW2);  }
            if(objnum==38) { G2.remove(RW2);  }
            if(objnum==41) { G2.remove(RB1);  }
            if(objnum==42) { G2.remove(KNB1);  }
            if(objnum==43) { G2.remove(BB1);  }
            if(objnum==44) { G2.remove(QUEENB);  }
            if(objnum==45) { G2.remove(KINGB);  }
            if(objnum==46) { G2.remove(BB2);  }
            if(objnum==47) { G2.remove(KNB2);  }
            if(objnum==48) { G2.remove(RB2);  }  }
        if (xs==6 & ys==4) {
            if(objnum==11) { G3.remove(PW1);  }
            if(objnum==12) { G3.remove(PW2);  }
            if(objnum==13) { G3.remove(PW3);  }
            if(objnum==14) { G3.remove(PW4);  }
            if(objnum==15) { G3.remove(PW5);  }
            if(objnum==16) { G3.remove(PW6);  }
            if(objnum==17) { G3.remove(PW7);  }
            if(objnum==18) { G3.remove(PW8);  }
            if(objnum==21) { G3.remove(PB1);  }
            if(objnum==22) { G3.remove(PB2);  }
            if(objnum==23) { G3.remove(PB3);  }
            if(objnum==24) { G3.remove(PB4);  }
            if(objnum==25) { G3.remove(PB5);  }
            if(objnum==26) { G3.remove(PB6);  }
            if(objnum==27) { G3.remove(PB7);  }
            if(objnum==28) { G3.remove(PB8);  }
            if(objnum==31) { G3.remove(RW1);  }
            if(objnum==32) { G3.remove(KNW1);  }
            if(objnum==33) { G3.remove(BW1);  }
            if(objnum==34) { G3.remove(QUEENW);  }
            if(objnum==35) { G3.remove(KINGW);  }
            if(objnum==36) { G3.remove(BW2);  }
            if(objnum==37) { G3.remove(KNW2);  }
            if(objnum==38) { G3.remove(RW2);  }
            if(objnum==41) { G3.remove(RB1);  }
            if(objnum==42) { G3.remove(KNB1);  }
            if(objnum==43) { G3.remove(BB1);  }
            if(objnum==44) { G3.remove(QUEENB);  }
            if(objnum==45) { G3.remove(KINGB);  }
            if(objnum==46) { G3.remove(BB2);  }
            if(objnum==47) { G3.remove(KNB2);  }
            if(objnum==48) { G3.remove(RB2);  }  }
        if (xs==6 & ys==5) {
            if(objnum==11) { G4.remove(PW1);  }
            if(objnum==12) { G4.remove(PW2);  }
            if(objnum==13) { G4.remove(PW3);  }
            if(objnum==14) { G4.remove(PW4);  }
            if(objnum==15) { G4.remove(PW5);  }
            if(objnum==16) { G4.remove(PW6);  }
            if(objnum==17) { G4.remove(PW7);  }
            if(objnum==18) { G4.remove(PW8);  }
            if(objnum==21) { G4.remove(PB1);  }
            if(objnum==22) { G4.remove(PB2);  }
            if(objnum==23) { G4.remove(PB3);  }
            if(objnum==24) { G4.remove(PB4);  }
            if(objnum==25) { G4.remove(PB5);  }
            if(objnum==26) { G4.remove(PB6);  }
            if(objnum==27) { G4.remove(PB7);  }
            if(objnum==28) { G4.remove(PB8);  }
            if(objnum==31) { G4.remove(RW1);  }
            if(objnum==32) { G4.remove(KNW1);  }
            if(objnum==33) { G4.remove(BW1);  }
            if(objnum==34) { G4.remove(QUEENW);  }
            if(objnum==35) { G4.remove(KINGW);  }
            if(objnum==36) { G4.remove(BW2);  }
            if(objnum==37) { G4.remove(KNW2);  }
            if(objnum==38) { G4.remove(RW2);  }
            if(objnum==41) { G4.remove(RB1);  }
            if(objnum==42) { G4.remove(KNB1);  }
            if(objnum==43) { G4.remove(BB1);  }
            if(objnum==44) { G4.remove(QUEENB);  }
            if(objnum==45) { G4.remove(KINGB);  }
            if(objnum==46) { G4.remove(BB2);  }
            if(objnum==47) { G4.remove(KNB2);  }
            if(objnum==48) { G4.remove(RB2);  }  }
        if (xs==6 & ys==6) {
            if(objnum==11) { G5.remove(PW1);  }
            if(objnum==12) { G5.remove(PW2);  }
            if(objnum==13) { G5.remove(PW3);  }
            if(objnum==14) { G5.remove(PW4);  }
            if(objnum==15) { G5.remove(PW5);  }
            if(objnum==16) { G5.remove(PW6);  }
            if(objnum==17) { G5.remove(PW7);  }
            if(objnum==18) { G5.remove(PW8);  }
            if(objnum==21) { G5.remove(PB1);  }
            if(objnum==22) { G5.remove(PB2);  }
            if(objnum==23) { G5.remove(PB3);  }
            if(objnum==24) { G5.remove(PB4);  }
            if(objnum==25) { G5.remove(PB5);  }
            if(objnum==26) { G5.remove(PB6);  }
            if(objnum==27) { G5.remove(PB7);  }
            if(objnum==28) { G5.remove(PB8);  }
            if(objnum==31) { G5.remove(RW1);  }
            if(objnum==32) { G5.remove(KNW1);  }
            if(objnum==33) { G5.remove(BW1);  }
            if(objnum==34) { G5.remove(QUEENW);  }
            if(objnum==35) { G5.remove(KINGW);  }
            if(objnum==36) { G5.remove(BW2);  }
            if(objnum==37) { G5.remove(KNW2);  }
            if(objnum==38) { G5.remove(RW2);  }
            if(objnum==41) { G5.remove(RB1);  }
            if(objnum==42) { G5.remove(KNB1);  }
            if(objnum==43) { G5.remove(BB1);  }
            if(objnum==44) { G5.remove(QUEENB);  }
            if(objnum==45) { G5.remove(KINGB);  }
            if(objnum==46) { G5.remove(BB2);  }
            if(objnum==47) { G5.remove(KNB2);  }
            if(objnum==48) { G5.remove(RB2);  }  }
        if (xs==6 & ys==7) {
            if(objnum==11) { G6.remove(PW1);  }
            if(objnum==12) { G6.remove(PW2);  }
            if(objnum==13) { G6.remove(PW3);  }
            if(objnum==14) { G6.remove(PW4);  }
            if(objnum==15) { G6.remove(PW5);  }
            if(objnum==16) { G6.remove(PW6);  }
            if(objnum==17) { G6.remove(PW7);  }
            if(objnum==18) { G6.remove(PW8);  }
            if(objnum==21) { G6.remove(PB1);  }
            if(objnum==22) { G6.remove(PB2);  }
            if(objnum==23) { G6.remove(PB3);  }
            if(objnum==24) { G6.remove(PB4);  }
            if(objnum==25) { G6.remove(PB5);  }
            if(objnum==26) { G6.remove(PB6);  }
            if(objnum==27) { G6.remove(PB7);  }
            if(objnum==28) { G6.remove(PB8);  }
            if(objnum==31) { G6.remove(RW1);  }
            if(objnum==32) { G6.remove(KNW1);  }
            if(objnum==33) { G6.remove(BW1);  }
            if(objnum==34) { G6.remove(QUEENW);  }
            if(objnum==35) { G6.remove(KINGW);  }
            if(objnum==36) { G6.remove(BW2);  }
            if(objnum==37) { G6.remove(KNW2);  }
            if(objnum==38) { G6.remove(RW2);  }
            if(objnum==41) { G6.remove(RB1);  }
            if(objnum==42) { G6.remove(KNB1);  }
            if(objnum==43) { G6.remove(BB1);  }
            if(objnum==44) { G6.remove(QUEENB);  }
            if(objnum==45) { G6.remove(KINGB);  }
            if(objnum==46) { G6.remove(BB2);  }
            if(objnum==47) { G6.remove(KNB2);  }
            if(objnum==48) { G6.remove(RB2);  }   }
        if (xs==6 & ys==8) {
            if(objnum==11) { G7.remove(PW1);  }
            if(objnum==12) { G7.remove(PW2);  }
            if(objnum==13) { G7.remove(PW3);  }
            if(objnum==14) { G7.remove(PW4);  }
            if(objnum==15) { G7.remove(PW5);  }
            if(objnum==16) { G7.remove(PW6);  }
            if(objnum==17) { G7.remove(PW7);  }
            if(objnum==18) { G7.remove(PW8);  }
            if(objnum==21) { G7.remove(PB1);  }
            if(objnum==22) { G7.remove(PB2);  }
            if(objnum==23) { G7.remove(PB3);  }
            if(objnum==24) { G7.remove(PB4);  }
            if(objnum==25) { G7.remove(PB5);  }
            if(objnum==26) { G7.remove(PB6);  }
            if(objnum==27) { G7.remove(PB7);  }
            if(objnum==28) { G7.remove(PB8);  }
            if(objnum==31) { G7.remove(RW1);  }
            if(objnum==32) { G7.remove(KNW1);  }
            if(objnum==33) { G7.remove(BW1);  }
            if(objnum==34) { G7.remove(QUEENW);  }
            if(objnum==35) { G7.remove(KINGW);  }
            if(objnum==36) { G7.remove(BW2);  }
            if(objnum==37) { G7.remove(KNW2);  }
            if(objnum==38) { G7.remove(RW2);  }
            if(objnum==41) { G7.remove(RB1);  }
            if(objnum==42) { G7.remove(KNB1);  }
            if(objnum==43) { G7.remove(BB1);  }
            if(objnum==44) { G7.remove(QUEENB);  }
            if(objnum==45) { G7.remove(KINGB);  }
            if(objnum==46) { G7.remove(BB2);  }
            if(objnum==47) { G7.remove(KNB2);  }
            if(objnum==48) { G7.remove(RB2);  } }
        if (xs==7 & ys==1) {
            if(objnum==11) { H0.remove(PW1);  }
            if(objnum==12) { H0.remove(PW2);  }
            if(objnum==13) { H0.remove(PW3);  }
            if(objnum==14) { H0.remove(PW4);  }
            if(objnum==15) { H0.remove(PW5);  }
            if(objnum==16) { H0.remove(PW6);  }
            if(objnum==17) { H0.remove(PW7);  }
            if(objnum==18) { H0.remove(PW8);  }
            if(objnum==21) { H0.remove(PB1);  }
            if(objnum==22) { H0.remove(PB2);  }
            if(objnum==23) { H0.remove(PB3);  }
            if(objnum==24) { H0.remove(PB4);  }
            if(objnum==25) { H0.remove(PB5);  }
            if(objnum==26) { H0.remove(PB6);  }
            if(objnum==27) { H0.remove(PB7);  }
            if(objnum==28) { H0.remove(PB8);  }
            if(objnum==31) { H0.remove(RW1);  }
            if(objnum==32) { H0.remove(KNW1);  }
            if(objnum==33) { H0.remove(BW1);  }
            if(objnum==34) { H0.remove(QUEENW);  }
            if(objnum==35) { H0.remove(KINGW);  }
            if(objnum==36) { H0.remove(BW2);  }
            if(objnum==37) { H0.remove(KNW2);  }
            if(objnum==38) { H0.remove(RW2);  }
            if(objnum==41) { H0.remove(RB1);  }
            if(objnum==42) { H0.remove(KNB1);  }
            if(objnum==43) { H0.remove(BB1);  }
            if(objnum==44) { H0.remove(QUEENB);  }
            if(objnum==45) { H0.remove(KINGB);  }
            if(objnum==46) { H0.remove(BB2);  }
            if(objnum==47) { H0.remove(KNB2);  }
            if(objnum==48) { H0.remove(RB2);  }  }
        if (xs==7 & ys==2) {
            if(objnum==11) { H1.remove(PW1);  }
            if(objnum==12) { H1.remove(PW2);  }
            if(objnum==13) { H1.remove(PW3);  }
            if(objnum==14) { H1.remove(PW4);  }
            if(objnum==15) { H1.remove(PW5);  }
            if(objnum==16) { H1.remove(PW6);  }
            if(objnum==17) { H1.remove(PW7);  }
            if(objnum==18) { H1.remove(PW8);  }
            if(objnum==21) { H1.remove(PB1);  }
            if(objnum==22) { H1.remove(PB2);  }
            if(objnum==23) { H1.remove(PB3);  }
            if(objnum==24) { H1.remove(PB4);  }
            if(objnum==25) { H1.remove(PB5);  }
            if(objnum==26) { H1.remove(PB6);  }
            if(objnum==27) { H1.remove(PB7);  }
            if(objnum==28) { H1.remove(PB8);  }
            if(objnum==31) { H1.remove(RW1);  }
            if(objnum==32) { H1.remove(KNW1);  }
            if(objnum==33) { H1.remove(BW1);  }
            if(objnum==34) { H1.remove(QUEENW);  }
            if(objnum==35) { H1.remove(KINGW);  }
            if(objnum==36) { H1.remove(BW2);  }
            if(objnum==37) { H1.remove(KNW2);  }
            if(objnum==38) { H1.remove(RW2);  }
            if(objnum==41) { H1.remove(RB1);  }
            if(objnum==42) { H1.remove(KNB1);  }
            if(objnum==43) { H1.remove(BB1);  }
            if(objnum==44) { H1.remove(QUEENB);  }
            if(objnum==45) { H1.remove(KINGB);  }
            if(objnum==46) { H1.remove(BB2);  }
            if(objnum==47) { H1.remove(KNB2);  }
            if(objnum==48) { H1.remove(RB2);  }  }
        if (xs==7 & ys==3) {
            if(objnum==11) { H2.remove(PW1);  }
            if(objnum==12) { H2.remove(PW2);  }
            if(objnum==13) { H2.remove(PW3);  }
            if(objnum==14) { H2.remove(PW4);  }
            if(objnum==15) { H2.remove(PW5);  }
            if(objnum==16) { H2.remove(PW6);  }
            if(objnum==17) { H2.remove(PW7);  }
            if(objnum==18) { H2.remove(PW8);  }
            if(objnum==21) { H2.remove(PB1);  }
            if(objnum==22) { H2.remove(PB2);  }
            if(objnum==23) { H2.remove(PB3);  }
            if(objnum==24) { H2.remove(PB4);  }
            if(objnum==25) { H2.remove(PB5);  }
            if(objnum==26) { H2.remove(PB6);  }
            if(objnum==27) { H2.remove(PB7);  }
            if(objnum==28) { H2.remove(PB8);  }
            if(objnum==31) { H2.remove(RW1);  }
            if(objnum==32) { H2.remove(KNW1);  }
            if(objnum==33) { H2.remove(BW1);  }
            if(objnum==34) { H2.remove(QUEENW);  }
            if(objnum==35) { H2.remove(KINGW);  }
            if(objnum==36) { H2.remove(BW2);  }
            if(objnum==37) { H2.remove(KNW2);  }
            if(objnum==38) { H2.remove(RW2);  }
            if(objnum==41) { H2.remove(RB1);  }
            if(objnum==42) { H2.remove(KNB1);  }
            if(objnum==43) { H2.remove(BB1);  }
            if(objnum==44) { H2.remove(QUEENB);  }
            if(objnum==45) { H2.remove(KINGB);  }
            if(objnum==46) { H2.remove(BB2);  }
            if(objnum==47) { H2.remove(KNB2);  }
            if(objnum==48) { H2.remove(RB2);  }  }
        if (xs==7 & ys==4) {
            if(objnum==11) { H3.remove(PW1);  }
            if(objnum==12) { H3.remove(PW2);  }
            if(objnum==13) { H3.remove(PW3);  }
            if(objnum==14) { H3.remove(PW4);  }
            if(objnum==15) { H3.remove(PW5);  }
            if(objnum==16) { H3.remove(PW6);  }
            if(objnum==17) { H3.remove(PW7);  }
            if(objnum==18) { H3.remove(PW8);  }
            if(objnum==21) { H3.remove(PB1);  }
            if(objnum==22) { H3.remove(PB2);  }
            if(objnum==23) { H3.remove(PB3);  }
            if(objnum==24) { H3.remove(PB4);  }
            if(objnum==25) { H3.remove(PB5);  }
            if(objnum==26) { H3.remove(PB6);  }
            if(objnum==27) { H3.remove(PB7);  }
            if(objnum==28) { H3.remove(PB8);  }
            if(objnum==31) { H3.remove(RW1);  }
            if(objnum==32) { H3.remove(KNW1);  }
            if(objnum==33) { H3.remove(BW1);  }
            if(objnum==34) { H3.remove(QUEENW);  }
            if(objnum==35) { H3.remove(KINGW);  }
            if(objnum==36) { H3.remove(BW2);  }
            if(objnum==37) { H3.remove(KNW2);  }
            if(objnum==38) { H3.remove(RW2);  }
            if(objnum==41) { H3.remove(RB1);  }
            if(objnum==42) { H3.remove(KNB1);  }
            if(objnum==43) { H3.remove(BB1);  }
            if(objnum==44) { H3.remove(QUEENB);  }
            if(objnum==45) { H3.remove(KINGB);  }
            if(objnum==46) { H3.remove(BB2);  }
            if(objnum==47) { H3.remove(KNB2);  }
            if(objnum==48) { H3.remove(RB2);  }  }
        if (xs==7 & ys==5) {
            if(objnum==11) { H4.remove(PW1);  }
            if(objnum==12) { H4.remove(PW2);  }
            if(objnum==13) { H4.remove(PW3);  }
            if(objnum==14) { H4.remove(PW4);  }
            if(objnum==15) { H4.remove(PW5);  }
            if(objnum==16) { H4.remove(PW6);  }
            if(objnum==17) { H4.remove(PW7);  }
            if(objnum==18) { H4.remove(PW8);  }
            if(objnum==21) { H4.remove(PB1);  }
            if(objnum==22) { H4.remove(PB2);  }
            if(objnum==23) { H4.remove(PB3);  }
            if(objnum==24) { H4.remove(PB4);  }
            if(objnum==25) { H4.remove(PB5);  }
            if(objnum==26) { H4.remove(PB6);  }
            if(objnum==27) { H4.remove(PB7);  }
            if(objnum==28) { H4.remove(PB8);  }
            if(objnum==31) { H4.remove(RW1);  }
            if(objnum==32) { H4.remove(KNW1);  }
            if(objnum==33) { H4.remove(BW1);  }
            if(objnum==34) { H4.remove(QUEENW);  }
            if(objnum==35) { H4.remove(KINGW);  }
            if(objnum==36) { H4.remove(BW2);  }
            if(objnum==37) { H4.remove(KNW2);  }
            if(objnum==38) { H4.remove(RW2);  }
            if(objnum==41) { H4.remove(RB1);  }
            if(objnum==42) { H4.remove(KNB1);  }
            if(objnum==43) { H4.remove(BB1);  }
            if(objnum==44) { H4.remove(QUEENB);  }
            if(objnum==45) { H4.remove(KINGB);  }
            if(objnum==46) { H4.remove(BB2);  }
            if(objnum==47) { H4.remove(KNB2);  }
            if(objnum==48) { H4.remove(RB2);  }  }
        if (xs==7 & ys==6) {
            if(objnum==11) { H5.remove(PW1);  }
            if(objnum==12) { H5.remove(PW2);  }
            if(objnum==13) { H5.remove(PW3);  }
            if(objnum==14) { H5.remove(PW4);  }
            if(objnum==15) { H5.remove(PW5);  }
            if(objnum==16) { H5.remove(PW6);  }
            if(objnum==17) { H5.remove(PW7);  }
            if(objnum==18) { H5.remove(PW8);  }
            if(objnum==21) { H5.remove(PB1);  }
            if(objnum==22) { H5.remove(PB2);  }
            if(objnum==23) { H5.remove(PB3);  }
            if(objnum==24) { H5.remove(PB4);  }
            if(objnum==25) { H5.remove(PB5);  }
            if(objnum==26) { H5.remove(PB6);  }
            if(objnum==27) { H5.remove(PB7);  }
            if(objnum==28) { H5.remove(PB8);  }
            if(objnum==31) { H5.remove(RW1);  }
            if(objnum==32) { H5.remove(KNW1);  }
            if(objnum==33) { H5.remove(BW1);  }
            if(objnum==34) { H5.remove(QUEENW);  }
            if(objnum==35) { H5.remove(KINGW);  }
            if(objnum==36) { H5.remove(BW2);  }
            if(objnum==37) { H5.remove(KNW2);  }
            if(objnum==38) { H5.remove(RW2);  }
            if(objnum==41) { H5.remove(RB1);  }
            if(objnum==42) { H5.remove(KNB1);  }
            if(objnum==43) { H5.remove(BB1);  }
            if(objnum==44) { H5.remove(QUEENB);  }
            if(objnum==45) { H5.remove(KINGB);  }
            if(objnum==46) { H5.remove(BB2);  }
            if(objnum==47) { H5.remove(KNB2);  }
            if(objnum==48) { H5.remove(RB2);  }  }
        if (xs==7 & ys==7) {
            if(objnum==11) { H6.remove(PW1);  }
            if(objnum==12) { H6.remove(PW2);  }
            if(objnum==13) { H6.remove(PW3);  }
            if(objnum==14) { H6.remove(PW4);  }
            if(objnum==15) { H6.remove(PW5);  }
            if(objnum==16) { H6.remove(PW6);  }
            if(objnum==17) { H6.remove(PW7);  }
            if(objnum==18) { H6.remove(PW8);  }
            if(objnum==21) { H6.remove(PB1);  }
            if(objnum==22) { H6.remove(PB2);  }
            if(objnum==23) { H6.remove(PB3);  }
            if(objnum==24) { H6.remove(PB4);  }
            if(objnum==25) { H6.remove(PB5);  }
            if(objnum==26) { H6.remove(PB6);  }
            if(objnum==27) { H6.remove(PB7);  }
            if(objnum==28) { H6.remove(PB8);  }
            if(objnum==31) { H6.remove(RW1);  }
            if(objnum==32) { H6.remove(KNW1);  }
            if(objnum==33) { H6.remove(BW1);  }
            if(objnum==34) { H6.remove(QUEENW);  }
            if(objnum==35) { H6.remove(KINGW);  }
            if(objnum==36) { H6.remove(BW2);  }
            if(objnum==37) { H6.remove(KNW2);  }
            if(objnum==38) { H6.remove(RW2);  }
            if(objnum==41) { H6.remove(RB1);  }
            if(objnum==42) { H6.remove(KNB1);  }
            if(objnum==43) { H6.remove(BB1);  }
            if(objnum==44) { H6.remove(QUEENB);  }
            if(objnum==45) { H6.remove(KINGB);  }
            if(objnum==46) { H6.remove(BB2);  }
            if(objnum==47) { H6.remove(KNB2);  }
            if(objnum==48) { H6.remove(RB2);  }  }
        if (xs==7 & ys==8) {
            if(objnum==11) { H7.remove(PW1);  }
            if(objnum==12) { H7.remove(PW2);  }
            if(objnum==13) { H7.remove(PW3);  }
            if(objnum==14) { H7.remove(PW4);  }
            if(objnum==15) { H7.remove(PW5);  }
            if(objnum==16) { H7.remove(PW6);  }
            if(objnum==17) { H7.remove(PW7);  }
            if(objnum==18) { H7.remove(PW8);  }
            if(objnum==21) { H7.remove(PB1);  }
            if(objnum==22) { H7.remove(PB2);  }
            if(objnum==23) { H7.remove(PB3);  }
            if(objnum==24) { H7.remove(PB4);  }
            if(objnum==25) { H7.remove(PB5);  }
            if(objnum==26) { H7.remove(PB6);  }
            if(objnum==27) { H7.remove(PB7);  }
            if(objnum==28) { H7.remove(PB8);  }
            if(objnum==31) { H7.remove(RW1);  }
            if(objnum==32) { H7.remove(KNW1);  }
            if(objnum==33) { H7.remove(BW1);  }
            if(objnum==34) { H7.remove(QUEENW);  }
            if(objnum==35) { H7.remove(KINGW);  }
            if(objnum==36) { H7.remove(BW2);  }
            if(objnum==37) { H7.remove(KNW2);  }
            if(objnum==38) { H7.remove(RW2);  }
            if(objnum==41) { H7.remove(RB1);  }
            if(objnum==42) { H7.remove(KNB1);  }
            if(objnum==43) { H7.remove(BB1);  }
            if(objnum==44) { H7.remove(QUEENB);  }
            if(objnum==45) { H7.remove(KINGB);  }
            if(objnum==46) { H7.remove(BB2);  }
            if(objnum==47) { H7.remove(KNB2);  }
            if(objnum==48) { H7.remove(RB2);  }
        }
    }
    
    public static void drawPiece(int xs, int ys, int objnum){
        int compoundvalue = (objnum*100)+(xs*10)+(ys);
        Namae=Integer.toString(compoundvalue);
        System.out.println("Name is "+ Namae);
        if(objnum==11) { PW1.setText(Namae); }
        if(objnum==12) { PW2.setText(Namae);  }
        if(objnum==13) { PW3.setText(Namae);  }
        if(objnum==14) { PW4.setText(Namae);  }
        if(objnum==15) { PW5.setText(Namae);  }
        if(objnum==16) { PW6.setText(Namae);  }
        if(objnum==17) { PW7.setText(Namae);  }
        if(objnum==18) { PW8.setText(Namae);  }
        if(objnum==21) { PB1.setText(Namae);  }
        if(objnum==22) { PB2.setText(Namae);  }
        if(objnum==23) { PB3.setText(Namae);  }
        if(objnum==24) { PB4.setText(Namae);  }
        if(objnum==25) { PB5.setText(Namae);  }
        if(objnum==26) { PB6.setText(Namae);  }
        if(objnum==27) { PB7.setText(Namae);  }
        if(objnum==28) { PB8.setText(Namae);  }

        if(objnum==31) { RW1.setText(Namae);  }
        if(objnum==32) { KNW1.setText(Namae);  }
        if(objnum==33) { BW1.setText(Namae);  }
        if(objnum==34) { QUEENW.setText(Namae);  }
        if(objnum==35) { KINGW.setText(Namae);  }
        if(objnum==36) { BW2.setText(Namae);  }
        if(objnum==37) { KNW2.setText(Namae);  }
        if(objnum==38) { RW2.setText(Namae);  }

        if(objnum==41) { RB1.setText(Namae);  }
        if(objnum==42) { KNB1.setText(Namae);  }
        if(objnum==43) { BB1.setText(Namae);  }
        if(objnum==44) { QUEENB.setText(Namae);  }
        if(objnum==45) { KINGB.setText(Namae);  }
        if(objnum==46) { BB2.setText(Namae);  }
        if(objnum==47) { KNB2.setText(Namae);  }
        if(objnum==48) { RB2.setText(Namae);  }
        
        if (xs==0 & ys==1) {  
            if(objnum==11) { A0.add(PW1);  }
            if(objnum==12) { A0.add(PW2);  }
            if(objnum==13) { A0.add(PW3);  }
            if(objnum==14) { A0.add(PW4);  }
            if(objnum==15) { A0.add(PW5);  }
            if(objnum==16) { A0.add(PW6);  }
            if(objnum==17) { A0.add(PW7);  }
            if(objnum==18) { A0.add(PW8);  }
            if(objnum==21) { A0.add(PB1);  }
            if(objnum==22) { A0.add(PB2);  }
            if(objnum==23) { A0.add(PB3);  }
            if(objnum==24) { A0.add(PB4);  }
            if(objnum==25) { A0.add(PB5);  }
            if(objnum==26) { A0.add(PB6);  }
            if(objnum==27) { A0.add(PB7);  }
            if(objnum==28) { A0.add(PB8);  }
            
            if(objnum==31) { A0.add(RW1);  }
            if(objnum==32) { A0.add(KNW1);  }
            if(objnum==33) { A0.add(BW1);  }
            if(objnum==34) { A0.add(QUEENW);  }
            if(objnum==35) { A0.add(KINGW);  }
            if(objnum==36) { A0.add(BW2);  }
            if(objnum==37) { A0.add(KNW2);  }
            if(objnum==38) { A0.add(RW2);  }

            if(objnum==41) { A0.add(RB1);  }
            if(objnum==42) { A0.add(KNB1);  }
            if(objnum==43) { A0.add(BB1);  }
            if(objnum==44) { A0.add(QUEENB);  }
            if(objnum==45) { A0.add(KINGB);  }
            if(objnum==46) { A0.add(BB2);  }
            if(objnum==47) { A0.add(KNB2);  }
            if(objnum==48) { A0.add(RB2);  }
        }
        if (xs==0 & ys==2) {             
            if(objnum==11) { A1.add(PW1);  }
            if(objnum==12) { A1.add(PW2);  }
            if(objnum==13) { A1.add(PW3);  }
            if(objnum==14) { A1.add(PW4);  }
            if(objnum==15) { A1.add(PW5);  }
            if(objnum==16) { A1.add(PW6);  }
            if(objnum==17) { A1.add(PW7);  }
            if(objnum==18) { A1.add(PW8);  }
            if(objnum==21) { A1.add(PB1);  }
            if(objnum==22) { A1.add(PB2);  }
            if(objnum==23) { A1.add(PB3);  }
            if(objnum==24) { A1.add(PB4);  }
            if(objnum==25) { A1.add(PB5);  }
            if(objnum==26) { A1.add(PB6);  }
            if(objnum==27) { A1.add(PB7);  }
            if(objnum==28) { A1.add(PB8);  }
            if(objnum==31) { A1.add(RW1);  }
            if(objnum==32) { A1.add(KNW1);  }
            if(objnum==33) { A1.add(BW1);  }
            if(objnum==34) { A1.add(QUEENW);  }
            if(objnum==35) { A1.add(KINGW);  }
            if(objnum==36) { A1.add(BW2);  }
            if(objnum==37) { A1.add(KNW2);  }
            if(objnum==38) { A1.add(RW2);  }
            if(objnum==41) { A1.add(RB1);  }
            if(objnum==42) { A1.add(KNB1);  }
            if(objnum==43) { A1.add(BB1);  }
            if(objnum==44) { A1.add(QUEENB);  }
            if(objnum==45) { A1.add(KINGB);  }
            if(objnum==46) { A1.add(BB2);  }
            if(objnum==47) { A1.add(KNB2);  }
            if(objnum==48) { A1.add(RB2);  }
        }
        if (xs==0 & ys==3) {
            if(objnum==11) { A2.add(PW1);  }
            if(objnum==12) { A2.add(PW2);  }
            if(objnum==13) { A2.add(PW3);  }
            if(objnum==14) { A2.add(PW4);  }
            if(objnum==15) { A2.add(PW5);  }
            if(objnum==16) { A2.add(PW6);  }
            if(objnum==17) { A2.add(PW7);  }
            if(objnum==18) { A2.add(PW8);  }
            if(objnum==21) { A2.add(PB1);  }
            if(objnum==22) { A2.add(PB2);  }
            if(objnum==23) { A2.add(PB3);  }
            if(objnum==24) { A2.add(PB4);  }
            if(objnum==25) { A2.add(PB5);  }
            if(objnum==26) { A2.add(PB6);  }
            if(objnum==27) { A2.add(PB7);  }
            if(objnum==28) { A2.add(PB8);  }
            if(objnum==31) { A2.add(RW1);  }
            if(objnum==32) { A2.add(KNW1);  }
            if(objnum==33) { A2.add(BW1);  }
            if(objnum==34) { A2.add(QUEENW);  }
            if(objnum==35) { A2.add(KINGW);  }
            if(objnum==36) { A2.add(BW2);  }
            if(objnum==37) { A2.add(KNW2);  }
            if(objnum==38) { A2.add(RW2);  }
            if(objnum==41) { A2.add(RB1);  }
            if(objnum==42) { A2.add(KNB1);  }
            if(objnum==43) { A2.add(BB1);  }
            if(objnum==44) { A2.add(QUEENB);  }
            if(objnum==45) { A2.add(KINGB);  }
            if(objnum==46) { A2.add(BB2);  }
            if(objnum==47) { A2.add(KNB2);  }
            if(objnum==48) { A2.add(RB2);  } }
        if (xs==0 & ys==4) {
            if(objnum==11) { A3.add(PW1);  }
            if(objnum==12) { A3.add(PW2);  }
            if(objnum==13) { A3.add(PW3);  }
            if(objnum==14) { A3.add(PW4);  }
            if(objnum==15) { A3.add(PW5);  }
            if(objnum==16) { A3.add(PW6);  }
            if(objnum==17) { A3.add(PW7);  }
            if(objnum==18) { A3.add(PW8);  }
            if(objnum==21) { A3.add(PB1);  }
            if(objnum==22) { A3.add(PB2);  }
            if(objnum==23) { A3.add(PB3);  }
            if(objnum==24) { A3.add(PB4);  }
            if(objnum==25) { A3.add(PB5);  }
            if(objnum==26) { A3.add(PB6);  }
            if(objnum==27) { A3.add(PB7);  }
            if(objnum==28) { A3.add(PB8);  }
            if(objnum==31) { A3.add(RW1);  }
            if(objnum==32) { A3.add(KNW1);  }
            if(objnum==33) { A3.add(BW1);  }
            if(objnum==34) { A3.add(QUEENW);  }
            if(objnum==35) { A3.add(KINGW);  }
            if(objnum==36) { A3.add(BW2);  }
            if(objnum==37) { A3.add(KNW2);  }
            if(objnum==38) { A3.add(RW2);  }
            if(objnum==41) { A3.add(RB1);  }
            if(objnum==42) { A3.add(KNB1);  }
            if(objnum==43) { A3.add(BB1);  }
            if(objnum==44) { A3.add(QUEENB);  }
            if(objnum==45) { A3.add(KINGB);  }
            if(objnum==46) { A3.add(BB2);  }
            if(objnum==47) { A3.add(KNB2);  }
            if(objnum==48) { A3.add(RB2);  } 
        }
        if (xs==0 & ys==5) {
            if(objnum==11) { A4.add(PW1);  }
            if(objnum==12) { A4.add(PW2);  }
            if(objnum==13) { A4.add(PW3);  }
            if(objnum==14) { A4.add(PW4);  }
            if(objnum==15) { A4.add(PW5);  }
            if(objnum==16) { A4.add(PW6);  }
            if(objnum==17) { A4.add(PW7);  }
            if(objnum==18) { A4.add(PW8);  }
            if(objnum==21) { A4.add(PB1);  }
            if(objnum==22) { A4.add(PB2);  }
            if(objnum==23) { A4.add(PB3);  }
            if(objnum==24) { A4.add(PB4);  }
            if(objnum==25) { A4.add(PB5);  }
            if(objnum==26) { A4.add(PB6);  }
            if(objnum==27) { A4.add(PB7);  }
            if(objnum==28) { A4.add(PB8);  }
            if(objnum==31) { A4.add(RW1);  }
            if(objnum==32) { A4.add(KNW1);  }
            if(objnum==33) { A4.add(BW1);  }
            if(objnum==34) { A4.add(QUEENW);  }
            if(objnum==35) { A4.add(KINGW);  }
            if(objnum==36) { A4.add(BW2);  }
            if(objnum==37) { A4.add(KNW2);  }
            if(objnum==38) { A4.add(RW2);  }
            if(objnum==41) { A4.add(RB1);  }
            if(objnum==42) { A4.add(KNB1);  }
            if(objnum==43) { A4.add(BB1);  }
            if(objnum==44) { A4.add(QUEENB);  }
            if(objnum==45) { A4.add(KINGB);  }
            if(objnum==46) { A4.add(BB2);  }
            if(objnum==47) { A4.add(KNB2);  }
            if(objnum==48) { A4.add(RB2);  }
        }
        if (xs==0 & ys==6) {
            if(objnum==11) { A5.add(PW1);  }
            if(objnum==12) { A5.add(PW2);  }
            if(objnum==13) { A5.add(PW3);  }
            if(objnum==14) { A5.add(PW4);  }
            if(objnum==15) { A5.add(PW5);  }
            if(objnum==16) { A5.add(PW6);  }
            if(objnum==17) { A5.add(PW7);  }
            if(objnum==18) { A5.add(PW8);  }
            if(objnum==21) { A5.add(PB1);  }
            if(objnum==22) { A5.add(PB2);  }
            if(objnum==23) { A5.add(PB3);  }
            if(objnum==24) { A5.add(PB4);  }
            if(objnum==25) { A5.add(PB5);  }
            if(objnum==26) { A5.add(PB6);  }
            if(objnum==27) { A5.add(PB7);  }
            if(objnum==28) { A5.add(PB8);  }
            if(objnum==31) { A5.add(RW1);  }
            if(objnum==32) { A5.add(KNW1);  }
            if(objnum==33) { A5.add(BW1);  }
            if(objnum==34) { A5.add(QUEENW);  }
            if(objnum==35) { A5.add(KINGW);  }
            if(objnum==36) { A5.add(BW2);  }
            if(objnum==37) { A5.add(KNW2);  }
            if(objnum==38) { A5.add(RW2);  }
            if(objnum==41) { A5.add(RB1);  }
            if(objnum==42) { A5.add(KNB1);  }
            if(objnum==43) { A5.add(BB1);  }
            if(objnum==44) { A5.add(QUEENB);  }
            if(objnum==45) { A5.add(KINGB);  }
            if(objnum==46) { A5.add(BB2);  }
            if(objnum==47) { A5.add(KNB2);  }
            if(objnum==48) { A5.add(RB2);  }}
        if (xs==0 & ys==7) {
            if(objnum==11) { A6.add(PW1);  }
            if(objnum==12) { A6.add(PW2);  }
            if(objnum==13) { A6.add(PW3);  }
            if(objnum==14) { A6.add(PW4);  }
            if(objnum==15) { A6.add(PW5);  }
            if(objnum==16) { A6.add(PW6);  }
            if(objnum==17) { A6.add(PW7);  }
            if(objnum==18) { A6.add(PW8);  }
            if(objnum==21) { A6.add(PB1);  }
            if(objnum==22) { A6.add(PB2);  }
            if(objnum==23) { A6.add(PB3);  }
            if(objnum==24) { A6.add(PB4);  }
            if(objnum==25) { A6.add(PB5);  }
            if(objnum==26) { A6.add(PB6);  }
            if(objnum==27) { A6.add(PB7);  }
            if(objnum==28) { A6.add(PB8);  }
            if(objnum==31) { A6.add(RW1);  }
            if(objnum==32) { A6.add(KNW1);  }
            if(objnum==33) { A6.add(BW1);  }
            if(objnum==34) { A6.add(QUEENW);  }
            if(objnum==35) { A6.add(KINGW);  }
            if(objnum==36) { A6.add(BW2);  }
            if(objnum==37) { A6.add(KNW2);  }
            if(objnum==38) { A6.add(RW2);  }
            if(objnum==41) { A6.add(RB1);  }
            if(objnum==42) { A6.add(KNB1);  }
            if(objnum==43) { A6.add(BB1);  }
            if(objnum==44) { A6.add(QUEENB);  }
            if(objnum==45) { A6.add(KINGB);  }
            if(objnum==46) { A6.add(BB2);  }
            if(objnum==47) { A6.add(KNB2);  }
            if(objnum==48) { A6.add(RB2);  }
        }
        if (xs==0 & ys==8) {
            if(objnum==11) { A7.add(PW1);  }
            if(objnum==12) { A7.add(PW2);  }
            if(objnum==13) { A7.add(PW3);  }
            if(objnum==14) { A7.add(PW4);  }
            if(objnum==15) { A7.add(PW5);  }
            if(objnum==16) { A7.add(PW6);  }
            if(objnum==17) { A7.add(PW7);  }
            if(objnum==18) { A7.add(PW8);  }
            if(objnum==21) { A7.add(PB1);  }
            if(objnum==22) { A7.add(PB2);  }
            if(objnum==23) { A7.add(PB3);  }
            if(objnum==24) { A7.add(PB4);  }
            if(objnum==25) { A7.add(PB5);  }
            if(objnum==26) { A7.add(PB6);  }
            if(objnum==27) { A7.add(PB7);  }
            if(objnum==28) { A7.add(PB8);  }
            if(objnum==31) { A7.add(RW1);  }
            if(objnum==32) { A7.add(KNW1);  }
            if(objnum==33) { A7.add(BW1);  }
            if(objnum==34) { A7.add(QUEENW);  }
            if(objnum==35) { A7.add(KINGW);  }
            if(objnum==36) { A7.add(BW2);  }
            if(objnum==37) { A7.add(KNW2);  }
            if(objnum==38) { A7.add(RW2);  }
            if(objnum==41) { A7.add(RB1);  }
            if(objnum==42) { A7.add(KNB1);  }
            if(objnum==43) { A7.add(BB1);  }
            if(objnum==44) { A7.add(QUEENB);  }
            if(objnum==45) { A7.add(KINGB);  }
            if(objnum==46) { A7.add(BB2);  }
            if(objnum==47) { A7.add(KNB2);  }
            if(objnum==48) { A7.add(RB2);  } 
        }
        if (xs==1 & ys==1) {
            if(objnum==11) { B0.add(PW1);  }
            if(objnum==12) { B0.add(PW2);  }
            if(objnum==13) { B0.add(PW3);  }
            if(objnum==14) { B0.add(PW4);  }
            if(objnum==15) { B0.add(PW5);  }
            if(objnum==16) { B0.add(PW6);  }
            if(objnum==17) { B0.add(PW7);  }
            if(objnum==18) { B0.add(PW8);  }
            if(objnum==21) { B0.add(PB1);  }
            if(objnum==22) { B0.add(PB2);  }
            if(objnum==23) { B0.add(PB3);  }
            if(objnum==24) { B0.add(PB4);  }
            if(objnum==25) { B0.add(PB5);  }
            if(objnum==26) { B0.add(PB6);  }
            if(objnum==27) { B0.add(PB7);  }
            if(objnum==28) { B0.add(PB8);  }
            if(objnum==31) { B0.add(RW1);  }
            if(objnum==32) { B0.add(KNW1);  }
            if(objnum==33) { B0.add(BW1);  }
            if(objnum==34) { B0.add(QUEENW);  }
            if(objnum==35) { B0.add(KINGW);  }
            if(objnum==36) { B0.add(BW2);  }
            if(objnum==37) { B0.add(KNW2);  }
            if(objnum==38) { B0.add(RW2);  }
            if(objnum==41) { B0.add(RB1);  }
            if(objnum==42) { B0.add(KNB1);  }
            if(objnum==43) { B0.add(BB1);  }
            if(objnum==44) { B0.add(QUEENB);  }
            if(objnum==45) { B0.add(KINGB);  }
            if(objnum==46) { B0.add(BB2);  }
            if(objnum==47) { B0.add(KNB2);  }
            if(objnum==48) { B0.add(RB2);  }
        }
        if (xs==1 & ys==2) {
            if(objnum==11) { B1.add(PW1);  }
            if(objnum==12) { B1.add(PW2);  }
            if(objnum==13) { B1.add(PW3);  }
            if(objnum==14) { B1.add(PW4);  }
            if(objnum==15) { B1.add(PW5);  }
            if(objnum==16) { B1.add(PW6);  }
            if(objnum==17) { B1.add(PW7);  }
            if(objnum==18) { B1.add(PW8);  }
            if(objnum==21) { B1.add(PB1);  }
            if(objnum==22) { B1.add(PB2);  }
            if(objnum==23) { B1.add(PB3);  }
            if(objnum==24) { B1.add(PB4);  }
            if(objnum==25) { B1.add(PB5);  }
            if(objnum==26) { B1.add(PB6);  }
            if(objnum==27) { B1.add(PB7);  }
            if(objnum==28) { B1.add(PB8);  }
            if(objnum==31) { B1.add(RW1);  }
            if(objnum==32) { B1.add(KNW1);  }
            if(objnum==33) { B1.add(BW1);  }
            if(objnum==34) { B1.add(QUEENW);  }
            if(objnum==35) { B1.add(KINGW);  }
            if(objnum==36) { B1.add(BW2);  }
            if(objnum==37) { B1.add(KNW2);  }
            if(objnum==38) { B1.add(RW2);  }
            if(objnum==41) { B1.add(RB1);  }
            if(objnum==42) { B1.add(KNB1);  }
            if(objnum==43) { B1.add(BB1);  }
            if(objnum==44) { B1.add(QUEENB);  }
            if(objnum==45) { B1.add(KINGB);  }
            if(objnum==46) { B1.add(BB2);  }
            if(objnum==47) { B1.add(KNB2);  }
            if(objnum==48) { B1.add(RB2);  }
        }
        if (xs==1 & ys==3) {
            if(objnum==11) { B2.add(PW1);  }
            if(objnum==12) { B2.add(PW2);  }
            if(objnum==13) { B2.add(PW3);  }
            if(objnum==14) { B2.add(PW4);  }
            if(objnum==15) { B2.add(PW5);  }
            if(objnum==16) { B2.add(PW6);  }
            if(objnum==17) { B2.add(PW7);  }
            if(objnum==18) { B2.add(PW8);  }
            if(objnum==21) { B2.add(PB1);  }
            if(objnum==22) { B2.add(PB2);  }
            if(objnum==23) { B2.add(PB3);  }
            if(objnum==24) { B2.add(PB4);  }
            if(objnum==25) { B2.add(PB5);  }
            if(objnum==26) { B2.add(PB6);  }
            if(objnum==27) { B2.add(PB7);  }
            if(objnum==28) { B2.add(PB8);  }
            if(objnum==31) { B2.add(RW1);  }
            if(objnum==32) { B2.add(KNW1);  }
            if(objnum==33) { B2.add(BW1);  }
            if(objnum==34) { B2.add(QUEENW);  }
            if(objnum==35) { B2.add(KINGW);  }
            if(objnum==36) { B2.add(BW2);  }
            if(objnum==37) { B2.add(KNW2);  }
            if(objnum==38) { B2.add(RW2);  }
            if(objnum==41) { B2.add(RB1);  }
            if(objnum==42) { B2.add(KNB1);  }
            if(objnum==43) { B2.add(BB1);  }
            if(objnum==44) { B2.add(QUEENB);  }
            if(objnum==45) { B2.add(KINGB);  }
            if(objnum==46) { B2.add(BB2);  }
            if(objnum==47) { B2.add(KNB2);  }
            if(objnum==48) { B2.add(RB2);  }
        }
        if (xs==1 & ys==4) {
            if(objnum==11) { B3.add(PW1);  }
            if(objnum==12) { B3.add(PW2);  }
            if(objnum==13) { B3.add(PW3);  }
            if(objnum==14) { B3.add(PW4);  }
            if(objnum==15) { B3.add(PW5);  }
            if(objnum==16) { B3.add(PW6);  }
            if(objnum==17) { B3.add(PW7);  }
            if(objnum==18) { B3.add(PW8);  }
            if(objnum==21) { B3.add(PB1);  }
            if(objnum==22) { B3.add(PB2);  }
            if(objnum==23) { B3.add(PB3);  }
            if(objnum==24) { B3.add(PB4);  }
            if(objnum==25) { B3.add(PB5);  }
            if(objnum==26) { B3.add(PB6);  }
            if(objnum==27) { B3.add(PB7);  }
            if(objnum==28) { B3.add(PB8);  }
            if(objnum==31) { B3.add(RW1);  }
            if(objnum==32) { B3.add(KNW1);  }
            if(objnum==33) { B3.add(BW1);  }
            if(objnum==34) { B3.add(QUEENW);  }
            if(objnum==35) { B3.add(KINGW);  }
            if(objnum==36) { B3.add(BW2);  }
            if(objnum==37) { B3.add(KNW2);  }
            if(objnum==38) { B3.add(RW2);  }
            if(objnum==41) { B3.add(RB1);  }
            if(objnum==42) { B3.add(KNB1);  }
            if(objnum==43) { B3.add(BB1);  }
            if(objnum==44) { B3.add(QUEENB);  }
            if(objnum==45) { B3.add(KINGB);  }
            if(objnum==46) { B3.add(BB2);  }
            if(objnum==47) { B3.add(KNB2);  }
            if(objnum==48) { B3.add(RB2);  } }
        if (xs==1 & ys==5) {
            if(objnum==11) { B4.add(PW1);  }
            if(objnum==12) { B4.add(PW2);  }
            if(objnum==13) { B4.add(PW3);  }
            if(objnum==14) { B4.add(PW4);  }
            if(objnum==15) { B4.add(PW5);  }
            if(objnum==16) { B4.add(PW6);  }
            if(objnum==17) { B4.add(PW7);  }
            if(objnum==18) { B4.add(PW8);  }
            if(objnum==21) { B4.add(PB1);  }
            if(objnum==22) { B4.add(PB2);  }
            if(objnum==23) { B4.add(PB3);  }
            if(objnum==24) { B4.add(PB4);  }
            if(objnum==25) { B4.add(PB5);  }
            if(objnum==26) { B4.add(PB6);  }
            if(objnum==27) { B4.add(PB7);  }
            if(objnum==28) { B4.add(PB8);  }
            if(objnum==31) { B4.add(RW1);  }
            if(objnum==32) { B4.add(KNW1);  }
            if(objnum==33) { B4.add(BW1);  }
            if(objnum==34) { B4.add(QUEENW);  }
            if(objnum==35) { B4.add(KINGW);  }
            if(objnum==36) { B4.add(BW2);  }
            if(objnum==37) { B4.add(KNW2);  }
            if(objnum==38) { B4.add(RW2);  }
            if(objnum==41) { B4.add(RB1);  }
            if(objnum==42) { B4.add(KNB1);  }
            if(objnum==43) { B4.add(BB1);  }
            if(objnum==44) { B4.add(QUEENB);  }
            if(objnum==45) { B4.add(KINGB);  }
            if(objnum==46) { B4.add(BB2);  }
            if(objnum==47) { B4.add(KNB2);  }
            if(objnum==48) { B4.add(RB2);  }
        }
        if (xs==1 & ys==6) {
            if(objnum==11) { B5.add(PW1);  }
            if(objnum==12) { B5.add(PW2);  }
            if(objnum==13) { B5.add(PW3);  }
            if(objnum==14) { B5.add(PW4);  }
            if(objnum==15) { B5.add(PW5);  }
            if(objnum==16) { B5.add(PW6);  }
            if(objnum==17) { B5.add(PW7);  }
            if(objnum==18) { B5.add(PW8);  }
            if(objnum==21) { B5.add(PB1);  }
            if(objnum==22) { B5.add(PB2);  }
            if(objnum==23) { B5.add(PB3);  }
            if(objnum==24) { B5.add(PB4);  }
            if(objnum==25) { B5.add(PB5);  }
            if(objnum==26) { B5.add(PB6);  }
            if(objnum==27) { B5.add(PB7);  }
            if(objnum==28) { B5.add(PB8);  }
            if(objnum==31) { B5.add(RW1);  }
            if(objnum==32) { B5.add(KNW1);  }
            if(objnum==33) { B5.add(BW1);  }
            if(objnum==34) { B5.add(QUEENW);  }
            if(objnum==35) { B5.add(KINGW);  }
            if(objnum==36) { B5.add(BW2);  }
            if(objnum==37) { B5.add(KNW2);  }
            if(objnum==38) { B5.add(RW2);  }
            if(objnum==41) { B5.add(RB1);  }
            if(objnum==42) { B5.add(KNB1);  }
            if(objnum==43) { B5.add(BB1);  }
            if(objnum==44) { B5.add(QUEENB);  }
            if(objnum==45) { B5.add(KINGB);  }
            if(objnum==46) { B5.add(BB2);  }
            if(objnum==47) { B5.add(KNB2);  }
            if(objnum==48) { B5.add(RB2);  } }
        if (xs==1 & ys==7) {
            if(objnum==11) { B6.add(PW1);  }
            if(objnum==12) { B6.add(PW2);  }
            if(objnum==13) { B6.add(PW3);  }
            if(objnum==14) { B6.add(PW4);  }
            if(objnum==15) { B6.add(PW5);  }
            if(objnum==16) { B6.add(PW6);  }
            if(objnum==17) { B6.add(PW7);  }
            if(objnum==18) { B6.add(PW8);  }
            if(objnum==21) { B6.add(PB1);  }
            if(objnum==22) { B6.add(PB2);  }
            if(objnum==23) { B6.add(PB3);  }
            if(objnum==24) { B6.add(PB4);  }
            if(objnum==25) { B6.add(PB5);  }
            if(objnum==26) { B6.add(PB6);  }
            if(objnum==27) { B6.add(PB7);  }
            if(objnum==28) { B6.add(PB8);  }
            if(objnum==31) { B6.add(RW1);  }
            if(objnum==32) { B6.add(KNW1);  }
            if(objnum==33) { B6.add(BW1);  }
            if(objnum==34) { B6.add(QUEENW);  }
            if(objnum==35) { B6.add(KINGW);  }
            if(objnum==36) { B6.add(BW2);  }
            if(objnum==37) { B6.add(KNW2);  }
            if(objnum==38) { B6.add(RW2);  }
            if(objnum==41) { B6.add(RB1);  }
            if(objnum==42) { B6.add(KNB1);  }
            if(objnum==43) { B6.add(BB1);  }
            if(objnum==44) { B6.add(QUEENB);  }
            if(objnum==45) { B6.add(KINGB);  }
            if(objnum==46) { B6.add(BB2);  }
            if(objnum==47) { B6.add(KNB2);  }
            if(objnum==48) { B6.add(RB2);  }
        }
        if (xs==1 & ys==8) {
            if(objnum==11) { B7.add(PW1);  }
            if(objnum==12) { B7.add(PW2);  }
            if(objnum==13) { B7.add(PW3);  }
            if(objnum==14) { B7.add(PW4);  }
            if(objnum==15) { B7.add(PW5);  }
            if(objnum==16) { B7.add(PW6);  }
            if(objnum==17) { B7.add(PW7);  }
            if(objnum==18) { B7.add(PW8);  }
            if(objnum==21) { B7.add(PB1);  }
            if(objnum==22) { B7.add(PB2);  }
            if(objnum==23) { B7.add(PB3);  }
            if(objnum==24) { B7.add(PB4);  }
            if(objnum==25) { B7.add(PB5);  }
            if(objnum==26) { B7.add(PB6);  }
            if(objnum==27) { B7.add(PB7);  }
            if(objnum==28) { B7.add(PB8);  }
            if(objnum==31) { B7.add(RW1);  }
            if(objnum==32) { B7.add(KNW1);  }
            if(objnum==33) { B7.add(BW1);  }
            if(objnum==34) { B7.add(QUEENW);  }
            if(objnum==35) { B7.add(KINGW);  }
            if(objnum==36) { B7.add(BW2);  }
            if(objnum==37) { B7.add(KNW2);  }
            if(objnum==38) { B7.add(RW2);  }
            if(objnum==41) { B7.add(RB1);  }
            if(objnum==42) { B7.add(KNB1);  }
            if(objnum==43) { B7.add(BB1);  }
            if(objnum==44) { B7.add(QUEENB);  }
            if(objnum==45) { B7.add(KINGB);  }
            if(objnum==46) { B7.add(BB2);  }
            if(objnum==47) { B7.add(KNB2);  }
            if(objnum==48) { B7.add(RB2);  } 
        }
        if (xs==2 & ys==1) {
            if(objnum==11) { C0.add(PW1);  }
            if(objnum==12) { C0.add(PW2);  }
            if(objnum==13) { C0.add(PW3);  }
            if(objnum==14) { C0.add(PW4);  }
            if(objnum==15) { C0.add(PW5);  }
            if(objnum==16) { C0.add(PW6);  }
            if(objnum==17) { C0.add(PW7);  }
            if(objnum==18) { C0.add(PW8);  }
            if(objnum==21) { C0.add(PB1);  }
            if(objnum==22) { C0.add(PB2);  }
            if(objnum==23) { C0.add(PB3);  }
            if(objnum==24) { C0.add(PB4);  }
            if(objnum==25) { C0.add(PB5);  }
            if(objnum==26) { C0.add(PB6);  }
            if(objnum==27) { C0.add(PB7);  }
            if(objnum==28) { C0.add(PB8);  }
            if(objnum==31) { C0.add(RW1);  }
            if(objnum==32) { C0.add(KNW1);  }
            if(objnum==33) { C0.add(BW1);  }
            if(objnum==34) { C0.add(QUEENW);  }
            if(objnum==35) { C0.add(KINGW);  }
            if(objnum==36) { C0.add(BW2);  }
            if(objnum==37) { C0.add(KNW2);  }
            if(objnum==38) { C0.add(RW2);  }
            if(objnum==41) { C0.add(RB1);  }
            if(objnum==42) { C0.add(KNB1);  }
            if(objnum==43) { C0.add(BB1);  }
            if(objnum==44) { C0.add(QUEENB);  }
            if(objnum==45) { C0.add(KINGB);  }
            if(objnum==46) { C0.add(BB2);  }
            if(objnum==47) { C0.add(KNB2);  }
            if(objnum==48) { C0.add(RB2);  } }
        if (xs==2 & ys==2) {
            if(objnum==11) { C1.add(PW1);  }
            if(objnum==12) { C1.add(PW2);  }
            if(objnum==13) { C1.add(PW3);  }
            if(objnum==14) { C1.add(PW4);  }
            if(objnum==15) { C1.add(PW5);  }
            if(objnum==16) { C1.add(PW6);  }
            if(objnum==17) { C1.add(PW7);  }
            if(objnum==18) { C1.add(PW8);  }
            if(objnum==21) { C1.add(PB1);  }
            if(objnum==22) { C1.add(PB2);  }
            if(objnum==23) { C1.add(PB3);  }
            if(objnum==24) { C1.add(PB4);  }
            if(objnum==25) { C1.add(PB5);  }
            if(objnum==26) { C1.add(PB6);  }
            if(objnum==27) { C1.add(PB7);  }
            if(objnum==28) { C1.add(PB8);  }
            if(objnum==31) { C1.add(RW1);  }
            if(objnum==32) { C1.add(KNW1);  }
            if(objnum==33) { C1.add(BW1);  }
            if(objnum==34) { C1.add(QUEENW);  }
            if(objnum==35) { C1.add(KINGW);  }
            if(objnum==36) { C1.add(BW2);  }
            if(objnum==37) { C1.add(KNW2);  }
            if(objnum==38) { C1.add(RW2);  }
            if(objnum==41) { C1.add(RB1);  }
            if(objnum==42) { C1.add(KNB1);  }
            if(objnum==43) { C1.add(BB1);  }
            if(objnum==44) { C1.add(QUEENB);  }
            if(objnum==45) { C1.add(KINGB);  }
            if(objnum==46) { C1.add(BB2);  }
            if(objnum==47) { C1.add(KNB2);  }
            if(objnum==48) { C1.add(RB2);  } }
        if (xs==2 & ys==3) {
            if(objnum==11) { C2.add(PW1);  }
            if(objnum==12) { C2.add(PW2);  }
            if(objnum==13) { C2.add(PW3);  }
            if(objnum==14) { C2.add(PW4);  }
            if(objnum==15) { C2.add(PW5);  }
            if(objnum==16) { C2.add(PW6);  }
            if(objnum==17) { C2.add(PW7);  }
            if(objnum==18) { C2.add(PW8);  }
            if(objnum==21) { C2.add(PB1);  }
            if(objnum==22) { C2.add(PB2);  }
            if(objnum==23) { C2.add(PB3);  }
            if(objnum==24) { C2.add(PB4);  }
            if(objnum==25) { C2.add(PB5);  }
            if(objnum==26) { C2.add(PB6);  }
            if(objnum==27) { C2.add(PB7);  }
            if(objnum==28) { C2.add(PB8);  }
            if(objnum==31) { C2.add(RW1);  }
            if(objnum==32) { C2.add(KNW1);  }
            if(objnum==33) { C2.add(BW1);  }
            if(objnum==34) { C2.add(QUEENW);  }
            if(objnum==35) { C2.add(KINGW);  }
            if(objnum==36) { C2.add(BW2);  }
            if(objnum==37) { C2.add(KNW2);  }
            if(objnum==38) { C2.add(RW2);  }
            if(objnum==41) { C2.add(RB1);  }
            if(objnum==42) { C2.add(KNB1);  }
            if(objnum==43) { C2.add(BB1);  }
            if(objnum==44) { C2.add(QUEENB);  }
            if(objnum==45) { C2.add(KINGB);  }
            if(objnum==46) { C2.add(BB2);  }
            if(objnum==47) { C2.add(KNB2);  }
            if(objnum==48) { C2.add(RB2);  } }
        if (xs==2 & ys==4) {
            if(objnum==11) { C3.add(PW1);  }
            if(objnum==12) { C3.add(PW2);  }
            if(objnum==13) { C3.add(PW3);  }
            if(objnum==14) { C3.add(PW4);  }
            if(objnum==15) { C3.add(PW5);  }
            if(objnum==16) { C3.add(PW6);  }
            if(objnum==17) { C3.add(PW7);  }
            if(objnum==18) { C3.add(PW8);  }
            if(objnum==21) { C3.add(PB1);  }
            if(objnum==22) { C3.add(PB2);  }
            if(objnum==23) { C3.add(PB3);  }
            if(objnum==24) { C3.add(PB4);  }
            if(objnum==25) { C3.add(PB5);  }
            if(objnum==26) { C3.add(PB6);  }
            if(objnum==27) { C3.add(PB7);  }
            if(objnum==28) { C3.add(PB8);  }
            if(objnum==31) { C3.add(RW1);  }
            if(objnum==32) { C3.add(KNW1);  }
            if(objnum==33) { C3.add(BW1);  }
            if(objnum==34) { C3.add(QUEENW);  }
            if(objnum==35) { C3.add(KINGW);  }
            if(objnum==36) { C3.add(BW2);  }
            if(objnum==37) { C3.add(KNW2);  }
            if(objnum==38) { C3.add(RW2);  }
            if(objnum==41) { C3.add(RB1);  }
            if(objnum==42) { C3.add(KNB1);  }
            if(objnum==43) { C3.add(BB1);  }
            if(objnum==44) { C3.add(QUEENB);  }
            if(objnum==45) { C3.add(KINGB);  }
            if(objnum==46) { C3.add(BB2);  }
            if(objnum==47) { C3.add(KNB2);  }
            if(objnum==48) { C3.add(RB2);  } }
        if (xs==2 & ys==5) {
            if(objnum==11) { C4.add(PW1);  }
            if(objnum==12) { C4.add(PW2);  }
            if(objnum==13) { C4.add(PW3);  }
            if(objnum==14) { C4.add(PW4);  }
            if(objnum==15) { C4.add(PW5);  }
            if(objnum==16) { C4.add(PW6);  }
            if(objnum==17) { C4.add(PW7);  }
            if(objnum==18) { C4.add(PW8);  }
            if(objnum==21) { C4.add(PB1);  }
            if(objnum==22) { C4.add(PB2);  }
            if(objnum==23) { C4.add(PB3);  }
            if(objnum==24) { C4.add(PB4);  }
            if(objnum==25) { C4.add(PB5);  }
            if(objnum==26) { C4.add(PB6);  }
            if(objnum==27) { C4.add(PB7);  }
            if(objnum==28) { C4.add(PB8);  }
            if(objnum==31) { C4.add(RW1);  }
            if(objnum==32) { C4.add(KNW1);  }
            if(objnum==33) { C4.add(BW1);  }
            if(objnum==34) { C4.add(QUEENW);  }
            if(objnum==35) { C4.add(KINGW);  }
            if(objnum==36) { C4.add(BW2);  }
            if(objnum==37) { C4.add(KNW2);  }
            if(objnum==38) { C4.add(RW2);  }
            if(objnum==41) { C4.add(RB1);  }
            if(objnum==42) { C4.add(KNB1);  }
            if(objnum==43) { C4.add(BB1);  }
            if(objnum==44) { C4.add(QUEENB);  }
            if(objnum==45) { C4.add(KINGB);  }
            if(objnum==46) { C4.add(BB2);  }
            if(objnum==47) { C4.add(KNB2);  }
            if(objnum==48) { C4.add(RB2);  } }
        if (xs==2 & ys==6) {
            if(objnum==11) { C5.add(PW1);  }
            if(objnum==12) { C5.add(PW2);  }
            if(objnum==13) { C5.add(PW3);  }
            if(objnum==14) { C5.add(PW4);  }
            if(objnum==15) { C5.add(PW5);  }
            if(objnum==16) { C5.add(PW6);  }
            if(objnum==17) { C5.add(PW7);  }
            if(objnum==18) { C5.add(PW8);  }
            if(objnum==21) { C5.add(PB1);  }
            if(objnum==22) { C5.add(PB2);  }
            if(objnum==23) { C5.add(PB3);  }
            if(objnum==24) { C5.add(PB4);  }
            if(objnum==25) { C5.add(PB5);  }
            if(objnum==26) { C5.add(PB6);  }
            if(objnum==27) { C5.add(PB7);  }
            if(objnum==28) { C5.add(PB8);  }
            if(objnum==31) { C5.add(RW1);  }
            if(objnum==32) { C5.add(KNW1);  }
            if(objnum==33) { C5.add(BW1);  }
            if(objnum==34) { C5.add(QUEENW);  }
            if(objnum==35) { C5.add(KINGW);  }
            if(objnum==36) { C5.add(BW2);  }
            if(objnum==37) { C5.add(KNW2);  }
            if(objnum==38) { C5.add(RW2);  }
            if(objnum==41) { C5.add(RB1);  }
            if(objnum==42) { C5.add(KNB1);  }
            if(objnum==43) { C5.add(BB1);  }
            if(objnum==44) { C5.add(QUEENB);  }
            if(objnum==45) { C5.add(KINGB);  }
            if(objnum==46) { C5.add(BB2);  }
            if(objnum==47) { C5.add(KNB2);  }
            if(objnum==48) { C5.add(RB2);  } }
        if (xs==2 & ys==7) {
            if(objnum==11) { C6.add(PW1);  }
            if(objnum==12) { C6.add(PW2);  }
            if(objnum==13) { C6.add(PW3);  }
            if(objnum==14) { C6.add(PW4);  }
            if(objnum==15) { C6.add(PW5);  }
            if(objnum==16) { C6.add(PW6);  }
            if(objnum==17) { C6.add(PW7);  }
            if(objnum==18) { C6.add(PW8);  }
            if(objnum==21) { C6.add(PB1);  }
            if(objnum==22) { C6.add(PB2);  }
            if(objnum==23) { C6.add(PB3);  }
            if(objnum==24) { C6.add(PB4);  }
            if(objnum==25) { C6.add(PB5);  }
            if(objnum==26) { C6.add(PB6);  }
            if(objnum==27) { C6.add(PB7);  }
            if(objnum==28) { C6.add(PB8);  }
            if(objnum==31) { C6.add(RW1);  }
            if(objnum==32) { C6.add(KNW1);  }
            if(objnum==33) { C6.add(BW1);  }
            if(objnum==34) { C6.add(QUEENW);  }
            if(objnum==35) { C6.add(KINGW);  }
            if(objnum==36) { C6.add(BW2);  }
            if(objnum==37) { C6.add(KNW2);  }
            if(objnum==38) { C6.add(RW2);  }
            if(objnum==41) { C6.add(RB1);  }
            if(objnum==42) { C6.add(KNB1);  }
            if(objnum==43) { C6.add(BB1);  }
            if(objnum==44) { C6.add(QUEENB);  }
            if(objnum==45) { C6.add(KINGB);  }
            if(objnum==46) { C6.add(BB2);  }
            if(objnum==47) { C6.add(KNB2);  }
            if(objnum==48) { C6.add(RB2);  } }
        if (xs==2 & ys==8) {
            if(objnum==11) { C7.add(PW1);  }
            if(objnum==12) { C7.add(PW2);  }
            if(objnum==13) { C7.add(PW3);  }
            if(objnum==14) { C7.add(PW4);  }
            if(objnum==15) { C7.add(PW5);  }
            if(objnum==16) { C7.add(PW6);  }
            if(objnum==17) { C7.add(PW7);  }
            if(objnum==18) { C7.add(PW8);  }
            if(objnum==21) { C7.add(PB1);  }
            if(objnum==22) { C7.add(PB2);  }
            if(objnum==23) { C7.add(PB3);  }
            if(objnum==24) { C7.add(PB4);  }
            if(objnum==25) { C7.add(PB5);  }
            if(objnum==26) { C7.add(PB6);  }
            if(objnum==27) { C7.add(PB7);  }
            if(objnum==28) { C7.add(PB8);  }
            if(objnum==31) { C7.add(RW1);  }
            if(objnum==32) { C7.add(KNW1);  }
            if(objnum==33) { C7.add(BW1);  }
            if(objnum==34) { C7.add(QUEENW);  }
            if(objnum==35) { C7.add(KINGW);  }
            if(objnum==36) { C7.add(BW2);  }
            if(objnum==37) { C7.add(KNW2);  }
            if(objnum==38) { C7.add(RW2);  }
            if(objnum==41) { C7.add(RB1);  }
            if(objnum==42) { C7.add(KNB1);  }
            if(objnum==43) { C7.add(BB1);  }
            if(objnum==44) { C7.add(QUEENB);  }
            if(objnum==45) { C7.add(KINGB);  }
            if(objnum==46) { C7.add(BB2);  }
            if(objnum==47) { C7.add(KNB2);  }
            if(objnum==48) { C7.add(RB2);  } }
        if (xs==3 & ys==1) {
            if(objnum==11) { D0.add(PW1);  }
            if(objnum==12) { D0.add(PW2);  }
            if(objnum==13) { D0.add(PW3);  }
            if(objnum==14) { D0.add(PW4);  }
            if(objnum==15) { D0.add(PW5);  }
            if(objnum==16) { D0.add(PW6);  }
            if(objnum==17) { D0.add(PW7);  }
            if(objnum==18) { D0.add(PW8);  }
            if(objnum==21) { D0.add(PB1);  }
            if(objnum==22) { D0.add(PB2);  }
            if(objnum==23) { D0.add(PB3);  }
            if(objnum==24) { D0.add(PB4);  }
            if(objnum==25) { D0.add(PB5);  }
            if(objnum==26) { D0.add(PB6);  }
            if(objnum==27) { D0.add(PB7);  }
            if(objnum==28) { D0.add(PB8);  }
            if(objnum==31) { D0.add(RW1);  }
            if(objnum==32) { D0.add(KNW1);  }
            if(objnum==33) { D0.add(BW1);  }
            if(objnum==34) { D0.add(QUEENW);  }
            if(objnum==35) { D0.add(KINGW);  }
            if(objnum==36) { D0.add(BW2);  }
            if(objnum==37) { D0.add(KNW2);  }
            if(objnum==38) { D0.add(RW2);  }
            if(objnum==41) { D0.add(RB1);  }
            if(objnum==42) { D0.add(KNB1);  }
            if(objnum==43) { D0.add(BB1);  }
            if(objnum==44) { D0.add(QUEENB);  }
            if(objnum==45) { D0.add(KINGB);  }
            if(objnum==46) { D0.add(BB2);  }
            if(objnum==47) { D0.add(KNB2);  }
            if(objnum==48) { D0.add(RB2);  } }
        if (xs==3 & ys==2) {
            if(objnum==11) { D1.add(PW1);  }
            if(objnum==12) { D1.add(PW2);  }
            if(objnum==13) { D1.add(PW3);  }
            if(objnum==14) { D1.add(PW4);  }
            if(objnum==15) { D1.add(PW5);  }
            if(objnum==16) { D1.add(PW6);  }
            if(objnum==17) { D1.add(PW7);  }
            if(objnum==18) { D1.add(PW8);  }
            if(objnum==21) { D1.add(PB1);  }
            if(objnum==22) { D1.add(PB2);  }
            if(objnum==23) { D1.add(PB3);  }
            if(objnum==24) { D1.add(PB4);  }
            if(objnum==25) { D1.add(PB5);  }
            if(objnum==26) { D1.add(PB6);  }
            if(objnum==27) { D1.add(PB7);  }
            if(objnum==28) { D1.add(PB8);  }
            if(objnum==31) { D1.add(RW1);  }
            if(objnum==32) { D1.add(KNW1);  }
            if(objnum==33) { D1.add(BW1);  }
            if(objnum==34) { D1.add(QUEENW);  }
            if(objnum==35) { D1.add(KINGW);  }
            if(objnum==36) { D1.add(BW2);  }
            if(objnum==37) { D1.add(KNW2);  }
            if(objnum==38) { D1.add(RW2);  }
            if(objnum==41) { D1.add(RB1);  }
            if(objnum==42) { D1.add(KNB1);  }
            if(objnum==43) { D1.add(BB1);  }
            if(objnum==44) { D1.add(QUEENB);  }
            if(objnum==45) { D1.add(KINGB);  }
            if(objnum==46) { D1.add(BB2);  }
            if(objnum==47) { D1.add(KNB2);  }
            if(objnum==48) { D1.add(RB2);  } }
        if (xs==3 & ys==3) {
            if(objnum==11) { D2.add(PW1);  }
            if(objnum==12) { D2.add(PW2);  }
            if(objnum==13) { D2.add(PW3);  }
            if(objnum==14) { D2.add(PW4);  }
            if(objnum==15) { D2.add(PW5);  }
            if(objnum==16) { D2.add(PW6);  }
            if(objnum==17) { D2.add(PW7);  }
            if(objnum==18) { D2.add(PW8);  }
            if(objnum==21) { D2.add(PB1);  }
            if(objnum==22) { D2.add(PB2);  }
            if(objnum==23) { D2.add(PB3);  }
            if(objnum==24) { D2.add(PB4);  }
            if(objnum==25) { D2.add(PB5);  }
            if(objnum==26) { D2.add(PB6);  }
            if(objnum==27) { D2.add(PB7);  }
            if(objnum==28) { D2.add(PB8);  }
            if(objnum==31) { D2.add(RW1);  }
            if(objnum==32) { D2.add(KNW1);  }
            if(objnum==33) { D2.add(BW1);  }
            if(objnum==34) { D2.add(QUEENW);  }
            if(objnum==35) { D2.add(KINGW);  }
            if(objnum==36) { D2.add(BW2);  }
            if(objnum==37) { D2.add(KNW2);  }
            if(objnum==38) { D2.add(RW2);  }
            if(objnum==41) { D2.add(RB1);  }
            if(objnum==42) { D2.add(KNB1);  }
            if(objnum==43) { D2.add(BB1);  }
            if(objnum==44) { D2.add(QUEENB);  }
            if(objnum==45) { D2.add(KINGB);  }
            if(objnum==46) { D2.add(BB2);  }
            if(objnum==47) { D2.add(KNB2);  }
            if(objnum==48) { D2.add(RB2);  } }
        if (xs==3 & ys==4) {
            if(objnum==11) { D3.add(PW1);  }
            if(objnum==12) { D3.add(PW2);  }
            if(objnum==13) { D3.add(PW3);  }
            if(objnum==14) { D3.add(PW4);  }
            if(objnum==15) { D3.add(PW5);  }
            if(objnum==16) { D3.add(PW6);  }
            if(objnum==17) { D3.add(PW7);  }
            if(objnum==18) { D3.add(PW8);  }
            if(objnum==21) { D3.add(PB1);  }
            if(objnum==22) { D3.add(PB2);  }
            if(objnum==23) { D3.add(PB3);  }
            if(objnum==24) { D3.add(PB4);  }
            if(objnum==25) { D3.add(PB5);  }
            if(objnum==26) { D3.add(PB6);  }
            if(objnum==27) { D3.add(PB7);  }
            if(objnum==28) { D3.add(PB8);  }
            if(objnum==31) { D3.add(RW1);  }
            if(objnum==32) { D3.add(KNW1);  }
            if(objnum==33) { D3.add(BW1);  }
            if(objnum==34) { D3.add(QUEENW);  }
            if(objnum==35) { D3.add(KINGW);  }
            if(objnum==36) { D3.add(BW2);  }
            if(objnum==37) { D3.add(KNW2);  }
            if(objnum==38) { D3.add(RW2);  }
            if(objnum==41) { D3.add(RB1);  }
            if(objnum==42) { D3.add(KNB1);  }
            if(objnum==43) { D3.add(BB1);  }
            if(objnum==44) { D3.add(QUEENB);  }
            if(objnum==45) { D3.add(KINGB);  }
            if(objnum==46) { D3.add(BB2);  }
            if(objnum==47) { D3.add(KNB2);  }
            if(objnum==48) { D3.add(RB2);  } }
        if (xs==3 & ys==5) {
            if(objnum==11) { D4.add(PW1);  }
            if(objnum==12) { D4.add(PW2);  }
            if(objnum==13) { D4.add(PW3);  }
            if(objnum==14) { D4.add(PW4);  }
            if(objnum==15) { D4.add(PW5);  }
            if(objnum==16) { D4.add(PW6);  }
            if(objnum==17) { D4.add(PW7);  }
            if(objnum==18) { D4.add(PW8);  }
            if(objnum==21) { D4.add(PB1);  }
            if(objnum==22) { D4.add(PB2);  }
            if(objnum==23) { D4.add(PB3);  }
            if(objnum==24) { D4.add(PB4);  }
            if(objnum==25) { D4.add(PB5);  }
            if(objnum==26) { D4.add(PB6);  }
            if(objnum==27) { D4.add(PB7);  }
            if(objnum==28) { D4.add(PB8);  }
            if(objnum==31) { D4.add(RW1);  }
            if(objnum==32) { D4.add(KNW1);  }
            if(objnum==33) { D4.add(BW1);  }
            if(objnum==34) { D4.add(QUEENW);  }
            if(objnum==35) { D4.add(KINGW);  }
            if(objnum==36) { D4.add(BW2);  }
            if(objnum==37) { D4.add(KNW2);  }
            if(objnum==38) { D4.add(RW2);  }
            if(objnum==41) { D4.add(RB1);  }
            if(objnum==42) { D4.add(KNB1);  }
            if(objnum==43) { D4.add(BB1);  }
            if(objnum==44) { D4.add(QUEENB);  }
            if(objnum==45) { D4.add(KINGB);  }
            if(objnum==46) { D4.add(BB2);  }
            if(objnum==47) { D4.add(KNB2);  }
            if(objnum==48) { D4.add(RB2);  }  }
        if (xs==3 & ys==6) {
            if(objnum==11) { D5.add(PW1);  }
            if(objnum==12) { D5.add(PW2);  }
            if(objnum==13) { D5.add(PW3);  }
            if(objnum==14) { D5.add(PW4);  }
            if(objnum==15) { D5.add(PW5);  }
            if(objnum==16) { D5.add(PW6);  }
            if(objnum==17) { D5.add(PW7);  }
            if(objnum==18) { D5.add(PW8);  }
            if(objnum==21) { D5.add(PB1);  }
            if(objnum==22) { D5.add(PB2);  }
            if(objnum==23) { D5.add(PB3);  }
            if(objnum==24) { D5.add(PB4);  }
            if(objnum==25) { D5.add(PB5);  }
            if(objnum==26) { D5.add(PB6);  }
            if(objnum==27) { D5.add(PB7);  }
            if(objnum==28) { D5.add(PB8);  }
            if(objnum==31) { D5.add(RW1);  }
            if(objnum==32) { D5.add(KNW1);  }
            if(objnum==33) { D5.add(BW1);  }
            if(objnum==34) { D5.add(QUEENW);  }
            if(objnum==35) { D5.add(KINGW);  }
            if(objnum==36) { D5.add(BW2);  }
            if(objnum==37) { D5.add(KNW2);  }
            if(objnum==38) { D5.add(RW2);  }
            if(objnum==41) { D5.add(RB1);  }
            if(objnum==42) { D5.add(KNB1);  }
            if(objnum==43) { D5.add(BB1);  }
            if(objnum==44) { D5.add(QUEENB);  }
            if(objnum==45) { D5.add(KINGB);  }
            if(objnum==46) { D5.add(BB2);  }
            if(objnum==47) { D5.add(KNB2);  }
            if(objnum==48) { D5.add(RB2);  } }
        if (xs==3 & ys==7) {
            if(objnum==11) { D6.add(PW1);  }
            if(objnum==12) { D6.add(PW2);  }
            if(objnum==13) { D6.add(PW3);  }
            if(objnum==14) { D6.add(PW4);  }
            if(objnum==15) { D6.add(PW5);  }
            if(objnum==16) { D6.add(PW6);  }
            if(objnum==17) { D6.add(PW7);  }
            if(objnum==18) { D6.add(PW8);  }
            if(objnum==21) { D6.add(PB1);  }
            if(objnum==22) { D6.add(PB2);  }
            if(objnum==23) { D6.add(PB3);  }
            if(objnum==24) { D6.add(PB4);  }
            if(objnum==25) { D6.add(PB5);  }
            if(objnum==26) { D6.add(PB6);  }
            if(objnum==27) { D6.add(PB7);  }
            if(objnum==28) { D6.add(PB8);  }
            if(objnum==31) { D6.add(RW1);  }
            if(objnum==32) { D6.add(KNW1);  }
            if(objnum==33) { D6.add(BW1);  }
            if(objnum==34) { D6.add(QUEENW);  }
            if(objnum==35) { D6.add(KINGW);  }
            if(objnum==36) { D6.add(BW2);  }
            if(objnum==37) { D6.add(KNW2);  }
            if(objnum==38) { D6.add(RW2);  }
            if(objnum==41) { D6.add(RB1);  }
            if(objnum==42) { D6.add(KNB1);  }
            if(objnum==43) { D6.add(BB1);  }
            if(objnum==44) { D6.add(QUEENB);  }
            if(objnum==45) { D6.add(KINGB);  }
            if(objnum==46) { D6.add(BB2);  }
            if(objnum==47) { D6.add(KNB2);  }
            if(objnum==48) { D6.add(RB2);  } }
        if (xs==3 & ys==8) {
            if(objnum==11) { D7.add(PW1);  }
            if(objnum==12) { D7.add(PW2);  }
            if(objnum==13) { D7.add(PW3);  }
            if(objnum==14) { D7.add(PW4);  }
            if(objnum==15) { D7.add(PW5);  }
            if(objnum==16) { D7.add(PW6);  }
            if(objnum==17) { D7.add(PW7);  }
            if(objnum==18) { D7.add(PW8);  }
            if(objnum==21) { D7.add(PB1);  }
            if(objnum==22) { D7.add(PB2);  }
            if(objnum==23) { D7.add(PB3);  }
            if(objnum==24) { D7.add(PB4);  }
            if(objnum==25) { D7.add(PB5);  }
            if(objnum==26) { D7.add(PB6);  }
            if(objnum==27) { D7.add(PB7);  }
            if(objnum==28) { D7.add(PB8);  }
            if(objnum==31) { D7.add(RW1);  }
            if(objnum==32) { D7.add(KNW1);  }
            if(objnum==33) { D7.add(BW1);  }
            if(objnum==34) { D7.add(QUEENW);  }
            if(objnum==35) { D7.add(KINGW);  }
            if(objnum==36) { D7.add(BW2);  }
            if(objnum==37) { D7.add(KNW2);  }
            if(objnum==38) { D7.add(RW2);  }
            if(objnum==41) { D7.add(RB1);  }
            if(objnum==42) { D7.add(KNB1);  }
            if(objnum==43) { D7.add(BB1);  }
            if(objnum==44) { D7.add(QUEENB);  }
            if(objnum==45) { D7.add(KINGB);  }
            if(objnum==46) { D7.add(BB2);  }
            if(objnum==47) { D7.add(KNB2);  }
            if(objnum==48) { D7.add(RB2);  } }
        if (xs==4 & ys==1) {
            if(objnum==11) { E0.add(PW1);  }
            if(objnum==12) { E0.add(PW2);  }
            if(objnum==13) { E0.add(PW3);  }
            if(objnum==14) { E0.add(PW4);  }
            if(objnum==15) { E0.add(PW5);  }
            if(objnum==16) { E0.add(PW6);  }
            if(objnum==17) { E0.add(PW7);  }
            if(objnum==18) { E0.add(PW8);  }
            if(objnum==21) { E0.add(PB1);  }
            if(objnum==22) { E0.add(PB2);  }
            if(objnum==23) { E0.add(PB3);  }
            if(objnum==24) { E0.add(PB4);  }
            if(objnum==25) { E0.add(PB5);  }
            if(objnum==26) { E0.add(PB6);  }
            if(objnum==27) { E0.add(PB7);  }
            if(objnum==28) { E0.add(PB8);  }
            if(objnum==31) { E0.add(RW1);  }
            if(objnum==32) { E0.add(KNW1);  }
            if(objnum==33) { E0.add(BW1);  }
            if(objnum==34) { E0.add(QUEENW);  }
            if(objnum==35) { E0.add(KINGW);  }
            if(objnum==36) { E0.add(BW2);  }
            if(objnum==37) { E0.add(KNW2);  }
            if(objnum==38) { E0.add(RW2);  }
            if(objnum==41) { E0.add(RB1);  }
            if(objnum==42) { E0.add(KNB1);  }
            if(objnum==43) { E0.add(BB1);  }
            if(objnum==44) { E0.add(QUEENB);  }
            if(objnum==45) { E0.add(KINGB);  }
            if(objnum==46) { E0.add(BB2);  }
            if(objnum==47) { E0.add(KNB2);  }
            if(objnum==48) { E0.add(RB2);  } }
        if (xs==4 & ys==2) {
            if(objnum==11) { E1.add(PW1);  }
            if(objnum==12) { E1.add(PW2);  }
            if(objnum==13) { E1.add(PW3);  }
            if(objnum==14) { E1.add(PW4);  }
            if(objnum==15) { E1.add(PW5);  }
            if(objnum==16) { E1.add(PW6);  }
            if(objnum==17) { E1.add(PW7);  }
            if(objnum==18) { E1.add(PW8);  }
            if(objnum==21) { E1.add(PB1);  }
            if(objnum==22) { E1.add(PB2);  }
            if(objnum==23) { E1.add(PB3);  }
            if(objnum==24) { E1.add(PB4);  }
            if(objnum==25) { E1.add(PB5);  }
            if(objnum==26) { E1.add(PB6);  }
            if(objnum==27) { E1.add(PB7);  }
            if(objnum==28) { E1.add(PB8);  }
            if(objnum==31) { E1.add(RW1);  }
            if(objnum==32) { E1.add(KNW1);  }
            if(objnum==33) { E1.add(BW1);  }
            if(objnum==34) { E1.add(QUEENW);  }
            if(objnum==35) { E1.add(KINGW);  }
            if(objnum==36) { E1.add(BW2);  }
            if(objnum==37) { E1.add(KNW2);  }
            if(objnum==38) { E1.add(RW2);  }
            if(objnum==41) { E1.add(RB1);  }
            if(objnum==42) { E1.add(KNB1);  }
            if(objnum==43) { E1.add(BB1);  }
            if(objnum==44) { E1.add(QUEENB);  }
            if(objnum==45) { E1.add(KINGB);  }
            if(objnum==46) { E1.add(BB2);  }
            if(objnum==47) { E1.add(KNB2);  }
            if(objnum==48) { E1.add(RB2);  } }
        if (xs==4 & ys==3) {
            if(objnum==11) { E2.add(PW1);  }
            if(objnum==12) { E2.add(PW2);  }
            if(objnum==13) { E2.add(PW3);  }
            if(objnum==14) { E2.add(PW4);  }
            if(objnum==15) { E2.add(PW5);  }
            if(objnum==16) { E2.add(PW6);  }
            if(objnum==17) { E2.add(PW7);  }
            if(objnum==18) { E2.add(PW8);  }
            if(objnum==21) { E2.add(PB1);  }
            if(objnum==22) { E2.add(PB2);  }
            if(objnum==23) { E2.add(PB3);  }
            if(objnum==24) { E2.add(PB4);  }
            if(objnum==25) { E2.add(PB5);  }
            if(objnum==26) { E2.add(PB6);  }
            if(objnum==27) { E2.add(PB7);  }
            if(objnum==28) { E2.add(PB8);  }
            if(objnum==31) { E2.add(RW1);  }
            if(objnum==32) { E2.add(KNW1);  }
            if(objnum==33) { E2.add(BW1);  }
            if(objnum==34) { E2.add(QUEENW);  }
            if(objnum==35) { E2.add(KINGW);  }
            if(objnum==36) { E2.add(BW2);  }
            if(objnum==37) { E2.add(KNW2);  }
            if(objnum==38) { E2.add(RW2);  }
            if(objnum==41) { E2.add(RB1);  }
            if(objnum==42) { E2.add(KNB1);  }
            if(objnum==43) { E2.add(BB1);  }
            if(objnum==44) { E2.add(QUEENB);  }
            if(objnum==45) { E2.add(KINGB);  }
            if(objnum==46) { E2.add(BB2);  }
            if(objnum==47) { E2.add(KNB2);  }
            if(objnum==48) { E2.add(RB2);  } }
        if (xs==4 & ys==4) {
            if(objnum==11) { E3.add(PW1);  }
            if(objnum==12) { E3.add(PW2);  }
            if(objnum==13) { E3.add(PW3);  }
            if(objnum==14) { E3.add(PW4);  }
            if(objnum==15) { E3.add(PW5);  }
            if(objnum==16) { E3.add(PW6);  }
            if(objnum==17) { E3.add(PW7);  }
            if(objnum==18) { E3.add(PW8);  }
            if(objnum==21) { E3.add(PB1);  }
            if(objnum==22) { E3.add(PB2);  }
            if(objnum==23) { E3.add(PB3);  }
            if(objnum==24) { E3.add(PB4);  }
            if(objnum==25) { E3.add(PB5);  }
            if(objnum==26) { E3.add(PB6);  }
            if(objnum==27) { E3.add(PB7);  }
            if(objnum==28) { E3.add(PB8);  }
            if(objnum==31) { E3.add(RW1);  }
            if(objnum==32) { E3.add(KNW1);  }
            if(objnum==33) { E3.add(BW1);  }
            if(objnum==34) { E3.add(QUEENW);  }
            if(objnum==35) { E3.add(KINGW);  }
            if(objnum==36) { E3.add(BW2);  }
            if(objnum==37) { E3.add(KNW2);  }
            if(objnum==38) { E3.add(RW2);  }
            if(objnum==41) { E3.add(RB1);  }
            if(objnum==42) { E3.add(KNB1);  }
            if(objnum==43) { E3.add(BB1);  }
            if(objnum==44) { E3.add(QUEENB);  }
            if(objnum==45) { E3.add(KINGB);  }
            if(objnum==46) { E3.add(BB2);  }
            if(objnum==47) { E3.add(KNB2);  }
            if(objnum==48) { E3.add(RB2);  } }
        if (xs==4 & ys==5) {
            if(objnum==11) { E4.add(PW1);  }
            if(objnum==12) { E4.add(PW2);  }
            if(objnum==13) { E4.add(PW3);  }
            if(objnum==14) { E4.add(PW4);  }
            if(objnum==15) { E4.add(PW5);  }
            if(objnum==16) { E4.add(PW6);  }
            if(objnum==17) { E4.add(PW7);  }
            if(objnum==18) { E4.add(PW8);  }
            if(objnum==21) { E4.add(PB1);  }
            if(objnum==22) { E4.add(PB2);  }
            if(objnum==23) { E4.add(PB3);  }
            if(objnum==24) { E4.add(PB4);  }
            if(objnum==25) { E4.add(PB5);  }
            if(objnum==26) { E4.add(PB6);  }
            if(objnum==27) { E4.add(PB7);  }
            if(objnum==28) { E4.add(PB8);  }
            if(objnum==31) { E4.add(RW1);  }
            if(objnum==32) { E4.add(KNW1);  }
            if(objnum==33) { E4.add(BW1);  }
            if(objnum==34) { E4.add(QUEENW);  }
            if(objnum==35) { E4.add(KINGW);  }
            if(objnum==36) { E4.add(BW2);  }
            if(objnum==37) { E4.add(KNW2);  }
            if(objnum==38) { E4.add(RW2);  }
            if(objnum==41) { E4.add(RB1);  }
            if(objnum==42) { E4.add(KNB1);  }
            if(objnum==43) { E4.add(BB1);  }
            if(objnum==44) { E4.add(QUEENB);  }
            if(objnum==45) { E4.add(KINGB);  }
            if(objnum==46) { E4.add(BB2);  }
            if(objnum==47) { E4.add(KNB2);  }
            if(objnum==48) { E4.add(RB2);  } }
        if (xs==4 & ys==6) {
            if(objnum==11) { E5.add(PW1);  }
            if(objnum==12) { E5.add(PW2);  }
            if(objnum==13) { E5.add(PW3);  }
            if(objnum==14) { E5.add(PW4);  }
            if(objnum==15) { E5.add(PW5);  }
            if(objnum==16) { E5.add(PW6);  }
            if(objnum==17) { E5.add(PW7);  }
            if(objnum==18) { E5.add(PW8);  }
            if(objnum==21) { E5.add(PB1);  }
            if(objnum==22) { E5.add(PB2);  }
            if(objnum==23) { E5.add(PB3);  }
            if(objnum==24) { E5.add(PB4);  }
            if(objnum==25) { E5.add(PB5);  }
            if(objnum==26) { E5.add(PB6);  }
            if(objnum==27) { E5.add(PB7);  }
            if(objnum==28) { E5.add(PB8);  }
            if(objnum==31) { E5.add(RW1);  }
            if(objnum==32) { E5.add(KNW1);  }
            if(objnum==33) { E5.add(BW1);  }
            if(objnum==34) { E5.add(QUEENW);  }
            if(objnum==35) { E5.add(KINGW);  }
            if(objnum==36) { E5.add(BW2);  }
            if(objnum==37) { E5.add(KNW2);  }
            if(objnum==38) { E5.add(RW2);  }
            if(objnum==41) { E5.add(RB1);  }
            if(objnum==42) { E5.add(KNB1);  }
            if(objnum==43) { E5.add(BB1);  }
            if(objnum==44) { E5.add(QUEENB);  }
            if(objnum==45) { E5.add(KINGB);  }
            if(objnum==46) { E5.add(BB2);  }
            if(objnum==47) { E5.add(KNB2);  }
            if(objnum==48) { E5.add(RB2);  } }
        if (xs==4 & ys==7) {
            if(objnum==11) { E6.add(PW1);  }
            if(objnum==12) { E6.add(PW2);  }
            if(objnum==13) { E6.add(PW3);  }
            if(objnum==14) { E6.add(PW4);  }
            if(objnum==15) { E6.add(PW5);  }
            if(objnum==16) { E6.add(PW6);  }
            if(objnum==17) { E6.add(PW7);  }
            if(objnum==18) { E6.add(PW8);  }
            if(objnum==21) { E6.add(PB1);  }
            if(objnum==22) { E6.add(PB2);  }
            if(objnum==23) { E6.add(PB3);  }
            if(objnum==24) { E6.add(PB4);  }
            if(objnum==25) { E6.add(PB5);  }
            if(objnum==26) { E6.add(PB6);  }
            if(objnum==27) { E6.add(PB7);  }
            if(objnum==28) { E6.add(PB8);  }
            if(objnum==31) { E6.add(RW1);  }
            if(objnum==32) { E6.add(KNW1);  }
            if(objnum==33) { E6.add(BW1);  }
            if(objnum==34) { E6.add(QUEENW);  }
            if(objnum==35) { E6.add(KINGW);  }
            if(objnum==36) { E6.add(BW2);  }
            if(objnum==37) { E6.add(KNW2);  }
            if(objnum==38) { E6.add(RW2);  }
            if(objnum==41) { E6.add(RB1);  }
            if(objnum==42) { E6.add(KNB1);  }
            if(objnum==43) { E6.add(BB1);  }
            if(objnum==44) { E6.add(QUEENB);  }
            if(objnum==45) { E6.add(KINGB);  }
            if(objnum==46) { E6.add(BB2);  }
            if(objnum==47) { E6.add(KNB2);  }
            if(objnum==48) { E6.add(RB2);  }  }
        if (xs==4 & ys==8) {
            if(objnum==11) { E7.add(PW1);  }
            if(objnum==12) { E7.add(PW2);  }
            if(objnum==13) { E7.add(PW3);  }
            if(objnum==14) { E7.add(PW4);  }
            if(objnum==15) { E7.add(PW5);  }
            if(objnum==16) { E7.add(PW6);  }
            if(objnum==17) { E7.add(PW7);  }
            if(objnum==18) { E7.add(PW8);  }
            if(objnum==21) { E7.add(PB1);  }
            if(objnum==22) { E7.add(PB2);  }
            if(objnum==23) { E7.add(PB3);  }
            if(objnum==24) { E7.add(PB4);  }
            if(objnum==25) { E7.add(PB5);  }
            if(objnum==26) { E7.add(PB6);  }
            if(objnum==27) { E7.add(PB7);  }
            if(objnum==28) { E7.add(PB8);  }
            if(objnum==31) { E7.add(RW1);  }
            if(objnum==32) { E7.add(KNW1);  }
            if(objnum==33) { E7.add(BW1);  }
            if(objnum==34) { E7.add(QUEENW);  }
            if(objnum==35) { E7.add(KINGW);  }
            if(objnum==36) { E7.add(BW2);  }
            if(objnum==37) { E7.add(KNW2);  }
            if(objnum==38) { E7.add(RW2);  }
            if(objnum==41) { E7.add(RB1);  }
            if(objnum==42) { E7.add(KNB1);  }
            if(objnum==43) { E7.add(BB1);  }
            if(objnum==44) { E7.add(QUEENB);  }
            if(objnum==45) { E7.add(KINGB);  }
            if(objnum==46) { E7.add(BB2);  }
            if(objnum==47) { E7.add(KNB2);  }
            if(objnum==48) { E7.add(RB2);  } }
        if (xs==5 & ys==1) {
            if(objnum==11) { F0.add(PW1);  }
            if(objnum==12) { F0.add(PW2);  }
            if(objnum==13) { F0.add(PW3);  }
            if(objnum==14) { F0.add(PW4);  }
            if(objnum==15) { F0.add(PW5);  }
            if(objnum==16) { F0.add(PW6);  }
            if(objnum==17) { F0.add(PW7);  }
            if(objnum==18) { F0.add(PW8);  }
            if(objnum==21) { F0.add(PB1);  }
            if(objnum==22) { F0.add(PB2);  }
            if(objnum==23) { F0.add(PB3);  }
            if(objnum==24) { F0.add(PB4);  }
            if(objnum==25) { F0.add(PB5);  }
            if(objnum==26) { F0.add(PB6);  }
            if(objnum==27) { F0.add(PB7);  }
            if(objnum==28) { F0.add(PB8);  }
            if(objnum==31) { F0.add(RW1);  }
            if(objnum==32) { F0.add(KNW1);  }
            if(objnum==33) { F0.add(BW1);  }
            if(objnum==34) { F0.add(QUEENW);  }
            if(objnum==35) { F0.add(KINGW);  }
            if(objnum==36) { F0.add(BW2);  }
            if(objnum==37) { F0.add(KNW2);  }
            if(objnum==38) { F0.add(RW2);  }
            if(objnum==41) { F0.add(RB1);  }
            if(objnum==42) { F0.add(KNB1);  }
            if(objnum==43) { F0.add(BB1);  }
            if(objnum==44) { F0.add(QUEENB);  }
            if(objnum==45) { F0.add(KINGB);  }
            if(objnum==46) { F0.add(BB2);  }
            if(objnum==47) { F0.add(KNB2);  }
            if(objnum==48) { F0.add(RB2);  } }
        if (xs==5 & ys==2) {
            if(objnum==11) { F1.add(PW1);  }
            if(objnum==12) { F1.add(PW2);  }
            if(objnum==13) { F1.add(PW3);  }
            if(objnum==14) { F1.add(PW4);  }
            if(objnum==15) { F1.add(PW5);  }
            if(objnum==16) { F1.add(PW6);  }
            if(objnum==17) { F1.add(PW7);  }
            if(objnum==18) { F1.add(PW8);  }
            if(objnum==21) { F1.add(PB1);  }
            if(objnum==22) { F1.add(PB2);  }
            if(objnum==23) { F1.add(PB3);  }
            if(objnum==24) { F1.add(PB4);  }
            if(objnum==25) { F1.add(PB5);  }
            if(objnum==26) { F1.add(PB6);  }
            if(objnum==27) { F1.add(PB7);  }
            if(objnum==28) { F1.add(PB8);  }
            if(objnum==31) { F1.add(RW1);  }
            if(objnum==32) { F1.add(KNW1);  }
            if(objnum==33) { F1.add(BW1);  }
            if(objnum==34) { F1.add(QUEENW);  }
            if(objnum==35) { F1.add(KINGW);  }
            if(objnum==36) { F1.add(BW2);  }
            if(objnum==37) { F1.add(KNW2);  }
            if(objnum==38) { F1.add(RW2);  }
            if(objnum==41) { F1.add(RB1);  }
            if(objnum==42) { F1.add(KNB1);  }
            if(objnum==43) { F1.add(BB1);  }
            if(objnum==44) { F1.add(QUEENB);  }
            if(objnum==45) { F1.add(KINGB);  }
            if(objnum==46) { F1.add(BB2);  }
            if(objnum==47) { F1.add(KNB2);  }
            if(objnum==48) { F1.add(RB2);  } }
        if (xs==5 & ys==3) {
            if(objnum==11) { F2.add(PW1);  }
            if(objnum==12) { F2.add(PW2);  }
            if(objnum==13) { F2.add(PW3);  }
            if(objnum==14) { F2.add(PW4);  }
            if(objnum==15) { F2.add(PW5);  }
            if(objnum==16) { F2.add(PW6);  }
            if(objnum==17) { F2.add(PW7);  }
            if(objnum==18) { F2.add(PW8);  }
            if(objnum==21) { F2.add(PB1);  }
            if(objnum==22) { F2.add(PB2);  }
            if(objnum==23) { F2.add(PB3);  }
            if(objnum==24) { F2.add(PB4);  }
            if(objnum==25) { F2.add(PB5);  }
            if(objnum==26) { F2.add(PB6);  }
            if(objnum==27) { F2.add(PB7);  }
            if(objnum==28) { F2.add(PB8);  }
            if(objnum==31) { F2.add(RW1);  }
            if(objnum==32) { F2.add(KNW1);  }
            if(objnum==33) { F2.add(BW1);  }
            if(objnum==34) { F2.add(QUEENW);  }
            if(objnum==35) { F2.add(KINGW);  }
            if(objnum==36) { F2.add(BW2);  }
            if(objnum==37) { F2.add(KNW2);  }
            if(objnum==38) { F2.add(RW2);  }
            if(objnum==41) { F2.add(RB1);  }
            if(objnum==42) { F2.add(KNB1);  }
            if(objnum==43) { F2.add(BB1);  }
            if(objnum==44) { F2.add(QUEENB);  }
            if(objnum==45) { F2.add(KINGB);  }
            if(objnum==46) { F2.add(BB2);  }
            if(objnum==47) { F2.add(KNB2);  }
            if(objnum==48) { F2.add(RB2);  } }
        if (xs==5 & ys==4) {
            if(objnum==11) { F3.add(PW1);  }
            if(objnum==12) { F3.add(PW2);  }
            if(objnum==13) { F3.add(PW3);  }
            if(objnum==14) { F3.add(PW4);  }
            if(objnum==15) { F3.add(PW5);  }
            if(objnum==16) { F3.add(PW6);  }
            if(objnum==17) { F3.add(PW7);  }
            if(objnum==18) { F3.add(PW8);  }
            if(objnum==21) { F3.add(PB1);  }
            if(objnum==22) { F3.add(PB2);  }
            if(objnum==23) { F3.add(PB3);  }
            if(objnum==24) { F3.add(PB4);  }
            if(objnum==25) { F3.add(PB5);  }
            if(objnum==26) { F3.add(PB6);  }
            if(objnum==27) { F3.add(PB7);  }
            if(objnum==28) { F3.add(PB8);  }
            if(objnum==31) { F3.add(RW1);  }
            if(objnum==32) { F3.add(KNW1);  }
            if(objnum==33) { F3.add(BW1);  }
            if(objnum==34) { F3.add(QUEENW);  }
            if(objnum==35) { F3.add(KINGW);  }
            if(objnum==36) { F3.add(BW2);  }
            if(objnum==37) { F3.add(KNW2);  }
            if(objnum==38) { F3.add(RW2);  }
            if(objnum==41) { F3.add(RB1);  }
            if(objnum==42) { F3.add(KNB1);  }
            if(objnum==43) { F3.add(BB1);  }
            if(objnum==44) { F3.add(QUEENB);  }
            if(objnum==45) { F3.add(KINGB);  }
            if(objnum==46) { F3.add(BB2);  }
            if(objnum==47) { F3.add(KNB2);  }
            if(objnum==48) { F3.add(RB2);  } 
        }
        if (xs==5 & ys==5) {             
            if(objnum==11) { F4.add(PW1);  }
            if(objnum==12) { F4.add(PW2);  }
            if(objnum==13) { F4.add(PW3);  }
            if(objnum==14) { F4.add(PW4);  }
            if(objnum==15) { F4.add(PW5);  }
            if(objnum==16) { F4.add(PW6);  }
            if(objnum==17) { F4.add(PW7);  }
            if(objnum==18) { F4.add(PW8);  }
            if(objnum==21) { F4.add(PB1);  }
            if(objnum==22) { F4.add(PB2);  }
            if(objnum==23) { F4.add(PB3);  }
            if(objnum==24) { F4.add(PB4);  }
            if(objnum==25) { F4.add(PB5);  }
            if(objnum==26) { F4.add(PB6);  }
            if(objnum==27) { F4.add(PB7);  }
            if(objnum==28) { F4.add(PB8);  }
            if(objnum==31) { F4.add(RW1);  }
            if(objnum==32) { F4.add(KNW1);  }
            if(objnum==33) { F4.add(BW1);  }
            if(objnum==34) { F4.add(QUEENW);  }
            if(objnum==35) { F4.add(KINGW);  }
            if(objnum==36) { F4.add(BW2);  }
            if(objnum==37) { F4.add(KNW2);  }
            if(objnum==38) { F4.add(RW2);  }
            if(objnum==41) { F4.add(RB1);  }
            if(objnum==42) { F4.add(KNB1);  }
            if(objnum==43) { F4.add(BB1);  }
            if(objnum==44) { F4.add(QUEENB);  }
            if(objnum==45) { F4.add(KINGB);  }
            if(objnum==46) { F4.add(BB2);  }
            if(objnum==47) { F4.add(KNB2);  }
            if(objnum==48) { F4.add(RB2);  }  
        }
        if (xs==5 & ys==6) {
            if(objnum==11) { F5.add(PW1);  }
            if(objnum==12) { F5.add(PW2);  }
            if(objnum==13) { F5.add(PW3);  }
            if(objnum==14) { F5.add(PW4);  }
            if(objnum==15) { F5.add(PW5);  }
            if(objnum==16) { F5.add(PW6);  }
            if(objnum==17) { F5.add(PW7);  }
            if(objnum==18) { F5.add(PW8);  }
            if(objnum==21) { F5.add(PB1);  }
            if(objnum==22) { F5.add(PB2);  }
            if(objnum==23) { F5.add(PB3);  }
            if(objnum==24) { F5.add(PB4);  }
            if(objnum==25) { F5.add(PB5);  }
            if(objnum==26) { F5.add(PB6);  }
            if(objnum==27) { F5.add(PB7);  }
            if(objnum==28) { F5.add(PB8);  }
            if(objnum==31) { F5.add(RW1);  }
            if(objnum==32) { F5.add(KNW1);  }
            if(objnum==33) { F5.add(BW1);  }
            if(objnum==34) { F5.add(QUEENW);  }
            if(objnum==35) { F5.add(KINGW);  }
            if(objnum==36) { F5.add(BW2);  }
            if(objnum==37) { F5.add(KNW2);  }
            if(objnum==38) { F5.add(RW2);  }
            if(objnum==41) { F5.add(RB1);  }
            if(objnum==42) { F5.add(KNB1);  }
            if(objnum==43) { F5.add(BB1);  }
            if(objnum==44) { F5.add(QUEENB);  }
            if(objnum==45) { F5.add(KINGB);  }
            if(objnum==46) { F5.add(BB2);  }
            if(objnum==47) { F5.add(KNB2);  }
            if(objnum==48) { F5.add(RB2);  }   
        }
        if (xs==5 & ys==7) {
            if(objnum==11) { F6.add(PW1);  }
            if(objnum==12) { F6.add(PW2);  }
            if(objnum==13) { F6.add(PW3);  }
            if(objnum==14) { F6.add(PW4);  }
            if(objnum==15) { F6.add(PW5);  }
            if(objnum==16) { F6.add(PW6);  }
            if(objnum==17) { F6.add(PW7);  }
            if(objnum==18) { F6.add(PW8);  }
            if(objnum==21) { F6.add(PB1);  }
            if(objnum==22) { F6.add(PB2);  }
            if(objnum==23) { F6.add(PB3);  }
            if(objnum==24) { F6.add(PB4);  }
            if(objnum==25) { F6.add(PB5);  }
            if(objnum==26) { F6.add(PB6);  }
            if(objnum==27) { F6.add(PB7);  }
            if(objnum==28) { F6.add(PB8);  }
            if(objnum==31) { F6.add(RW1);  }
            if(objnum==32) { F6.add(KNW1);  }
            if(objnum==33) { F6.add(BW1);  }
            if(objnum==34) { F6.add(QUEENW);  }
            if(objnum==35) { F6.add(KINGW);  }
            if(objnum==36) { F6.add(BW2);  }
            if(objnum==37) { F6.add(KNW2);  }
            if(objnum==38) { F6.add(RW2);  }
            if(objnum==41) { F6.add(RB1);  }
            if(objnum==42) { F6.add(KNB1);  }
            if(objnum==43) { F6.add(BB1);  }
            if(objnum==44) { F6.add(QUEENB);  }
            if(objnum==45) { F6.add(KINGB);  }
            if(objnum==46) { F6.add(BB2);  }
            if(objnum==47) { F6.add(KNB2);  }
            if(objnum==48) { F6.add(RB2);  } 
        }
        if (xs==5 & ys==8) {
            if(objnum==11) { F7.add(PW1);  }
            if(objnum==12) { F7.add(PW2);  }
            if(objnum==13) { F7.add(PW3);  }
            if(objnum==14) { F7.add(PW4);  }
            if(objnum==15) { F7.add(PW5);  }
            if(objnum==16) { F7.add(PW6);  }
            if(objnum==17) { F7.add(PW7);  }
            if(objnum==18) { F7.add(PW8);  }
            if(objnum==21) { F7.add(PB1);  }
            if(objnum==22) { F7.add(PB2);  }
            if(objnum==23) { F7.add(PB3);  }
            if(objnum==24) { F7.add(PB4);  }
            if(objnum==25) { F7.add(PB5);  }
            if(objnum==26) { F7.add(PB6);  }
            if(objnum==27) { F7.add(PB7);  }
            if(objnum==28) { F7.add(PB8);  }
            if(objnum==31) { F7.add(RW1);  }
            if(objnum==32) { F7.add(KNW1);  }
            if(objnum==33) { F7.add(BW1);  }
            if(objnum==34) { F7.add(QUEENW);  }
            if(objnum==35) { F7.add(KINGW);  }
            if(objnum==36) { F7.add(BW2);  }
            if(objnum==37) { F7.add(KNW2);  }
            if(objnum==38) { F7.add(RW2);  }
            if(objnum==41) { F7.add(RB1);  }
            if(objnum==42) { F7.add(KNB1);  }
            if(objnum==43) { F7.add(BB1);  }
            if(objnum==44) { F7.add(QUEENB);  }
            if(objnum==45) { F7.add(KINGB);  }
            if(objnum==46) { F7.add(BB2);  }
            if(objnum==47) { F7.add(KNB2);  }
            if(objnum==48) { F7.add(RB2);  }  }
        if (xs==6 & ys==1) {
            if(objnum==11) { G0.add(PW1);  }
            if(objnum==12) { G0.add(PW2);  }
            if(objnum==13) { G0.add(PW3);  }
            if(objnum==14) { G0.add(PW4);  }
            if(objnum==15) { G0.add(PW5);  }
            if(objnum==16) { G0.add(PW6);  }
            if(objnum==17) { G0.add(PW7);  }
            if(objnum==18) { G0.add(PW8);  }
            if(objnum==21) { G0.add(PB1);  }
            if(objnum==22) { G0.add(PB2);  }
            if(objnum==23) { G0.add(PB3);  }
            if(objnum==24) { G0.add(PB4);  }
            if(objnum==25) { G0.add(PB5);  }
            if(objnum==26) { G0.add(PB6);  }
            if(objnum==27) { G0.add(PB7);  }
            if(objnum==28) { G0.add(PB8);  }
            if(objnum==31) { G0.add(RW1);  }
            if(objnum==32) { G0.add(KNW1);  }
            if(objnum==33) { G0.add(BW1);  }
            if(objnum==34) { G0.add(QUEENW);  }
            if(objnum==35) { G0.add(KINGW);  }
            if(objnum==36) { G0.add(BW2);  }
            if(objnum==37) { G0.add(KNW2);  }
            if(objnum==38) { G0.add(RW2);  }
            if(objnum==41) { G0.add(RB1);  }
            if(objnum==42) { G0.add(KNB1);  }
            if(objnum==43) { G0.add(BB1);  }
            if(objnum==44) { G0.add(QUEENB);  }
            if(objnum==45) { G0.add(KINGB);  }
            if(objnum==46) { G0.add(BB2);  }
            if(objnum==47) { G0.add(KNB2);  }
            if(objnum==48) { G0.add(RB2);  }  }
        if (xs==6 & ys==2) {
            if(objnum==11) { G1.add(PW1);  }
            if(objnum==12) { G1.add(PW2);  }
            if(objnum==13) { G1.add(PW3);  }
            if(objnum==14) { G1.add(PW4);  }
            if(objnum==15) { G1.add(PW5);  }
            if(objnum==16) { G1.add(PW6);  }
            if(objnum==17) { G1.add(PW7);  }
            if(objnum==18) { G1.add(PW8);  }
            if(objnum==21) { G1.add(PB1);  }
            if(objnum==22) { G1.add(PB2);  }
            if(objnum==23) { G1.add(PB3);  }
            if(objnum==24) { G1.add(PB4);  }
            if(objnum==25) { G1.add(PB5);  }
            if(objnum==26) { G1.add(PB6);  }
            if(objnum==27) { G1.add(PB7);  }
            if(objnum==28) { G1.add(PB8);  }
            if(objnum==31) { G1.add(RW1);  }
            if(objnum==32) { G1.add(KNW1);  }
            if(objnum==33) { G1.add(BW1);  }
            if(objnum==34) { G1.add(QUEENW);  }
            if(objnum==35) { G1.add(KINGW);  }
            if(objnum==36) { G1.add(BW2);  }
            if(objnum==37) { G1.add(KNW2);  }
            if(objnum==38) { G1.add(RW2);  }
            if(objnum==41) { G1.add(RB1);  }
            if(objnum==42) { G1.add(KNB1);  }
            if(objnum==43) { G1.add(BB1);  }
            if(objnum==44) { G1.add(QUEENB);  }
            if(objnum==45) { G1.add(KINGB);  }
            if(objnum==46) { G1.add(BB2);  }
            if(objnum==47) { G1.add(KNB2);  }
            if(objnum==48) { G1.add(RB2);  }  }
        if (xs==6 & ys==3) {
            if(objnum==11) { G2.add(PW1);  }
            if(objnum==12) { G2.add(PW2);  }
            if(objnum==13) { G2.add(PW3);  }
            if(objnum==14) { G2.add(PW4);  }
            if(objnum==15) { G2.add(PW5);  }
            if(objnum==16) { G2.add(PW6);  }
            if(objnum==17) { G2.add(PW7);  }
            if(objnum==18) { G2.add(PW8);  }
            if(objnum==21) { G2.add(PB1);  }
            if(objnum==22) { G2.add(PB2);  }
            if(objnum==23) { G2.add(PB3);  }
            if(objnum==24) { G2.add(PB4);  }
            if(objnum==25) { G2.add(PB5);  }
            if(objnum==26) { G2.add(PB6);  }
            if(objnum==27) { G2.add(PB7);  }
            if(objnum==28) { G2.add(PB8);  }
            if(objnum==31) { G2.add(RW1);  }
            if(objnum==32) { G2.add(KNW1);  }
            if(objnum==33) { G2.add(BW1);  }
            if(objnum==34) { G2.add(QUEENW);  }
            if(objnum==35) { G2.add(KINGW);  }
            if(objnum==36) { G2.add(BW2);  }
            if(objnum==37) { G2.add(KNW2);  }
            if(objnum==38) { G2.add(RW2);  }
            if(objnum==41) { G2.add(RB1);  }
            if(objnum==42) { G2.add(KNB1);  }
            if(objnum==43) { G2.add(BB1);  }
            if(objnum==44) { G2.add(QUEENB);  }
            if(objnum==45) { G2.add(KINGB);  }
            if(objnum==46) { G2.add(BB2);  }
            if(objnum==47) { G2.add(KNB2);  }
            if(objnum==48) { G2.add(RB2);  }  }
        if (xs==6 & ys==4) {
            if(objnum==11) { G3.add(PW1);  }
            if(objnum==12) { G3.add(PW2);  }
            if(objnum==13) { G3.add(PW3);  }
            if(objnum==14) { G3.add(PW4);  }
            if(objnum==15) { G3.add(PW5);  }
            if(objnum==16) { G3.add(PW6);  }
            if(objnum==17) { G3.add(PW7);  }
            if(objnum==18) { G3.add(PW8);  }
            if(objnum==21) { G3.add(PB1);  }
            if(objnum==22) { G3.add(PB2);  }
            if(objnum==23) { G3.add(PB3);  }
            if(objnum==24) { G3.add(PB4);  }
            if(objnum==25) { G3.add(PB5);  }
            if(objnum==26) { G3.add(PB6);  }
            if(objnum==27) { G3.add(PB7);  }
            if(objnum==28) { G3.add(PB8);  }
            if(objnum==31) { G3.add(RW1);  }
            if(objnum==32) { G3.add(KNW1);  }
            if(objnum==33) { G3.add(BW1);  }
            if(objnum==34) { G3.add(QUEENW);  }
            if(objnum==35) { G3.add(KINGW);  }
            if(objnum==36) { G3.add(BW2);  }
            if(objnum==37) { G3.add(KNW2);  }
            if(objnum==38) { G3.add(RW2);  }
            if(objnum==41) { G3.add(RB1);  }
            if(objnum==42) { G3.add(KNB1);  }
            if(objnum==43) { G3.add(BB1);  }
            if(objnum==44) { G3.add(QUEENB);  }
            if(objnum==45) { G3.add(KINGB);  }
            if(objnum==46) { G3.add(BB2);  }
            if(objnum==47) { G3.add(KNB2);  }
            if(objnum==48) { G3.add(RB2);  }  }
        if (xs==6 & ys==5) {
            if(objnum==11) { G4.add(PW1);  }
            if(objnum==12) { G4.add(PW2);  }
            if(objnum==13) { G4.add(PW3);  }
            if(objnum==14) { G4.add(PW4);  }
            if(objnum==15) { G4.add(PW5);  }
            if(objnum==16) { G4.add(PW6);  }
            if(objnum==17) { G4.add(PW7);  }
            if(objnum==18) { G4.add(PW8);  }
            if(objnum==21) { G4.add(PB1);  }
            if(objnum==22) { G4.add(PB2);  }
            if(objnum==23) { G4.add(PB3);  }
            if(objnum==24) { G4.add(PB4);  }
            if(objnum==25) { G4.add(PB5);  }
            if(objnum==26) { G4.add(PB6);  }
            if(objnum==27) { G4.add(PB7);  }
            if(objnum==28) { G4.add(PB8);  }
            if(objnum==31) { G4.add(RW1);  }
            if(objnum==32) { G4.add(KNW1);  }
            if(objnum==33) { G4.add(BW1);  }
            if(objnum==34) { G4.add(QUEENW);  }
            if(objnum==35) { G4.add(KINGW);  }
            if(objnum==36) { G4.add(BW2);  }
            if(objnum==37) { G4.add(KNW2);  }
            if(objnum==38) { G4.add(RW2);  }
            if(objnum==41) { G4.add(RB1);  }
            if(objnum==42) { G4.add(KNB1);  }
            if(objnum==43) { G4.add(BB1);  }
            if(objnum==44) { G4.add(QUEENB);  }
            if(objnum==45) { G4.add(KINGB);  }
            if(objnum==46) { G4.add(BB2);  }
            if(objnum==47) { G4.add(KNB2);  }
            if(objnum==48) { G4.add(RB2);  }  }
        if (xs==6 & ys==6) {
            if(objnum==11) { G5.add(PW1);  }
            if(objnum==12) { G5.add(PW2);  }
            if(objnum==13) { G5.add(PW3);  }
            if(objnum==14) { G5.add(PW4);  }
            if(objnum==15) { G5.add(PW5);  }
            if(objnum==16) { G5.add(PW6);  }
            if(objnum==17) { G5.add(PW7);  }
            if(objnum==18) { G5.add(PW8);  }
            if(objnum==21) { G5.add(PB1);  }
            if(objnum==22) { G5.add(PB2);  }
            if(objnum==23) { G5.add(PB3);  }
            if(objnum==24) { G5.add(PB4);  }
            if(objnum==25) { G5.add(PB5);  }
            if(objnum==26) { G5.add(PB6);  }
            if(objnum==27) { G5.add(PB7);  }
            if(objnum==28) { G5.add(PB8);  }
            if(objnum==31) { G5.add(RW1);  }
            if(objnum==32) { G5.add(KNW1);  }
            if(objnum==33) { G5.add(BW1);  }
            if(objnum==34) { G5.add(QUEENW);  }
            if(objnum==35) { G5.add(KINGW);  }
            if(objnum==36) { G5.add(BW2);  }
            if(objnum==37) { G5.add(KNW2);  }
            if(objnum==38) { G5.add(RW2);  }
            if(objnum==41) { G5.add(RB1);  }
            if(objnum==42) { G5.add(KNB1);  }
            if(objnum==43) { G5.add(BB1);  }
            if(objnum==44) { G5.add(QUEENB);  }
            if(objnum==45) { G5.add(KINGB);  }
            if(objnum==46) { G5.add(BB2);  }
            if(objnum==47) { G5.add(KNB2);  }
            if(objnum==48) { G5.add(RB2);  }  }
        if (xs==6 & ys==7) {
            if(objnum==11) { G6.add(PW1);  }
            if(objnum==12) { G6.add(PW2);  }
            if(objnum==13) { G6.add(PW3);  }
            if(objnum==14) { G6.add(PW4);  }
            if(objnum==15) { G6.add(PW5);  }
            if(objnum==16) { G6.add(PW6);  }
            if(objnum==17) { G6.add(PW7);  }
            if(objnum==18) { G6.add(PW8);  }
            if(objnum==21) { G6.add(PB1);  }
            if(objnum==22) { G6.add(PB2);  }
            if(objnum==23) { G6.add(PB3);  }
            if(objnum==24) { G6.add(PB4);  }
            if(objnum==25) { G6.add(PB5);  }
            if(objnum==26) { G6.add(PB6);  }
            if(objnum==27) { G6.add(PB7);  }
            if(objnum==28) { G6.add(PB8);  }
            if(objnum==31) { G6.add(RW1);  }
            if(objnum==32) { G6.add(KNW1);  }
            if(objnum==33) { G6.add(BW1);  }
            if(objnum==34) { G6.add(QUEENW);  }
            if(objnum==35) { G6.add(KINGW);  }
            if(objnum==36) { G6.add(BW2);  }
            if(objnum==37) { G6.add(KNW2);  }
            if(objnum==38) { G6.add(RW2);  }
            if(objnum==41) { G6.add(RB1);  }
            if(objnum==42) { G6.add(KNB1);  }
            if(objnum==43) { G6.add(BB1);  }
            if(objnum==44) { G6.add(QUEENB);  }
            if(objnum==45) { G6.add(KINGB);  }
            if(objnum==46) { G6.add(BB2);  }
            if(objnum==47) { G6.add(KNB2);  }
            if(objnum==48) { G6.add(RB2);  }   }
        if (xs==6 & ys==8) {
            if(objnum==11) { G7.add(PW1);  }
            if(objnum==12) { G7.add(PW2);  }
            if(objnum==13) { G7.add(PW3);  }
            if(objnum==14) { G7.add(PW4);  }
            if(objnum==15) { G7.add(PW5);  }
            if(objnum==16) { G7.add(PW6);  }
            if(objnum==17) { G7.add(PW7);  }
            if(objnum==18) { G7.add(PW8);  }
            if(objnum==21) { G7.add(PB1);  }
            if(objnum==22) { G7.add(PB2);  }
            if(objnum==23) { G7.add(PB3);  }
            if(objnum==24) { G7.add(PB4);  }
            if(objnum==25) { G7.add(PB5);  }
            if(objnum==26) { G7.add(PB6);  }
            if(objnum==27) { G7.add(PB7);  }
            if(objnum==28) { G7.add(PB8);  }
            if(objnum==31) { G7.add(RW1);  }
            if(objnum==32) { G7.add(KNW1);  }
            if(objnum==33) { G7.add(BW1);  }
            if(objnum==34) { G7.add(QUEENW);  }
            if(objnum==35) { G7.add(KINGW);  }
            if(objnum==36) { G7.add(BW2);  }
            if(objnum==37) { G7.add(KNW2);  }
            if(objnum==38) { G7.add(RW2);  }
            if(objnum==41) { G7.add(RB1);  }
            if(objnum==42) { G7.add(KNB1);  }
            if(objnum==43) { G7.add(BB1);  }
            if(objnum==44) { G7.add(QUEENB);  }
            if(objnum==45) { G7.add(KINGB);  }
            if(objnum==46) { G7.add(BB2);  }
            if(objnum==47) { G7.add(KNB2);  }
            if(objnum==48) { G7.add(RB2);  } }
        if (xs==7 & ys==1) {
            if(objnum==11) { H0.add(PW1);  }
            if(objnum==12) { H0.add(PW2);  }
            if(objnum==13) { H0.add(PW3);  }
            if(objnum==14) { H0.add(PW4);  }
            if(objnum==15) { H0.add(PW5);  }
            if(objnum==16) { H0.add(PW6);  }
            if(objnum==17) { H0.add(PW7);  }
            if(objnum==18) { H0.add(PW8);  }
            if(objnum==21) { H0.add(PB1);  }
            if(objnum==22) { H0.add(PB2);  }
            if(objnum==23) { H0.add(PB3);  }
            if(objnum==24) { H0.add(PB4);  }
            if(objnum==25) { H0.add(PB5);  }
            if(objnum==26) { H0.add(PB6);  }
            if(objnum==27) { H0.add(PB7);  }
            if(objnum==28) { H0.add(PB8);  }
            if(objnum==31) { H0.add(RW1);  }
            if(objnum==32) { H0.add(KNW1);  }
            if(objnum==33) { H0.add(BW1);  }
            if(objnum==34) { H0.add(QUEENW);  }
            if(objnum==35) { H0.add(KINGW);  }
            if(objnum==36) { H0.add(BW2);  }
            if(objnum==37) { H0.add(KNW2);  }
            if(objnum==38) { H0.add(RW2);  }
            if(objnum==41) { H0.add(RB1);  }
            if(objnum==42) { H0.add(KNB1);  }
            if(objnum==43) { H0.add(BB1);  }
            if(objnum==44) { H0.add(QUEENB);  }
            if(objnum==45) { H0.add(KINGB);  }
            if(objnum==46) { H0.add(BB2);  }
            if(objnum==47) { H0.add(KNB2);  }
            if(objnum==48) { H0.add(RB2);  }  }
        if (xs==7 & ys==2) {
            if(objnum==11) { H1.add(PW1);  }
            if(objnum==12) { H1.add(PW2);  }
            if(objnum==13) { H1.add(PW3);  }
            if(objnum==14) { H1.add(PW4);  }
            if(objnum==15) { H1.add(PW5);  }
            if(objnum==16) { H1.add(PW6);  }
            if(objnum==17) { H1.add(PW7);  }
            if(objnum==18) { H1.add(PW8);  }
            if(objnum==21) { H1.add(PB1);  }
            if(objnum==22) { H1.add(PB2);  }
            if(objnum==23) { H1.add(PB3);  }
            if(objnum==24) { H1.add(PB4);  }
            if(objnum==25) { H1.add(PB5);  }
            if(objnum==26) { H1.add(PB6);  }
            if(objnum==27) { H1.add(PB7);  }
            if(objnum==28) { H1.add(PB8);  }
            if(objnum==31) { H1.add(RW1);  }
            if(objnum==32) { H1.add(KNW1);  }
            if(objnum==33) { H1.add(BW1);  }
            if(objnum==34) { H1.add(QUEENW);  }
            if(objnum==35) { H1.add(KINGW);  }
            if(objnum==36) { H1.add(BW2);  }
            if(objnum==37) { H1.add(KNW2);  }
            if(objnum==38) { H1.add(RW2);  }
            if(objnum==41) { H1.add(RB1);  }
            if(objnum==42) { H1.add(KNB1);  }
            if(objnum==43) { H1.add(BB1);  }
            if(objnum==44) { H1.add(QUEENB);  }
            if(objnum==45) { H1.add(KINGB);  }
            if(objnum==46) { H1.add(BB2);  }
            if(objnum==47) { H1.add(KNB2);  }
            if(objnum==48) { H1.add(RB2);  }  }
        if (xs==7 & ys==3) {
            if(objnum==11) { H2.add(PW1);  }
            if(objnum==12) { H2.add(PW2);  }
            if(objnum==13) { H2.add(PW3);  }
            if(objnum==14) { H2.add(PW4);  }
            if(objnum==15) { H2.add(PW5);  }
            if(objnum==16) { H2.add(PW6);  }
            if(objnum==17) { H2.add(PW7);  }
            if(objnum==18) { H2.add(PW8);  }
            if(objnum==21) { H2.add(PB1);  }
            if(objnum==22) { H2.add(PB2);  }
            if(objnum==23) { H2.add(PB3);  }
            if(objnum==24) { H2.add(PB4);  }
            if(objnum==25) { H2.add(PB5);  }
            if(objnum==26) { H2.add(PB6);  }
            if(objnum==27) { H2.add(PB7);  }
            if(objnum==28) { H2.add(PB8);  }
            if(objnum==31) { H2.add(RW1);  }
            if(objnum==32) { H2.add(KNW1);  }
            if(objnum==33) { H2.add(BW1);  }
            if(objnum==34) { H2.add(QUEENW);  }
            if(objnum==35) { H2.add(KINGW);  }
            if(objnum==36) { H2.add(BW2);  }
            if(objnum==37) { H2.add(KNW2);  }
            if(objnum==38) { H2.add(RW2);  }
            if(objnum==41) { H2.add(RB1);  }
            if(objnum==42) { H2.add(KNB1);  }
            if(objnum==43) { H2.add(BB1);  }
            if(objnum==44) { H2.add(QUEENB);  }
            if(objnum==45) { H2.add(KINGB);  }
            if(objnum==46) { H2.add(BB2);  }
            if(objnum==47) { H2.add(KNB2);  }
            if(objnum==48) { H2.add(RB2);  }  }
        if (xs==7 & ys==4) {
            if(objnum==11) { H3.add(PW1);  }
            if(objnum==12) { H3.add(PW2);  }
            if(objnum==13) { H3.add(PW3);  }
            if(objnum==14) { H3.add(PW4);  }
            if(objnum==15) { H3.add(PW5);  }
            if(objnum==16) { H3.add(PW6);  }
            if(objnum==17) { H3.add(PW7);  }
            if(objnum==18) { H3.add(PW8);  }
            if(objnum==21) { H3.add(PB1);  }
            if(objnum==22) { H3.add(PB2);  }
            if(objnum==23) { H3.add(PB3);  }
            if(objnum==24) { H3.add(PB4);  }
            if(objnum==25) { H3.add(PB5);  }
            if(objnum==26) { H3.add(PB6);  }
            if(objnum==27) { H3.add(PB7);  }
            if(objnum==28) { H3.add(PB8);  }
            if(objnum==31) { H3.add(RW1);  }
            if(objnum==32) { H3.add(KNW1);  }
            if(objnum==33) { H3.add(BW1);  }
            if(objnum==34) { H3.add(QUEENW);  }
            if(objnum==35) { H3.add(KINGW);  }
            if(objnum==36) { H3.add(BW2);  }
            if(objnum==37) { H3.add(KNW2);  }
            if(objnum==38) { H3.add(RW2);  }
            if(objnum==41) { H3.add(RB1);  }
            if(objnum==42) { H3.add(KNB1);  }
            if(objnum==43) { H3.add(BB1);  }
            if(objnum==44) { H3.add(QUEENB);  }
            if(objnum==45) { H3.add(KINGB);  }
            if(objnum==46) { H3.add(BB2);  }
            if(objnum==47) { H3.add(KNB2);  }
            if(objnum==48) { H3.add(RB2);  }  }
        if (xs==7 & ys==5) {
            if(objnum==11) { H4.add(PW1);  }
            if(objnum==12) { H4.add(PW2);  }
            if(objnum==13) { H4.add(PW3);  }
            if(objnum==14) { H4.add(PW4);  }
            if(objnum==15) { H4.add(PW5);  }
            if(objnum==16) { H4.add(PW6);  }
            if(objnum==17) { H4.add(PW7);  }
            if(objnum==18) { H4.add(PW8);  }
            if(objnum==21) { H4.add(PB1);  }
            if(objnum==22) { H4.add(PB2);  }
            if(objnum==23) { H4.add(PB3);  }
            if(objnum==24) { H4.add(PB4);  }
            if(objnum==25) { H4.add(PB5);  }
            if(objnum==26) { H4.add(PB6);  }
            if(objnum==27) { H4.add(PB7);  }
            if(objnum==28) { H4.add(PB8);  }
            if(objnum==31) { H4.add(RW1);  }
            if(objnum==32) { H4.add(KNW1);  }
            if(objnum==33) { H4.add(BW1);  }
            if(objnum==34) { H4.add(QUEENW);  }
            if(objnum==35) { H4.add(KINGW);  }
            if(objnum==36) { H4.add(BW2);  }
            if(objnum==37) { H4.add(KNW2);  }
            if(objnum==38) { H4.add(RW2);  }
            if(objnum==41) { H4.add(RB1);  }
            if(objnum==42) { H4.add(KNB1);  }
            if(objnum==43) { H4.add(BB1);  }
            if(objnum==44) { H4.add(QUEENB);  }
            if(objnum==45) { H4.add(KINGB);  }
            if(objnum==46) { H4.add(BB2);  }
            if(objnum==47) { H4.add(KNB2);  }
            if(objnum==48) { H4.add(RB2);  }  }
        if (xs==7 & ys==6) {
            if(objnum==11) { H5.add(PW1);  }
            if(objnum==12) { H5.add(PW2);  }
            if(objnum==13) { H5.add(PW3);  }
            if(objnum==14) { H5.add(PW4);  }
            if(objnum==15) { H5.add(PW5);  }
            if(objnum==16) { H5.add(PW6);  }
            if(objnum==17) { H5.add(PW7);  }
            if(objnum==18) { H5.add(PW8);  }
            if(objnum==21) { H5.add(PB1);  }
            if(objnum==22) { H5.add(PB2);  }
            if(objnum==23) { H5.add(PB3);  }
            if(objnum==24) { H5.add(PB4);  }
            if(objnum==25) { H5.add(PB5);  }
            if(objnum==26) { H5.add(PB6);  }
            if(objnum==27) { H5.add(PB7);  }
            if(objnum==28) { H5.add(PB8);  }
            if(objnum==31) { H5.add(RW1);  }
            if(objnum==32) { H5.add(KNW1);  }
            if(objnum==33) { H5.add(BW1);  }
            if(objnum==34) { H5.add(QUEENW);  }
            if(objnum==35) { H5.add(KINGW);  }
            if(objnum==36) { H5.add(BW2);  }
            if(objnum==37) { H5.add(KNW2);  }
            if(objnum==38) { H5.add(RW2);  }
            if(objnum==41) { H5.add(RB1);  }
            if(objnum==42) { H5.add(KNB1);  }
            if(objnum==43) { H5.add(BB1);  }
            if(objnum==44) { H5.add(QUEENB);  }
            if(objnum==45) { H5.add(KINGB);  }
            if(objnum==46) { H5.add(BB2);  }
            if(objnum==47) { H5.add(KNB2);  }
            if(objnum==48) { H5.add(RB2);  }  }
        if (xs==7 & ys==7) {
            if(objnum==11) { H6.add(PW1);  }
            if(objnum==12) { H6.add(PW2);  }
            if(objnum==13) { H6.add(PW3);  }
            if(objnum==14) { H6.add(PW4);  }
            if(objnum==15) { H6.add(PW5);  }
            if(objnum==16) { H6.add(PW6);  }
            if(objnum==17) { H6.add(PW7);  }
            if(objnum==18) { H6.add(PW8);  }
            if(objnum==21) { H6.add(PB1);  }
            if(objnum==22) { H6.add(PB2);  }
            if(objnum==23) { H6.add(PB3);  }
            if(objnum==24) { H6.add(PB4);  }
            if(objnum==25) { H6.add(PB5);  }
            if(objnum==26) { H6.add(PB6);  }
            if(objnum==27) { H6.add(PB7);  }
            if(objnum==28) { H6.add(PB8);  }
            if(objnum==31) { H6.add(RW1);  }
            if(objnum==32) { H6.add(KNW1);  }
            if(objnum==33) { H6.add(BW1);  }
            if(objnum==34) { H6.add(QUEENW);  }
            if(objnum==35) { H6.add(KINGW);  }
            if(objnum==36) { H6.add(BW2);  }
            if(objnum==37) { H6.add(KNW2);  }
            if(objnum==38) { H6.add(RW2);  }
            if(objnum==41) { H6.add(RB1);  }
            if(objnum==42) { H6.add(KNB1);  }
            if(objnum==43) { H6.add(BB1);  }
            if(objnum==44) { H6.add(QUEENB);  }
            if(objnum==45) { H6.add(KINGB);  }
            if(objnum==46) { H6.add(BB2);  }
            if(objnum==47) { H6.add(KNB2);  }
            if(objnum==48) { H6.add(RB2);  }  }
        if (xs==7 & ys==8) {
            if(objnum==11) { H7.add(PW1);  }
            if(objnum==12) { H7.add(PW2);  }
            if(objnum==13) { H7.add(PW3);  }
            if(objnum==14) { H7.add(PW4);  }
            if(objnum==15) { H7.add(PW5);  }
            if(objnum==16) { H7.add(PW6);  }
            if(objnum==17) { H7.add(PW7);  }
            if(objnum==18) { H7.add(PW8);  }
            if(objnum==21) { H7.add(PB1);  }
            if(objnum==22) { H7.add(PB2);  }
            if(objnum==23) { H7.add(PB3);  }
            if(objnum==24) { H7.add(PB4);  }
            if(objnum==25) { H7.add(PB5);  }
            if(objnum==26) { H7.add(PB6);  }
            if(objnum==27) { H7.add(PB7);  }
            if(objnum==28) { H7.add(PB8);  }
            if(objnum==31) { H7.add(RW1);  }
            if(objnum==32) { H7.add(KNW1);  }
            if(objnum==33) { H7.add(BW1);  }
            if(objnum==34) { H7.add(QUEENW);  }
            if(objnum==35) { H7.add(KINGW);  }
            if(objnum==36) { H7.add(BW2);  }
            if(objnum==37) { H7.add(KNW2);  }
            if(objnum==38) { H7.add(RW2);  }
            if(objnum==41) { H7.add(RB1);  }
            if(objnum==42) { H7.add(KNB1);  }
            if(objnum==43) { H7.add(BB1);  }
            if(objnum==44) { H7.add(QUEENB);  }
            if(objnum==45) { H7.add(KINGB);  }
            if(objnum==46) { H7.add(BB2);  }
            if(objnum==47) { H7.add(KNB2);  }
            if(objnum==48) { H7.add(RB2);  }
        }
    }

    public void ChessPieceLoad(){
        A0.add(RW1);
        A1.add(KNW1);
        A2.add(BW1);
        A3.add(QUEENW);
        A4.add(KINGW);
        A5.add(BW2);
        A6.add(KNW2);
        A7.add(RW2);

        B0.add(PW1);
        B1.add(PW2);
        B2.add(PW3);
        B3.add(PW4);
        B4.add(PW5);
        B5.add(PW6);
        B6.add(PW7);
        B7.add(PW8);

        G0.add(PB1);
        G1.add(PB2);
        G2.add(PB3);
        G3.add(PB4);
        G4.add(PB5);
        G5.add(PB6);
        G6.add(PB7);
        G7.add(PB8);

        H0.add(RB1);
        H1.add(KNB1);
        H2.add(BB1);
        H3.add(QUEENB);
        H4.add(KINGB);
        H5.add(BB2);
        H6.add(KNB2);
        H7.add(RB2);
    }

    public void Piece(){

    }

    public void showboard(){

        f.add(A0);
        f.add(A1);
        f.add(A2);
        f.add(A3);
        f.add(A4);
        f.add(A5);
        f.add(A6);
        f.add(A7);
        f.add(B0);
        f.add(B1);
        f.add(B2);
        f.add(B3);
        f.add(B4);
        f.add(B5);
        f.add(B6);
        f.add(B7);
        f.add(C0);
        f.add(C1);
        f.add(C2);
        f.add(C3);
        f.add(C4);
        f.add(C5);
        f.add(C6);
        f.add(C7);
        f.add(D0);
        f.add(D1);
        f.add(D2);
        f.add(D3);
        f.add(D4);
        f.add(D5);
        f.add(D6);
        f.add(D7);
        f.add(E0);
        f.add(E1);
        f.add(E2);
        f.add(E3);
        f.add(E4);
        f.add(E5);
        f.add(E6);
        f.add(E7);
        f.add(F0);
        f.add(F1);
        f.add(F2);
        f.add(F3);
        f.add(F4);
        f.add(F5);
        f.add(F6);
        f.add(F7);
        f.add(G0);
        f.add(G1);
        f.add(G2);
        f.add(G3);
        f.add(G4);
        f.add(G5);
        f.add(G6);
        f.add(G7);
        f.add(H0);
        f.add(H1);
        f.add(H2);
        f.add(H3);
        f.add(H4);
        f.add(H5);
        f.add(H6);
        f.add(H7);

        f.setLayout(null);
        board.setLocationRelativeTo(null);
        board.setLayout(null);
    }

    public static int convertvalues(int OCID,int job){
        int ObID, ObPosX, ObPosY;
        ObID=OCID/100;
        ObPosX=(OCID-(ObID*100))/10;
        ObPosY=(OCID-(ObID*100)-(ObPosX*10));
        System.out.println("ObjID:" + ObID + " Pos X:"+ ObPosX + " Pos Y:"+ ObPosY);
        if(job==0) {return ObID; }
        if(job==1) {return ObPosX; }
        if(job==2) {return ObPosY; }
        return 0;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(piecelift+"||"+piecedrop+"||"+ObjConvID+"||"+ObjID+"("+ObjPosX+","+ObjPosY+")");
        if(piecelift==true & piecedrop==true){

        if (e.getSource() == A0) {
            System.out.print("A0");
            xpos = 0;
            ypos = 1;
        }
        if (e.getSource() == A1) {
            System.out.print("A1");
            xpos = 0;
            ypos = 2;
        }
        if (e.getSource() == A2) {
            System.out.print("A2");
            xpos = 0;
            ypos = 3;
        }
        if (e.getSource() == A3) {
            System.out.print("A3");
            xpos = 0;
            ypos = 4;
        }
        if (e.getSource() == A4) {
            System.out.print("A4");
            xpos = 0;
            ypos = 5;
        }
        if (e.getSource() == A5) {
            System.out.print("A5");
            xpos = 0;
            ypos = 6;
        }
        if (e.getSource() == A6) {
            System.out.print("A6");
            xpos = 0;
            ypos = 7;
        }
        if (e.getSource() == A7) {
            System.out.print("A7");
            xpos = 0;
            ypos = 8;
        }

        if (e.getSource() == B0) {
            System.out.print("B0");
            xpos = 1;
            ypos = 1;
        }

        if (e.getSource() == B1) {
            System.out.print("B1");
            xpos = 1;
            ypos = 2;
        }
        if (e.getSource() == B2) {
            System.out.print("B2");
            xpos = 1;
            ypos = 3;
        }
        if (e.getSource() == B3) {
            System.out.print("B3");
            xpos = 1;
            ypos = 4;
        }
        if (e.getSource() == B4) {
            System.out.print("B4");
            xpos = 1;
            ypos = 5;
        }
        if (e.getSource() == B5) {
            System.out.print("B5");
            xpos = 1;
            ypos = 5;
        }
        if (e.getSource() == B6) {
            System.out.print("B6");
            xpos = 1;
            ypos = 7;
        }
        if (e.getSource() == B7) {
            System.out.print("B7");
            xpos = 1;
            ypos = 8;
        }

        if (e.getSource() == C0) {
            System.out.print("C0");
            xpos = 2;
            ypos = 1;
        }
        if (e.getSource() == C1) {
            System.out.print("C1");
            xpos = 2;
            ypos = 2;
        }
        if (e.getSource() == C2) {
            System.out.print("C2");
            xpos = 2;
            ypos = 3;
        }
        if (e.getSource() == C3) {
            System.out.print("C3");
            xpos = 2;
            ypos = 4;
        }
        if (e.getSource() == C4) {
            System.out.print("C4");
            xpos = 2;
            ypos = 5;
        }
        if (e.getSource() == C5) {
            System.out.print("C5");
            xpos = 2;
            ypos = 6;
        }
        if (e.getSource() == C6) {
            System.out.print("C6");
            xpos = 2;
            ypos = 7;
        }
        if (e.getSource() == C7) {
            System.out.print("C7");
            xpos = 2;
            ypos = 8;
        }

        if (e.getSource() == D0) {
            System.out.print("D0");
            xpos = 3;
            ypos = 1;
        }
        if (e.getSource() == D1) {
            System.out.print("D1");
            xpos = 3;
            ypos = 2;
        }
        if (e.getSource() == D2) {
            System.out.print("D2");
            xpos = 3;
            ypos = 3;
        }
        if (e.getSource() == D3) {
            System.out.print("D3");
            xpos = 3;
            ypos = 4;
        }
        if (e.getSource() == D4) {
            System.out.print("D4");
            xpos = 3;
            ypos = 5;
        }
        if (e.getSource() == D5) {
            System.out.print("D5");
            xpos = 3;
            ypos = 6;
        }
        if (e.getSource() == D6) {
            System.out.print("D6");
            xpos = 3;
            ypos = 7;
        }
        if (e.getSource() == D7) {
            System.out.print("D7");
            xpos = 3;
            ypos = 8;
        }

        if (e.getSource() == E0) {
            System.out.print("E0");
            xpos = 4;
            ypos = 1;
        }
        if (e.getSource() == E1) {
            System.out.print("E1");
            xpos = 4;
            ypos = 2;
        }
        if (e.getSource() == E2) {
            System.out.print("E2");
            xpos = 4;
            ypos = 3;
        }
        if (e.getSource() == E3) {
            System.out.print("E3");
            xpos = 4;
            ypos = 4;
        }
        if (e.getSource() == E4) {
            System.out.print("E4");
            xpos = 4;
            ypos = 5;
        }
        if (e.getSource() == E5) {
            System.out.print("E5");
            xpos = 4;
            ypos = 6;
        }
        if (e.getSource() == E6) {
            System.out.print("E6");
            xpos = 4;
            ypos = 7;
        }
        if (e.getSource() == E7) {
            System.out.print("E7");
            xpos = 4;
            ypos = 8;
        }

        if (e.getSource() == F0) {
            System.out.print("F0");
            xpos = 5;
            ypos = 1;
        }
        if (e.getSource() == F1) {
            System.out.print("F1");
            xpos = 5;
            ypos = 2;
        }
        if (e.getSource() == F2) {
            System.out.print("F2");
            xpos = 5;
            ypos = 3;
        }
        if (e.getSource() == F3) {
            System.out.print("F3");
            xpos = 5;
            ypos = 4;
        }
        if (e.getSource() == F4) {
            System.out.print("F4");
            xpos = 5;
            ypos = 5;
        }
        if (e.getSource() == F5) {
            System.out.print("F5");
            xpos = 5;
            ypos = 6;
        }
        if (e.getSource() == F6) {
            System.out.print("F6");
            xpos = 5;
            ypos = 7;
        }
        if (e.getSource() == F7) {
            System.out.print("F7");
            xpos = 5;
            ypos = 8;
        }

        if (e.getSource() == G0) {
            System.out.print("G0");
            xpos = 6;
            ypos = 1;
        }
        if (e.getSource() == G1) {
            System.out.print("G1");
            xpos = 6;
            ypos = 2;
        }
        if (e.getSource() == G2) {
            System.out.print("G2");
            xpos = 6;
            ypos = 3;
        }
        if (e.getSource() == G3) {
            System.out.print("G3");
            xpos = 6;
            ypos = 4;
        }
        if (e.getSource() == G4) {
            System.out.print("G4");
            xpos = 6;
            ypos = 5;
        }
        if (e.getSource() == G5) {
            System.out.print("G5");
            xpos = 6;
            ypos = 6;
        }
        if (e.getSource() == G6) {
            System.out.print("G6");
            xpos = 6;
            ypos = 7;
        }
        if (e.getSource() == G7) {
            System.out.print("G7");
            xpos = 6;
            ypos = 8;
        }

        if (e.getSource() == H0) {
            System.out.print("H0");
            xpos = 7;
            ypos = 1;
        }
        if (e.getSource() == H1) {
            System.out.print("H1");
            xpos = 7;
            ypos = 2;
        }
        if (e.getSource() == H2) {
            System.out.print("H2");
            xpos = 7;
            ypos = 3;
        }
        if (e.getSource() == H3) {
            System.out.print("H3");
            xpos = 7;
            ypos = 4;
        }
        if (e.getSource() == H4) {
            System.out.print("H4");
            xpos = 7;
            ypos = 5;
        }
        if (e.getSource() == H5) {
            System.out.print("H5");
            xpos = 7;
            ypos = 6;
        }
        if (e.getSource() == H6) {
            System.out.print("H6");
            xpos = 7;
            ypos = 7;
        }
        if (e.getSource() == H7) {
            System.out.print("H7");
            xpos = 7;
            ypos = 8;
        }
        drawPiece(xpos,ypos,ObjID);
        space[xpos][ypos]=ObjID;
        piecelift=false;
        piecedrop=false;
        System.out.println("New Object "+ ObjID +" Draw at Tile: (" + xpos +"," +ypos + ");" );
        //Flush System to avoid added pieces
        ObjID=0;
        ObjPosX=0;
        ObjPosY=0;
        ObjConvID=0;
        f.repaint();

    }

        if(piecelift==false){
        if (e.getSource() == PW1) {
            System.out.print("PW1");
            Namae = PW1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PW2) {
            System.out.print("PW2");
            Namae = PW2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PW3) {
            System.out.print("PW3");
            Namae = PW3.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PW4) {
            System.out.print("PW4");
            Namae = PW4.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PW5) {
            System.out.print("PW5");
            Namae = PW5.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PW6) {
            System.out.print("PW6");
            Namae = PW6.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PW7) {
            System.out.print("PW7");
            Namae = PW7.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PW8) {
            System.out.print("PW8");
            Namae = PW8.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }

        if (e.getSource() == PB1) {
            System.out.print("PB1");
            Namae = PB1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PB2) {
            System.out.print("PB2");
            Namae = PB2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PB3) {
            System.out.print("PB3");
            Namae = PB3.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PB4) {
            System.out.print("PB4");
            Namae = PB4.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PB5) {
            System.out.print("PB5");
            Namae = PB5.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PB6) {
            System.out.print("PB6");
            Namae = PB6.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PB7) {
            System.out.print("PB7");
            Namae = PB7.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == PB8) {
            System.out.print("PB8");
            Namae = PB8.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }

        if (e.getSource() == RB1) {
            System.out.print("RB1");
            Namae = RB1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == RB2) {
            System.out.print("RB2");
            Namae = RB2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == KNB1) {
            System.out.print("KNB1");
            Namae = KNB1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == KNB2) {
            System.out.print("KNB2");
            Namae = KNB2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == BB1) {
            System.out.print("BB1");
            Namae = BB1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == BB2) {
            System.out.print("BB2");
            Namae = BB2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == QUEENB) {
            System.out.print("QUEENB");
            Namae = QUEENB.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == KINGB) {
            System.out.print("KINGB");
            Namae = KINGB.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }

        if (e.getSource() == RW1) {
            System.out.print("RW1");
            Namae = RW1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == RW2) {
            System.out.print("RW2");
            Namae = RW2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == KNW1) {
            System.out.print("KNW1");
            Namae = KNW1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == KNW2) {
            System.out.print("KNW2");
            Namae = KNW2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == BW1) {
            System.out.print("BW1");
            Namae = BW1.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == BW2) {
            System.out.print("BW2");
            Namae = BW2.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == QUEENW) {
            System.out.print("QUEENW");
            Namae = QUEENW.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }
        if (e.getSource() == KINGW) {
            System.out.print("KINGW");
            Namae = KINGW.getText();
            ObjConvID = Integer.parseInt(Namae);
            ObjID = convertvalues(ObjConvID, 0);
            ObjPosY = convertvalues(ObjConvID, 2);
            ObjPosX = convertvalues(ObjConvID, 1);
        }

        movingpiece = ObjConvID;
        space[ObjPosX][ObjPosY]=0;
        System.out.println("Removed Piece: "+movingpiece);
        removePiece(ObjPosX, ObjPosY, ObjID);
        piecelift=true;
        piecedrop=true;
    }
        showspace();
        board.revalidate();
        System.out.println(" Mouse clicked Executed");
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
