/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboshizz;

/**
 *
 * @author dewaa
 */
class Desktop extends Computer {
    @Override
    void bootUp() {
        System.out.println("Desktop is booting up...");
    }

    @Override
    void shutDown() {
        System.out.println("Desktop is shutting down...");
    }

    @Override
    void displaySpecs() {
        System.out.println("Desktop: High-performance CPU, dedicated GPU, large storage.");
    }
}
