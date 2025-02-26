/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboshizz;

/**
 *
 * @author dewaa
 */
class Monitor implements Component {
    @Override
    public void connect() {
        System.out.println("Monitor is connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Monitor is disconnected.");
    }
}
