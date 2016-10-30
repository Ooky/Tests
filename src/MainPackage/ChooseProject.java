/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import JUnit.JUnitTests;
import JansiTest.JansiTest;
import Jump.Jump;
import Karte.KarteTest2DArr;
import Karte.Player;
import SystemConsole.SystemConsole;

/**
 *
 * @author Creat-if
 */
public class ChooseProject {

    private Jump jump;
    private SystemConsole consoletest;
    private JansiTest jansiTest;
    private Player playerKarte;
    private JUnitTests junitTests;

    protected enum project {

        JUMP, SONSTIGETESTS, PLAYERKARTE, JANSI, JUNIT
    };

    public ChooseProject(project chooseProject) {
        switch (chooseProject) {
            case JUMP:
                jump();
                break;
            case SONSTIGETESTS:
                consoleTest();
                break;
            case JANSI:
                jansi();
                break;
            case PLAYERKARTE:
                playerKarte();
                break;
            case JUNIT:
                jUnit(10,2);
                break;
            default:
                System.out.println("Look at ChooseProject for KeyWords!");
                break;
        }

    }
    
    private void jUnit(int x, int y){
        junitTests = new JUnitTests();
        System.out.println(junitTests.calc(x, y));
    }

    private void jump() {
        jump = new Jump();
        jump.jump();
    }

    private void consoleTest() {
        System.out.println("Wird fehler ausgeben, in der IDE geht es nicht, siehe dazu");
        System.out.println("Java 7 Das Handbuch auf Seite 75!");
        consoletest.T1Console();
    }

    private void jansi() {
        jansiTest = new JansiTest();
        jansiTest.JansiTest();
    }

    private void playerKarte() {
        playerKarte = new Player();
        System.out.println("getName: " + playerKarte.getName());
        System.out.println("getNeuZone: " + playerKarte.getNeuZone());
        System.out.println("getZone: " + playerKarte.getZone());
        System.out.println("Zone auf 2 setzen: " + playerKarte.setZone(2));
        System.out.println("getZone: " + playerKarte.getZone());
        System.out.println("Zone zurück auf 1 setzen : " + playerKarte.setZone(1));
        System.out.println("getZone: " + playerKarte.getZone());
        System.out.println("\nKarte.KarteTest.zonenLoader(KarteTest.zone1()); :");
        Karte.KarteTest2DArr.zonenLoader(KarteTest2DArr.zone1());
        System.out.println("\n");
        System.out.println("getNeuZone: " + playerKarte.getNeuZone());
    }

}
