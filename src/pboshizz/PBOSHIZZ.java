/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pboshizz;

/**
 *
 * @author dewaa
 */
public class PBOSHIZZ {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();
        Component monitor = new Monitor();
        Component keyboard = new Keyboard();

        desktop.bootUp();
        desktop.displaySpecs();
        desktop.shutDown();

        laptop.bootUp();
        laptop.displaySpecs();
        laptop.shutDown();

        monitor.connect();
        monitor.disconnect();

        keyboard.connect();
        keyboard.disconnect();
    }
}
