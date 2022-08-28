package design_patterns.structural.adapter_pattern;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
        //Do nothing
    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file. Name: "+ filename);
    }
}
