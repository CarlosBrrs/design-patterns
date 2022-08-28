package design_patterns.structural.adapter_pattern;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        }
        //mediaAdapter is providing support to play other file formats
        else if (audioType.equalsIgnoreCase("MP4") || audioType.equalsIgnoreCase("VLC")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
