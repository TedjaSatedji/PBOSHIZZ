/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboshizz;

/**
 *
 * @author dewaa
 */
class Laptop extends Computer {
    @Override
    void bootUp() {
        System.out.println("Laptop is booting up...");
    }

    @Override
    void shutDown() {
        System.out.println("Laptop is shutting down...");
    }

    @Override
    void displaySpecs() {
        System.out.println("Laptop: Portable, built-in battery, integrated GPU.");
    }
}