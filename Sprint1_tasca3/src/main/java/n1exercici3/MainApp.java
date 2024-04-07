package n1exercici3;

import n1exercici3.play.Play;

public class MainApp {
    public static void main(String[] args) {

        Play play = new Play();
        play.guardarDatos();
        play.playApp(play.guardarDatos());

    }
}