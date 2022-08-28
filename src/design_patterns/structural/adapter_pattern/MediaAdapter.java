package design_patterns.structural.adapter_pattern;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMusicPlayer = new VLCPlayer();
        }
        else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMusicPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMusicPlayer.playVLC(filename);
        }
        else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMusicPlayer.playMP4(filename);
        }
    }
}
