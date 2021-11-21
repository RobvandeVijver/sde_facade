package app;

/**
 * Class Cinema
 */
public class Cinema {

    /**
     * Properties
     */
    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private Tuner tuner;

    /**
     * Constructor
     */
    public Cinema(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popcornPopper,
                  Projector projector, Screen screen, TheaterLights theaterLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }


    public watchingMovie() {
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(20);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play("Legends never Die");
    }

    public alreadyWatchingMovie() {
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.off();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public listeningMusic() {
        theaterLights.on();
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setCd(cdPlayer);
        cdPlayer.on();
        cdPlayer.play("random");
    }

    public alreadyListeningMusic() {
        amplifier.off();
        amplifier.setCd(cdPlayer);
        cdPlayer.eject();
        cdPlayer.off();
    }

    public turnOnRadio() {
        tuner.on();
        tuner.setFrequency(5);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(tuner);
    }

    public listeningRadio() {
        tuner.off();
        amplifier.off();
    }



}
