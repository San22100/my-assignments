public class CustomException {
    public static void main(String[] args) {
        Music music = new Music("guitar",8,"A");

        try{
            music.composingMusic(true);
        }
        catch (InTuneMusicException e){
            System.out.println("handler 1 :" +e);
        }
        catch (OutOfTuneMusicException a){
            System.out.println("handler 2 : "+a);
        }

    }
}
class Music{
    String instrument;
    int chords;
    String scale;
    int QualifiedChords = 6;



    public Music(String instrument, int chords, String scale) {
        this.instrument = instrument;
        this.chords = chords;
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "Music{" +
                "instrument='" + instrument + '\'' +
                ", chords=" + chords +
                ", scale='" + scale + '\'' +
                '}';
    }
   void composingMusic(boolean makingMusic){
       System.out.println("started making music");

        if (QualifiedChords > chords) {
            InTuneMusicException a = new InTuneMusicException("music can be composed");
            throw a;
        }
        else if (QualifiedChords < chords) {
            OutOfTuneMusicException c = new OutOfTuneMusicException("music cannot be composed");
            throw c;

        }
        System.out.println("finish creating music");
    }
}
class InTuneMusicException extends RuntimeException{
    public InTuneMusicException(String message) {
        super (message);
    }
}
class OutOfTuneMusicException extends RuntimeException{
    public OutOfTuneMusicException(String message){
        super(message);
    }
}