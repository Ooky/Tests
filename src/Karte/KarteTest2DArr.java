package Karte;

public class KarteTest2DArr {
    
    public static void zonenLoader(String map)
    {
        int spalten = 24;
        int zeilen = 80; //79 früher ohne /n
        char[][] zone = new char[spalten][zeilen];
        for (int i =0; i<spalten; i++)
        {
            for(int j=0; j<zeilen; j++)
            {
            	zone[i][j] = map.charAt((i*(zeilen))+j);
//                System.out.println("i:"+i+" und j:"+j+" => "+z1[i][j]);
                System.out.print(zone[i][j]); 
                
            }
        }
    }
    
//    public char[][] getPosition()
//    {
//         System.out.print(zone1());
//         return getPosition();
//    }
//     
//    public void setPosition(char zone) 
//    {
//        Player myPlayer = new Player();
//        this.zonenLoader(null) = myPlayer.getNeuZone();
//    }
    
    public static String zone1() 
    {
        String zeile00="+--------------o  o-----------------------------------------------------------+\n";
        String zeile01="|**********   oo  oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile02="|*(C)lose1*   oo  oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile03="|**********   oo  oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile04="|             oo  ooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooo^^^^^^^^ooooo|\n";
        String zeile05="|ooooooooooooooo  oooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooo^^^^ooooo|\n";
        String zeile06="|oo^^^^^^^^^oooo  oooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooo^^^^^^^ooo|\n";
        String zeile07="|oo^^^^^^ooooooo  ooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooo^^^oooo|\n";
        String zeile08="   ^^^^^^         oooooooooo^^^oo^^^^^^^^^^^^^^^ooooooooooo^^^^^^oooooo^^^oooo|\n";
        String zeile09="|oo^^^^^^ooooooooooooooooooo^^^oooooooooooooooooooooooooooooo^^^^^^ooo^^^^^ooo|\n";
        String zeile10="|oo^^^^^^oooo^^^^^^oooooooooo^^ooooooooooooooooooooooooooooooooo^^^^^^oo^^oooo|\n";
        String zeile11="|oo^^^^^^ooo^^^oooooooooooooo  oooooooooooooooooooooooooooooooooooo^^^^^^^oooo|\n";
        String zeile12="|oo^^^^^^ooo^^^ooo                                             oooooo^^^oooooo|\n";
        String zeile13="|oo^^^^^^ooo^^^ooo  ooooooooooooooooooooooooooooooooooooooooo  ooooooooooooooo|\n";
        String zeile14="|ooo^^^^^^^^^^^ooo  ooooooooooooooooooooooooooooooooooooooooo  oooooooooooooooo\n";
        String zeile15="|ooo^^^^^^^^^^^ooo  ooooooooooooooooooooooooooooooooooooooooo                  \n";
        String zeile16="|ooooooo^^^^^^^^oo  ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n";
        String zeile17="|ooooooooooooooooo                               ooooooooo^^^^^^^^^^^^^ooooooo|\n";
        String zeile18="|oooooo____ooooooo  ooooooooooooooooooooooooooo  ooooooo^^^^^^^^^^^^^^^^^ooooo|\n";
        String zeile19="|ooooo/    \\oooooo  oooooooooo^^^^^^^^^^^^^^ooo  oooo^^^^^^^^^^^^^^^^^^^^^oooo|\n";
        String zeile20="|oooo|      |ooooo  ooooo^^^^^^^^^^^^^^^^^^^^^^  ^^^^^^^^^^oooooo^^^^^^^^^^^oo|\n";
        String zeile21="|oooo| HOME |ooooo  ooooo^^^^^^^ooooo^^^^^^^^^^  ^^^^^^^oooooo^^^^^^^^^ooooooo|\n";
        String zeile22="|oooo|______|       ooooooooooooooooooooooooooo  ooooooooooooooooooooooooooooo|\n";
        String zeile23="+-----------------------------------------------------------------------------+\n";
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;
    }
    
    public static String zone2() 
    {
        String zeile00="+----------------------------o  o--------   ----------------------------------+\n";
        String zeile01="|**********   oooooooooooooooo  ooooooooo                          ooooooooooo|\n";
        String zeile02="|*(C)lose2*   oooooooooooooooo  ooooooooooooo^^^ooooo^^^^^oooooooooooooooooooo|\n";
        String zeile03="|**********   oooooooooooooooo  ooooooooooo^^^^^^ooo^^^^^^^^^^^^^^^ooooooooooo|\n";
        String zeile04="|             oooooooooooooooo  ooooooooooo^^^^^oooo^^^^oooooo^^^ooooooooooooo|\n";
        String zeile05="|ooooooooooooooooooooooooooooo  oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^   ooooo|\n";
        String zeile06="|ooooooooooooooooooooooooooooo  oooooooooooooooooooooooooooooooooooooo   ooooo|\n";
        String zeile07="|oooooooooooooooooo                                              ooooo   ooooo|\n";
        String zeile08="|oooooooooooooooooo  ooooooooooooooooooooooooooooooooooooooooo   ooooo   ooooo|\n";
        String zeile09="|oooooooooooooooooo  oo^^^^^^^^^^^^^^^^^^^^oooooo^^^^^^^^^^^oo   ooooo____oooo|\n";
        String zeile10="|oooooooooooooooooo  oo^^^^^^^^^^^^^^^^^^^^^ooooo^^^^^^^^^^^oo   oooo/    \\ooo|\n";
        String zeile11="|oooooooooooooooooo  oo^^^^^^^^^^^^^^^^^^^^^^oooo^^^^^^^^^^^oo   ooo|      |oo|\n";
        String zeile12="|oooooooooooooooooo  ooo^^^^^^^^^^^^^^^^^^^^^^^oo^^^^^^^^^^^oo   ooo|Secret|oo|\n";
        String zeile13="|oooooooooooooooooo  ooo^^^^^^^^oo^^^^^^^^^^^^^^o^^^^^^^^ooooo   ooo|______|oo|\n";
        String zeile14="ooooooooooooooooooo  oooo^^^^^^ooo^^^^^^^^^^^^^^^^^^^^^ooooooo   ooooooooooooo|\n";
        String zeile15="                     oooooo^^^oooo^^^^^^^^^^^^^^^^^^^^oooooooo                |\n";
        String zeile16="oooooooooooooooooo   oooooooooooooo   oooooooooooooooooooooooo   ooooooooooooo|\n";
        String zeile17="|ooooo^^oooooooooo                                oooooooooooo   ooooooooooooo|\n";
        String zeile18="|ooo^^^^^^oooooooooooooooooooooooooooooooooooooo  oooooooooooooooooooooooooooo|\n";
        String zeile19="|oooo^^^^^^^^^^^^^ooooooooo^^^^^^^^^^^^ooooooooo  oooo^^^^^^^^^^^^^^oooooooooo|\n";
        String zeile20="|oo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oo  ^^^^^^^^^^^^^^^^^^^^^^^^^^oo|\n";
        String zeile21="|oo^^^^^^^^^ooooo^^^^^^^^^^^^oooooooo^^^^^^^^^^^  ^^^^^^^^ooooooooo^^^^^^^oooo|\n";
        String zeile22="|ooooooooooooooooooooooooooooooooooooooooooooooo  oooooooooooooooooooooooooooo|\n";
        String zeile23="+-----------------------------------------------------------------------------+\n";
  
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;

    }

    public static String zone3() 
    {
        String zeile00="+----------------------------------------------------------o   o--------------+\n";
        String zeile01="|**********    ooooooooooooooooooooooooooooooooooooooooooooo   ooooooooooooooo|\n";
        String zeile02="|*(C)lose3*    ooooooooooooooooooo^^^^^^^^^^^^^^oooooooooooo   ooooooooooooooo|\n";
        String zeile03="|**********    oooooooooooooooooo^^^^^^^^^^^^^ooooooo^^^^^^^^^^^^^^^^^^^oooooo|\n";
        String zeile04="|              oooo^^^^^^^^ooooooo^^^^^^^^^^^^^^oooooooooooo^^^^^^^^^^^^^ooooo|\n";
        String zeile05="|oooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooo^^^^^^^^^^^^^^^^^o|\n";
        String zeile06="|oooooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooooooooooooooooo^^^o|\n";
        String zeile07="|ooooooooo               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^                   oo^^^o|\n";
        String zeile08="|ooooooooo   oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooooooooo   oo^^^o|\n";
        String zeile09="|ooooooooo   oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooooooooo   oo^^^o|\n";
        String zeile10="|ooooooooo   ooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooo   oo^^^o|\n";
        String zeile11="|ooooooooo   ooooooo^^^^^^oooooooooooooooooooo^^^^^^^^oooooooo^^^oooo   oo^^^o|\n";
        String zeile12="|ooooooooo   ooooooo^^^^^^ooooooooooooooooooooooooooooooooooooooooooo   oo^^^o|\n";
        String zeile13="|ooooooooo   ooooo^^^^^^^^ooo                                 ooooooo   oo^^^o|\n";
        String zeile14="|ooooooooo   ooooooo^^ooooooo   ooooooooooooooooooooooooooo   ooooooo   oo^^^o|\n";
        String zeile15="|ooooooooo   oooo^^^^^^^^oooo   ooooooooo^^^^^^^^^^^^oooooo   ooooooo   oo^^^o|\n";
        String zeile16="|ooooooooo   oooooo^^^ooooooo   oooooooo^^^^^^^^^^^^^^^^ooo   ooooooo   oo^^^o|\n";
        String zeile17="|ooooooooo   ooooo^^^^ooooooo   ooooooo^^^^^^^^^^^^^^^^oooo   ooooooo   oo^^^o|\n";
        String zeile18="|ooooooooo   oooo^^^^oooooooo   oooooo^^^^^^^^^^^^^^^^^oooo   ooooooo   oo^^^o|\n";
        String zeile19="|ooooooooo   oooooooooooooooo   ooooo^^^^^^^^^^^^^^^^^^^ooo             oo^^^o|\n";
        String zeile20="|ooooooooo   oooooooooooooooo   ooooo^^^^^^^^^^^^^^^^^oooooooooooooooooooo^^^o|\n";
        String zeile21="             oooooooooooooooo   ooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^o|\n";
        String zeile22="|oooooooooooooooooooooooooooo   ooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^o|\n";
        String zeile23="+---------------------------o   o--------   ----------------------------------+\n";
        
        
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;
    }

    public static String zone4() 
    {
        String zeile00 = "+-----------------------------------------------------------------------------+\n";
        String zeile01 = "|**********   oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile02 = "|*(C)lose4*   ooooooooooooooooooooooooooooooooooooooooooooooooooo^^^^^^^^ooooo|\n";
        String zeile03 = "|**********   ooo                                          oooo^^^^^^^^ooooooo|\n";
        String zeile04 = "|             ooo  oooooooooooooooooooooooooooooooooooooo  oooo^^^^^^^oooooooo|\n";
        String zeile05 = "|oooooooooooooooo  oooooooooooooooooooooooooooooooooooooo  oooo^^^^^^ooooooooo|\n";
        String zeile06 = "|ooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooooooo  ^^^^^^^^^^ooooooooo|\n";
        String zeile07 = "      oooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooooo  ^^^^^^^^^^ooooooooo|\n";
        String zeile08 = "|ooo  oooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^ooooooooooooooooo^^^^^^^^oooooo|\n";
        String zeile09 = "|ooo  oooooooooooooooooooo^^^^^^oooooooo^^^^^^^^^^^ooooooooo^^^^^^^^^ooooooooo|\n";
        String zeile10 = "|ooo  oooooooooooooooooooo^^^^^^ooooooooooo^^^^^^^^ooooo^^^^^^^^^^^^^ooooooooo|\n";
        String zeile11 = "|ooo  oooooooooooooooooooo^^^^^^ooooooooooo^^^^^^^^ooooo^^^^^^^^^^^^^^^ooooooo|\n";
        String zeile12 = "|ooo  oooooooooooooooooooo^^^^^^ooooooooooo^^^^^^^^ooooo^^^^^^^^^^^^^^^^^^^^oo|\n";
        String zeile13 = "|ooo  oooooo^^^^^^^^^^^^^^^^^^^^oooooooo^^^^^^^^^^^ooooooooooooo^^^^^^^^^^^^oo|\n";
        String zeile14 = "|ooo  oooo^^^^^^^^^^ooooooooooooo^^^ooooooo^^^^^^^^oooooooo^^^^^^^^^^^^^^^^^oo|\n";
        String zeile15 = "|ooo  ooooo^^^^^^^^^ooooooooooooo^^^^ooo^^^^^^^^^^^oooooo  ^^^^^^^^^^^^^^ooooo|\n";
        String zeile16 = "|ooo  ooooo^^^^^^^^^ooooooooooooo^^^^ooo^^^^^^^^^^^oooooo  ^^^^^^^^^^^^ooooooo|\n";
        String zeile17 = "      oooo^^^^^^^^^^ooooooooooooo^^^^ooo^^^^^^^^^^^oooooo  ^^^^^^^^^^^oooooooo|\n";
        String zeile18 = "|oooooooooooooo^^^^^^^oooooo^^^^^^^^^ooo^^^^^^^^^^^oooooo  ^^^^^^^^^oooooooooo|\n";
        String zeile19 = "|ooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooo  ^^^^^^^^^^^^ooooooo|\n";
        String zeile20 = "|ooooooooooooooooooooooooooooooo  ooooooooooooooooooooooo  ooooooooooooooooooo|\n";
        String zeile21 = "|ooooooooooooooo                  ooooooooooooooooo^^^^^^                      \n";
        String zeile22 = "|ooooooooooooooo  oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile23 = "+--------------o  o-----------------------------------------------------------+\n";

        return zeile00 + zeile01 + zeile02 + zeile03 + zeile04 + zeile05 + zeile06
                + zeile07 + zeile08 + zeile09 + zeile10 + zeile11 + zeile12 + zeile13
                + zeile14 + zeile15 + zeile16 + zeile17 + zeile18 + zeile19 + zeile20
                + zeile21 + zeile22 + zeile23;

    }

    public static String zone5() 
    {
        String zeile00="+------------------------o  o-------------------------------------------------+\n";
        String zeile01="|**********   oooooooooooo  oooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile02="|*(C)lose5*   oooooooooooo  oooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile03="|**********   oooooooooooo  oooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile04="|             oooooooooooo                                   ooooooooooooooooo|\n";
        String zeile05="|oooooooooooooooooooooooooooooooooooooooooooooooooooooooooo  ooooooooooooooooo|\n";
        String zeile06="|oooooooooooooooooooooooooooooooooooooooooooooooooooooooooo  ooooooooooooooooo|\n";
        String zeile07="|oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooooooooo  ooooooooooooooooo|\n";
        String zeile08="|oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooo  oooo              \n";
        String zeile09="|oo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooo  oooo  ooooooooooo|\n";
        String zeile10="|oo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooo  oooo  ooooooooooo|\n";
        String zeile11="|oo^^^^^^^^^^^^^^^^^oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^oooo  oooo  ooooooooooo|\n";
        String zeile12="|oo^^^^^^^^^^^^^^ooooooooo^^^^^oooooo^^^^^^^^^^^^^^^^^^oooo  oooo  ooooooooooo|\n";
        String zeile13="|oo^^^^^^^^^^^^ooooooooooo^^^^^^^^oooooo^^^^^^^^^^^^^^^oooo  oooo  ooooooooooo|\n";
        String zeile14="|oo^^^^^^^^^^^^ooooooooooo^^^^^^^^^^^oooooooooooo  oooooooo  oooo  ooooooooooo|\n";
        String zeile15="|oo^^^^^^^^^^^^ooooooooo^^^^^^^^^^^^^oooooooooooo  oooooooo  oooo  ooooooooooo|\n";
        String zeile16="|oo^^^^^^^^^^^^oooooo^^^^^^^^^^^^^^^^oooooooooooo  oooooooo  oooo  ooooooooooo|\n";
        String zeile17="|ooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooo            oooo  ooooooooooo|\n";
        String zeile18="|oooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooooooooooooooooo  ooooooooooo|\n";
        String zeile19="|oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooo  ooooooooooo|\n";
        String zeile20="|oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooo  ooooooooooo|\n";
        String zeile21="|oooooooooooooooo^^^^^^^^^^^^^ooooooooooooo^^^                     ooooooooooo|\n";
        String zeile22="|ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile23="+-----------------------------------------------------------------------------+\n";
        
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;


    }

    public static String zone6() 
    {
        String zeile00="+-----------------------------------------o  o--------------------------------+\n";
        String zeile01="|**********   ooooooooooooooooooooooooooooo  ooooooooooooooooooooooooooooooooo|\n";
        String zeile02="|*(C)lose6*   o^^^^^^^^                      oooooooooooo^^^^^^^^^^^^ooooooooo|\n";
        String zeile03="|**********   o^^^^^^^^ooooooooooooooooooooooooooo^^^^^^^^^^^^oooo^^^^oooooooo|\n";
        String zeile04="|             o^^^^^^^^ooooooooooooooooooooooo^^^^^^^^oooooooooooooooooooooooo|\n";
        String zeile05="|oooooooooooooo^^^^^^^^ooooooooooooooooooooooooo^^^^^^^^^^^^^ooooooooooooooooo|\n";
        String zeile06="|oooooooooooooo^^^^^^^^ooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^oooooooooooo|\n";
        String zeile07="|oooooooooooooo^^^^^^^^                     ^^^^^^^^^^^^^^^^^^^^^^             \n";
        String zeile08="|oooooooooooooo^^^^^^^^ooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^oooooooooooo|\n";
        String zeile09="|oooooooooooooo^^^^^^^^ooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^oooooooooooo|\n";
        String zeile10="|oooooooooooooo^^^^^^^^ooooooooooooooooooooooooooo^^^^^^^^^^^^oooooooooooooooo|\n";
        String zeile11="|oooooooooooo^^^^^^^^^^^oooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile12="|oooooooooooo^^^^^^^^^^^oooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile13="|oooooooooooo^^^^^^^^^^^oooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile14="|oooooooooooooooooo^^^^^^ooooooooooooooo^^^^^^^^^^^^^ooooooooooooooooooooooooo|\n";
        String zeile15="|oooooooooooooooooo^^^^^^^ooooooooo^^^^^^^^^^^^^^^^^^^^^^ooooooooooooooooooooo|\n";
        String zeile16="|oooooooooooooooooo^^^^^^^^^ooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooooooooooooooo|\n";
        String zeile17="|oooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooooo        \n";
        String zeile18="|oooooooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooo  ooooo|\n";
        String zeile19="|oooooooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooooooooo  ooooo|\n";
        String zeile20="|oooooooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooooooo  ooooo|\n";
        String zeile21="|ooooooooooooooooooooooooo                                               ooooo|\n";
        String zeile22="|ooooooooooooooooooooooooo  oooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile23="+------------------------o  o-------------------------------------------------+\n";
        
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;

    }

    public static String zone7() 
    {
        String zeile00="+-----------------------------------------------------------------------------+\n";
        String zeile01="|**********   oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile02="|*(C)lose7*   oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile03="|**********   oooooooooooooooooooooooooooooooooooooooooooooooooo^^^^^^^^^ooooo|\n";
        String zeile04="|             ooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^oooo^^^^^^^^^^^^ooooo|\n";
        String zeile05="|oooooooooooooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^oooo^^^^^^^^^^^^ooooo|\n";
        String zeile06="|oooooooooooooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^oooo^^^^^^^^^^^^ooooo|\n";
        String zeile07="|oooooooooo                      ^^^^^^^^^^^^^oooo^^^^^^^ooooo^^^^^^^^^^^ooooo|\n";
        String zeile08="|oooooooooo  oooooooooooooooooooo^^^^^^^^^^^^^oooo^^^^^^^oooooo^^^^^^^^^^^^^^^^\n";
        String zeile09="|oooooooooo  oooooooooooooo^^^^^^^^^^^^^^^oooooooo^^^^^^^oooooooo^^^^^^^^^^^^^^\n";
        String zeile10="|oooooooooo  oooooooooooooo^^^^^^^^^^^^^ooooooo^^^^^^oooooooooooo^^^^^^^^^^^^^^\n";
        String zeile11="|oooooooooo  oooooo^^^^^^^^^^^^^^^^^^^^^oo^^^^^^^^^^^oooooooooooo^^^^^^^^^^^^^^\n";
        String zeile12="|oooooooooo  oooooo^^^^^^^^^^^^^^oooooooooo^^^^^^oooooooooooooooooo^^^^^^^^^^^^\n";
        String zeile13="|oooooooooo  oooooo^^^^^^^^^^^^^^oooooooooo^^^^^^ooooooooooooooooo^^^^^^^^^^^^^\n";
        String zeile14="|oooooooooo  oooooo^^^^^^^^^^^^^^oooooooooo^^^^^^ooooooooooooooooo^^^^^^^^^^^^^\n";
        String zeile15="|oooooooooo  oooooo^^^^^^^^^^^^^^oooooooooo^^^^^^oooo^^^^^^^^^^^^^ooooooo^^^^^^\n";
        String zeile16="|oooooooooo  oooooooooooo  ooooooooooooooooo^^^^ooooo^^^^^^^^^^^^^ooooooo^^^^^^\n";
        String zeile17="|oooooooooo  oooooooooooo  oooooooooooooooooooooooooooooooo^^^^^^^ooooooo^^^^^^\n";
        String zeile18="|oooooooooo  oooooooooooo                             ooooo^^^^^^^ooooooo^^^^^^\n";
        String zeile19="|oooooooooo  ooooooooooooooooooooooooooooooooooooooo  ooooo^^^^^^^^^^^^^^^^^^^^\n";
        String zeile20="|oooooooooo                                  ooooooo  ooooo^^^^^^^^^^^^^^^^^^^^\n";
        String zeile21="|oooooooooooooooooooooooooooooooooooooooooo  ooooooo        ^^^^^^^^^^^^^^^^^^|\n";
        String zeile22="|oooooooooooooooooooooooooooooooooooooooooo  ooooooooooooooooooooooooooooooooo|\n";
        String zeile23="+-----------------------------------------o  o--------------------------------+\n";
        
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;
    }

    public static String zone8() 
    {
        String zeile00="+-----------------------------------------------------------------------------+\n";
        String zeile01="|**********   oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile02="|*(C)lose8*   oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile03="|**********   oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^ooooooooooooooooooooooooooooo|\n";
        String zeile04="|             oooooooooooo^^^^^^^^^^^^^^^^^^^^^^^ooooooooooooooooooooooooooooo|\n";
        String zeile05="|ooooooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^       oooooooooooooooooooooo|\n";
        String zeile06="|oooooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooo  oooooooooooooooooooooo|\n";
        String zeile07="|ooooooooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ooooo  oooooooooooooooooooooo|\n";
        String zeile08="^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooo  oooooooooooooooooooooo|\n";
        String zeile09="^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooo  oooooooooooooooooooooo|\n";
        String zeile10="^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooooooooooo  oooooooooooooooooooooo|\n";
        String zeile11="^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^oooooooooooooooooo  oooooooooooooooooooooo|\n";
        String zeile12="^^^^^^^^^^^^^^^^^^^^^oooooooo^^^^^^^^^oooo^^^ooooooooo  ooooooooooo            \n";
        String zeile13="^^^^^^^^^^^^^^^^^^^oooooooooo^^^^^^^^ooooo^^^^^ooooooo  ooooooooooo  ooooooooo|\n";
        String zeile14="^^^^^^^^^^^^^^^^ooooooooooooo^^^^^^^^ooooo^^^^^^^^^^^^^^^oooooooooo  ooooooooo|\n";
        String zeile15="^^^^^^^^^^^^ooooooooooooooooo^^^^^^^oooooo^^^^^^^^^^^^^^^oooooooooo  ooooooooo|\n";
        String zeile16="^^^^^^^^oooooooo^^^^^^^^^^^^^^^^^^^^oooooo^^^ooo^^^oooooooooooooooo  ooooooooo|\n";
        String zeile17="^^^^^^oooooooooo^^^^^^^^^^^^^^^^^^^^oooooo^^^ooo^^^oooooooooooooooo  ooooooooo|\n";
        String zeile18="^^^oooooooooooo^^^^^^^^^^^^^^^^^^^^^oooooooooooo^^^^^^^^^oooooooooo  ooooooooo|\n";
        String zeile19="^^ooooooooooo^^^^^^^^^^^^^^^^^^^^^^^^ooooooooooo^^^^^^^^^oooooooooo  ooooooooo|\n";
        String zeile20="^oooooooooooo^^^^^^^^^^^^^^^^^^^^oooooooooo^^^^^^^^^^^^^^^^          ooooooooo|\n";
        String zeile21="|ooooooooooooooooo^^^^^^^^^^^^^oooooooooooo^^^^ooooooooooooooooooooooooooooooo|\n";
        String zeile22="|ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile23="+-----------------------------------------------------------------------------+\n";
        
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;
    }

    public static String zone9() 
    {
        String zeile00="+-----------------------------------------------------------------------------+\n";
        String zeile01="|**********   oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|\n";
        String zeile02="|*(C)lose9*   oooooooooooooooooooooooooooooooooooooooooooooooo                |\n";
        String zeile03="|**********   oooooo^^^^ooooooooooooooooooooo                                o|\n";
        String zeile04="|             oooooo^^^^oooooooooooooo                                      oo|\n";
        String zeile05="|oooooooooooooooooo^^^^ooooooooooooo          |ZZzzz                       ooo|\n";
        String zeile06="|ooo^^^^^^^^^^^^^^^^ooooooooo    |          |~~~|           |        ooooooooo|\n";
        String zeile07="|ooooooooooooo^^^^^^^^^oooooooooo             |                            ooo|\n";
        String zeile08="|ooo^^^^^^^^^^^^^^^^^^^oooooooo               |                          ooooo|\n";
        String zeile09="|ooo^^^^^^^^^^^^^^^^ooooooooo    |ZZzzz      /^\\            |ZZzzz     ooooooo|\n";
        String zeile10="|ooo^^^^^^^^^^^^^^^^ooooooooo    |        |^^^^^^^|        / \\oooooooooooooooo|\n";
        String zeile11="|ooo^^^^^^^^^^^oooooooooooooo   /^\\       |[]+    |       |~~~|ooooooooooooooo|\n";
        String zeile12="    ^^^^^^^^^^^        oooooo|^^^^^^^|    |    +[]|       |   |ooooooooooooooo|\n";
        String zeile13="|ooo^^^^^^^^^^^oooooo  oooooo|    +[]|/\\/\\/\\/\\^/\\/\\/\\/\\/|^^^^^^^|ooooooooooooo|\n";
        String zeile14="|ooo^^^^^^^^^^^oooooo  oooooo|+[]+   |~~~~~~~~~~~~~~~~~~|    +[]|ooooooooooooo|\n";
        String zeile15="|ooo^^^^^^^^^^^oooooo  oooooo|       |  []   /^\\   []   |+[]+   |ooooooooooooo|\n";
        String zeile16="|ooo^^^^^^^^^^^oooooo  oooooo|   +[]+|  []  || ||  []   |   +[]+|ooooooooooooo|\n";
        String zeile17="|ooo^^^^^^^^^^^^^oooo  oooooo|[]+    |      || ||       |[]+    |ooooooooooooo|\n";
        String zeile18="|oooo^^^^^^^^^^^^oooo  oooooo|_______|------------------|_______|ooo^^^^^^oooo|\n";
        String zeile19="|oooooo^^^^^^^^^^oooo  oooooooooooooooooooooo  ooooooooooooooooooooo^^^^^^oooo|\n";
        String zeile20="|ooooooo^^^^^^^^^oooo  oooooooooooooooooooooo  ooooooooooooooooooooo^^^^^^oooo|\n";
        String zeile21="|ooooooo^^^^^^^^^oooo                                                     oooo|\n";
        String zeile22="|oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo  ooooooooooooooo|\n";
        String zeile23="+-----------------------------------------------------------o  o--------------+\n";
        
        return zeile00+zeile01+zeile02+zeile03+zeile04+zeile05+zeile06
                +zeile07+zeile08+zeile09+zeile10+zeile11+zeile12+zeile13
                +zeile14+zeile15+zeile16+zeile17+zeile18+zeile19+zeile20
                +zeile21+zeile22+zeile23;
    }
}




















