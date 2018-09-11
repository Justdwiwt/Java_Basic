package test_05_31;

public class Day09Test {
}

@SuppressWarnings("ALL")
class Controller {
    private MediaPlayer[] players;

    public Controller(MediaPlayer[] players) {
        this.players = players;
    }

    public void open(int i) {
        players[i].open();
    }

    public void play(int i) {
        players[i].play();
    }

    public void stop(int i) {
        players[i].stop();
    }
}

interface MediaPlayer {
    void play();

    void stop();

    void open();
}

class TapePlayer implements MediaPlayer {

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void open() {

    }
}

class DVDPlayer implements MediaPlayer {

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void open() {

    }
}

class CDPlayer implements MediaPlayer {
    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void open() {

    }
}
