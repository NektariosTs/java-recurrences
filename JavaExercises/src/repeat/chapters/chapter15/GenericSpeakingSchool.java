package repeat.chapters.chapter15;

public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void learnToSpeak() {
        iSpeakable.speak();
    }
}
